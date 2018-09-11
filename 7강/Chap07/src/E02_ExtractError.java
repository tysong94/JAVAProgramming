// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 2. �������� �ʵ� ����
import java.text.DecimalFormat;

public class E02_ExtractError {
	public static void main(String[] args) {
		
		// ���ڿ� �迭 ����, �ʱ�ȭ(�׸� �迭)
		String[] itemlist = 
		{
			"01  ���ڿ���180m    3,780    1      3,780",
			"02  BE���座Ʈ15   15,000    1     15,000", 
			"03  (G)�⺻��     2,980    1      2,980", 
			"04* ������� 2.3    4,950    1      4,950", 
			"05  �׸� ������     5,980    1      5,980", 
			"06  �ϸ� ġŲ��     8,480    1      8,480", 
			"07  �η�������   13,300    1     13,300", 
			"08  �ٳ��������    5,980    1      5,980", 
			"09  ��������Ŷ    2,980    2      5,960", 
			"10  Ǯ���� ġ��&    4,700    1      4,700", 
			"11  ��)HG �����      990    1          1", 
			"12* �ް���(����)    1,440    1      1,440", 
			"13  Ŀ�Ǹ����� 2    4,250    1      4,250", 
			"14  Ʈ���� ����     2,750    1      2,750", 
			"15  ��귣�� ��     9,800    1      9,800", 
			"16  ��ŰǪ��Ŀ��    2,980    1      2,980", 
			"17* (990)EF����       990    1         10", 
			"18* �޸��ٿ����   10,130    1     10,130", 
			"19* ���ֵ��ī��    4,060    1      4,060", 
			"20  �����ڵ����    3,900    1      3,900", 
			"21* �õ���纣��   12,400    2     24,800", 
			"22* ���̱�ġ      5,000    1      5,000", 
			"23* �ı�ġ          5,000    1      5,000", 
			"24* û�ۻ�� 5��    9,800    1      9,800", 
			"25  ���ǹ���Ƽ R    9,900    1      9,900", 
			"26  DWƮ��ġ��Ʈ   39,900    1     39,900", 
			"27* ġŰŸ ����     5,180    1      5,180", 
			"28* ���              520    1        520", 
			"29  �㽬���ݸ���    1,000    1      1,000", 
			"30* �����������1,000,000    1  1,000,000"	
		};
		
		// String, Int ���� ����
		String notTotal = ""; // �ݾ��� �ƴ� �κ� 
		
		String priceStr = ""; // �ܰ� ���ڿ�
		String numStr = "";	  // ���� ���ڿ�
		String totalStr = ""; // �ݾ� ���ڿ�
		
		int priceInt = 0;	  // �ܰ� ������
		int numInt = 0;		  // ���� ������
		int totalInt = 0;	  // �ݾ� ������
		
		// �޸� ��ü ����, ���� ����
		DecimalFormat df = new DecimalFormat();
		
		// �ܰ�, ����, �ݾ� ���ڿ� -> ������ �ٲٰ� ����ϱ�. 
		for(int i = 0; i < itemlist.length; i++)
		{
			byte[] itemByte = itemlist[i].getBytes();		// �� ���ڿ��� ����Ʈ �迭�� �ɰ�.
			
			notTotal = new String(itemByte, 0, 30);			// �ݾ��� �ƴ� �κ� ���ڿ�.
						
			priceStr = new String(itemByte, 16, 9);			// �ܰ� ���ڿ�(����Ʈ�� �߶�.)
			priceStr = priceStr.replaceAll(",", "").trim(); // ','�� '����' ���ֱ� 
			priceInt = Integer.parseInt(priceStr);			// ���ڿ� -> ������
					
			numStr	= new String(itemByte, 25, 5);			// ���� ���ڿ� -> ������(�����ϰ� ����)
			numStr = numStr.replaceAll(",", "").trim();		
			numInt = Integer.parseInt(numStr);
			
			totalStr = new String(itemByte, 30, 11);		// �ݾ� ���ڿ� -> ������(�����ϰ� ����)
			totalStr = totalStr.replaceAll(",",  "").trim();
			totalInt = Integer.parseInt(totalStr);
			
			// ���� ã�Ƴ��� �����ϰ� ����ϱ�.
			if(totalInt != priceInt * numInt)				// �ݾ��� �ܰ� * ������ ���� ������ 
			{
				totalInt = priceInt * numInt;				// �ݾ��� ����
				totalStr = df.format(totalInt);				// �ݾ� ������ -> ���ڿ�(�޸�����)
				
				System.out.printf("***************************\n");
				System.out.printf("����[%s]\n", itemlist[i]); 				// ���� -> �״�� �� ���ڿ� ���
				System.out.printf("����[%s%11s]\n", notTotal, totalStr);	// ���� -> �ݾ׸� �ٲپ� �ְ� ���
				System.out.printf("***************************\n");
			}
		}
		
//		System.out.println(notTotal);
//		System.out.println(priceInt);
//		System.out.println(numInt);
//		System.out.println(totalInt);
		
	}
}
