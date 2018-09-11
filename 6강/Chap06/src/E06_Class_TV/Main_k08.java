//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 6. 클래스, 객체, 인스턴스(리모콘)
package E06_Class_TV;

public class Main_k08 {
	public static void main(String[] args) {
		
		TVRC_k08 tv = new TVRC_k08();
		
		for(int i = 1; i <= 6; i++) {
			tv.volUp_k08();
			System.out.printf("%s", tv.msg);
		}
		
		for(int i = 1; i <= 6; i++) {
			tv.volDn_k08();
			System.out.printf("%s", tv.msg);
		}
		
		for(int i = 1; i <= 10; i++) {
			tv.chUp_k08();
			System.out.printf("%s", tv.msg);
		}
		
		for(int i = 1; i <= 10; i++) {
			tv.chDn_k08();
			System.out.printf("%s", tv.msg);
		}
	}
}
