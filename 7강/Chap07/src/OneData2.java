

public class OneData2 {

	// 변수 선언(학번, 이름, 국어, 영어, 수학, 총점, 평균)
	private int studentID;
	private String name; 
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double ave;
	
	// 생성자 메소드(학번, 이름, 국어, 영어 수학을 매개변수로 함.)
	public OneData2(int studentID, String name, int kor, int eng, int mat)
	{
		this.studentID = studentID;	// 학번, 이름, 국어, 영어, 수학 점수를 초기화
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	
		this.sum = kor + eng + mat;	// 총점, 평균을 초기화
		this.ave = sum / 3.0;
	}
		
	
	// 게터 메소드 : 각 변수를 가져오는 메소드.
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
