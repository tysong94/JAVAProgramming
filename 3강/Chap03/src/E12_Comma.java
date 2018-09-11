import java.text.DecimalFormat;

// 날짜 : 5월 4일 
// 저자 : 송태양
// 제목 : 12. 콤마 찍기

public class E12_Comma {
	public static void main(String[] args) {
		int k08_myWon = 1000000; // 원
		double k08_moneyEx = 1238.21; // 달러당 원
		double k08_commission = 0.003; // 달러당 수수료율
		double k08_comPerOne = k08_moneyEx*k08_commission; // 달러당 수수료 = 달러당 원*달러당 수수료율
		
		int k08_usd = (int)(k08_myWon/(k08_moneyEx+k08_comPerOne)); // 달러 = 원/(달러당 원+달러당 수수료) -> 환전시에 먼저 수수료까지 계산해야함.
		double k08_totalCom = k08_usd*k08_comPerOne; // 총 수수료 = 달러*달러당 수수료
		int k08_i_totalCom; // 정수형 총 수수료
		// 총 수수료가 정수로 떨어지지 않으면 정수형으로 하고 올림, 정수로 떨어지면 정수형으로만 바꾸어줌.
		if(k08_totalCom != (double)((int)k08_totalCom)) { 
			k08_i_totalCom = (int)k08_totalCom+1; 
		} else {
			k08_i_totalCom = (int)k08_totalCom; 
		}
		int k08_remain = (int)(k08_myWon-k08_usd*k08_moneyEx-k08_i_totalCom); // 잔돈 = 원 - 달러한화 - 정수형 총 수수료
		
		// 콤마찍기
		// 숫자를 ,로 표현하기 위해 DecimalFormat 변수를 생성하고 df.format 메소드를 호출함.
		// 출력할 시 출력형은 %s로 해야 한다.
		DecimalFormat df = new DecimalFormat("###,###,###,###");
				
		System.out.printf("*********************************************************************\n");
		System.out.printf("*                            콤마찍기                                                          *\n");
		System.out.printf("달러당 수수료 : %f원, 총 수수료 : %s원\n", 
				k08_comPerOne, 
				df.format(k08_i_totalCom));
		System.out.printf("총 한화환전금액 : %s원 => 미화 : %s달러, 수수료징구 : %s원, 잔돈 : %s원\n", 
				df.format(k08_myWon), 
				df.format(k08_usd), 
				df.format(k08_i_totalCom), 
				df.format(k08_remain));
		System.out.printf("*********************************************************************\n");
			
	}
}
