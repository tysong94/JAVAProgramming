// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : switch case��
public class E02_switchcase {
	public static void main(String[] args) {
		
		String k08_jumin="123456-1234567";
		
		switch(k08_jumin.charAt(7)) { // string�� ��� �Ұ�.
		case '1':
			System.out.println("20������ �¾ ���� ���\n");
			//break;
		case '2':
			System.out.println("20������ �¾ ���� ���\n");
			//break;
		case '3':
			System.out.println("20������ �¾ ���� ���\n");
			//break;
		case '4':
			System.out.println("20������ �¾ ���� ���\n");
			//break;
		default :
			System.out.println("���\n");
			//break;
		}
		//break�� ���� ������ ����ǹǷ� break�� ���� ������ �ѹ� ����� ���Ǻ��� ���������� ��� ����ȴ�.
	}
}
