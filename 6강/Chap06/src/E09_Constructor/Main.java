//朝楼 : 5岿 19老 
//历磊 : 价怕剧
//力格 : 9. 积己磊(郡府海捞磐)
package E09_Constructor;

public class Main {
	public static void main(String[] args) {
	
		Elevator2 el = new Elevator2();
		
		for(int i = 0; i < 10; i++){
			el.up();
			System.out.printf("MSG[%s]\n", el.help);
		}
	
		for(int i = 0; i < 10; i++)	{
			el.down();
			System.out.printf("MSG[%s]\n", el.help);
		}
		
		Elevator2 elUP = new Elevator2(5);
		System.out.printf("MSG elUP[%s]\n", elUP.help);
		
		Elevator2 elDN = new Elevator2(-5);
		System.out.printf("MSG elDN[%s]\n", elDN.help);
	
	}
}
