//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 15. ���丮 ����
package E15_Pattern_Factory;

public class ComputerFactory_k08 {
	
	// Ŭ���� �޼ҵ�(Static �޼ҵ�)�� �ν��Ͻ��� ����� ��ȯ��. -> new �� �ʿ�X.
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
