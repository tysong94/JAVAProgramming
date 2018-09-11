// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 1. �ѱ� ���

// ��ũ �ִ� Ŭ����
public class Han {
	
	// �տ� ��ũ�� ���̴� �޼ҵ�
	public static String BlankForeword(String str, int kan)
	{
		byte[] byteArr = str.getBytes();		// ���ڿ� -> ����Ʈ �迭
		
		int blankCount = kan - byteArr.length; // �� ����Ʈ���� ���� ����Ʈ�� ���.
		
		String blank = ""; 						// ���� ����Ʈ����ŭ ������ ����.
		for(int i = 1; i <= blankCount; i++)
		{
			blank = blank + " ";
		}
		
		return str = blank + str; 				// ���� + �������� ��ȯ.
	}
	
	// �ڿ� ��ũ�� ���̴� �޼ҵ�
	public static String BlankBackword(String str, int kan)
	{
		byte[] byteArr = str.getBytes();		// ���ڿ� -> ����Ʈ �迭
		
		int blankCount = kan - byteArr.length; // �� ����Ʈ���� ���� ����Ʈ�� ���.
		
		String blank = ""; 						// ���� ����Ʈ����ŭ ������ ����.
		for(int i = 1; i <= blankCount; i++)
		{
			blank = blank + " ";
		}
		
		return str = str + blank; 				// �������� + ���� ��ȯ.
	}
	
	// �ѱ� ���� ���� �޼ҵ�
	public static int Count(String str)
	{
		int hanCount = 0;
		for(int i = 0; i < str.length(); i++) // ù��° ���ں��� ������ ���ڱ���
		{
			byte[] charByte = str.substring(i, i+1).getBytes(); // ���� -> ����Ʈ �迭
			if(charByte.length == 2)							// ������ ����Ʈ�� 2�̸� 
			{
				hanCount++;										// hanCount�� �ø���.
			}
		}
		
		return hanCount;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		String s = "�ѱ��̴�";
		byte[] b = s.getBytes(); 
		System.out.println(b.length); // �� ����Ʈ�� �����.
		
		String s1 = new String(b, 0, 4);// -> b �������� 4����Ʈ��ŭ ������.
		String s2 = new String(b, 0, 5);// -> b �������� 5����Ʈ��ŭ ������.
		String s3 = new String(b, 0, 6);// -> b �������� 6����Ʈ��ŭ ������.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.printf("%s", BlankForeword("�ѱ�abcd", 15));
		
	}

}


