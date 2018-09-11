//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 11. 메소드 오버라이딩
package E11_Overriding;

public class Main_k08 {
	public static void main(String[] args) {
	
		Elevator3_k08 el = new Elevator3_k08();
		
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
