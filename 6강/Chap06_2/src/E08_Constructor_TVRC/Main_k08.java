//朝楼 : 5岿 28老 
//历磊 : 价怕剧
//力格 : 8. 积己磊(府葛能)
package E08_Constructor_TVRC;

public class Main_k08 {
	public static void main(String[] args) {
		
		TVRC2_k08 tv = new TVRC2_k08(5, 0, 10, 1);
				
		TVRC2_k08 tvVolUp = new TVRC2_k08(5, 0);
		System.out.printf("%s\n", tvVolUp.Voice);
		TVRC2_k08 tvVolDn = new TVRC2_k08(-5, 0);
		System.out.printf("%s\n", tvVolDn.Voice);
		
		TVRC2_k08 tvChannelUp = new TVRC2_k08(0, 10);
		System.out.printf("%s\n", tvChannelUp.Voice);
		TVRC2_k08 tvChannelDn = new TVRC2_k08(0, -10);
		System.out.printf("%s\n", tvChannelDn.Voice);
		
	}
}
