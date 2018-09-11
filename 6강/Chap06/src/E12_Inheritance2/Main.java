//朝楼 : 5岿 19老 
//历磊 : 价怕剧
//力格 : 12. 惑加(府葛能)
package E12_Inheritance2;

public class Main {
	public static void main(String[] args) {
		
		TVRC3 tvrc = new TVRC3();
		
		for(int i = 1; i <= 5; i++) {
			tvrc.VolUp();
			System.out.printf("%s", tvrc.Voice);
		}
		
		for(int i = 1; i <= 5; i++) {
			tvrc.VolDn();
			System.out.printf("%s", tvrc.Voice);
		}
		
		for(int i = 1; i <= 10; i++) {
			tvrc.ChannelUp();
			System.out.printf("%s", tvrc.Voice);
		}
		
		for(int i = 1; i <= 10; i++) {
			tvrc.ChannelDn();
			System.out.printf("%s", tvrc.Voice);
		}
		
		tvrc.battery();
		System.out.printf("%s", tvrc.Voice);
		
	}
}
