//날짜 : 5월 19일 
//저자 : 송태양
//제목 : 16. 성적 집계표(여러 페이지)
package E14E15E16_MakeClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GradingSheet_SeveralPage {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("출력일자 : YYYY.MM.dd HH:MM:ss");
		
		// 배열 만들기
		int iPerson = 200;
		InputData id = new InputData(iPerson);
		
		// 자료 만들고 배열에 넣기
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("홍길%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			id.SetData(i, name, kor, eng, mat);
		}
						
		// 페이지 수 구하기
		int personPerPage = 30;
		int Page = iPerson / personPerPage;
		if(iPerson % personPerPage != 0) Page++;
		
		// 시작 번호 선언
		int startnum = 0;
				
		// 누적 페이지 합계 변수 선언 -> 초기화되지 않음.
		int korsum = 0;
		int engsum = 0;
		int matsum = 0;
		int sumsum = 0;
		double avesum = 0;
		int count = 0;
		
/////// 한 페이지의 출력 내용 시작///////////////////////////////////////////////////////////
		for(int i = 0; i < Page; i++ ) {
			System.out.printf("                 성적집계표\n");
			System.out.printf("PAGE : %d           %s\n", i+1, sdf.format(cal.getTime()));
			System.out.printf("=================================================\n");
			System.out.printf("번호  이름     국어   영어   수학   총점     평균\n");
			System.out.printf("=================================================\n");
			
			// 현재 페이지 합계 변수 선언 -> 한 페이지 출력할 때마다 초기화.
			int pkorsum = 0;
			int pengsum = 0;
			int pmatsum = 0;
			int psumsum = 0;
			double pavesum = 0;
			int pcount = 0;
			
			// 한 항목의 출력 내용 시작 /////////////////////////////////////////////////////
			for(int j = startnum; j < startnum + personPerPage; j++) {
				if(j == iPerson) break;
				
				// 하나의 항목(자료) 출력
				System.out.printf("%03d %-6s%7d%7d%7d%7d%9.0f\n", j+1, id.name[j], id.kor[j], id.eng[j], id.mat[j], id.sum[j], id.ave[j]);	
				
				// 현재 페이지 합계 - 한 자료를 출력할 때마다 누적 
				pkorsum += id.kor[j];
				pengsum += id.eng[j];
				pmatsum += id.mat[j];
				psumsum += id.sum[j];
				pavesum += id.ave[j];
				pcount ++;
				
				// 누적 페이지 합계 - 한 자료를 출력할 때마다 누적
				korsum += id.kor[j];
				engsum += id.eng[j];
				matsum += id.mat[j];
				sumsum += id.sum[j];
				avesum += id.ave[j];
				count ++;
			}
			// 한 항목의 출력 내용 끝//////////////////////////////////////////////////////////
			
			// 현재 페이지 평균
			double pkorave = pkorsum / pcount;
			double pengave = pengsum / pcount;
			double pmatave = pmatsum / pcount;
			double psumave = psumsum / pcount;
			double paveave = pavesum / pcount;
			
			System.out.printf("=================================================\n");
			System.out.printf("현재페이지\n");
			System.out.printf("합계        %7d%7d%7d%7d%9.0f\n", pkorsum, pengsum, pmatsum, psumsum, pavesum);
			System.out.printf("평균        %7.0f%7.0f%7.0f%7.0f%9.0f\n", pkorave, pengave, pmatave, psumave, paveave);
			
			// 누적 페이지 평균
			double korave = korsum / count;
			double engave = engsum / count;
			double matave = matsum / count;
			double sumave = sumsum / count;
			double aveave = avesum / count;
			
			System.out.printf("=================================================\n");
			System.out.printf("누적페이지\n");
			System.out.printf("합계        %7d%7d%7d%7d%9.0f\n", korsum, engsum, matsum, sumsum, avesum);
			System.out.printf("평균        %7.0f%7.0f%7.0f%7.0f%9.0f\n", korave, engave, matave, sumave, aveave);
			System.out.printf("\n");
			
			startnum += personPerPage;
		}
/////// 한 페이지의 출력 내용 끝///////////////////////////////////////////////////////////
	}
}
