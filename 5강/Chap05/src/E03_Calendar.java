// ��¥ : 5�� 14�� 
// ���� : ���¾�
// ���� : �޷� �μ�
public class E03_Calendar {
	public static void main(String[] args) {
		
		// 0 ~ 6 -> �Ͽ��� ~ �����
		int iWeekday_k08 = 1; 
		
		// 0�� ~ 11�� -> 1�� ~ 12���� ������ ��
		int[] iMLD_k08 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		
		
		for(int iMon_k08 = 0; iMon_k08 < 12; iMon_k08++)
		{
			// ��, ���, ���� ���
			System.out.printf("        %d��\n", iMon_k08 + 1);
			System.out.printf("=====================\n");
			System.out.printf(" �� �� ȭ �� �� �� �� \n");
			
			// ������ �����
			for(int space_k08 = 0; space_k08 <= iWeekday_k08 - 1; space_k08++) // ���� ���� ����ŭ ������ ����ش�.
			{ System.out.printf("   "); } 
			
			// ���� �����
			for(int day_k08 = 1; day_k08 <= iMLD_k08[iMon_k08]; day_k08++) 
			{
				System.out.printf(" %2d", day_k08); 				// ���� �����.
				
				iWeekday_k08++;									// ���� ���Ϸ� �Ѿ��.
				if(iWeekday_k08 == 7) 							// ���� ������ ������� �Ѿ�� �����ϰ�, 0���� �ٲ۴�.(�Ͽ��Ϸ� �ٲ۴�.)
				{ System.out.printf("\n"); iWeekday_k08 = 0; }
			}
			System.out.printf("\n\n");
		}
		
	}
}
