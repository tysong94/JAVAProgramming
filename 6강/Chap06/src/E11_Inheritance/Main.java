//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 11. ���(����������)
package E11_Inheritance;

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
