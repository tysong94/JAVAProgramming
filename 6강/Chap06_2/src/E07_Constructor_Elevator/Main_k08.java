//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 7. ������(����������)
package E07_Constructor_Elevator;

public class Main_k08 {
	public static void main(String[] args) {
		
		// ù��° ������
		Elevator2_k08 el = new Elevator2_k08();
		
		for(int i = 0; i < 10; i++){
			el.up();
			System.out.printf("MSG el[%s]\n", el.help);
		}
	
		for(int i = 0; i < 10; i++)	{
			el.down();
			System.out.printf("MSG el[%s]\n", el.help);
		}
		
		// �ι�° ������
		Elevator2_k08 el2 = new Elevator2_k08(5, -5);
				
		for(int i = 0; i < 5; i++){
			el2.up();
			System.out.printf("MSG el2[%s]\n", el2.help);
		}
	
		for(int i = 0; i < 11; i++)	{
			el2.down();
			System.out.printf("MSG el2[%s]\n", el2.help);
		}
		
		// ����° ������
		Elevator2_k08 elUP = new Elevator2_k08(5);
		System.out.printf("MSG elUP[%s]\n", elUP.help);
		
		Elevator2_k08 elDN = new Elevator2_k08(-5);
		System.out.printf("MSG elDN[%s]\n", elDN.help);
		
		
	
	}
}
