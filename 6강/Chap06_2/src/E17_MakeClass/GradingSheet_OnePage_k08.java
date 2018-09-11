//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 17. 성적 집계표(한 페이지)
package E17_MakeClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GradingSheet_OnePage_k08 {
	public static void main(String[] args) {
		
		// 날짜, 데이터 객체, 인스턴스 생성
		Calendar cal_k08 = Calendar.getInstance();
		SimpleDateFormat sdf_k08 = new SimpleDateFormat("출력일자 : YYYY.MM.dd HH:MM:ss");
		int iPerson = 30;
		InputData_k08 id = new InputData_k08(iPerson);
		
		// 자료 생성, 데이터 배열에 자료 넣기
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("홍길%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			id.SetData_k08(i, name, kor, eng, mat);
		}
			
		// 출력
		System.out.printf("                 성적집계표\n");
		System.out.printf("                   %s\n", sdf_k08.format(cal_k08.getTime()));
		System.out.printf("=================================================\n");
		System.out.printf("번호  이름     국어   영어   수학   총점     평균\n");
		System.out.printf("=================================================\n");
		
		int korsum = 0;
		int engsum = 0;
		int matsum = 0;
		int sumsum = 0;
		double avesum = 0;
		
		for(int i = 0; i < iPerson; i++) {
			System.out.printf("%03d   %s%7d%7d%7d%7d%9.0f\n", i+1, id.name[i], id.kor[i], id.eng[i], id.mat[i], id.sum[i], id.ave[i]);	
			// 배열의 합계 구하기
			korsum += id.kor[i];
			engsum += id.eng[i];
			matsum += id.mat[i];
			sumsum += id.sum[i];
			avesum += id.ave[i];
		}
		
		// 배열의 평균 구하기
		double korave = korsum / iPerson;
		double engave = engsum / iPerson;
		double matave = matsum / iPerson;
		double sumave = sumsum / iPerson;
		double aveave = avesum / iPerson;
		
		System.out.printf("=================================================\n");
		System.out.printf("합계        %7d%7d%7d%7d%9.0f\n", korsum, engsum, matsum, sumsum, avesum);
		System.out.printf("평균        %7.0f%7.0f%7.0f%7.0f%9.0f\n", korave, engave, matave, sumave, aveave);
		
	}
}
