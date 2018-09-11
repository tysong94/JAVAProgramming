// ��¥ : 5�� 23�� 
// ���� : ���¾�
// ���� : 6. ���� �Ⱦ��
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E06_FileScanning {
	public static void main(String[] args) throws IOException {
		
		// ���� ����, ���� �б� ����, ���� ���� ���� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f));
		StringBuffer sb = new StringBuffer();
		
		// �� ���� ���ڼ�, �о�� ���ڼ� ���� ����
		int lineCnt = 0;
		char[] ch = new char[1000]; // �ѹ��� 1000���� ����.
		int n = -1;					 // �о�� ���ڼ�.
				
		// ���� �б�
		while(true) {
			n = br.read(ch);			// ���ڸ� �о� �迭�� ����, n�� �о�� ���ڼ�
			if(n == -1) { break; }		// ���ڰ� �����m ����.
			
			for(char c : ch) {										// 1000����(����)���� �� ���ھ� ������.
				
				if(c != '\n') {										// ������ �ƴϸ� 
					sb.append(c);									// sb(��Ʈ������)�� ���ڸ� �����Ѵ�.
				}
				else {												// �����̸� 
					System.out.printf("[%s]***\n", sb.toString());	// sb�� string���� �ٲپ� ����ϰ� ����.
					sb.delete(0, sb.length());						// sb�� ����ش�.
				}
			}
			if(lineCnt == 0) break;
			lineCnt++;
		}
		System.out.printf("[%s]***\n", sb.toString());				// ������ �����ִ� sb�� string���� �ٲٰ� �������.
		br.close();		
	}
}
