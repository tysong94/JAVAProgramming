// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 9. Ŭ������ ArrayList
import java.util.ArrayList;

public class E09_ArrayList_Class {
	
	static ArrayList<OneData1> AllData = new ArrayList<OneData1>();
	
	static int sumkor = 0;
	static int sumeng = 0;
	static int summat = 0;
	static int sumsum = 0;
	static int sumave = 0;
	static final int iPerson = 20;
	
	// ������ ����� �޼ҵ�
	public static void DataSet()
	{
		for(int i = 0; i < iPerson; i++)
		{
			// ���� �Ű������� ����
			int studentID = i + 1;
			String name = String.format("ȫ��%02d", i);			
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			
			// OneData ��ü�� �����ϰ� AllData �迭�� �ִ´�.
			AllData.add(new OneData1(studentID, name, kor, eng, mat)); 
		}
	}
	
	// ��� �μ�
	public static void HeadPrint()
	{
		System.out.printf("************************************\n");
		System.out.printf("%2s %4s %2s %2s %2s %2s %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("************************************\n");
	}
	
	// ���� �μ� : �ϳ��� OneData(��ü)�� �������� ���
	public static void ItemPrint(int i)
	{
		OneData1 od = AllData.get(i);
		System.out.printf
		(
			"%4d %4s %3d %3d %3d  %3d  %6.2f\n",
			od.getStudentID(), od.getName(), od.getKor(), od.getEng(), od.getMat(), od.getSum(), od.getAve()
		);
		
		sumkor += od.getKor();
		sumeng += od.getEng();
		summat += od.getMat();
		sumsum += od.getSum();
		sumave += od.getAve();
	}
	
	// ���� �μ�
	public static void TailPrint()
	{
		System.out.printf("************************************\n");
		System.out.printf("�����հ� %d   �������: %6.2f\n", sumkor, sumkor / (double)AllData.size());
		System.out.printf("�����հ� %d   �������: %6.2f\n", sumeng, sumeng / (double)AllData.size());
		System.out.printf("�����հ� %d   �������: %6.2f\n", summat, summat / (double)AllData.size());
		System.out.printf("************************************\n");
		System.out.printf("������հ� %d   �����: %6.2f\n", sumave, sumave / (double)AllData.size());
	}
	
	public static void main(String[] args) {
		
		DataSet();
		HeadPrint();
		for(int i = 0; i < AllData.size(); i++)
		{
			ItemPrint(i);
		}
		TailPrint();
		
	}
	
}
