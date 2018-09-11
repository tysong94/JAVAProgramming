//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 5. 메소드 오버로딩(계산기)
package E05_MethodOverloading;

public class Main_k08 {
	public static void main(String[] args) {
		
		Calc_k08 c = new Calc_k08();
		
		System.out.printf("2개 덧셈 호출 [%d]\n", c.sum_k08(1, 2));
		System.out.printf("3개 덧셈 호출 [%d]\n", c.sum_k08(1, 2, 3));
		System.out.printf("4개 덧셈 호출 [%d]\n", c.sum_k08(1, 2, 3, 4));
		System.out.printf("더블형 덧셈 호출 [%f]\n", c.sum_k08(1.3, 2.4));
		
	}
}
