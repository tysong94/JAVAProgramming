// 날짜 : 5월 4일 
// 저자 : 송태양
// 제목 : 6. 단순 세금 계산
	
public class E06_TaxCal {
	public static int taxCal(int k08_val, int k08_rate) { // 세전가격, 세율
		int k08_taxR; // 세금
		
		if(((double)k08_val*(double)k08_rate/100.0) == k08_val*k08_rate/100) { // 실수로 세금을 계산한 것이 정수로 세금을 계산한 것과 같으면(정수로 떨어지면)
			k08_taxR = k08_val*k08_rate/100; // 정수로 계산한 값을 세금으로 준다.
		} else { // 실수 계산값과 정수 계산값이 같지 않으면
			k08_taxR = (k08_val*k08_rate/100)+1;  // 정수로 계산한 것 +1한 값을 세금으로 준다. -> 소수점 이하를 올림 처리한 것.
		}
		
		return k08_taxR;
	}

	public static void main(String[] args) {
		int k08_val = 271; // 세전가격
		int k08_rate = 3; // 세금 3퍼센트
	
		int k08_tax = taxCal(k08_val, k08_rate); // 세전가격과 세율로 세금을 계산함
	
		System.out.printf("***********************************\n");
		System.out.printf("*            단순 세금 계산                    *\n");
		System.out.printf("실제 세금 계산 : %f\n", k08_val*k08_rate/100.0); // 계산식에 실수가 포함되어 있으므로 실수 계산
		System.out.printf("세전 가격 : %d 세금 : %d 세포함가격 : %d\n", k08_val, k08_tax, k08_val+k08_tax); // 실수 세금계산과 정수 세금계산이 다름 -> else로 실행. -> +1 
		System.out.printf("***********************************\n");
	}
}

