import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// ��¥ : 5�� 14�� 
// ���� : ���¾�
// ���� : ������ ��� 2
public class E05_receipt2 {
	public static void main(String[] args) {
		
		String itemname1_k08, itemname2_k08; // ǰ��
		String itemcode1_k08, itemcode2_k08; // ǰ���ڵ�
		int price1_k08, price2_k08; // �ܰ�
		int num1_k08, num2_k08; // ����
		
		// ǰ��1 ����
		itemname1_k08 = "Ǯ��������";
		itemcode1_k08 = "8809169718205";
		price1_k08 = 1000;
		num1_k08 = 1;
		
		// ǰ��2 ����
		itemname2_k08 = "�ٳ����䱸��Ʈ";
		itemcode2_k08 = "8809169213444";
		price2_k08 = 1600;
		num2_k08 = 1;
				
		// ���� ���
		int aftertax = (price1_k08 * num1_k08) + (price2_k08 * num2_k08); // ���� ����
		int taxPercent = 10; double taxRate = taxPercent/100.0; // ����
		int pretax, tax;
		pretax = (int)(aftertax / (1+taxRate));
		tax = aftertax - pretax; // ���� = ���İ���-��������
		
		// �������� = ���İ��� / (1 + ����) -> int�� ���� ó��

		// �޸� ���
		// DecimalFormat ���� df�� format �޼ҵ� ȣ��.
		// ���� : System.out.printf("%s", df.format(����))
		DecimalFormat df = new DecimalFormat();
		
		// ��¥ ���
		// �ð� �������� : Calendar ���� cal�� getTime �޼ҵ� ȣ��
		// �ð����� ���������� �ٲ� : SimpleDateFormat ���� sdf�� format �޼ҵ� ȣ��.
		// ���� : System.out.printf("%s", sdf.format(cal.getTime))
		// ��� ����� �ٸ��� ������ �����Ƿ� ������� �ٸ� ���� ������ �����Ͽ� ����Ѵ�.
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY/MM/dd"); 
		
		// ĭ ���߱�
		// �ѱ��� ȭ��� 2ĭ�� ����, �� �ܴ� 1ĭ
		// �� 41ĭ
		System.out.printf("����(����)�ްԼ�\n");
		System.out.printf("������ֽð��ݸ������380-4\n");
		System.out.printf("�ֺ��� 677-85-00239 TEL:043-857-9929\n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("[������]%s 190049   POS��ȣ: 0002\n", sdf.format(cal.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ǰ���ڵ�              �ܰ�  ����     �ݾ�\n");
		System.out.printf("-----------------------------------------\n");
		// 19ĭ(ǰ���ڵ�) + 7ĭ(�ܰ�) + 6ĭ(����) + 9ĭ(�ݾ�) = 41ĭ
		System.out.printf("%s\n", itemname1_k08);
		System.out.printf("%-19.19s%7.7s%6.6s%9.9s\n", itemcode1_k08, df.format(price1_k08), df.format(num1_k08), df.format(price1_k08 * num1_k08));
		System.out.printf("%s\n", itemname2_k08);
		System.out.printf("%-19.19s%7.7s%6.6s%9.9s\n", itemcode2_k08, df.format(price2_k08), df.format(num2_k08), df.format(price2_k08 * num2_k08));
		System.out.printf("\n");
		// 14ĭ(�ѱ�) + 27ĭ(����) = 41ĭ
		System.out.printf("���� ��ǰ �հ�%27.27s\n", df.format(pretax));
		System.out.printf("��    ��    ��%27.27s\n", df.format(tax));
		System.out.printf("��          ��%27.27s\n", df.format(aftertax));
		System.out.printf("026-��ī���%27.27s\n", "00/00A");
		// 16ĭ(�ѱ� :) + 25ĭ(����) = 41ĭ
		System.out.printf("ī  ��  ��  ȣ :%25.25s\n", "5522-20**-****-BADD");
		System.out.printf("ī  ��  ��  �� :%25.25s\n", df.format(aftertax));
		System.out.printf("��  ��  ��  �� :%22.22s\n", "�Ͻú�");
		System.out.printf("ī  ��  ��  ȣ :%25.25s\n", "04-KICC         75549250");
		System.out.printf("�� �� �� �� ȣ :%25.25s\n", "");
		System.out.printf("��  ��  ��  �� :%25.25s\n", df.format(aftertax));
		System.out.printf("��    ��    �� :%25.25s\n", df.format(0));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("�ֹ���ȣ :      0920\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("�Ǹſ� : 000002 ������2\n");
		System.out.printf("%s-0002-0922\n", sdf2.format(cal.getTime()));
		System.out.printf("�������:[00138705  %s190049]\n", sdf.format(cal.getTime()));
			
	}
}
