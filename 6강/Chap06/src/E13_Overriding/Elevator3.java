//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 13. �޼ҵ� �������̵�
package E13_Overriding;

public class Elevator3 extends Elevator2{

	void repair() {
		help = "�������Դϴ�";
	}
	
	void up() {
		if(floor == limit_up_floor) {
			help = "���������Դϴ�.";
		}
		else {
			floor = floor+2;
			help = String.format("%d���Դϴ�.", floor);
		}
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.help);
	}
}
