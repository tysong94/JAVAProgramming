

public class OneData2 {

	// ���� ����(�й�, �̸�, ����, ����, ����, ����, ���)
	private int studentID;
	private String name; 
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double ave;
	
	// ������ �޼ҵ�(�й�, �̸�, ����, ���� ������ �Ű������� ��.)
	public OneData2(int studentID, String name, int kor, int eng, int mat)
	{
		this.studentID = studentID;	// �й�, �̸�, ����, ����, ���� ������ �ʱ�ȭ
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	
		this.sum = kor + eng + mat;	// ����, ����� �ʱ�ȭ
		this.ave = sum / 3.0;
	}
		
	
	// ���� �޼ҵ� : �� ������ �������� �޼ҵ�.
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


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
