// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : ĭ ���� �μ�
import java.text.DecimalFormat;

public class P14_Print {
	public static void main(String[] args) {
		
		String item = "���";
		int unit_price = 5000; // �ܰ�
		int num = 500; // ����
		int total = unit_price * num; // �հ�
		
		System.out.printf("%4.4s\n", "a"); // 1ĭ�� ��Ƹ���
		System.out.printf("%3.3s\n", "��"); // 1ĭ�� �� ��ƸԴ´�. -> ĭ���� -1��.
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // �޸��� ��� ���� DecimalFormat Ŭ���� ������.
		
		// %20.20s -> 20ĭ�� ���� ��� ���ڿ��� �־� ������ ������.
		
		// ��� ���
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "ǰ��", "�ܰ�", "����", "�հ�"); 
		// �ѱ��� ��� '1ĭ�� ��' ��Ƹ��� -> 2���� �̹Ƿ� 10-2�� ���� ĭ�� ��ƾ� �Ѵ�.
		System.out.printf("======================================================\n");
				
		// �� ���
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", 
				item, df.format(unit_price), df.format(num), df.format(total)); // ǰ��, �ܰ�, ����, �հ� ���
		// ���ڴ� 10ĭ�� �״�� �����ش�.
		System.out.printf("======================================================\n");
		  
	
	}
}
