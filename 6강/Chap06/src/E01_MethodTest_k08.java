// ��¥ : 5�� 28�� 
// ���� : ���¾�
// ���� : 1. �޼ҵ�
public class E01_MethodTest_k08 {
	
	// �޼ҵ� ����
	public static void iamMethod_k08() {	// static �޼ҵ� : ���α׷��� �����ϸ� �ٷ� �� �� �ְ� ��.
		System.out.printf("���� �޼ҵ��~\n");
	}
	
	public static void main(String[] args) {
		// �޼ҵ� ���, �޼ҵ� ȣ�� ���  
		E01_MethodTest_k08.iamMethod_k08(); // Ŭ����.�޼ҵ� : �ٸ� Ŭ������ �ִ� �޼ҵ��� ���.
		iamMethod_k08();					// �޼ҵ� : �ڱ� Ŭ���� �ȿ� �ִ� �޼ҵ��� ���.
	}	

}
