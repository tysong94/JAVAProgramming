// ��¥ : 5�� 23�� 
// ���� : ���¾�
// ���� : 7. ���� �����ϱ�
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E07_FileRefining {
	public static void main(String[] args) throws IOException {
		
		// ���� ���� ����, ���� ���� �б� ����, ���ο� ���� ����, ���ο� ���� ���� ����, ���� ���� ���� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File f1 = new File("C:\\Users\\kopo\\Desktop\\Data\\StockDailyPrice.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
		
		String oneLine;
		
		
		// ���� �б�, �����ϱ�, �ٽ� ����
		int rcnt = 0; int wcnt = 0;
		while((oneLine = br.readLine()) != null) {
			StringBuffer sb = new StringBuffer();
			
			String[] field = oneLine.split("%_%");
			if(field.length > 2 && field[2].replace("^", "").trim().substring(0, 1).equals("A")) {	// ������ 2�� �ʵ��� ù���ڰ� A�� ��
				
				sb.append(field[0].replace("^", "").trim());			// ������ 0�� �ʵ带 sb�� ����. 
				for(int j = 1; j < field.length; j++) {					// 1�� �ʵ���� ������ �ʵ����
					sb.append("," + field[j].replace("^", "").trim());	// ,�� ������ �ʵ带 sb�� ������.
				}
				
				bw1.write(sb.toString()); bw1.newLine();// ���ο� ���Ͽ� ������ sb�� string���� �ٲٰ� ���� ������. 
				wcnt++;									// �� ���� �� ī��Ʈ	
				System.out.printf("write [%d][%d][%s]\n", rcnt, wcnt, sb.toString());
			}
			rcnt++;										// ���� ���� �� ī��Ʈ
		}
		br.close();
		bw1.close();
			
		System.out.printf("Program End[%d][%d]records\n",rcnt, wcnt);
	}
}
