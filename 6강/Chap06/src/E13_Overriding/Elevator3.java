//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 13. 메소드 오버라이딩
package E13_Overriding;

public class Elevator3 extends Elevator2{

	void repair() {
		help = "수리중입니다";
	}
	
	void up() {
		if(floor == limit_up_floor) {
			help = "마지막층입니다.";
		}
		else {
			floor = floor+2;
			help = String.format("%d층입니다.", floor);
		}
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.help);
	}
}
