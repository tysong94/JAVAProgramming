//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 15. ���丮 ����
package E15_Pattern_Factory;

public class Laptop_k08 extends Computer_k08 {
	private String name;
	
	public Laptop_k08 (String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
