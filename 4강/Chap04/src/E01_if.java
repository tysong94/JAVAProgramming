// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : if��
public class E01_if {
	public static void main(String[] args) {
		
		int k08_score = 70;
		int k08_num = 0;
		
		//if(������ ���� -> ���๮�� �� �� �϶� ����.)
		if(k08_score>60) 
			System.out.println("�հ��Դϴ�.");
		
		//if
		if(k08_score>60) {
			System.out.println("�հ��Դϴ�."); // ������ ���̸� ����
		}
		
		//if ~ else
		if(k08_score>60) {
			System.out.println("�հ��Դϴ�."); // ������ ���̸� ����
		} else {
			System.out.println("���հ��Դϴ�."); // ������ �����̸� ����
		}
		
		//if ~ else if ~ else
		if(k08_num>0) {
			System.out.println("����Դϴ�."); // ����1�� ���̸� ����
		} else if(k08_num<0) {
			System.out.println("�����Դϴ�."); // ����1�� �����̰� ���� 2�� ���̸� ����
		} else {
			System.out.println("���Դϴ�."); // ����1, 2 ��� �������� ������ ����
		}
		
		if(k08_score>=90) {
			System.out.println("A���"); // ����1�� ���̸� ����
		} else if(k08_score>=80 && k08_score<90) {
			System.out.println("B���"); // ����1�� �����̰� ���� 2�� ���̸� ����
		} else if(k08_score>=70 && k08_score<80) {
			System.out.println("C���"); // ����1, 2�� �����̰� ���� 3�� ���̸� ����
		} else {
			System.out.println("F���"); // ������ ��� �������� ������ ����
		}
		
	}
}
