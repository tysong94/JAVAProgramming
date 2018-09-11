// ��¥ : 5�� 23�� 
// ���� : ���¾�
// ���� : 9. 20150112 ������ �����ϱ�
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileExtracting_20150112 {
	public static void main(String[] args) throws IOException{
		
		// ���� ���� ����, ���� ���� �б� ����, ���ο� ���� ����, ���ο� ���� ���� ����, ���� ���� String ���� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File nf = new File("C:\\Users\\kopo\\Desktop\\Data\\20150112.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(nf));
		
		String oneLine;
				
		// ���� �б�, ���� �����ϱ�, ���� ����
		// ���� �б�
		int rcnt = 0; int wcnt = 0;
		while((oneLine = br.readLine()) != null) {	// �� ������ �а� ����.
			String[] field = oneLine.split(",");	// �� ������ �ʵ�� �ɰ���.(,��)
			StringBuffer sb = new StringBuffer();	// �ʵ带 ������ StringBuffer ���� ����.					
			
			// ���� �����ϱ�
			if(field.length > 2 && field[1].equals("20150112")) {	// 1�� �ʵ尡 20150112�� ��
				sb.append(field[0]);								// 0�� �ʵ带 sb�� ����. 
				for(int j = 1; j < field.length; j++) {				// 1�� �ʵ���� ������ �ʵ���� ,�� �ʵ带 sb�� ����
					sb.append("," + field[j]);							
				}
				
			// ���� ����
			bw.write(sb.toString()); bw.newLine();					// ���ο� ���Ͽ� ������ sb�� string���� �ٲٰ� ���� ������. 
			wcnt++;	// �� ���� �� ī��Ʈ
			System.out.printf("write [%d][%d][%s]\n", rcnt, wcnt, sb.toString());															
			}
			rcnt++;	// ���� ���� �� ī��Ʈ
		}
		// ���� �ݱ�
		br.close();
		bw.close();
			
		System.out.printf("Program End[%d][%d]records\n",rcnt, wcnt);
		
	}
}
