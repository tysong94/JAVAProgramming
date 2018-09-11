//날짜 : 5월 30일 
//저자 : 송태양
//제목 : 1. Basic Training (1) - 전국도시공원표준데이터
package kr.ac.kopoctc.algoritm.t1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E02_CityPark_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql 쿼리문 실행
		// 테이블 지우기 쿼리문
		stmt.execute("drop table citypark_k08;");
		
		// mysql 닫기
		stmt.close();
		conn.close();
	}
}
