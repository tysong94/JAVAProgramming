//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 13. 메소드 오버라이딩
package E13_Overriding;

public class Main {
	public static void main(String[] args) {
	
		Elevator3 el = new Elevator3();
		
		for(int i = 0; i < 10; i++){
			el.up();
			System.out.printf("MSG el3[%s]\n", el.help);
		}
	
		for(int i = 0; i < 10; i++)	{
			el.down();
			System.out.printf("MSG el3[%s]\n", el.help);
		}
		
		el.repair();
		System.out.printf("MSG el3[%s]\n", el.help);
		
			
	}
}
