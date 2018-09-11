// ��¥ : 5�� 23�� 
// ���� : ���¾�
// ���� : 10. �Ｚ���� 2015�� �ִ�/�ּ� ���� ������ �����ϱ�
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E10_FileExtracting_Samsung_2015_MaxMin {
	public static void main(String[] args) throws IOException{
		
		// ���� ���� ����, ���� ���� �б� ����, ���ο� ���� ����, ���ο� ���� ���� ����, ���� ���� String ���� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\A005930.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File nf = new File("C:\\Users\\kopo\\Desktop\\Data\\A005930_2015_Max_Min.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(nf));
		
		String oneLine;								// �� ���� ������ String ���� ����
		oneLine = br.readLine(); br.close();		// �� ���� �а� ����, �ݱ�
		String[] tempfield = oneLine.split(",");	// �� ������ �ʵ�� �ɰ���.(,��)
		
		int max = Integer.parseInt(tempfield[3]);	// ���� max �ʱⰪ
		int min = Integer.parseInt(tempfield[3]);	// ���� min �ʱⰪ
		
		StringBuffer sbMax = new StringBuffer();	// �ʵ带 ������ StringBuffer ���� ����.		
		StringBuffer sbMin = new StringBuffer();
		
		int rcnt = 0; int wcnt = 0;
		
		br = new BufferedReader(new FileReader(f));// BufferReader �ʱ�ȭ.
		
		// ���� �б�, ���� �����ϱ�, ���� ����
		// ���� �б�
		while((oneLine = br.readLine()) != null) {	// �� ������ �а� ����.
			String[] field = oneLine.split(",");	// �� ������ �ʵ�� �ɰ���.(,��)
						
			// ���� �����ϱ�
			if(field[1].contains("2015")) {						// 1�� �ʵ尡 2015���� ��
				
				if(max < Integer.parseInt(field[3])) {			// 3�� �ʵ�(����)�� �� ũ��
				
					max = Integer.parseInt(field[3]);			// ������ ����
					sbMax.delete(0, sbMax.length());			// sbMax�� ���
					sbMax.append(field[0]);						// 0�� �ʵ带 sbMax�� ����. 
					for(int j = 1; j < field.length; j++) 	{	// 1�� �ʵ���� ������ �ʵ���� ,�� �ʵ带 sbMax�� ����
						sbMax.append("," + field[j]);							
					}
				
				}
				if(min > Integer.parseInt(field[3])) {			// 3�� �ʵ�(����)�� �� ������
					
					min = Integer.parseInt(field[3]);			// ������ ����	
					sbMin.delete(0, sbMin.length());			// sbMin�� ���
					sbMin.append(field[0]);						// 0�� �ʵ带 sbMin�� ����. 
					for(int j = 1; j < field.length; j++) 	{	// 1�� �ʵ���� ������ �ʵ���� ,�� �ʵ带 sbMin�� ����
						sbMin.append("," + field[j]);							
					}
				}
			}
			rcnt++;												// ���� ���� �� ī��Ʈ
		}
		// ���� ����
		bw.write(sbMax.toString()); bw.newLine();	// ���ο� ���Ͽ� ������ sbMax�� string���� �ٲٰ� ���� ������. 
		wcnt++;
		bw.write(sbMin.toString()); bw.newLine();	// ���ο� ���Ͽ� ������ sbMin�� string���� �ٲٰ� ���� ������. 
		wcnt++;										// �� ���� �� ī��Ʈ
		
		System.out.printf("write [%d][%d][%s]\n", rcnt, wcnt, sbMax.toString());
		System.out.printf("write [%d][%d][%s]\n", rcnt, wcnt, sbMin.toString());
				
		// ���� �ݱ�
		br.close();
		bw.close();
			
		System.out.printf("Program End[%d][%d]records\n",rcnt, wcnt);
		
	}
}
