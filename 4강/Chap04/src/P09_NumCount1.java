// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : ���� �б�
public class P09_NumCount1 {
	public static void main(String[] args) {
		
		// ��Ʈ�� �迭 units ������ ���� �ѱ� ���Ҹ� ����.
		String[] units_k08 = {"��","��","��","��","��","��","��","ĥ","��","��"};
		
		for(int num_k08 = 0; num_k08 < 101; num_k08++) 
		{
			// num�� 1�� �ڸ��� ��
			if(0 <= num_k08 && num_k08 < 10) 
			{ 
				System.out.printf("�����ڸ� : %s\n", units_k08[num_k08]); // units�迭�� �ش� ���� �ѱ��� ���.
			} 
			
			// num�� 10�� �ڸ��� ��
			else if(10 <= num_k08 && num_k08 < 100) 
			{ 
				int num10_k08, num1_k08; // num�� 10�� �ڸ�, num�� 1�� �ڸ� ����
				num10_k08 = num_k08 / 10; // num�� 10�� �ڸ� = i/10(��)
				num1_k08 = num_k08 % 10; // num�� 1�� �ڸ� = i%10(������)
				
				if(num1_k08 == 0) // num�� 1�� �ڸ��� 0�� �� 
				{
					System.out.printf("�����ڸ� : %s��\n", units_k08[num10_k08]); // 10�� �ڸ��� ���� �ѱ��� �����.
				} 
				else // num�� 1�� �ڸ��� 0�� �ƴ� ��
				{
					System.out.printf("�����ڸ� : %s��%s\n", units_k08[num10_k08], units_k08[num1_k08]); // 10�� �ڸ��� 1�� �ڸ��� ���� �ѱ��� �����.
				}
			} 
			
			// num�� �� ���� ��(100�� �ڸ��� ��)
			else 
			{
				System.out.printf("==> %d\n", num_k08);	// �׳� ����Ѵ�.(100��)		
			}
		}
		
	}
}
