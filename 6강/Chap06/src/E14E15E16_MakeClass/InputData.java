//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 14. 클래스 만들기
package E14E15E16_MakeClass;

public class InputData {
	// 변수 선언 ////////////////////////////
	// 한 사람의 자료
	String[] name;
	int[] kor;
	int[] eng;
	int[] mat;
	int[] sum;
	double[] ave;
			
	// 총 인원수 만큼 배열 생성 ////////////////////////////
	public InputData (int iPerson) {
		this.name = new String[iPerson];
		this.kor = new int[iPerson];
		this.eng = new int[iPerson];
		this.mat = new int[iPerson];
		this.sum = new int[iPerson];
		this.ave = new double[iPerson];	
	}
	
	// 각 원소에 자료 넣기 ////////////////////////////
	public void SetData(int i, String name, int kor, int eng, int mat) {
		// 한 사람의 자료
		this.name[i] = name;
		this.kor[i] = kor;
		this.eng[i] = eng; 
		this.mat[i] = eng; 
		
		this.sum[i] = this.kor[i] + this.eng[i] + this.mat[i];
		this.ave[i] = this.sum[i] / 3.0;
	}
}
