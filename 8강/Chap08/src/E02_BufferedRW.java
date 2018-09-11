// ��¥ : 5�� 17�� 
// ���� : ���¾�
// ���� : 2. Buffered �а� ����
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E02_BufferedRW {
	
	// ���� ���� �޼ҵ�
	public static void FileWrite() throws IOException
	{
		File f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");	// ���� ��������
		BufferedWriter bw = new BufferedWriter(new FileWriter(f)); // ���� ���� ���� ���� 
		
		bw.write("�ȳ� �ȳ�");	// ���� ����
		bw.newLine();			// �����ϱ�
		bw.write("hello hello");
		bw.newLine();
		
		bw.close();				// ���� �ݱ�
	}
	
	// ���� �б� �޼ҵ�
	public static void FileRead() throws IOException
	{
		File f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");	// ���� ��������
		BufferedReader br = new BufferedReader(new FileReader(f));	// ���� �б� ���� ����
		
		String oneLine;								// �� ���� ������ ���ڿ�
		while((oneLine = br.readLine()) != null)	// �� ���� �а� ������, ���� ������ ����.
		{
			System.out.printf("%s\n", oneLine);		// ������ ���� ���
		}
		
		br.close();									// ���� �ݱ�
	}
		
	// ���� �޼ҵ� - ���� �б�, ���� ���� �޼ҵ� ����
	public static void main(String[] args) throws IOException
	{
		FileWrite();
		FileRead();		
	}
}
