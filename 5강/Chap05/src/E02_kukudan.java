// 날짜 : 5월 14일 
// 저자 : 송태양
// 제목 : 구구단 인쇄2
public class E02_kukudan {
	public static void main(String[] args) {
		
		// i, i+3, i+6단을 동시에 출력 -> i가 3일때 끝나야 하므로 탈출식은 i < 4, 증감식은 i++
		for(int i_k08 = 1; i_k08 < 4; i_k08++) 
		{
			System.out.printf("************\t************\t************\n");
			System.out.printf(" 구구단 %d단\t 구구단 %d단\t 구구단 %d단\n", i_k08, i_k08+3, i_k08+6); 
			System.out.printf("************\t************\t************\n");
			
			//곱하기는 모두 동일하므로 그대로 한다.
			for(int j_k08 = 1; j_k08 < 10; j_k08++) 
			{
				// 숫자를 정렬해야 하므로 곱한 값에 대하여 %2d로 2칸을 잡음.
				System.out.printf(" %d * %d = %2d      %d * %d = %2d      %d * %d = %2d     \n", 
						// 단을 i, i+3, i+6로 하고 곱해줌.
						i_k08, j_k08, i_k08*j_k08,  i_k08+3, j_k08, (i_k08+3)*j_k08, i_k08+6, j_k08, (i_k08+6)*j_k08); 
			}
		}
		
	}
}
