//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 5. �޼ҵ� �����ε�(����)
package E05_MethodOverloading;

public class Main_k08 {
	public static void main(String[] args) {
		
		Calc_k08 c = new Calc_k08();
		
		System.out.printf("2�� ���� ȣ�� [%d]\n", c.sum_k08(1, 2));
		System.out.printf("3�� ���� ȣ�� [%d]\n", c.sum_k08(1, 2, 3));
		System.out.printf("4�� ���� ȣ�� [%d]\n", c.sum_k08(1, 2, 3, 4));
		System.out.printf("������ ���� ȣ�� [%f]\n", c.sum_k08(1.3, 2.4));
		
	}
}
