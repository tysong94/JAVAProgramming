// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 띄어쓰기 연습
public class P11_Space {
	public static void main(String[] args) {
		
		for(int space_k08 = 0; space_k08 < 10; space_k08++) 
		{
			for(int num_k08 = 0; num_k08 < space_k08; num_k08++) // space수 만큼 시행
			{ 
				System.out.printf(" "); // space수 만큼 공백을 찍는다.
			}
			System.out.printf("%d\n", space_k08); // 공백에 뒤이어 space수를 출력하고 개행함.
		}
	
	}
}
