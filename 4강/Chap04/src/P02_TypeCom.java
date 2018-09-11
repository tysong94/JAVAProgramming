// 날짜 : 5월 9일  
// 저자 : 송태양
// 제목 : 숫자형, 문자형 비교
public class P02_TypeCom {
	public static void main(String[] args) {
		
	// 숫자형 비교
		int i_k08;
		double d_k08;
		
		i_k08 = 10/3; // i = 3
		d_k08 = 10/3.0; // d = 3.333...
		
		// int와 double은 정수형 연산과 실수형 연산이다.
		// i = 3.000000 != d = 3.333333...(비교시 int가 double로 형변환되어도 값은 변하지 않음.)
		if(i_k08 == d_k08) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n", (double)i_k08,d_k08); 
		
		// 단지 유효숫자까지 표시된 것 뿐이지 다르다.
		// d = 3.333... != 3.333333
		if(d_k08==3.333333) System.out.printf("equal\n");
		else System.out.printf("Not equal[3.333333][%f]\n", d_k08);
		
		// d를 double에서 int로 형변환 -> 소수점 자리가 버려짐.
		// d = 3 = i = 3
		d_k08=(int)d_k08;
		if(i_k08==d_k08) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n", (double)i_k08,d_k08);
		
		// i를 int, double로 인쇄 -> int는 소수점 자리 표시x, double은 소수점 자리 표시o.
		System.out.printf("int로 인쇄[%d][%f]\n", i_k08, d_k08);
		System.out.printf("double로 인쇄[%f][%f]\n", (double)i_k08, d_k08);
		
	// char 비교
		// char는 =='문자'와 같이 비교. 
		char a_k08='c';
		
		if(a_k08=='b') System.out.printf("a는 b이다\n");
		if(a_k08=='c') System.out.printf("a는 c이다\n");
		if(a_k08=='d') System.out.printf("a는 d이다\n");
		
	// String 비교
		// String은 클래스 함수 .equals("문자열")을 사용.
		String aa_k08="abcd";
		
		if(aa_k08.equals("abcd")) System.out.printf("aa는 abcd이다.\n");
		else System.out.printf("aa는 abcd가 아니다.\n");
		
	// boolean 비교
		// boolean은 (변수) 또는 (!변수) 와 같이 비교. 
		boolean b_k08=true;
		
		if(!!b_k08) System.out.printf("b가 아니고 아니면 참이다.\n");
		else System.out.printf("b가 아니고 아니면 거짓이다.\n");
		
		
		
	}
}
