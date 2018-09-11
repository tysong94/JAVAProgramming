//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 9. 상속(엘리베이터)
package E09_Inheritance_Elevator;

public class Elevator3_k08 extends Elevator2_k08 implements Door_k08{

	void repair_k08() {
		help = "수리중입니다";
	}

	@Override
	public void open() {
		System.out.println("엘리베이터 문이 열립니다.");
	}

	@Override
	public void close() {
		System.out.println("엘리베이터 문이 닫힙니다.");
	}
}
