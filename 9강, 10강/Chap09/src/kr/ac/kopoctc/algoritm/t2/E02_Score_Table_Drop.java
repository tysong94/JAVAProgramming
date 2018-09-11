//날짜 : 5월 30일 
//저자 : 송태양
//제목 : 2.  Basic Training (2) - 성적 테이블 지우기
package kr.ac.kopoctc.algoritm.t2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E02_Score_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		Statement stmt = conn.createStatement();
	
		// mysql 쿼리문 실행
		// 테이블 지우기 쿼리문
		stmt.execute("drop table score_k08;");
		
		// mysql 닫기
		stmt.close();
		conn.close();
	}
}
