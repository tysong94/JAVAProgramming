// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 피라미드 찍기
public class P13_Pyramid {
	public static void main(String[] args) {
		
		int star_k08, space_k08;
		
		star_k08 = 1; space_k08 = 20;
		
		while(true)
		{
			for(int i_k08 = 0; i_k08 < space_k08; i_k08++) { System.out.printf(" "); } // space 값 만큼 공백을 찍어줌
			for(int i_k08 = 0; i_k08 < star_k08; i_k08++) { System.out.printf("*"); } // star 값 만큼 별을 찍어줌.
			System.out.printf("\n"); // 공백, 별 다 찍고 개행
			
			space_k08 = space_k08-1; // space는 값을 하나씩 줄인다.
			star_k08 = star_k08+2; // star는 값을 2개씩 늘린다.
			
			if(space_k08 < 0) break; // space가 0보다 작으면 끝냄.(총 21번 찍고 끝남.)
		}

	}
}
