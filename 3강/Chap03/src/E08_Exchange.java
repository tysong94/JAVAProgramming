// ��¥ : 5�� 4�� 
// ���� : ���¾�
// ���� : 8. �ܼ� ȯ�� ���

public class E08_Exchange {
	public static void main(String[] args) {
		int k08_myWon = 1000000; // ��
		double k08_moneyEx = 1238.21; // �޷��� ��
		double k08_commission = 0.003; // �޷��� ��������(0.3%)
		
		int k08_usd = (int)(k08_myWon/k08_moneyEx); // �޷� = ��/�޷��� ��(�Ҽ��� ���� ����.)
		int k08_remain = (int)(k08_myWon-k08_usd*k08_moneyEx); // �ܵ� = ��-ȯ����(�޷�*�޷��� ��)(�Ҽ��� ���� ����.)
		
		System.out.printf("*************************************************\n");
		System.out.printf("*                  ��������� ���                                *\n");
		System.out.printf("�� ��ȭȯ���ݾ� : %d�� => ��ȭ : %d�޷�, �ܵ� : %d��\n", k08_myWon, k08_usd, k08_remain);
		System.out.printf("*************************************************\n");
	}
}
