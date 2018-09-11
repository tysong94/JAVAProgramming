//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 17. ���� ����ǥ(�� ������)
package E17_MakeClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GradingSheet_OnePage_k08 {
	public static void main(String[] args) {
		
		// ��¥, ������ ��ü, �ν��Ͻ� ����
		Calendar cal_k08 = Calendar.getInstance();
		SimpleDateFormat sdf_k08 = new SimpleDateFormat("������� : YYYY.MM.dd HH:MM:ss");
		int iPerson = 30;
		InputData_k08 id = new InputData_k08(iPerson);
		
		// �ڷ� ����, ������ �迭�� �ڷ� �ֱ�
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("ȫ��%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			id.SetData_k08(i, name, kor, eng, mat);
		}
			
		// ���
		System.out.printf("                 ��������ǥ\n");
		System.out.printf("                   %s\n", sdf_k08.format(cal_k08.getTime()));
		System.out.printf("=================================================\n");
		System.out.printf("��ȣ  �̸�     ����   ����   ����   ����     ���\n");
		System.out.printf("=================================================\n");
		
		int korsum = 0;
		int engsum = 0;
		int matsum = 0;
		int sumsum = 0;
		double avesum = 0;
		
		for(int i = 0; i < iPerson; i++) {
			System.out.printf("%03d   %s%7d%7d%7d%7d%9.0f\n", i+1, id.name[i], id.kor[i], id.eng[i], id.mat[i], id.sum[i], id.ave[i]);	
			// �迭�� �հ� ���ϱ�
			korsum += id.kor[i];
			engsum += id.eng[i];
			matsum += id.mat[i];
			sumsum += id.sum[i];
			avesum += id.ave[i];
		}
		
		// �迭�� ��� ���ϱ�
		double korave = korsum / iPerson;
		double engave = engsum / iPerson;
		double matave = matsum / iPerson;
		double sumave = sumsum / iPerson;
		double aveave = avesum / iPerson;
		
		System.out.printf("=================================================\n");
		System.out.printf("�հ�        %7d%7d%7d%7d%9.0f\n", korsum, engsum, matsum, sumsum, avesum);
		System.out.printf("���        %7.0f%7.0f%7.0f%7.0f%9.0f\n", korave, engave, matave, sumave, aveave);
		
	}
}
