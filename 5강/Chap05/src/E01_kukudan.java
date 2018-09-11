// 날짜 : 5월 14일 
// 저자 : 송태양
// 제목 : 구구단 인쇄
public class E01_kukudan {
	public static void main(String[] args) {
		
		// 1, 2, 3단을 동시에 출력 -> 증감식을 +3으로 한다.(123, 456, 789)
		for(int i_k08 = 1; i_k08 <= 7; i_k08 = i_k08+3) 
		{
			System.out.printf("************\t************\t************\n");
			System.out.printf(" 구구단 %d단\t 구구단%d 단\t 구구단%d 단\n", i_k08, i_k08+1, i_k08+2);
			System.out.printf("************\t************\t************\n");
			
			// 곱하기는 모두 동일하므로 그대로 한다.
			for(int j_k08 = 1; j_k08 < 10; j_k08++) 
			{
				// 숫자를 정렬해야 하므로 곱한 값에 대하여 %2d로 2칸을 잡음.
				System.out.printf(" %d * %d = %2d      %d * %d = %2d      %d * %d = %2d     \n", 
						// 123단, 456단, 789단 동시에 함 -> 단을 i, i+1, i+2로 하고 곱해줌.
						i_k08, j_k08, i_k08*j_k08,  i_k08+1, j_k08, (i_k08+1)*j_k08, i_k08+2, j_k08, (i_k08+2)*j_k08); 
			}
		}
		
	}
}
