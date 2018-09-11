//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 15. 팩토리 패턴
package E15_Pattern_Factory;

public class Main_k08 {
	public static void main(String[] args) {
		
		Computer_k08 sty_desktop = ComputerFactory_k08.produceComputer("Desktop", "sty_desktop");
		Computer_k08 sty_laptop = ComputerFactory_k08.produceComputer("Laptop", "sty_laptop");
		System.out.println(sty_desktop);
		System.out.println(sty_laptop);
	
	}
}
