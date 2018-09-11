//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 7. 메소드 오버로딩(계산기)
package E07_MethodOverloading;

public class Calc {

	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	public double sum(double a, double b) {
		return a + b;
	}

}
