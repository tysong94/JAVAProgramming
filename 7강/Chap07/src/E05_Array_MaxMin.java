// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 5. �迭�� �ִ�, �ּҰ� ã��
public class E05_Array_MaxMin {
	public static void main(String[] args) {
		
		int[] iArray = { 1, 7, 2, 3, 5, 11, 212, 33, 44, 78, 2121, 11, 5, 18, 0, 1 };
		
		for(int i = 0; i < iArray.length; i++)
		{
			System.out.printf("iArray[%d] = %d\n", i, iArray[i]);
		}
		
		// Max ã��
		int iMaxPt = 0;			// ó�� ��ġ
		int iMax = iArray[0];	// ó�� �迭��
				
		for(int i = 0; i < iArray.length; i++)	// ��� ���ҿ� ���Ͽ�
		{
			if(iMax < iArray[i])				// iMax�� ���������� �ش� ���Ұ��� ũ��
			{
				iMaxPt = i;						// iMaxPt�� ������ ��ġ�� �ش� ��ġ�� �ٲ�
				iMax = iArray[i];				// iMax�� �������� �ش� ���Ұ����� �ٲ�
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", iMaxPt, iMax);	// ���� �ִ밪�� ��ġ�� ���� ����Ѵ�.
		
		// Min ã��
		int iMinPt = 0;			// ó�� ��ġ
		int iMin = iArray[0];	// ó�� �迭��
				
		for(int i = 0; i < iArray.length; i++)	// ��� ���ҿ� ���Ͽ�
		{
			if(iMin > iArray[i])				// iMin�� ���������� �ش� ���Ұ��� ������
			{
				iMinPt = i;						// iMinPt�� ������ ��ġ�� �ش� ��ġ�� �ٲ�
				iMin = iArray[i];				// iMin�� �������� �ش� ���Ұ��� �ٲ�
			}
		}
		System.out.printf("MIN : iArray[%d] = %d\n", iMinPt, iMin);	// ���� �ּҰ��� ��ġ�� ���� ����Ѵ�.

		
		
	}
}
