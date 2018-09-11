// ��¥ : 5�� 17�� 
// ���� : ���¾�
// ���� : 4. �Ÿ� ���(������)
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class E04_DistanceCal_Park {
	
	// �迭���� �ִ밪�� �ε��� ���ϱ�
	public static int maxIndex(ArrayList<Double> Arr)
	{
		
		int iMaxPt = 0;			// ó�� ��ġ
		double iMax = Arr.get(0);	// ó�� �迭��
				
		for(int i = 0; i < Arr.size(); i++)	// ��� ���ҿ� ���Ͽ�
		{
			if(Arr.get(i) != null)
			{
				if(iMax < Arr.get(i))				// iMax�� ���������� �ش� ���Ұ��� ũ��
				{
					iMaxPt = i;						// iMaxPt�� ������ ��ġ�� �ش� ��ġ�� �ٲ�
					iMax = Arr.get(i);				// iMax�� �������� �ش� ���Ұ����� �ٲ�
				}
			}
		}
		return iMaxPt;
	}
	
	// �迭���� �ּҰ��� �ε��� ���ϱ�
	public static int minIndex(ArrayList<Double> Arr)
	{
		// Min ã��
		int iMinPt = 0;			// ó�� ��ġ
		double iMin = Arr.get(0);	// ó�� �迭��
				
		for(int i = 0; i < Arr.size(); i++)	// ��� ���ҿ� ���Ͽ�
		{
			if(Arr.get(i) != null)
			{
				if(iMin > Arr.get(i))				// iMin�� ���������� �ش� ���Ұ��� ������
				{
					iMinPt = i;						// iMinPt�� ������ ��ġ�� �ش� ��ġ�� �ٲ�
					iMin = Arr.get(i);				// iMin�� �������� �ش� ���Ұ��� �ٲ�
				}

			}
		}
		return iMinPt;
	}
	
	// �μ� �޼ҵ�
	public static void print(int index, String Line)
	{
		String[] field = Line.split("\t");
		System.out.printf("**[%d��° �׸�]******************\n", index + 2);
		System.out.printf("%s : %s\n", "���������θ��ּ�", field[4]);	// ���θ��ּ�
		System.out.printf("%s : %s\n", "����", field[28]);	// �ش� ����
		System.out.printf("%s : %s\n", "�浵", field[29]);	// �ش� �浵
		
		// ����� ����, �浵 
		double lat = 37.3860521;
		double lng = 127.1214038;
		// �ش� ���� �浵
		double lat2 = Double.parseDouble(field[28]);
		double lng2 = Double.parseDouble(field[29]);
		// �Ÿ� ���
		double dist = Math.sqrt(Math.pow(lat2 - lat, 2) + Math.pow(lng2 - lng, 2));
		
		System.out.printf("���������� �Ÿ�: %f\n", dist);
		System.out.printf("*********************************\n");
	}
		
//// ���� �޼ҵ� ////////////////////////////////////////////////////////////////////////	
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\����������ǥ�ص�����.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String oneLine;
		
		
		// ���� �а� ������ ������, ������ �ʵ� �ɰ�.
		if((oneLine = br.readLine()) == null)
		{
			System.out.printf("�� �����Դϴ�\n");
			return;
		}
		String[] field_name = oneLine.split("\t");
		
						
		// ���� �ٺ��� ����.
		// �迭�� ����� ����ϰ� ����.
		ArrayList<String> LineArr = new ArrayList<String>();
		ArrayList<Double> distArr = new ArrayList<Double>();
		
		// �Ÿ���� ///////////////////////////////////////////////////////////////////
		int lineCnt = 2;
		while((oneLine = br.readLine()) != null)
		{
			
			String[] field = oneLine.split("\t");
			
			if(field[28].matches("(^[0-9]*$)") || field[29].matches("(^[0-9]*$)"))
			{
				LineArr.add(oneLine);	// ������ �迭�� ����
				distArr.add(null);		// �Ÿ��� �迭�� ����
				lineCnt++;
				continue;
			}
			
			// ����� ����, �浵 
			double lat = 37.3860521;
			double lng = 127.1214038;
			
			// �ش� ���� �浵
			double lat2 = Double.parseDouble(field[28]);
			double lng2 = Double.parseDouble(field[29]);
			
			Double dist;
			// �Ÿ� ���
			if((lat2 >= 33 && lat2 <= 38) && (lng2 >= 124 && lng2 <= 131))
			{ dist = Math.sqrt(Math.pow(lat2 - lat, 2) + Math.pow(lng2 - lng, 2)); }
			else
			{ dist = null; }
						
			System.out.printf("**[%d��° �׸�]******************\n", lineCnt);
			System.out.printf("%s : %s\n", field_name[4], field[4]);	// ���θ��ּ�
			System.out.printf("%s : %s\n", field_name[28], field[28]);	// �ش� ����
			System.out.printf("%s : %s\n", field_name[29], field[29]);	// �ش� �浵
			System.out.printf("���������� �Ÿ�: %f\n", dist);
			System.out.printf("*********************************\n");
			
			LineArr.add(oneLine);	// ������ �迭�� ����
			distArr.add(dist);		// �Ÿ��� �迭�� ����
		
//			if(LineCnt == 10) break;
			lineCnt++;
		}
		
		// �ִ�, �ּ� �Ÿ� ��� ////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println();
		System.out.printf("**��������� ���� �� ��**********************\n");
		print(maxIndex(distArr), LineArr.get(maxIndex(distArr)));
		System.out.printf("**��������� ���� ����� ��******************\n");
		print(minIndex(distArr), LineArr.get(minIndex(distArr)));
				
	
		br.close();
	}
}
