// ��¥ : 5�� 17�� 
// ���� : ���¾�
// ���� : 1. �����ϰ� �а� ����
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class E01_SimpleRW {
	public static void main(String[] args) {
		
		try 
		{
			// ������ ������ ���� ������ ����
			File f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");
			
			// ���� ����
			FileWriter fw = new FileWriter(f);	// ���� ���� ���� ����
			
			fw.write("�ȳ�\r\n");				// ���� ����
			fw.write("hello\r\n");				
			
			fw.close();							// ���� �ݱ�
			
			
			// ���� �б�
			FileReader fr = new FileReader(f);		// ���� �б� ���� ����
			
			char[] ch = new char[100];				// �ִ� ���� �� �ִ� ���ڼ� ����.
			int n = -1;								// �о�� ���� ���� : -1�� ���ڰ� ���� ���� ��.
			
			while(true)						 	
			{
				n = fr.read(ch);					// ch �迭�� �� ���ھ� ����, n�� �� �о�� ���ڼ��� ����.
				if(n == -1) break;					// �о�� ���ڰ� ������ �����.
				for(int i = 0; i < n; i++)			// �о�� ���ڼ���ŭ
				{
					System.out.printf("%c", ch[i]);	// ch �迭���� ���ڸ� ������.
				}
			}
			
			fr.close();								// ���� �ݱ�
			System.out.printf("\nFILE READ END");
		}
		catch(Exception e)
		{
			System.out.printf("�����Դϴ�.[%s]", e);
		}
		
	}
}
