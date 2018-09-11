//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 9. 생성자(엘리베이터)
package E09_Constructor;

public class Elevator2 {

		int limit_up_floor;
		int limit_down_floor;
		int floor;
		String help;
		
		// 최대층 10, 최하층 0, 현재층 1로 준공.
		Elevator2() {
			limit_up_floor = 10;
			limit_down_floor = 0;
			floor = 1;
			System.out.printf("엘리베이터 준공 완료\n");
		}
		
		// 최대층 10, 최하층 0, 현재층 a로 만듦.
		Elevator2(int a) {
			limit_up_floor = 10;
			limit_down_floor = 0;
			floor = 1;
			System.out.printf("엘리베이터 준공 완료[%d]\n", a);
		
			if(a > 0) {
				for(int i = 0; i < a; i++) this.up();
			}
			else if(a < 0) {
				for(int i = 0; i < (a*-1); i++) this.down();
			}
		}
				
		void up() {
			if(floor == limit_up_floor) {
				help = "마지막층입니다.";
			}
			else {
				floor++;
				help = String.format("%d층입니다.", floor);
			}
		}
		
		void down() {
			if(floor == limit_down_floor) { 
				help = "처음층입니다.";
			}
			else {
				floor--;
				help = String.format("%d층입니다.", floor);
			}
		}
}


