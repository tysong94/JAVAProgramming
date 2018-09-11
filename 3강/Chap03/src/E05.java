// 날짜 : 5월 4일 
// 저자 : 송태양
// 제목 : 5. 소수점 자리의 버림, 반올림 처리

public class E05 {
	public static void main(String[] args) {
		// 정수형 변수 나눗셈 -> 소수점 자리가 버려짐.
		int k08_myVal;
				
		k08_myVal=14/5;
		System.out.printf("5-1 : %d\n", k08_myVal);

		// 실수형 변수 나눗셈 -> 소수점 자리가 나옴.
		double k08_myValF;
		
		k08_myValF=14/5; // 계산식이 정수형이므로 소수점 자리가 나오지 않음.
		System.out.printf("5-2 : %f\n", k08_myValF);
		
		k08_myValF=14/5.0; // 계산식이 실수형을 하나라도 포함해야 소수점 자리가 나옴.
		System.out.printf("5-3 : %f\n", k08_myValF);
		k08_myValF=14.0/5;
		System.out.printf("5-3 : %f\n", k08_myValF);
		
		k08_myValF=14.0/5+0.5; // 실수형 계산 후 0.5 더함
		System.out.printf("5-4 : %f\n", k08_myValF);
		
		k08_myValF=(int)(14.0/5+0.5); // 실수형 계산 후 0.5 더하고 정수형 변환 -> 소수점이 반올림된다.
		System.out.printf("5-5 : %f\n", k08_myValF);
	}
}
