//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 15. ���� ����ǥ(�� ������)
package E14E15E16_MakeClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GradingSheet_OnePage {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("������� : YYYY.MM.dd HH:MM:ss");
		
		// �迭 �����
		int iPerson = 30;
		InputData id = new InputData(iPerson);
		
		// �ڷ� ����� �迭�� �ֱ�
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("ȫ��%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			id.SetData(i, name, kor, eng, mat);
		}
		
		// �迭�� �հ� ���ϱ�
		int korsum = 0;
		int engsum = 0;
		int matsum = 0;
		int sumsum = 0;
		double avesum = 0;
		for(int i = 0; i < iPerson; i++) {
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
			
		// ���
		System.out.printf("                 ��������ǥ\n");
		System.out.printf("                   %s\n", sdf.format(cal.getTime()));
		System.out.printf("=================================================\n");
		System.out.printf("��ȣ  �̸�     ����   ����   ����   ����     ���\n");
		System.out.printf("=================================================\n");
		for(int i = 0; i < iPerson; i++) {
			System.out.printf("%03d   %s%7d%7d%7d%7d%9.0f\n", i+1, id.name[i], id.kor[i], id.eng[i], id.mat[i], id.sum[i], id.ave[i]);	
		}
		System.out.printf("=================================================\n");
		System.out.printf("�հ�        %7d%7d%7d%7d%9.0f\n", korsum, engsum, matsum, sumsum, avesum);
		System.out.printf("���        %7.0f%7.0f%7.0f%7.0f%9.0f\n", korave, engave, matave, sumave, aveave);
		
	}
}
