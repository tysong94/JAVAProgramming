// ��¥ : 5�� 17�� 
// ���� : ���¾�
// ���� : 3. ���� ���Ͽ� ����
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class E03_ApplyToRealFile_WIFI {
	
	public static void main(String[] args) throws IOException 
	{
		// ���� ����, ���� �б� ����, ���� ���� ���� ����
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\���������������ǥ�ص�����.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String oneLine;
		
		// �ʵ�� ����(ù��° ����) �ɰ���
		if((oneLine = br.readLine()) == null)		// �ʵ�� ������ ������(�� �����̸�) 
		{
			System.out.printf("�� �����Դϴ�\n");	// �������̶�� ���.
			br.close();								// ���� ����.
			return;
		}
		String[] field_name = oneLine.split(",");	// ù��° ������ ,�� ������ �ʵ�� �迭�� �־��ش�.
		
		// ���� ����(�ι�° ����~) �ɰ��� ����ϱ�.
		int lineCnt = 1;							// ���μ��� ������ ���� ����
		while((oneLine = br.readLine()) != null)	// �� ������ �а� ����, ������� �ƴϸ� ��� ������.
		{
			String[] field = oneLine.split(",");								// �� ������ ,�� ������ �ʵ� �迭�� �־��ش�.
			
			System.out.printf("**[%d��° �׸�]******************\n", lineCnt);	
			for(int j = 0; j < field_name.length; j++)
			{
				System.out.printf("%s : %s\n", field_name[j], field[j]);		// �� ������ �ʵ��� �ʵ带 ��� ���
			}
			System.out.printf("*********************************\n");
			
			if(lineCnt == 100) break;											// �� 100������ �Ǹ� ����. 			
			lineCnt++;															// ���μ��� �÷���.
		}
		br.close();																// ���� ����.
	}
}
