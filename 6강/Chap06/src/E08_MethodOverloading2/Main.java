//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 8. 메소드 오버로딩(점수)
package E08_MethodOverloading2;

public class Main {
	public static void main(String[] args) {
		
		Score s = new Score();
		
		s.score(100, 100, 100);
		s.score(100, 100, 100, 100);
		s.score(100, 100, 100, 100, 100);
	}
}
