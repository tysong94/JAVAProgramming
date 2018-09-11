//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 12. ���(������)
package E12_Inheritance2;

public class TVRC2 {

	int MaxVol = 5;
	int MinVol = 0;
	int Vol = 0;
	
	int MaxChannel = 10;
	int MinChannel = 1;
	int Channel = 1;
	
	String Voice;

	TVRC2() {
		
	}
	
	TVRC2(int Vol, int Channel) {
		System.out.printf("TV Ʋ��\n");
		if(Vol > 0) {
			for(int i = 0; i < Vol; i++) this.VolUp();
		}
		else if(Vol < 0) {
			for(int i = 0; i < (Vol*-1); i++) this.VolDn();
		}
		
		if(Channel > 0) {
			for(int i = 0; i < Channel; i++) this.ChannelUp();
		}
		else if(Channel < 0) {
			for(int i = 0; i < (Channel*-1); i++) this.ChannelDn();
		}
	}
	
	void VolUp() {
		if(Vol != MaxVol) {
			Vol++;
			Voice = String.format("���� : %d\n", Vol);
		} 
		else {
			Voice = String.format("���� : %d, �ִ� �����Դϴ�.\n", Vol);	
		}
	}
	
	void VolDn() {
		if(Vol != MinVol) {
			Vol--;
			Voice = String.format("���� : %d\n", Vol);
		}
		else {
			Voice = String.format("���� : %d, �ּ� �����Դϴ�.\n", Vol);	
		}
	}
	
	void ChannelUp() {
		if(Channel != MaxChannel) {
			Channel++;
			Voice = String.format("ä�� : %d��\n", Channel);
		}
		else {
			Voice = String.format("ä�� : %d��, ������ ä���Դϴ�.\n", Channel);
		}
	}
	
	void ChannelDn() {
		if(Channel != MinChannel) {
			Channel--;
			Voice = String.format("ä�� : %d��\n", Channel);
		}
		else {
			Voice = String.format("ä�� : %d��, ó�� ä���Դϴ�.\n", Channel);
		}
	}

}
