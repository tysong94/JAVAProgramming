//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 11. �޼ҵ� �������̵�
package E11_Overriding;

public class Elevator3_k08 extends Elevator2_k08 {

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
