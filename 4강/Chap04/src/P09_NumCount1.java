// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 숫자 읽기
public class P09_NumCount1 {
	public static void main(String[] args) {
		
		// 스트링 배열 units 변수에 숫자 한글 원소를 넣음.
		String[] units_k08 = {"영","일","이","삼","사","오","육","칠","팔","구"};
		
		for(int num_k08 = 0; num_k08 < 101; num_k08++) 
		{
			// num이 1의 자리일 때
			if(0 <= num_k08 && num_k08 < 10) 
			{ 
				System.out.printf("일의자리 : %s\n", units_k08[num_k08]); // units배열의 해당 숫자 한글을 출력.
			} 
			
			// num이 10의 자리일 때
			else if(10 <= num_k08 && num_k08 < 100) 
			{ 
				int num10_k08, num1_k08; // num의 10의 자리, num의 1의 자리 선언
				num10_k08 = num_k08 / 10; // num의 10의 자리 = i/10(몫)
				num1_k08 = num_k08 % 10; // num의 1의 자리 = i%10(나머지)
				
				if(num1_k08 == 0) // num의 1의 자리가 0일 때 
				{
					System.out.printf("십의자리 : %s십\n", units_k08[num10_k08]); // 10의 자리만 숫자 한글을 출력함.
				} 
				else // num의 1의 자리가 0이 아닐 때
				{
					System.out.printf("십의자리 : %s십%s\n", units_k08[num10_k08], units_k08[num1_k08]); // 10의 자리와 1의 자리의 숫자 한글을 출력함.
				}
			} 
			
			// num이 그 외일 때(100의 자리일 때)
			else 
			{
				System.out.printf("==> %d\n", num_k08);	// 그냥 출력한다.(100임)		
			}
		}
		
	}
}
