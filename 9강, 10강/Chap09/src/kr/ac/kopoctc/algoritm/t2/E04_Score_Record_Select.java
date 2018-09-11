//날짜 : 5월 30일 
//저자 : 송태양
//제목 : 2. Basic Training (2) - 성적 레코드 읽기
package kr.ac.kopoctc.algoritm.t2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class E04_Score_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db 접속, 쿼리 저장 변수, 쿼리 실행 객체, 결과 저장 객체 -> 생성/인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		String query;
		Statement stmt = conn.createStatement();
		ResultSet rset; 
		
		// 총 페이지 수 구하기
		rset = stmt.executeQuery("select count(*) from score_k08;");// 레코드 개수 세기 쿼리 실행, 결과 저장
		rset.next();												// 결과 가져옴
		int allRec = rset.getInt(1);								// 필드(첫번째) 가져옴 = 총 레코드 개수
		int pageRec = 30;											// 페이지당 레코드 개수
		int page = allRec / pageRec;								// 페이지 수
		if(allRec % pageRec != 0) page++;
		
		// 날짜 출력 객체 -> 생성, 인스턴스화
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("출력일자 : YYYY.MM.dd HH:MM:ss");
		
		//// 한 페이지 출력 //////////////////////////////////////////////////////////////////////////////////////
		for(int i = 1; i <= page; i++) {
			System.out.printf("                 성적집계표\n");
			System.out.printf("PAGE : %d          %s\n", i, sdf.format(cal.getTime()));
			System.out.printf("=================================================\n");
			System.out.printf("번호  이름     국어   영어   수학   총점     평균\n");
			System.out.printf("=================================================\n");
			
			
			// 레코드 30개 가져오기
			query = "select "				// 레코드 30개씩 가져오기 쿼리 저장
					+ "studentid, "			// 번호
					+ "name, "				// 이름
					+ "kor, "				// 국어
					+ "eng, "				// 영어
					+ "mat, "				// 수학
					+ "kor + eng + mat, "	// 총점
					+ "(kor + eng + mat)/3"	// 평균
					+ " from score_k08 group by studentid order by studentid  limit " + (i-1)*30 + "," + 30 ;
			rset = stmt.executeQuery(query);// 레코드 30개 가져오기 쿼리 실행, 결과 저장
			
			//// 한 레코드 출력////////////////////////////////////////////////////
			for(int j = 1; j <= 30; j++) {
				// 레코드 한개 가져오기
				rset.next();	
				// 레코드 한개 출력
				System.out.printf("%03d %-6s%7d%7d%7d%7d%9.0f\n", 
						rset.getInt(1), 
						rset.getString(2), 
						rset.getInt(3), 
						rset.getInt(4), 
						rset.getInt(5), 
						rset.getInt(6),
						rset.getDouble(7)
						);
				if(rset.getInt(1) == 1000) break;
			}
			///////////////////////////////////////////////////////////////////////
			
			//// 한 페이지 통계 출력////////////////////////////////////////////////
			// 한 페이지 합계, 평균 가져오기 -> 쿼리 실행, 레코드 저장, 레코드 가져오기, 레코드 출력
			String query2 = "select "
					+ "sum(kor), sum(eng), sum(mat), sum(kor+ eng + mat), sum((kor + eng + mat) / 3), "
					+ "avg(kor), avg(eng), avg(mat), avg(kor + eng + mat), avg((kor + eng + mat) / 3)"
					+ " from (" + query + ") As subquery;";
			rset = stmt.executeQuery(query2);
			rset.next();
			
			System.out.printf("=================================================\n");
			System.out.printf("현재페이지\n");
			System.out.printf("합계        %7d%7d%7d%7d%9.0f\n", rset.getInt(1), rset.getInt(2), rset.getInt(3), rset.getInt(4), rset.getDouble(5));
			System.out.printf("평균        %7.0f%7.0f%7.0f%7.0f%9.0f\n", rset.getDouble(6), rset.getDouble(7), rset.getDouble(8), rset.getDouble(9), rset.getDouble(10));

			// 누적 페이지 통계 출력/////////////////////////////////////////////////
			// 누적 페이지 합계, 평균 가져오기 -> 쿼리 실행, 레코드 저장, 레코드 가져오기, 레코드 출력
			String query3 = "select "
					+ "sum(kor), sum(eng), sum(mat), sum(kor+ eng + mat), sum((kor + eng + mat) / 3), "
					+ "avg(kor), avg(eng), avg(mat), avg(kor + eng + mat), avg((kor + eng + mat) / 3)"
					+ " from score_k08 where studentid <= " + (i * 30) ;
			rset = stmt.executeQuery(query3);
			rset.next();
			
			System.out.printf("=================================================\n");
			System.out.printf("누적페이지\n");
			System.out.printf("합계        %7d%7d%7d%7d%9.0f\n", rset.getInt(1), rset.getInt(2), rset.getInt(3), rset.getInt(4), rset.getDouble(5));
			System.out.printf("평균        %7.0f%7.0f%7.0f%7.0f%9.0f\n", rset.getDouble(6), rset.getDouble(7), rset.getDouble(8), rset.getDouble(9), rset.getDouble(10));
			System.out.println();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////			
		
		// db 닫기
		rset.close();
		stmt.close();
		conn.close();
	}
}
