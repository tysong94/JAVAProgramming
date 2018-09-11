// 날짜 : 5월 14일 
// 저자 : 송태양
// 제목 : 달력 인쇄
public class E03_Calendar {
	public static void main(String[] args) {
		
		// 0 ~ 6 -> 일요일 ~ 토요일
		int iWeekday_k08 = 1; 
		
		// 0번 ~ 11번 -> 1월 ~ 12월의 마지막 일
		int[] iMLD_k08 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		
		
		for(int iMon_k08 = 0; iMon_k08 < 12; iMon_k08++)
		{
			// 월, 헤더, 요일 출력
			System.out.printf("        %d월\n", iMon_k08 + 1);
			System.out.printf("=====================\n");
			System.out.printf(" 일 월 화 수 목 금 토 \n");
			
			// 공백을 찍어줌
			for(int space_k08 = 0; space_k08 <= iWeekday_k08 - 1; space_k08++) // 현재 요일 전만큼 공백을 찍어준다.
			{ System.out.printf("   "); } 
			
			// 일을 찍어줌
			for(int day_k08 = 1; day_k08 <= iMLD_k08[iMon_k08]; day_k08++) 
			{
				System.out.printf(" %2d", day_k08); 				// 일을 찍어줌.
				
				iWeekday_k08++;									// 다음 요일로 넘어간다.
				if(iWeekday_k08 == 7) 							// 다음 요일이 토요일을 넘어가면 개행하고, 0으로 바꾼다.(일요일로 바꾼다.)
				{ System.out.printf("\n"); iWeekday_k08 = 0; }
			}
			System.out.printf("\n\n");
		}
		
	}
}
