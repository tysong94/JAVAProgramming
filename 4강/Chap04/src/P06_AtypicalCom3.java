// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : ������ ��3
public class P06_AtypicalCom3 {
	public static void main(String[] args) {
		
		for(int m_k08 = 1; m_k08 < 13; m_k08++) // �� �ݺ���
		{
			System.out.printf("%d�� => ", m_k08);
			for(int d_k08 = 1; d_k08 < 32; d_k08++) // �� �ݺ��� 
			{
				System.out.printf("%d", d_k08);
								
				if((m_k08 == 4 || m_k08 == 6 || m_k08 == 7 || m_k08 == 9 || m_k08 == 11) && (d_k08==30)) { break; }
				// 4, 6, 7, 9, 11�� �� �� 30�Ͽ��� ����.
				if((m_k08 == 2) && (d_k08 == 28)) { break; }
				// 2�� �� �� 28�Ͽ��� ����.
				if(d_k08 == 31) { break; } 
				// 31���� �Ǹ� ����.
				
				// ������ �� 2����  ��ø if�� �� ���ǽ��� �� ���ǹ����� && �����ڷ� ����.
																
				System.out.printf(",", d_k08);
				// ������ ������ �޸��� ��´�.
			}
			System.out.printf("\n");
		}
		
	}
}

