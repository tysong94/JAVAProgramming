// ��¥ : 5�� 4�� 
// ���� : ���¾�
// ���� : 9. ������ ���

public class E09_Exchange2 {
	public static void main(String[] args) {
		int k08_myWon = 1000000; // ��
		double k08_moneyEx = 1238.21; // �޷��� ��
		double k08_commission = 0.003; // �޷��� ��������(0.3%)
		
		int k08_usd = (int)(k08_myWon/k08_moneyEx); // �޷� = ��/�޷��� ��(�Ҽ��� ���� ����.)
		int k08_remain = (int)(k08_myWon-k08_usd*k08_moneyEx); // �ܵ� = ��-ȯ����(�޷�*�޷��� ��)(�Ҽ��� ���� ����.)
		
		double k08_comPerOne = k08_moneyEx*k08_commission; // �޷��� ������ = �޷��� ��*�޷��� ��������
		double k08_totalCom = k08_usd*k08_comPerOne; // ��  ������ = �޷�*�޷��� ������
		
		System.out.printf("*********************************************\n");
		System.out.printf("*                  ������ ���                              *\n");
		System.out.printf("�޷��� ������ : %f��, �� ������ : %f�� \n", k08_comPerOne, k08_totalCom);
		System.out.printf("*********************************************\n");
		
	}
}
