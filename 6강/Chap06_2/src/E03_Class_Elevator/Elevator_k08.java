//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 4. 클래스, 객체, 인스턴스(엘리베이터)
package E03_Class_Elevator;

public class Elevator_k08 {

		int limit_up_floor = 10;	// 최상층
		int limit_down_floor = 0;	// 최하층
		int floor = 1;				// 현재층
		String msg;					// 메세지(전역변수) -> formating...
		
		// 올라가는 메소드
		void up_k08() {	
			if(floor == limit_up_floor) {
				msg = "마지막층입니다.";
			}
			else {
				floor++;
				msg = String.format("%d층입니다.", floor); 
				// 프린트를 하는 대신 String.format으로 상태를 저장함.(현재 어딘지 알 수 있음)
			}
		}
		// 내려가는 메소드
		void down_k08() {
			if(floor == limit_down_floor) { 
				msg = "처음층입니다.";
			}
			else {
				floor--;
				msg = String.format("%d층입니다.", floor);
			}
		}
}


