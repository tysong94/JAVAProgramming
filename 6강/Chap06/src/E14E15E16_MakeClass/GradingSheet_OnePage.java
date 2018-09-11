//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 15. 성적 집계표(한 페이지)
package E14E15E16_MakeClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GradingSheet_OnePage {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("출력일자 : YYYY.MM.dd HH:MM:ss");
		
		// 배열 만들기
		int iPerson = 30;
		InputData id = new InputData(iPerson);
		
		// 자료 만들고 배열에 넣기
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("홍길%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			id.SetData(i, name, kor, eng, mat);
		}
		
		// 배열의 합계 구하기
		int korsum = 0;
		int engsum = 0;
		int matsum = 0;
		int sumsum = 0;
		double avesum = 0;
		for(int i = 0; i < iPerson; i++) {
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
			
		// 출력
		System.out.printf("                 성적집계표\n");
		System.out.printf("                   %s\n", sdf.format(cal.getTime()));
		System.out.printf("=================================================\n");
		System.out.printf("번호  이름     국어   영어   수학   총점     평균\n");
		System.out.printf("=================================================\n");
		for(int i = 0; i < iPerson; i++) {
			System.out.printf("%03d   %s%7d%7d%7d%7d%9.0f\n", i+1, id.name[i], id.kor[i], id.eng[i], id.mat[i], id.sum[i], id.ave[i]);	
		}
		System.out.printf("=================================================\n");
		System.out.printf("합계        %7d%7d%7d%7d%9.0f\n", korsum, engsum, matsum, sumsum, avesum);
		System.out.printf("평균        %7.0f%7.0f%7.0f%7.0f%9.0f\n", korave, engave, matave, sumave, aveave);
		
	}
}
