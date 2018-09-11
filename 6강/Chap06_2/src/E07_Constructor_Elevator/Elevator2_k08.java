//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 7. ������(����������)
package E07_Constructor_Elevator;

public class Elevator2_k08 {

		int limit_up_floor;
		int limit_down_floor;
		int floor;
		String help;
		
		// �ֻ��� 10, ������ 1, ������ 1�� �ذ�.
		Elevator2_k08() {
			limit_up_floor = 10;
			limit_down_floor = 1;
			floor = 1;
			System.out.printf("���������� �ذ� �Ϸ�, �ֻ��� 10��, ������ 1��\n");
		}
		
		// �ֻ��� top, ������ bottom, ������ 1�� �ذ�.
		Elevator2_k08(int top, int bottom) {
			limit_up_floor = top;
			limit_down_floor = bottom;
			floor = 1;
			System.out.printf("���������� �ذ� �Ϸ�, �ֻ��� %d��, ������ %d��\n", top, bottom);
		}
		
		// �ֻ��� 10, ������ 1, ������ a�� ����.
		Elevator2_k08(int a) {
			this();
		
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


