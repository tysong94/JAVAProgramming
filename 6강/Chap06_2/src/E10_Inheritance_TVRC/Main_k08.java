//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 10. ���(������)
package E10_Inheritance_TVRC;

public class Main_k08 {
	public static void main(String[] args) {
		
		TVRC3_k08 tvrc = new TVRC3_k08();
		
		for(int i = 1; i <= 5; i++) {
			tvrc.volUp_k08();
			System.out.printf("%s", tvrc.Voice);
		}
		
		for(int i = 1; i <= 5; i++) {
			tvrc.volDn_k08();
			System.out.printf("%s", tvrc.Voice);
		}
		
		for(int i = 1; i <= 10; i++) {
			tvrc.chUp_k08();
			System.out.printf("%s", tvrc.Voice);
		}
		
		for(int i = 1; i <= 10; i++) {
			tvrc.chDn_k08();
			System.out.printf("%s", tvrc.Voice);
		}
		
		tvrc.battery();
		System.out.printf("%s", tvrc.Voice);
		
	}
}
