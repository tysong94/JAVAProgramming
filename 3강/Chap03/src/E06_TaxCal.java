// ��¥ : 5�� 4�� 
// ���� : ���¾�
// ���� : 6. �ܼ� ���� ���
	
public class E06_TaxCal {
	public static int taxCal(int k08_val, int k08_rate) { // ��������, ����
		int k08_taxR; // ����
		
		if(((double)k08_val*(double)k08_rate/100.0) == k08_val*k08_rate/100) { // �Ǽ��� ������ ����� ���� ������ ������ ����� �Ͱ� ������(������ ��������)
			k08_taxR = k08_val*k08_rate/100; // ������ ����� ���� �������� �ش�.
		} else { // �Ǽ� ��갪�� ���� ��갪�� ���� ������
			k08_taxR = (k08_val*k08_rate/100)+1;  // ������ ����� �� +1�� ���� �������� �ش�. -> �Ҽ��� ���ϸ� �ø� ó���� ��.
		}
		
		return k08_taxR;
	}

	public static void main(String[] args) {
		int k08_val = 271; // ��������
		int k08_rate = 3; // ���� 3�ۼ�Ʈ
	
		int k08_tax = taxCal(k08_val, k08_rate); // �������ݰ� ������ ������ �����
	
		System.out.printf("***********************************\n");
		System.out.printf("*            �ܼ� ���� ���                    *\n");
		System.out.printf("���� ���� ��� : %f\n", k08_val*k08_rate/100.0); // ���Ŀ� �Ǽ��� ���ԵǾ� �����Ƿ� �Ǽ� ���
		System.out.printf("���� ���� : %d ���� : %d �����԰��� : %d\n", k08_val, k08_tax, k08_val+k08_tax); // �Ǽ� ���ݰ��� ���� ���ݰ���� �ٸ� -> else�� ����. -> +1 
		System.out.printf("***********************************\n");
	}
}

