// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 1. �ѱ� ���
public class E01_Han {
	public static void main(String[] args) {
		
		// ���� ���� 15ĭ ���.
		System.out.printf("HanBlankForeword[%s]\n", Han.BlankForeword("�ѱ�aa", 15));		
		System.out.printf("HanBlankForeword[%s]\n", Han.BlankForeword("�ѱ��ѱ�aa", 15));	
		System.out.printf("HanBlankForeword[%s]\n", Han.BlankBackword("�ѱ�aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", Han.BlankBackword("�ѱ��ѱ�aa", 15));
		// ���ڿ��� �ѱ��� ������ ��.
		System.out.printf("�ѱ��� [%d]��\n", Han.Count("�ѱ��ѱ�aa")); 						
	
	}
}
