//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 17. 클래스 만들기
package E17_MakeClass;

public class ReportSheet_k08 {
	public static void main(String[] args) {
		
		int iPerson = 10;
		
		InputData_k08 inData = new InputData_k08(iPerson);
		
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("홍길%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			
			inData.SetData_k08(i, name, kor, eng, mat);
		}
		
		for(int i = 0; i < iPerson; i++) {
			System.out.printf(
					"번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n", 
					i, inData.name[i], inData.kor[i], inData.eng[i], inData.mat[i], inData.sum[i], inData.ave[i]);
		}
		
	}
}
