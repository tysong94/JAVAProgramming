// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : Array�̿� ��
public class P08_ArrayCom {
	public static void main(String[] args) {
		
		int[] LMD_k08 = {31,28,31,30,31,30,31,31,30,31,30,31};
		// �� ���� ������ ���� �迭�� ����.
		
		for(int m_k08 = 1; m_k08 <= 12; m_k08++) // m�� 1 ���� 12�� ������ ����.
		{ 
			System.out.printf("%d�� => ", m_k08); // m�� ���
			for(int d_k08 = 1; d_k08 <= 31; d_k08++) // d�� 1���� 31�� ������ ����.
			{ 
				System.out.printf("%d", d_k08); // d�� ���
				if(d_k08 == LMD_k08[m_k08-1] ) { break; } // m���� �� d�� ������ ��(�迭�� m-1��° ����)�̸� ����.
				System.out.printf(","); //������ ���� �ƴϸ� �޸��� ����, ������ ���̸� �޸��� �� ����
			}
			System.out.printf("\n");
		}
		
	}
}
