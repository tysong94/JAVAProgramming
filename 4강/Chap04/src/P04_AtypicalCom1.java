// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 비정형 비교1
public class P04_AtypicalCom1 {
	public static void main(String[] args) {
		
		// 무조건 짧게 하는 것이 아니라 누구나 알아볼 수 있도록 코딩하는 것이 좋음.
		// 1월일 때 31일, 2월일 때 28일 ... 12월 일 때 31일이면 for문을 멈춤.
		
		for(int month_k08 = 1; month_k08 < 13; month_k08++) // 월 반복문
		{
			System.out.printf("%d월 => ", month_k08);
			for(int day_k08 = 1; day_k08 < 32; day_k08++) // 일 반복문
			{
				if(month_k08 == 1 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 2 && day_k08 == 28) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 3 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 4 && day_k08 == 30) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 5 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 6 && day_k08 == 30) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 7 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 8 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 9 && day_k08 == 30) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 10 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 11 && day_k08 == 30) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 12 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				// 해당 month와 마지막day의 조건을 모두 만족할 때 반복문을 멈추도록 함.
				// 단순하게 해당 month 비교와 해당 day 비교를 && 연산자로 묶어주어 조건을 준다.
				System.out.printf("%d,", day_k08);
			}
			System.out.printf("\n");
		}
		
	}
}
