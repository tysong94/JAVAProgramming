// ��¥ : 5�� 4�� 
// ���� : ���¾�
// ���� : 5. �Ҽ��� �ڸ��� ����, �ݿø� ó��

public class E05 {
	public static void main(String[] args) {
		// ������ ���� ������ -> �Ҽ��� �ڸ��� ������.
		int k08_myVal;
				
		k08_myVal=14/5;
		System.out.printf("5-1 : %d\n", k08_myVal);

		// �Ǽ��� ���� ������ -> �Ҽ��� �ڸ��� ����.
		double k08_myValF;
		
		k08_myValF=14/5; // ������ �������̹Ƿ� �Ҽ��� �ڸ��� ������ ����.
		System.out.printf("5-2 : %f\n", k08_myValF);
		
		k08_myValF=14/5.0; // ������ �Ǽ����� �ϳ��� �����ؾ� �Ҽ��� �ڸ��� ����.
		System.out.printf("5-3 : %f\n", k08_myValF);
		k08_myValF=14.0/5;
		System.out.printf("5-3 : %f\n", k08_myValF);
		
		k08_myValF=14.0/5+0.5; // �Ǽ��� ��� �� 0.5 ����
		System.out.printf("5-4 : %f\n", k08_myValF);
		
		k08_myValF=(int)(14.0/5+0.5); // �Ǽ��� ��� �� 0.5 ���ϰ� ������ ��ȯ -> �Ҽ����� �ݿø��ȴ�.
		System.out.printf("5-5 : %f\n", k08_myValF);
	}
}
