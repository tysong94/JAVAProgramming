// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : sin�Լ� �׷���
public class P12_SinGraph {
	public static void main(String[] args) {
		
		double fSin_k08;
		
		for(int angle_k08 = 0; angle_k08 < 360; angle_k08++) // 0 ~ 359������ ����
		{
			fSin_k08 = Math.sin(angle_k08 * 3.141592 / 180); // 0�� ~ 359�� ������ ���� �Լ���
			System.out.printf("%d sin ==> %f\n", angle_k08, fSin_k08); // ~�� ���� ==> ���� �Լ��� ���
		}
		
		for(int angle_k08 = 0; angle_k08 < 360; angle_k08++) // 0 ~ 359������ ����
		{
			fSin_k08 = Math.sin(angle_k08*3.141592/180); // 0�� ~ 359�� ������ ���� �Լ��� -> -1 ~ 1���� ���´�.
			
			int Space_k08 = (int)((1.0 - fSin_k08)*50); // ���� �Լ����� 0 ~ 2������ �ٲپ��ְ� 50�� ���Ͽ� ���������� �ٲٸ�  ���� ���� 0 ~ 100���� Ŀ����. 
			for(int i_k08 = 0; i_k08 < Space_k08; i_k08++) System.out.printf(" "); // i�� Space�� ��ŭ ������ ����ش�.
			System.out.printf("*[%f][%d]\n", fSin_k08, Space_k08); // ���� ���� ������ �����. -> sin���� ��ǥ���� x������ ǥ������ ���� ��µȴ�.
		}
		
	}
}
