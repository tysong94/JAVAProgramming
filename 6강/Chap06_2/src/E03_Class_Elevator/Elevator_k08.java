//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 4. Ŭ����, ��ü, �ν��Ͻ�(����������)
package E03_Class_Elevator;

public class Elevator_k08 {

		int limit_up_floor = 10;	// �ֻ���
		int limit_down_floor = 0;	// ������
		int floor = 1;				// ������
		String msg;					// �޼���(��������) -> formating...
		
		// �ö󰡴� �޼ҵ�
		void up_k08() {	
			if(floor == limit_up_floor) {
				msg = "���������Դϴ�.";
			}
			else {
				floor++;
				msg = String.format("%d���Դϴ�.", floor); 
				// ����Ʈ�� �ϴ� ��� String.format���� ���¸� ������.(���� ����� �� �� ����)
			}
		}
		// �������� �޼ҵ�
		void down_k08() {
			if(floor == limit_down_floor) { 
				msg = "ó�����Դϴ�.";
			}
			else {
				floor--;
				msg = String.format("%d���Դϴ�.", floor);
			}
		}
}


