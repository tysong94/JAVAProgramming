// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : ������ ��1
public class P04_AtypicalCom1 {
	public static void main(String[] args) {
		
		// ������ ª�� �ϴ� ���� �ƴ϶� ������ �˾ƺ� �� �ֵ��� �ڵ��ϴ� ���� ����.
		// 1���� �� 31��, 2���� �� 28�� ... 12�� �� �� 31���̸� for���� ����.
		
		for(int month_k08 = 1; month_k08 < 13; month_k08++) // �� �ݺ���
		{
			System.out.printf("%d�� => ", month_k08);
			for(int day_k08 = 1; day_k08 < 32; day_k08++) // �� �ݺ���
			{
				if(month_k08 == 1 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 2 && day_k08 == 28) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 3 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 4 && day_k08 == 30) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 5 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 6 && day_k08 == 30) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 7 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 8 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 9 && day_k08 == 30) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 10 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 11 && day_k08 == 30) {System.out.printf("%d", day_k08); break;}
				if(month_k08 == 12 && day_k08 == 31) {System.out.printf("%d", day_k08); break;}
				// �ش� month�� ������day�� ������ ��� ������ �� �ݺ����� ���ߵ��� ��.
				// �ܼ��ϰ� �ش� month �񱳿� �ش� day �񱳸� && �����ڷ� �����־� ������ �ش�.
				System.out.printf("%d,", day_k08);
			}
			System.out.printf("\n");
		}
		
	}
}
