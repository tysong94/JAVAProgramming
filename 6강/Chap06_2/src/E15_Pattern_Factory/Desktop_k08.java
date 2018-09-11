//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 15. 팩토리 패턴
package E15_Pattern_Factory;

public class Desktop_k08 extends Computer_k08{
	private String name;
	
	public Desktop_k08 (String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
