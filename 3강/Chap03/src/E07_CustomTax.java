// ��¥ : 5�� 4�� 
// ���� : ���¾�
// ���� : 7. �Һ��ڰ��� �߽� ���� ���

// ���İ��ݰ� ������ ���� �־����� �������ݰ� ������ ����ϴ� ���.
// ������ �÷��� �ϹǷ� ���������� ������(������) �Ѵ�.
// custom = netval+taxval -> ���İ��� = ��������+����
// netval = custom/(1+rate) -> �������� = ���İ���/(1+����)
// taxval = custom-netval -> ���� = ���İ���-��������

public class E07_CustomTax {
	public static void main(String[] args) {
	
		int k08_custom = 280; // ���İ���
		int k08_taxrate = 3; // 3%�� 0.03 -> ���� = taxrate/100.0;
		
		int k08_netval, k08_taxval; // ��������, ����
		
		k08_netval = (int)(k08_custom/(1+k08_taxrate/100.0)); // �������� = ���İ���/(1+����) -> �Ǽ��� ��� �� ������ ��ȯ���� �Ҽ��� ���� ����.
		k08_taxval = k08_custom-k08_netval; // ���� = ���İ���-��������
		
		System.out.printf("**************************************\n");
		System.out.printf("*          �Һ��ڰ��� �߽� ���� ���               *\n");
		System.out.printf(" �Һ��ڰ��� : %d, ���� ���� : %d, ���� : %d \n", k08_custom, k08_netval, k08_taxval);
		System.out.printf("**************************************\n");
	}
}
