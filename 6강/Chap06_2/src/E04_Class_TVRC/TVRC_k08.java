//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 6. Ŭ����, ��ü, �ν��Ͻ�(������)
package E04_Class_TVRC;

public class TVRC_k08 {

	int MaxVol = 5;
	int MinVol = 0;
	int Vol = 0;
	
	int MaxChannel = 10;
	int MinChannel = 1;
	int Channel = 1;
	
	String msg;
	
	void volUp_k08() {
		if(Vol != MaxVol) {
			Vol++;
			msg = String.format("���� : %d\n", Vol);
		} 
		else {
			msg = String.format("���� : %d, �ִ� �����Դϴ�.\n", Vol);	
		}
	}
	
	void volDn_k08() {
		if(Vol != MinVol) {
			Vol--;
			msg = String.format("���� : %d\n", Vol);
		}
		else {
			msg = String.format("���� : %d, �ּ� �����Դϴ�.\n", Vol);	
		}
	}
	
	void chUp_k08() {
		if(Channel != MaxChannel) {
			Channel++;
			msg = String.format("ä�� : %d��\n", Channel);
		}
		else {
			msg = String.format("ä�� : %d��, ������ ä���Դϴ�.\n", Channel);
		}
	}
	
	void chDn_k08() {
		if(Channel != MinChannel) {
			Channel--;
			msg = String.format("ä�� : %d��\n", Channel);
		}
		else {
			msg = String.format("ä�� : %d��, ó�� ä���Դϴ�.\n", Channel);
		}
	}

}
