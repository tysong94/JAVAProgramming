//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 14. �̱��� ����
package E14_Pattern_Singleton;

public class SingletonMain_k08 {
	public static void main(String[] args) {
//		Singleton_k08 ss = new Singleton(); -> �ν��Ͻ� ������ �� ����.
		
		Singleton_k08 s = Singleton_k08.getInstance();	// ���� �ν��Ͻ� ���
		s.add(100);		
		s.showNumber();
		
		// add(100)�� ���ص�...101�� ����.
		Singleton_k08 s1 = Singleton_k08.getInstance();	// ���� �ν��Ͻ� ���
		s1.showNumber();
	}
}
