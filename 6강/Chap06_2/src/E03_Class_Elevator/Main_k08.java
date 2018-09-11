//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 4. 클래스, 객체, 인스턴스(엘리베이터)
package E03_Class_Elevator;

public class Main_k08 {
	
	private static int inVal;
	
	public static void up_k08() {
		inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", inVal);
	}
		
	public static void main(String[] args) {
		// 클래스 내부 변수/메소드 사용
		inVal = 0;
		up_k08();
		
		// 외부 클래스 사용
		Elevator_k08 el;			// 클래스, 객체 
		el = new Elevator_k08();	// 객체를 인스턴스화.
				
		for(int i = 0; i < 10; i++) {	
			el.up_k08();
			System.out.printf("MSG[%s]\n", el.msg);
		}
	
		for(int i = 0; i < 10; i++) {
			el.down_k08();
			System.out.printf("MSG[%s]\n", el.msg);
		}
	}
}
