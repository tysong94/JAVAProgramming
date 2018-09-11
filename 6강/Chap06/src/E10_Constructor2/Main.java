//朝楼 : 5岿 19老 
//历磊 : 价怕剧
//力格 : 10. 积己磊(府葛能)
package E10_Constructor2;

public class Main {
	public static void main(String[] args) {
		
		TVRC2 tvVolUp = new TVRC2(5, 0);
		System.out.printf("%s\n", tvVolUp.Voice);
		TVRC2 tvVolDn = new TVRC2(-5, 0);
		System.out.printf("%s\n", tvVolDn.Voice);
		
		TVRC2 tvChannelUp = new TVRC2(0, 10);
		System.out.printf("%s\n", tvChannelUp.Voice);
		TVRC2 tvChannelDn = new TVRC2(0, -10);
		System.out.printf("%s\n", tvChannelDn.Voice);
		
	}
}
