//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 6. 클래스, 객체, 인스턴스(리모콘)
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
			msg = String.format("볼륨 : %d\n", Vol);
		} 
		else {
			msg = String.format("볼륨 : %d, 최대 볼륨입니다.\n", Vol);	
		}
	}
	
	void volDn_k08() {
		if(Vol != MinVol) {
			Vol--;
			msg = String.format("볼륨 : %d\n", Vol);
		}
		else {
			msg = String.format("볼륨 : %d, 최소 볼륨입니다.\n", Vol);	
		}
	}
	
	void chUp_k08() {
		if(Channel != MaxChannel) {
			Channel++;
			msg = String.format("채널 : %d번\n", Channel);
		}
		else {
			msg = String.format("채널 : %d번, 마지막 채널입니다.\n", Channel);
		}
	}
	
	void chDn_k08() {
		if(Channel != MinChannel) {
			Channel--;
			msg = String.format("채널 : %d번\n", Channel);
		}
		else {
			msg = String.format("채널 : %d번, 처음 채널입니다.\n", Channel);
		}
	}

}
