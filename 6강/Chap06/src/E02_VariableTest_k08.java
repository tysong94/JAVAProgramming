// ��¥ : 5�� 28�� 
// ���� : ���¾�
// ���� : 2. ����
public class E02_VariableTest_k08 {
	
	// ��������
	static int si_k08;
	
	// ��������
	public static void add_k08(int i) {
		si_k08++;
		i++;
		System.out.printf("add �޼ҵ忡�� si = [%d]\n", si_k08);
		System.out.printf("add �޼ҵ忡�� i = [%d]\n", i);
	}
	
	// �������� �������ֱ�.
	public static int add2_k08(int i) {
		si_k08++;
		i++;
		System.out.printf("add2 �޼ҵ忡�� si = [%d]\n", si_k08);
		System.out.printf("add2 �޼ҵ忡�� i = [%d]\n", i);
		return i;
	}
	
	public static void main(String[] args) {
		int mi;
		
		si_k08 = 1;
		mi = 1;
		System.out.printf("************************************\n");
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� si = [%d]\n", si_k08);
		System.out.printf("�޼ҵ� ȣ�� �� ���ο��� mi = [%d]\n", mi);
		System.out.printf("************************************\n");
		
		add_k08(mi);
		System.out.printf("************************************\n");
		System.out.printf("add �޼ҵ� ȣ�� �� ���ο��� si = [%d]\n", si_k08);
		System.out.printf("add �޼ҵ� ȣ�� �� ���ο��� mi = [%d]\n", mi);
		System.out.printf("************************************\n");
		
		mi = add2_k08(mi); // ��ȭ�� mi ���� �����Ͽ� ����.
		System.out.printf("************************************\n");
		System.out.printf("add2 �޼ҵ� ȣ�� �� ���ο��� si = [%d]\n", si_k08);
		System.out.printf("add2 �޼ҵ� ȣ�� �� ���ο��� mi = [%d]\n", mi);
		System.out.printf("************************************\n");
	}
}
