// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 6. Ŭ������ �迭
public class E06_Array_ClassArray {
	public static void main(String[] args) {
	
	// �� ������(��ü)�� ������ ����
	int iPerson = 5;
	
	// OneDataŬ������ ���ҷ� �ϴ� �迭�� ����, ����(������ŭ)
	E06_OneData[] AllData = new E06_OneData[iPerson];
	
	// �迭�� �ش� ���Ҹ� �ش� ��ü�� �ʱ�ȭ��.
	AllData[0] = new E06_OneData("ȫ��01", 100, 100, 100);
	AllData[1] = new E06_OneData("ȫ��02", 90, 90, 90);
	AllData[2] = new E06_OneData("ȫ��03", 80, 80, 80);
	AllData[3] = new E06_OneData("ȫ��04", 70, 70, 70);
	AllData[4] = new E06_OneData("ȫ��05", 60, 60, 60);
	
	// �� ��ü�� �������� ����غ���.
	for(int i = 0; i < AllData.length; i++)
	{
		System.out.printf("%s", AllData[i].getName());
		System.out.printf(" %d", AllData[i].getKor());
		System.out.printf(" %d", AllData[i].getEng());
		System.out.printf(" %d", AllData[i].getSum());
		System.out.printf(" %f", AllData[i].getAve());
		System.out.println();
	}
	
	}
}
