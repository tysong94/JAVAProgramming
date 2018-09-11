// ��¥ : 5�� 17�� 
// ���� : ���¾�
// ���� : 5. ���� �и�, ������ ����
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E05_FileSeparation_WIFI {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\���������������ǥ�ص�����.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File f1 = new File("C:\\Users\\kopo\\Desktop\\Data\\���������������ǥ�ص�����_SKT.txt");
		File f2 = new File("C:\\Users\\kopo\\Desktop\\Data\\���������������ǥ�ص�����_KT.txt");
		File f3 = new File("C:\\Users\\kopo\\Desktop\\Data\\���������������ǥ�ص�����_LGU+.txt");
		BufferedWriter wsk = new BufferedWriter(new FileWriter(f1));
		BufferedWriter wkt = new BufferedWriter(new FileWriter(f2));
		BufferedWriter wlg = new BufferedWriter(new FileWriter(f3));
		
		// �� ���� �����ϴ� ����
		String oneLine;
		
		// ù��° ������ ����
		if( (oneLine = br.readLine()) == null )
		{
			System.out.printf("�� �����Դϴ�\n");
			br.close();
			wsk.close();
			wkt.close();
			wlg.close();
			return;
		}
		// 3���� ���Ͽ� ù��° ������ ���� ����
		wsk.write(oneLine); wsk.newLine();
		wkt.write(oneLine); wkt.newLine();
		wlg.write(oneLine); wlg.newLine();
		
		
		
		int lineCnt = 2;
		while((oneLine = br.readLine()) != null)
		{
			String[] field = oneLine.split("\t");
			
			String tongsinsa = field[5].trim();
			
			// ���� �ٸ� ��Ż� �̸��� �ϳ��� ��Ż� �̸����� �ٲپ��ְ� �ʵ� �迭�� �־� �� �������� ������.
			// �ش� ��Ż翡 ������ ����.
			if(
				tongsinsa.equalsIgnoreCase("SK") 
				|| tongsinsa.equalsIgnoreCase("SKT") 
				|| tongsinsa.equalsIgnoreCase("skt") 
				|| tongsinsa.equalsIgnoreCase("SK�ڷ���") 
				|| tongsinsa.equalsIgnoreCase("��SK�ڷ���")
				) 
			{	
				field[5] = "SKT"; 
				oneLine = String.join("\t", field); 
				wsk.write(oneLine); wsk.newLine(); 
			}
			else if(
					tongsinsa.equalsIgnoreCase("KT") 
					|| tongsinsa.equalsIgnoreCase("��KT") 
					|| tongsinsa.equalsIgnoreCase("������Ƽ") 
					|| tongsinsa.equalsIgnoreCase("KT�÷�") 
					|| tongsinsa.equalsIgnoreCase("KT,U+") 
					|| tongsinsa.contains("KT")
					)
			{ 
				field[5] = "KT"; 
				oneLine = String.join("\t", field); 
				wkt.write(oneLine); wkt.newLine(); 
			}
			else if(
					tongsinsa.equalsIgnoreCase("(��)�������÷���") 
					|| tongsinsa.equalsIgnoreCase("lg") 
					|| tongsinsa.equalsIgnoreCase("LG") 
					|| tongsinsa.equalsIgnoreCase("LG U +") 
					|| tongsinsa.equalsIgnoreCase("LG U+") 
					|| tongsinsa.equalsIgnoreCase("LGT") 
					|| tongsinsa.equalsIgnoreCase("LGU") 
					|| tongsinsa.equalsIgnoreCase("lgu+") 
					|| tongsinsa.equalsIgnoreCase("LGU+") 
					|| tongsinsa.equalsIgnoreCase("LG���÷���") 
					|| tongsinsa.equalsIgnoreCase("U+")
					) 
			{  
				field[5] = "LGU+";
				oneLine = String.join("\t", field);
				wlg.write(oneLine); wlg.newLine();
			} 
			else { System.out.printf("�� �� ���� ��Ż�[%d��° �׸�][%s]***\n", lineCnt, field[5]); }
			
			lineCnt++;
		}
		
		br.close();
		wsk.close();
		wkt.close();
		wlg.close();
	}
}
