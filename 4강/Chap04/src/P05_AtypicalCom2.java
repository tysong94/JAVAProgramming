// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : ������ ��2
public class P05_AtypicalCom2 {
	public static void main(String[] args) {
		
		for(int month_k08 = 1; month_k08 <= 12; month_k08++) // �� �ݺ���
		{
			System.out.printf("%d�� => ", month_k08);
			for(int day_k08 = 1; day_k08 <= 31; day_k08++) // �� �ݺ���
			{
				System.out.printf("%d", day_k08);
				
				if(month_k08 == 4 || month_k08 == 6 || month_k08 == 7 || month_k08 == 9 || month_k08 == 11) 
				{ 
					if(day_k08 == 30) { break; }
				} 
				// 4, 6, 7, 9, 11�� �� �� 30�Ͽ��� ����.
				
				if(month_k08 == 2) 
				{ 
					if(day_k08 == 28) { break; } 
				} 
				// 2�� �� �� 28�Ͽ��� ����.
				
				if(day_k08 == 31) { break; } 
				// 31���� �Ǹ� ����.
				
				System.out.printf(",", day_k08);
				// ������ �� 1���� �ߺ��Ǵ� �κ��� ����
				// �� if�� �� if�� ��ø�Ͽ� ���� 
			}
			System.out.printf("\n");
		}
		
	}
}
