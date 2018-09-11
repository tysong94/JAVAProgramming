//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 7. 메소드 오버로딩(계산기)
package E07_MethodOverloading;

public class Main {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		System.out.printf("2개 덧셈 호출 [%d]\n", c.sum(1, 1));
		System.out.printf("3개 덧셈 호출 [%d]\n", c.sum(1, 1, 1));
		System.out.printf("4개 덧셈 호출 [%d]\n", c.sum(1, 1, 1, 1));
		System.out.printf("더블형 덧셈 호출 [%f]\n", c.sum(1.3, 2.4));
		
	}
}
