// 날짜 : 5월 4일 
// 저자 : 송태양
// 제목 : 9. 수수료 계산

public class E09_Exchange2 {
	public static void main(String[] args) {
		int k08_myWon = 1000000; // 원
		double k08_moneyEx = 1238.21; // 달러당 원
		double k08_commission = 0.003; // 달러당 수수료율(0.3%)
		
		int k08_usd = (int)(k08_myWon/k08_moneyEx); // 달러 = 원/달러당 원(소수점 이하 버림.)
		int k08_remain = (int)(k08_myWon-k08_usd*k08_moneyEx); // 잔돈 = 원-환전액(달러*달러당 원)(소수점 이하 버림.)
		
		double k08_comPerOne = k08_moneyEx*k08_commission; // 달러당 수수료 = 달러당 원*달러당 수수료율
		double k08_totalCom = k08_usd*k08_comPerOne; // 총  수수료 = 달러*달러당 수수료
		
		System.out.printf("*********************************************\n");
		System.out.printf("*                  수수료 계산                              *\n");
		System.out.printf("달러당 수수료 : %f원, 총 수수료 : %f원 \n", k08_comPerOne, k08_totalCom);
		System.out.printf("*********************************************\n");
		
	}
}
