// ��¥ : 5�� 23�� 
// ���� : ���¾�
// ���� : 8. �Ｚ���� ������ �����ϱ�
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E08_FileExtracting_Samsung {
	public static void main(String[] args) throws IOException{
		
		// ���� ���� ����, ���� ���� �б� ����, ���ο� ���� ����, ���ο� ���� ���� ����, ���� ���� String ���� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File nf = new File("C:\\Users\\kopo\\Desktop\\Data\\A005930.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(nf));
		
		String oneLine;
				
		// ���� �б�, ���� �����ϱ�, ���� ����
		// ���� �б�
		int rcnt = 0; int wcnt = 0;
		while((oneLine = br.readLine()) != null) {	// �� ������ �а� ����.
			String[] field = oneLine.split(",");	// �� ������ �ʵ�� �ɰ���.(,��)
			StringBuffer sb = new StringBuffer();	// �ʵ带 ������ StringBuffer ���� ����.					
			
			// ���� �����ϱ�
			if(field.length > 2 && field[2].equals("A005930")) {	// 2�� �ʵ尡 A005930(�Ｚ����)�� ��
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
