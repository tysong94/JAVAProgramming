//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 7. �޼ҵ� �����ε�(����)
package E07_MethodOverloading;

public class Main {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		System.out.printf("2�� ���� ȣ�� [%d]\n", c.sum(1, 1));
		System.out.printf("3�� ���� ȣ�� [%d]\n", c.sum(1, 1, 1));
		System.out.printf("4�� ���� ȣ�� [%d]\n", c.sum(1, 1, 1, 1));
		System.out.printf("������ ���� ȣ�� [%f]\n", c.sum(1.3, 2.4));
		
	}
}
