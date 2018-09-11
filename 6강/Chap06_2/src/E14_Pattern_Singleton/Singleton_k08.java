//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 14. �̱��� ����
package E14_Pattern_Singleton;


public final class Singleton_k08 {	// final class : Ȯ��(���)�� �� ����.
	
	// Ŭ������ �ε�� �� ������ ��ü ����, �ν��Ͻ� ����
	private static Singleton_k08 s = new Singleton_k08(); 
	
	/// ���� Ŭ������ ���////////////////////////////
	private int number;
	
	
	private Singleton_k08() {	// �����ڰ� private�̹Ƿ� �ν��Ͻ��� �� �̻� ���� �� ����.
		number = 1;
	}
	
	
	public static Singleton_k08 getInstance() {	// '�ν��Ͻ��� ��������' ������.
		if(s == null) {								// ����ƽ �޼��忡���� ����ƽ ������ �� �� �ִ�.
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
