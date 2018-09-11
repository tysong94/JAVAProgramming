//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 9. ������(����������)
package E09_Constructor;

public class Elevator2 {

		int limit_up_floor;
		int limit_down_floor;
		int floor;
		String help;
		
		// �ִ��� 10, ������ 0, ������ 1�� �ذ�.
		Elevator2() {
			limit_up_floor = 10;
			limit_down_floor = 0;
			floor = 1;
			System.out.printf("���������� �ذ� �Ϸ�\n");
		}
		
		// �ִ��� 10, ������ 0, ������ a�� ����.
		Elevator2(int a) {
			limit_up_floor = 10;
			limit_down_floor = 0;
			floor = 1;
			System.out.printf("���������� �ذ� �Ϸ�[%d]\n", a);
		
			if(a > 0) {
				for(int i = 0; i < a; i++) this.up();
			}
			else if(a < 0) {
				for(int i = 0; i < (a*-1); i++) this.down();
			}
		}
				
		void up() {
			if(floor == limit_up_floor) {
				help = "���������Դϴ�.";
			}
			else {
				floor++;
				help = String.format("%d���Դϴ�.", floor);
			}
		}
		
		void down() {
			if(floor == limit_down_floor) { 
				help = "ó�����Դϴ�.";
			}
			else {
				floor--;
				help = String.format("%d���Դϴ�.", floor);
			}
		}
}


