// ��¥ : 5�� 4�� 
// ���� : ���¾�
// ���� : 10. ������ ���� ȯ�� ��� 1(�߸��� ��)

public class E10_Exchange3 {
	public static void main(String[] args) {
		int k08_myWon = 1000000; // ��
		double k08_moneyEx = 1238.21; // �޷��� ��
		double k08_commission = 0.003; // �޷��� ��������(0.3%)
		double k08_comPerOne = k08_moneyEx*k08_commission; // �޷��� ������ = �޷��� ��*�޷��� ��������
		
		int k08_usd = (int)(k08_myWon/k08_moneyEx); // �޷� = ��/�޷��� ��(�Ҽ��� ���� ����.)
		double k08_totalCom = k08_usd*k08_comPerOne; // �� ������ = �޷�*�޷��� ������
		int k08_i_totalCom; // ������ �� ������
		// �� �����ᰡ ������ �������� ������ ���������� �ϰ� �ø�, ������ �������� ���������θ� �ٲپ���.
		if(k08_totalCom != (double)((int)k08_totalCom)) { 
			k08_i_totalCom = (int)k08_totalCom+1; 
		} else { // 
			k08_i_totalCom = (int)k08_totalCom; 
		}
		int k08_remain = (int)(k08_myWon-k08_usd*k08_moneyEx-k08_i_totalCom); // �ܵ� = ��-ȯ����-������ �� ������
		// ȯ���� �� �� �Ŀ� �����Ḧ ���Ƿ� ������ ����.(�ܵ��� -�� �ȴ�.)
		
		System.out.printf("********************************************************************\n");
		System.out.printf("*                          ������ ���� ȯ��                                                   *\n");
		System.out.printf("�޷��� ������ : %f��, �� ������ : %d��\n", k08_comPerOne, k08_i_totalCom);
		System.out.printf("�� ��ȭȯ���ݾ� : %d�� => ��ȭ : %d�޷�, ������¡�� : %d��, �ܵ� : %d��\n", k08_myWon, k08_usd, k08_i_totalCom, k08_remain);
		System.out.printf("********************************************************************\n");
			
	}
}
