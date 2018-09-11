//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 12. 상속(리모콘)
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
		System.out.printf("TV 틀기\n");
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
			Voice = String.format("볼륨 : %d\n", Vol);
		} 
		else {
			Voice = String.format("볼륨 : %d, 최대 볼륨입니다.\n", Vol);	
		}
	}
	
	void VolDn() {
		if(Vol != MinVol) {
			Vol--;
			Voice = String.format("볼륨 : %d\n", Vol);
		}
		else {
			Voice = String.format("볼륨 : %d, 최소 볼륨입니다.\n", Vol);	
		}
	}
	
	void ChannelUp() {
		if(Channel != MaxChannel) {
			Channel++;
			Voice = String.format("채널 : %d번\n", Channel);
		}
		else {
			Voice = String.format("채널 : %d번, 마지막 채널입니다.\n", Channel);
		}
	}
	
	void ChannelDn() {
		if(Channel != MinChannel) {
			Channel--;
			Voice = String.format("채널 : %d번\n", Channel);
		}
		else {
			Voice = String.format("채널 : %d번, 처음 채널입니다.\n", Channel);
		}
	}

}
