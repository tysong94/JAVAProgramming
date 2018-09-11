// 날짜 : 5월 4일 
// 저자 : 송태양
// 제목 : 10. 수수료 포함 환전 계산 1(잘못된 예)

public class E10_Exchange3 {
	public static void main(String[] args) {
		int k08_myWon = 1000000; // 원
		double k08_moneyEx = 1238.21; // 달러당 원
		double k08_commission = 0.003; // 달러당 수수료율(0.3%)
		double k08_comPerOne = k08_moneyEx*k08_commission; // 달러당 수수료 = 달러당 원*달러당 수수료율
		
		int k08_usd = (int)(k08_myWon/k08_moneyEx); // 달러 = 원/달러당 원(소수점 이하 버림.)
		double k08_totalCom = k08_usd*k08_comPerOne; // 총 수수료 = 달러*달러당 수수료
		int k08_i_totalCom; // 정수형 총 수수료
		// 총 수수료가 정수로 떨어지지 않으면 정수형으로 하고 올림, 정수로 떨어지면 정수형으로만 바꾸어줌.
		if(k08_totalCom != (double)((int)k08_totalCom)) { 
			k08_i_totalCom = (int)k08_totalCom+1; 
		} else { // 
			k08_i_totalCom = (int)k08_totalCom; 
		}
		int k08_remain = (int)(k08_myWon-k08_usd*k08_moneyEx-k08_i_totalCom); // 잔돈 = 원-환전액-정수형 총 수수료
		// 환전을 다 한 후에 수수료를 빼므로 오차가 생김.(잔돈이 -가 된다.)
		
		System.out.printf("********************************************************************\n");
		System.out.printf("*                          수수료 적용 환전                                                   *\n");
		System.out.printf("달러당 수수료 : %f원, 총 수수료 : %d원\n", k08_comPerOne, k08_i_totalCom);
		System.out.printf("총 한화환전금액 : %d원 => 미화 : %d달러, 수수료징구 : %d원, 잔돈 : %d원\n", k08_myWon, k08_usd, k08_i_totalCom, k08_remain);
		System.out.printf("********************************************************************\n");
			
	}
}
