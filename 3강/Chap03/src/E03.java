// 날짜 : 5월 4일 
// 저자 : 송태양
// 제목 : 3. 정수형 연산(버림), 나머지 연산자 응용

public class E03 {
	public static void main(String[] args) {
		// 정수형 변수의 나눗셈은 정수 범위에서 버림		
		int k08_i;
		
		k08_i = 1000/3; // 몫 구하기 (정수형 변수의 나눗셈은 나머지를 버리므로 몫과 같다.)
		System.out.printf("3-1 : %d\n", k08_i);
		
		k08_i = 1000%3; // 나머지 구하기
		System.out.printf("3-2 : %d\n", k08_i);
		
		// 나머지 연산자의 응용
		System.out.printf("3-3\n");
		for(int k08_ii=0; k08_ii<20; k08_ii++)
		{
			System.out.printf("%d ", k08_ii);
			if((k08_ii+1)%5 == 0) // (i+1)이 5의 배수가 될 때 개행함. 즉 다섯개씩 찍고 개행한다.
			{
				System.out.printf("\n");
			}
		}
		
	}
}
