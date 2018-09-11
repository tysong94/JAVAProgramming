// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 1. 한글 계산
public class E01_Han {
	public static void main(String[] args) {
		
		// 글자 포함 15칸 출력.
		System.out.printf("HanBlankForeword[%s]\n", Han.BlankForeword("한글aa", 15));		
		System.out.printf("HanBlankForeword[%s]\n", Han.BlankForeword("한글한글aa", 15));	
		System.out.printf("HanBlankForeword[%s]\n", Han.BlankBackword("한글aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", Han.BlankBackword("한글한글aa", 15));
		// 글자에서 한글의 개수를 셈.
		System.out.printf("한글은 [%d]개\n", Han.Count("한글한글aa")); 						
	
	}
}
