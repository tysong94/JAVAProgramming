// ��¥ : 5�� 9��  
// ���� : ���¾�
// ���� : case�� ��
public class P07_CaseCom {
	public static void main(String[] args) {
		
		for(int m_k08 = 1; m_k08 <= 12; m_k08++) // �� �ݺ���
		{
			System.out.printf("%d�� => ", m_k08);
			LOOP:for(int d_k08 = 1; d_k08 <= 31; d_k08++) // �� �ݺ���
			//break�� ���� LOOPǥ���ڸ� �ش�.
			{ 
				System.out.printf("%d", d_k08); 
				switch(m_k08) 
				{
				case 4: case 6: case 7: case 9: case 11: 
					if(d_k08 == 30) { break LOOP; } // ������ ������ ��� for �ݺ��� ��ü�� ���߾�� �ϹǷ� LOOP�� �������.
					break; // switch���� ����.
				// 4, 6, 7, 9, 11�� �� �� 30�Ͽ��� ����.
				case 2: 
					if(d_k08 == 28) { break LOOP; } 
					break;
				// 2�� �� �� 28�Ͽ��� ����.
				default :
					if(d_k08 == 31) { break LOOP; }
					break;
				// �׿� ���� �� 31���� �Ǹ� ����.
				}
				System.out.printf(",", d_k08); 
			}
			System.out.printf("\n");
		}
		
	}
}
