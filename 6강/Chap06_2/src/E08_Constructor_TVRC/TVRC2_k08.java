//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 8. 생성자(리모콘)
package E08_Constructor_TVRC;

public class TVRC2_k08 {

	int MaxVol = 10;
	int MinVol = 0;
	int Vol = 0;
	
	int MaxChannel = 20;
	int MinChannel = 1;
	int Channel = 1;
	
	String Voice;

	// 생성자 1
	TVRC2_k08 (int maxVol, int minVol, int maxChannel, int minChannel) {
		this.MaxVol = maxVol;
		this.MinVol = minVol;
		this.MaxChannel = maxChannel;
		this.MinChannel = minChannel;
		System.out.printf("TV 틀기, 최대 볼륨%d, 최소 볼륨%d, 최대 채널%d, 최소 채널%d\n", this.MaxVol, this.MinVol, this.MaxChannel, this.MinChannel);
	}
	// 생성자 2
	TVRC2_k08(int Vol, int Channel) {
		System.out.printf("TV 틀기\n");
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
			Voice = String.format("볼륨 : %d\n", Vol);
		} 
		else {
			Voice = String.format("볼륨 : %d, 최대 볼륨입니다.\n", Vol);	
		}
	}
	
	void volDn_k08() {
		if(Vol != MinVol) {
			Vol--;
			Voice = String.format("볼륨 : %d\n", Vol);
		}
		else {
			Voice = String.format("볼륨 : %d, 최소 볼륨입니다.\n", Vol);	
		}
	}
	
	void chUp_k08() {
		if(Channel != MaxChannel) {
			Channel++;
			Voice = String.format("채널 : %d번\n", Channel);
		}
		else {
			Voice = String.format("채널 : %d번, 마지막 채널입니다.\n", Channel);
		}
	}
	
	void chDn_k08() {
		if(Channel != MinChannel) {
			Channel--;
			Voice = String.format("채널 : %d번\n", Channel);
		}
		else {
			Voice = String.format("채널 : %d번, 처음 채널입니다.\n", Channel);
		}
	}

}
