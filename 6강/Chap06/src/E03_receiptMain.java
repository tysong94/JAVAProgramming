import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 3. ������ �޼ҵ�(������ ���)
public class E03_receiptMain {
	
////////// ĭ ���߱� �޼ҵ� ////////////////////////////////////////////////////////////////////////	
	
	// ���ڿ��� ĭ ���(����Ʈ ���) �޼ҵ�
	public static int getByteSize(String str) 
	{
	    int en = 0;
	    int ko = 0;
	    int etc = 0;
	    
	    char[] string = str.toCharArray(); 								// ���ڿ� -> ���� �迭			

	   
	    for (int j = 0; j < string.length; j++) 						// ù��° ���ں��� �� ������ ���ڱ��� ����Ʈ ����.			
	    {
	    	if (string[j] >= 'A' && string[j] <= 'z') 					// �����̸� ���� 1����Ʈ ����
	        { en++; }   
	        else if (string[j] >= '\uAC00' && string[j] <= '\uD7A3') 	// �ѱ��̸� �ѱ� 2����Ʈ ����
	        { ko++; ko++; }
	        else 														// �׿��̸� �׿� 1����Ʈ ����
	        { etc++; }													
	    }
	   
	    return (en + ko + etc);											// �� ����Ʈ�� ���Ͽ� ��ȯ�Ѵ�.							
	}
	
	// ���ڿ� -> 12����Ʈ ���ڿ�
	public static String String12Byte(String str) 
	{
	    int en = 0;
	    int ko = 0;
	    int etc = 0;
	    int count = 0;

	    
	    char[] charArr = str.toCharArray(); 							// ���ڿ� -> ���� �迭

	    
    	for (int j = 0; j < charArr.length; j++) 						// ���ڿ��� 12����Ʈ���� �����ϰ� �ش� ���ڼ��� ���
	    {
	       	if (charArr[j] >= 'A' && charArr[j] <= 'z') 					
	       	{ en++; }					
	        else if (charArr[j] >= '\uAC00' && charArr[j] <= '\uD7A3') 
	        { ko++; ko++; }	
	        else 														
	        { etc++; }														
	         
	        if(en + ko + etc < 12) { count = j; }						// 12����Ʈ �̸��̸� ���ڼ� ��ȯ	
	        if(en + ko + etc == 12) { count = j; break; } 				// 12����Ʈ�� �Ǹ� ���߰� �ش� ���ڼ� ��ȯ
	        else if(en + ko + etc == 13) { count = j - 1; break; }		// 13����Ʈ�� �Ǹ� ���߰� �ش� ���ڼ� -1 ��ȯ
	    }
	    
	    
	    char[] charArr12 = new char[count+1];							// 12����Ʈ�� �ɰ� ���� -> �迭�� �ٽ� ����(12����Ʈ�� �� ���ڼ���ŭ)
	    for(int i = 0; i < count+1; i++) { charArr12[i] = charArr[i]; }

	    str = String.valueOf(charArr12); 								// ���� �迭(12����Ʈ ����) -> ���ڿ� ������ 
	      
	    return str; 													// �ڸ� ���ڿ� ��ȯ.
	}
	
	// 12����Ʈ ���ڿ� ������߱�
	public static String BlankInsert(String str)
	{
		
		if(getByteSize(str) < 11)							// ���ڿ��� 11����Ʈ �̸��̸� 
		{
			String blank = "";								// ���� ���ڿ� + ���� ����Ʈ��ŭ ����
			for(int i = 1; i <= 12 - getByteSize(str); i++)
			{
				blank = blank + " ";
			}
			str = str + blank;
		}
		else if(getByteSize(str) == 11)						// ���ڿ��� 11����Ʈ�̸�
		{
			str = str + " ";								// ���� ���ڿ� + 1����Ʈ ����
		}
		else 												// ���ڿ��� 12����Ʈ�̸�
		{
		}													// �ƹ��͵� ����.
		
		return str;											// 
	}
	
/////////// ��� �޼ҵ� //////////////////////////////////////////////////////////////////////	
	
	// �޸� ���
	// DecimalFormat ���� df�� format �޼ҵ� ȣ��.
	// ���� : System.out.printf("%s", df.format(����))
	static DecimalFormat df = new DecimalFormat();
	
	// ��¥ ���
	// �ð� �������� : Calendar ���� cal�� getTime �޼ҵ� ȣ��
	// �ð����� ���������� �ٲ� : SimpleDateFormat ���� sdf�� format �޼ҵ� ȣ��.
	// ���� : System.out.printf("%s", sdf.format(cal.getTime))
	static Calendar cal = Calendar.getInstance();
	static SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");
	
	
	static void titlePrint() {
		System.out.printf("emart         �̸�Ʈ ������ (031)888-1234\n");
		System.out.printf("              206-86-50913               \n");
		System.out.printf("              ���ν� ������ ������� 552 \n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�(30�ϳ�)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī������)\n");
		System.out.printf("üũī��/�ſ�ī�� û����� �ݿ���\n");
		System.out.printf("�ִ� 3~5�� �ҿ� (�ָ�, ����������)\n");
		System.out.printf("\n");
	}
	
	static void timeStemp() {
		System.out.printf("[�� ��]%s     POS:0009-2418\n", sdf.format(cal.getTime()));
	}
	
	static void headPrint() {
		System.out.printf("-----------------------------------------\n");
		System.out.printf("    �� ǰ ��         �ܰ� ����       �ݾ�\n");
		System.out.printf("-----------------------------------------\n");
	}
	
	// ��ǰ��迭
	static String[] itemname_k08 = 
	{
		"���ڿ���180ml*4", "BE���座Ʈ15F-16BK", "(G)�⺻����4-7", "������� 2.3L", "�׸� �����ͽ�95g#8", "�ϸ� ġŲ�ʰ�480+1", "�η��������Ϻ��", "�ٳ�������� 240ml", "��������Ŷ312.5G", "Ǯ���� ġ��&ġ��", 
		"��)HG ��������� 2", "�ް���(����)", "Ŀ�Ǹ����� 240ML*4", "Ʈ���� �����ѻ���", "��귣�� ����ä��", "��ŰǪ��Ŀ���͵�2", "(990)EF����", "�޸��ٿ����ٸ���", "���ֵ��ī����", "�����ڵ���ø���20",
		"�õ���纣��1.13kg", "���̱�ġ", "�ı�ġ", "û�ۻ�� 5��/��", "���ǹ���Ƽ R��BLAC", "DWƮ��ġ��ƮNAVYS", "ġŰŸ ����������", "���", "�㽬���ݸ��帵ũ", "�����������" 
	};
	
	// �ܰ� �迭
	static int[] priceArr_k08 = 
	{ 
		3780, 15000, 2980, 4950, 5980, 8480, 13300, 5980, 2980, 4700, 
		990, 1440, 4250, 2750, 9800, 2980, 990, 10130, 4060, 3900, 
		12400, 5000, 5000, 9800, 9900, 39900, 5180, 520, 1000, 1000000,
	};
	
	// ���� �迭
	static int[] numArr_k08 = 
	{ 
		1, 1, 1, 1, 1, 1, 1, 1, 2, 1,
		1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		2, 1, 1, 1, 1, 1, 1, 1, 1, 1 
	}; 
	
	// �鼼���� �迭
	static boolean[] taxFreeArr_k08 = 
	{ 
		false, false, false, true, false, false, false, false, false, false,
		false, true, false, false, false, false, true, true, true, false,	
		true, true, true, true, false, false, true, true, false, false,
	};
	
	// *�迭
	static String[] star_k08;
	
	// �Ѿ�
	static int totalPrice_k08;
	
	// �鼼 ��ǰ �Ѿ�
	static int taxFreePrice_k08;
	
	// ���� ��ǰ �Ѿ� 
	static int taxPrice_k08;
	
	// ���� ���� 
	static int aftertax;
	
	// ����
	static int taxPercent; static double taxRate; // ����
	
	// ���� ����
	static int pretax; // �������� = ���İ��� / (1 + ����) -> int�� ���� ó��;
	
	// ����
	static int tax; // ���� = ���İ���-��������
	
	
	static void itemPrint(int itemnum) {
		// * �迭 (�鼼���ο� ����)
		star_k08 = new String[taxFreeArr_k08.length];
		for(int i = 0; i < taxFreeArr_k08.length; i++) {
			if(taxFreeArr_k08[i] == true) {
				star_k08[i] = "*"; 
			}
			else {
				star_k08[i] = "";
			}
		}
		
		// �Ѿ� ���
		for(int i = 0; i < priceArr_k08.length; i++) {
			totalPrice_k08 += priceArr_k08[i] * numArr_k08[i];
		}
				
		// �鼼��ǰ �Ѿ� ���
		for(int i = 0; i < priceArr_k08.length; i++) {
			if(taxFreeArr_k08[i] == true) {
				taxFreePrice_k08 += priceArr_k08[i] * numArr_k08[i];
			}
		}
		
		taxPrice_k08 = totalPrice_k08 - taxFreePrice_k08;
		
		aftertax = taxPrice_k08; 
		
		taxPercent = 10; taxRate = taxPercent/100.0; // ����
		
		pretax = (int)(aftertax / (1 + taxRate));
		
		tax = aftertax - pretax;
		
				
		for(int i = 0; i < itemnum; i++) {
			System.out.printf("%02d", i+1); 					 						// ��ȣ -> 2ĭ 
			System.out.printf("%-2s", star_k08[i]); 				 					// * -> 2ĭ 
			System.out.printf("%s", BlankInsert(String12Byte(itemname_k08[i])));		// ��ǰ�� -> 12ĭ
			System.out.printf("%9.9s", df.format(priceArr_k08[i])); 					// �ܰ� -> 9ĭ(1,000,000)
			System.out.printf("%5.5s", df.format(numArr_k08[i])); 						// ���� -> 5ĭ(1,000)
			System.out.printf("%11.11s\n", df.format(priceArr_k08[i]*numArr_k08[i])); 	// �ݾ� -> 11ĭ(100,000,000)
		}
	}
	
	static void totalPrint() {
		System.out.printf("            (*)�� ��  �� ǰ%14.14s\n", df.format(taxFreePrice_k08));
		System.out.printf("               �� ��  �� ǰ%14.14s\n", df.format(pretax));
		System.out.printf("               ��   ��   ��%14.14s\n", df.format(tax));
		System.out.printf("               ��        ��%14.14s\n", df.format(totalPrice_k08));
		System.out.printf("�� �� �� �� �� ��%24.24s\n", df.format(totalPrice_k08));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0024 ��  ��           5417**8890/07850246\n");
		System.out.printf("ī�����%30.30s\n", "�Ͻú� / " + df.format(totalPrice_k08));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.", "");
	}
	
	
	public static void main(String[] args) {
		
		int itemCount = itemname_k08.length;
		titlePrint();
		timeStemp();
		headPrint();
		itemPrint(itemCount);
		totalPrint();
	}
}
