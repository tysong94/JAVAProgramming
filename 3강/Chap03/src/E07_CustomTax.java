// 날짜 : 5월 4일 
// 저자 : 송태양
// 제목 : 7. 소비자가격 중심 세금 계산

// 세후가격과 세율이 먼저 주어지고 세전가격과 세금을 계산하는 방식.
// 세금을 올려야 하므로 세전가격을 내려야(버려야) 한다.
// custom = netval+taxval -> 세후가격 = 세전가격+세금
// netval = custom/(1+rate) -> 세전가격 = 세후가격/(1+세율)
// taxval = custom-netval -> 세금 = 세후가격-세전가격

public class E07_CustomTax {
	public static void main(String[] args) {
	
		int k08_custom = 280; // 세후가격
		int k08_taxrate = 3; // 3%는 0.03 -> 세율 = taxrate/100.0;
		
		int k08_netval, k08_taxval; // 세전가격, 세금
		
		k08_netval = (int)(k08_custom/(1+k08_taxrate/100.0)); // 세전가격 = 세후가격/(1+세율) -> 실수형 계산 후 정수형 변환으로 소수점 이하 버림.
		k08_taxval = k08_custom-k08_netval; // 세금 = 세후가격-세전가격
		
		System.out.printf("**************************************\n");
		System.out.printf("*          소비자가격 중심 세금 계산               *\n");
		System.out.printf(" 소비자가격 : %d, 세전 가격 : %d, 세금 : %d \n", k08_custom, k08_netval, k08_taxval);
		System.out.printf("**************************************\n");
	}
}
