import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// ��¥ : 5�� 4�� 
// ���� : ���¾�
// ���� : 13. �޸� ���, ��¥ ����

public class E13_Date {
	public static void main(String[] args) {
		int k08_myWon = 1000000; // ��
		double k08_moneyEx = 1238.21; // �޷��� ��
		double k08_commission = 0.003; // �޷��� ��������
		double k08_comPerOne = k08_moneyEx*k08_commission; // �޷��� ������ = �޷��� ��*�޷��� ��������
		
		int k08_usd = (int)(k08_myWon/(k08_moneyEx+k08_comPerOne)); // �޷� = ��/(�޷��� ��+�޷��� ������) -> ȯ���ÿ� ���� ��������� ����ؾ���.
		double k08_totalCom = k08_usd*k08_comPerOne; // �� ������ = �޷�*�޷��� ������
		int k08_i_totalCom; // ������ �� ������
		// �� �����ᰡ ������ �������� ������ ���������� �ϰ� �ø�, ������ �������� ���������θ� �ٲپ���.
		if(k08_totalCom != (double)((int)k08_totalCom)) { 
			k08_i_totalCom = (int)k08_totalCom+1; 
		} else {
			k08_i_totalCom = (int)k08_totalCom; 
		}
		int k08_remain = (int)(k08_myWon-k08_usd*k08_moneyEx-k08_i_totalCom); // �ܵ� = �� - �޷���ȭ - ������ �� ������
		
		// �޸� ���
		// ���ڸ� ,�� ǥ���ϱ� ���� DecimalFormat ������ �����ϰ� df.format �޼ҵ带 ȣ����.
		// ����� �� ������� %s�� �ؾ� �Ѵ�.
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		
		// ��¥ ���
		// Ķ���� ���� cal�� �����Ͽ� getTime�޼ҵ� ȣ��, SimpleDateFormat ���� sdf�� �����Ͽ� format �޼ҵ� ȣ��.
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		
		System.out.printf("********************************************************************\n");
		System.out.printf("*                             ��¥ ����                                                      *\n");
		System.out.printf("�޷��� ������ : %f��, �� ������ : %s��\n", 
				k08_comPerOne, 
				df.format(k08_i_totalCom));
		System.out.printf("�� ��ȭȯ���ݾ� : %s�� => ��ȭ : %s�޷�, ������¡�� : %s��, �ܵ� : %s��\n", 
				df.format(k08_myWon), 
				df.format(k08_usd), 
				df.format(k08_i_totalCom), 
				df.format(k08_remain));
		System.out.printf("��������ð� : %s\n", sdf.format(cal.getTime()));
		System.out.printf("********************************************************************\n");
			
	}
}
