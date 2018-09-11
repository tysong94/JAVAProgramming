//날짜 : 5월 29일 
//저자 : 송태양
//제목 : 7. FreeWifi 테이블 지우기
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E07_FreeWifi_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql 쿼리문 실행
		// 테이블 지우기 쿼리문
		stmt.execute("drop table freewifi_k08;");
		
		// mysql 닫기
		stmt.close();
		conn.close();
	}
}
