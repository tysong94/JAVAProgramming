import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// ��¥ : 5�� 14�� 
// ���� : ���¾�
// ���� : ������ ��� 1
public class E04_receipt {
	public static void main(String[] args) {
		
		// ���� ���
		int aftertax_k08 = 14000; // ���� ����
		int taxPercent_k08 = 10; double taxRate_k08 = taxPercent_k08/100.0; // ����
		
		int pretax_k08, tax_k08; // ��������, ����
		pretax_k08 = (int)(aftertax_k08 / (1 + taxRate_k08)); // �������� = ���İ��� / (1 + ����) -> int�� ���� ó��
		tax_k08 = aftertax_k08 - pretax_k08; // ���� = ���İ���-��������
		// �޸� ���
		// DecimalFormat ���� df�� format �޼ҵ� ȣ��.
		// ���� : System.out.printf("%s", df.format(����))
		DecimalFormat df = new DecimalFormat();
		
		// ��¥ ���
		// �ð� �������� : Ķ���� ���� cal�� getTime �޼ҵ� ȣ��
		// �ð����� ���������� �ٲ� : SimpleDateFormat ���� sdf�� format �޼ҵ� ȣ��.
		// ���� : System.out.printf("%s", sdf.format(cal.getTime))
		// ��� ����� �ٸ��� ������ �����Ƿ� ������� �ٸ� ���� ������ �����Ͽ� ����Ѵ�.
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY-MM-dd HH:mm"); 
		
		// ĭ���߱�
		// �ѱ��� ȭ��� 2ĭ�� ����, �� �ܴ� 1ĭ
		// �� 41ĭ
		System.out.printf("\n");
		System.out.printf("              ��  ��  ��\n");
		System.out.printf("=========================================\n");
		System.out.printf("���λ�ȸ(�д缭����) 129-17-77924\n");
		System.out.printf("�̻�ö 031 781 1596\n");
		System.out.printf("������ �д籸 ������ 269-3\n");
		System.out.printf("���̺�� : 12\n");
		System.out.printf("�ֹ���ȣ : %s 01 00041\n", sdf.format(cal.getTime()));
		System.out.printf("=========================================\n");
		// 8ĭ(�ֹ��հ�) + 33ĭ(����) = 41ĭ
		System.out.printf("�ֹ��հ�%33.33s\n", df.format(aftertax_k08));
		System.out.printf("���αݾ�%33.33s\n", df.format(0));
		System.out.printf("�����ݾ�%33.33s\n", df.format(aftertax_k08));
		System.out.printf("=========================================\n");
		// 6ĭ(�ѱ�) + 12ĭ(����) + 5ĭ(����) + 6ĭ(�ѱ�) + 12ĭ(����) = 41ĭ
		System.out.printf("��  ��%12.12s     ��  ��%12.12s\n", df.format(0), df.format(pretax_k08));
		System.out.printf("ī  ��%12.12s     ��  ��%12.12s\n", df.format(aftertax_k08), df.format(tax_k08));
		System.out.printf("����Ʈ%12.12s     ��  ��%12.12s\n", df.format(0), df.format(0));
		System.out.printf("%23.23s�����ݾ�%10.10s\n", "", df.format(aftertax_k08));
		System.out.printf("=========================================\n");
		System.out.printf("         [�츮ī�� �ſ� ����]\n");
		System.out.printf("�� �� �� �� : %s\n", sdf2.format(cal.getTime()));
		System.out.printf("ī �� �� ȣ : 55222059****2021\n");
		System.out.printf("�� �� �� ȣ : 79753574  �Һΰ��� : 00\n");
		System.out.printf("�� �� �� �� : %s\n", df.format(aftertax_k08));
		System.out.printf("�� �� �� ȣ : 730461774  /  ��ī���\n");
		System.out.printf("����� ��ȣ : 129-17-77924\n");
		System.out.printf("=========================================\n");
		System.out.printf("%s CASHIER :           ����\n", sdf3.format(cal.getTime()));
		System.out.printf("=========================================\n");
		System.out.printf("���� �մϴ�.\n");
		
		
		
		
	}
}
