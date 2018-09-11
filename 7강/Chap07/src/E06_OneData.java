

public class E06_OneData {

	// ���� ����(�̸�, ����, ����, ����)
	private String name; 
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double ave;
	
	// ������ �޼ҵ�(�̸�, ����, ���� ���� �Ű������� ����)
	// �̸�, ����, ����, ���� ������ �ʱ�ȭ
	// ����, ����� �ʱ�ȭ
	public E06_OneData(String name, int kor, int eng, int mat)
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	
		this.sum = kor + eng + mat;
		this.ave = sum / 3.0;
	}
		
	
	// ���� �޼ҵ�
	// �� ������ �������� �޼ҵ�.
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}


	public int getSum() {
		return sum;
	}


	public double getAve() {
		return ave;
	}
	
}
