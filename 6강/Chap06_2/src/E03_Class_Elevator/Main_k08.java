//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 4. Ŭ����, ��ü, �ν��Ͻ�(����������)
package E03_Class_Elevator;

public class Main_k08 {
	
	private static int inVal;
	
	public static void up_k08() {
		inVal++;
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", inVal);
	}
		
	public static void main(String[] args) {
		// Ŭ���� ���� ����/�޼ҵ� ���
		inVal = 0;
		up_k08();
		
		// �ܺ� Ŭ���� ���
		Elevator_k08 el;			// Ŭ����, ��ü 
		el = new Elevator_k08();	// ��ü�� �ν��Ͻ�ȭ.
				
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
