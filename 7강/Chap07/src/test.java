
public class test {
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
		
	}
}
