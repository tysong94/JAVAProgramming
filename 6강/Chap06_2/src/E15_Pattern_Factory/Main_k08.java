//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 15. ���丮 ����
package E15_Pattern_Factory;

public class Main_k08 {
	public static void main(String[] args) {
		
		Computer_k08 sty_desktop = ComputerFactory_k08.produceComputer("Desktop", "sty_desktop");
		Computer_k08 sty_laptop = ComputerFactory_k08.produceComputer("Laptop", "sty_laptop");
		System.out.println(sty_desktop);
		System.out.println(sty_laptop);
	
	}
}
