//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 16. ���� ����ǥ(���� ������)
package E14E15E16_MakeClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GradingSheet_SeveralPage {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("������� : YYYY.MM.dd HH:MM:ss");
		
		// �迭 �����
		int iPerson = 200;
		InputData id = new InputData(iPerson);
		
		// �ڷ� ����� �迭�� �ֱ�
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("ȫ��%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			id.SetData(i, name, kor, eng, mat);
		}
						
		// ������ �� ���ϱ�
		int personPerPage = 30;
		int Page = iPerson / personPerPage;
		if(iPerson % personPerPage != 0) Page++;
		
		// ���� ��ȣ ����
		int startnum = 0;
				
		// ���� ������ �հ� ���� ���� -> �ʱ�ȭ���� ����.
		int korsum = 0;
		int engsum = 0;
		int matsum = 0;
		int sumsum = 0;
		double avesum = 0;
		int count = 0;
		
/////// �� �������� ��� ���� ����///////////////////////////////////////////////////////////
		for(int i = 0; i < Page; i++ ) {
			System.out.printf("                 ��������ǥ\n");
			System.out.printf("PAGE : %d           %s\n", i+1, sdf.format(cal.getTime()));
			System.out.printf("=================================================\n");
			System.out.printf("��ȣ  �̸�     ����   ����   ����   ����     ���\n");
			System.out.printf("=================================================\n");
			
			// ���� ������ �հ� ���� ���� -> �� ������ ����� ������ �ʱ�ȭ.
			int pkorsum = 0;
			int pengsum = 0;
			int pmatsum = 0;
			int psumsum = 0;
			double pavesum = 0;
			int pcount = 0;
			
			// �� �׸��� ��� ���� ���� /////////////////////////////////////////////////////
			for(int j = startnum; j < startnum + personPerPage; j++) {
				if(j == iPerson) break;
				
				// �ϳ��� �׸�(�ڷ�) ���
				System.out.printf("%03d %-6s%7d%7d%7d%7d%9.0f\n", j+1, id.name[j], id.kor[j], id.eng[j], id.mat[j], id.sum[j], id.ave[j]);	
				
				// ���� ������ �հ� - �� �ڷḦ ����� ������ ���� 
				pkorsum += id.kor[j];
				pengsum += id.eng[j];
				pmatsum += id.mat[j];
				psumsum += id.sum[j];
				pavesum += id.ave[j];
				pcount ++;
				
				// ���� ������ �հ� - �� �ڷḦ ����� ������ ����
				korsum += id.kor[j];
				engsum += id.eng[j];
				matsum += id.mat[j];
				sumsum += id.sum[j];
				avesum += id.ave[j];
				count ++;
			}
			// �� �׸��� ��� ���� ��//////////////////////////////////////////////////////////
			
			// ���� ������ ���
			double pkorave = pkorsum / pcount;
			double pengave = pengsum / pcount;
			double pmatave = pmatsum / pcount;
			double psumave = psumsum / pcount;
			double paveave = pavesum / pcount;
			
			System.out.printf("=================================================\n");
			System.out.printf("����������\n");
			System.out.printf("�հ�        %7d%7d%7d%7d%9.0f\n", pkorsum, pengsum, pmatsum, psumsum, pavesum);
			System.out.printf("���        %7.0f%7.0f%7.0f%7.0f%9.0f\n", pkorave, pengave, pmatave, psumave, paveave);
			
			// ���� ������ ���
			double korave = korsum / count;
			double engave = engsum / count;
			double matave = matsum / count;
			double sumave = sumsum / count;
			double aveave = avesum / count;
			
			System.out.printf("=================================================\n");
			System.out.printf("����������\n");
			System.out.printf("�հ�        %7d%7d%7d%7d%9.0f\n", korsum, engsum, matsum, sumsum, avesum);
			System.out.printf("���        %7.0f%7.0f%7.0f%7.0f%9.0f\n", korave, engave, matave, sumave, aveave);
			System.out.printf("\n");
			
			startnum += personPerPage;
		}
/////// �� �������� ��� ���� ��///////////////////////////////////////////////////////////
	}
}
