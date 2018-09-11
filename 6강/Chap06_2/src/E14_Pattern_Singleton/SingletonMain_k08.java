//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 14. 싱글톤 패턴
package E14_Pattern_Singleton;

public class SingletonMain_k08 {
	public static void main(String[] args) {
//		Singleton_k08 ss = new Singleton(); -> 인스턴스 생성할 수 없음.
		
		Singleton_k08 s = Singleton_k08.getInstance();	// 기존 인스턴스 사용
		s.add(100);		
		s.showNumber();
		
		// add(100)을 안해도...101이 나옴.
		Singleton_k08 s1 = Singleton_k08.getInstance();	// 기존 인스턴스 사용
		s1.showNumber();
	}
}
