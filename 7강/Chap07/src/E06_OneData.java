

public class E06_OneData {

	// 변수 선언(이름, 국어, 영어, 수학)
	private String name; 
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double ave;
	
	// 생성자 메소드(이름, 국어, 영어 수학 매개변수를 받음)
	// 이름, 국어, 영어, 수학 점수를 초기화
	// 총점, 평균을 초기화
	public E06_OneData(String name, int kor, int eng, int mat)
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	
		this.sum = kor + eng + mat;
		this.ave = sum / 3.0;
	}
		
	
	// 게터 메소드
	// 각 변수를 가져오는 메소드.
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
