// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 10. �������� ���� ����ǥ
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class E10_GradeTableSort {
	
	// OneData ArrayList �����
	static ArrayList<OneData2> AllData = new ArrayList<OneData2>();
	
	// ���� ����
	static int pkorsum = 0;			// ���� ������ �հ� ����
	static int pengsum = 0;
	static int pmatsum = 0;
	static int ptotsum = 0;
	static int pavesum = 0;
	static int pitemcount = 0;
		
	static int sumkor = 0;				// ���� ������ �հ� ����
	static int sumeng = 0;
	static int summat = 0;
	static int sumsum = 0;
	static int sumave = 0;
	static int aitemcount = 0;
	
		
	// �� ������ ����
	public static void DataSet(int personNum)
	{
		for(int i = 0; i < personNum; i++)
		{
			int studentID = i + 1;										// ���� �Ű������� ����
			String name = String.format("ȫ��%02d", i);			
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			
			AllData.add(new OneData2(studentID, name, kor, eng, mat)); 	// OneData ��ü�� �����ϰ� AllData �迭�� �ִ´�.
		}
	}
	
	// �� ������ �����ϱ�
	public static void DataSort()
	{
		Comparator<OneData2> kijun = new Comparator<OneData2>()
		{
			public int compare(OneData2 a1, OneData2 a2)
			{
				return (a2.getSum() - a1.getSum());
			}
		};
		Collections.sort(AllData, kijun);
	
		for(int i = 0; i < AllData.size(); i++)		// ��ȣ �ٽ� �ٲپ �ֱ�.
		{
			AllData.get(i).setStudentID(i+1);
		}
	}
	
	
	// ��� �μ�
	public static void HeadPrint(int page)
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.printf("                  ��������ǥ                    \n");
		System.out.printf("PAGE : %d                     %s\n", page, sdf.format(cal.getTime()));
		System.out.printf("================================================\n");
		System.out.printf("��ȣ   �̸�     ����   ����   ����   �հ�   ���\n");
		System.out.printf("================================================\n");
	}
	
	// ���� �μ� : �ϳ��� OneData�� �������� ���
	public static void ItemPrint(int i)
	{
		OneData2 od = AllData.get(i);
		System.out.printf
		(
			"%03d    %-5s%6d%7d%7d%7d%7.0f\n",
			od.getStudentID(), od.getName(), od.getKor(), od.getEng(), od.getMat(), od.getSum(), od.getAve()
		);
		
		pkorsum += od.getKor();
		pengsum += od.getEng();
		pmatsum += od.getMat();
		ptotsum += od.getSum();
		pavesum += od.getAve();
		pitemcount ++;
				
		sumkor += od.getKor();
		sumeng += od.getEng();
		summat += od.getMat();
		sumsum += od.getSum();
		sumave += od.getAve();
		aitemcount ++;
	}
	
	// ���� �μ�
	public static void TailPrint()
	{
		// ���� ������ �μ�
		System.out.printf("================================================\n");
		System.out.printf("����������\n");
		System.out.printf
		(
			"%-11s%7d%7d%7d%7d%7d\n", 
			"�հ�", pkorsum, pengsum, pmatsum, ptotsum, pavesum
		);
		System.out.printf
		(
			"%-11s%7.0f%7.0f%7.0f%7.0f%7.0f\n",
			"���", pkorsum / (double)pitemcount, pengsum / (double)pitemcount, pmatsum / (double)pitemcount, ptotsum / (double)pitemcount, pavesum / (double)pitemcount
		);
		pkorsum = 0;
		pengsum = 0;
		pmatsum = 0;
		ptotsum = 0;
		pavesum = 0;
		pitemcount = 0;
		
		// ���� ������ �μ�
		System.out.printf("================================================\n");
		System.out.printf("����������\n");
		System.out.printf
		(
			"%-11s%7d%7d%7d%7d%7d\n",
			"�հ�", sumkor, sumeng, summat, sumsum, sumave
		);
		System.out.printf
		(
			"%-11s%7.0f%7.0f%7.0f%7.0f%7.0f\n",
			"���", sumkor / (double)aitemcount, sumeng / (double)aitemcount, summat / (double)aitemcount, sumsum / (double)aitemcount, sumave / (double)aitemcount
		);
		System.out.printf("\n\n");
	}
	
	public static void main(String[] args) {
		
		// ������ ����
		DataSet(10);	// ������ ����
//		DataSort();	// ������ ����
		
		// �׸� ��, ������ �� ����
		int pageitemnum = 3; 								// �������� �׸� ��
		int allPage = AllData.size() / pageitemnum;			// ��ü ������ 
		if(AllData.size() % pageitemnum !=0) { allPage++; }
		int startindex = 0;									// ���� �ε��� ����
					
		// ���
		for(int Page = 1; Page <= allPage; Page++) 						// ó�� ���������� ������ ����������
		{
			
			HeadPrint(Page);											// ��� �μ�
			
			for(int i = startindex; i < startindex + pageitemnum; i++)	// ���� �����ͺ��� �׸� ����ŭ ������ �μ�
			{
				if(i == AllData.size()) 
				{
					break;
				}
				else
				{
					ItemPrint(i);
				}			
			}
						
			TailPrint();										// ���� �μ�
			
			startindex = startindex + pageitemnum;						// ���� ������ ����
		}
	
	}
	
}
