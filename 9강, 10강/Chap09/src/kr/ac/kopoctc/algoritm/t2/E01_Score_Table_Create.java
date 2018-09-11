//날짜 : 5월 30일 
//저자 : 송태양
//제목 : 2.  Basic Training (2) - 성적 테이블 만들기
package kr.ac.kopoctc.algoritm.t2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E01_Score_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		Statement stmt = conn.createStatement();
	
		// mysql 쿼리문 실행
		stmt.execute( 
					"create table score_k08("		// score 테이블 생성
					+ "studentid 	int,"			// 학번
					+ "name 		varchar(10),"	// 이름
					+ "kor			int,"			// 국어
					+ "eng			int,"			// 영어
					+ "mat			int,"			// 수학
					+ "PRIMARY KEY(studentid)"		// 키 지정
					+ ") DEFAULT CHARSET = utf8;"	
					);
		
		// mysql 닫기
		stmt.close();
		conn.close();
	}
}

