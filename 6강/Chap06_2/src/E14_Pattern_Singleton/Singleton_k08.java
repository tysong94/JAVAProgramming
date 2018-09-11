//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 14. 싱글톤 패턴
package E14_Pattern_Singleton;


public final class Singleton_k08 {	// final class : 확장(상속)될 수 없음.
	
	// 클래스가 로드될 때 스스로 객체 선언, 인스턴스 생성
	private static Singleton_k08 s = new Singleton_k08(); 
	
	/// 이하 클래스의 멤버////////////////////////////
	private int number;
	
	
	private Singleton_k08() {	// 생성자가 private이므로 인스턴스를 더 이상 만들 수 없다.
		number = 1;
	}
	
	
	public static Singleton_k08 getInstance() {	// '인스턴스를 가져오는' 게터임.
		if(s == null) {								// 스터틱 메서드에서는 스터틱 변수만 쓸 수 있다.
			s = new Singleton_k08();
		}
		return s;
	}
	
	public void showNumber() {
		System.out.println(number);
	}
	
	public void add(int i) {
		number = number + i;
	}
	
	///////////////////////////////////////////////////
	
}
