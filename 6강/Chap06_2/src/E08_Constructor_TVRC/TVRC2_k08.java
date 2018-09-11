//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 8. ������(������)
package E08_Constructor_TVRC;

public class TVRC2_k08 {

	int MaxVol = 10;
	int MinVol = 0;
	int Vol = 0;
	
	int MaxChannel = 20;
	int MinChannel = 1;
	int Channel = 1;
	
	String Voice;

	// ������ 1
	TVRC2_k08 (int maxVol, int minVol, int maxChannel, int minChannel) {
		this.MaxVol = maxVol;
		this.MinVol = minVol;
		this.MaxChannel = maxChannel;
		this.MinChannel = minChannel;
		System.out.printf("TV Ʋ��, �ִ� ����%d, �ּ� ����%d, �ִ� ä��%d, �ּ� ä��%d\n", this.MaxVol, this.MinVol, this.MaxChannel, this.MinChannel);
	}
	// ������ 2
	TVRC2_k08(int Vol, int Channel) {
		System.out.printf("TV Ʋ��\n");
		if(Vol > 0) {
			for(int i = 0; i < Vol; i++) this.volUp_k08();
		}
		else if(Vol < 0) {
			for(int i = 0; i < (Vol*-1); i++) this.volDn_k08();
		}
		
		if(Channel > 0) {
			for(int i = 0; i < Channel; i++) this.chUp_k08();
		}
		else if(Channel < 0) {
			for(int i = 0; i < (Channel*-1); i++) this.chDn_k08();
		}
	}
	
	void volUp_k08() {
		if(Vol != MaxVol) {
			Vol++;
			Voice = String.format("���� : %d\n", Vol);
		} 
		else {
			Voice = String.format("���� : %d, �ִ� �����Դϴ�.\n", Vol);	
		}
	}
	
	void volDn_k08() {
		if(Vol != MinVol) {
			Vol--;
			Voice = String.format("���� : %d\n", Vol);
		}
		else {
			Voice = String.format("���� : %d, �ּ� �����Դϴ�.\n", Vol);	
		}
	}
	
	void chUp_k08() {
		if(Channel != MaxChannel) {
			Channel++;
			Voice = String.format("ä�� : %d��\n", Channel);
		}
		else {
			Voice = String.format("ä�� : %d��, ������ ä���Դϴ�.\n", Channel);
		}
	}
	
	void chDn_k08() {
		if(Channel != MinChannel) {
			Channel--;
			Voice = String.format("ä�� : %d��\n", Channel);
		}
		else {
			Voice = String.format("ä�� : %d��, ó�� ä���Դϴ�.\n", Channel);
		}
	}

}
