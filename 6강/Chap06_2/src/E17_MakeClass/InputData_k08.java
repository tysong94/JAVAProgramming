//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 17. 클래스 만들기
package E17_MakeClass;

public class InputData_k08 {
	// 변수 ////////////////////////////
	// 여러 사람의 자료
	String[] name;
	int[] kor;
	int[] eng;
	int[] mat;
	int[] sum;
	double[] ave;
		
	// 생성자 //////////////////////////////
	// 총 인원수 만큼 배열 생성
	public InputData_k08 (int iPerson) {
		this.name = new String[iPerson];
		this.kor = new int[iPerson];
		this.eng = new int[iPerson];
		this.mat = new int[iPerson];
		this.sum = new int[iPerson];
		this.ave = new double[iPerson];	
	}
	
	// 메소드 /////////////////////////////
	// 각 원소에 자료 넣기 
	public void SetData_k08(int i, String name, int kor, int eng, int mat) {
		// 한 사람의 자료
		this.name[i] = name;
		this.kor[i] = kor;
		this.eng[i] = eng; 
		this.mat[i] = eng; 
		
		this.sum[i] = this.kor[i] + this.eng[i] + this.mat[i];
		this.ave[i] = this.sum[i] / 3.0;
	}
}
