//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 9. ���(����������)
package E09_Inheritance_Elevator;

public class Elevator3_k08 extends Elevator2_k08 implements Door_k08{

	void repair_k08() {
		help = "�������Դϴ�";
	}

	@Override
	public void open() {
		System.out.println("���������� ���� �����ϴ�.");
	}

	@Override
	public void close() {
		System.out.println("���������� ���� �����ϴ�.");
	}
}
