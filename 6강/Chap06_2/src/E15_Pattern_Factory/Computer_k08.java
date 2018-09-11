//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 15. 팩토리 패턴
package E15_Pattern_Factory;

public abstract class Computer_k08 {
	public abstract String getName();	// 추상 메소드를 선언
	
	public String toString() {			// 필요 메소드를 정의
		return "이름 : " + getName();
	}
}
