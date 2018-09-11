//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 15. 팩토리 패턴
package E15_Pattern_Factory;

public class ComputerFactory_k08 {
	
	// 클래스 메소드(Static 메소드)로 인스턴스를 만들어 반환함. -> new 할 필요X.
	public static Computer_k08 produceComputer(String type, String name) {
		if(type.equals("Laptop")) {
			return new Laptop_k08(name);
		}
		else if(type.equals("Desktop")) {
			return new Desktop_k08(name);
		}
		else {
			return null;
		}
	}

}
