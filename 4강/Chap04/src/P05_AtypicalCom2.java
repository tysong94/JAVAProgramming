// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 비정형 비교2
public class P05_AtypicalCom2 {
	public static void main(String[] args) {
		
		for(int month_k08 = 1; month_k08 <= 12; month_k08++) // 월 반복문
		{
			System.out.printf("%d월 => ", month_k08);
			for(int day_k08 = 1; day_k08 <= 31; day_k08++) // 일 반복문
			{
				System.out.printf("%d", day_k08);
				
				if(month_k08 == 4 || month_k08 == 6 || month_k08 == 7 || month_k08 == 9 || month_k08 == 11) 
				{ 
					if(day_k08 == 30) { break; }
				} 
				// 4, 6, 7, 9, 11월 일 때 30일에서 멈춤.
				
				if(month_k08 == 2) 
				{ 
					if(day_k08 == 28) { break; } 
				} 
				// 2월 일 때 28일에서 멈춤.
				
				if(day_k08 == 31) { break; } 
				// 31일이 되면 멈춤.
				
				System.out.printf(",", day_k08);
				// 비정형 비교 1에서 중복되는 부분을 묶음
				// 월 if에 일 if를 중첩하여 실행 
			}
			System.out.printf("\n");
		}
		
	}
}
