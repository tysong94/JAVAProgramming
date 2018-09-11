//날짜 : 5월 29일 
//저자 : 송태양
//제목 : 3. 테이블 지우기
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E03_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); // 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql에 쿼리문 실행
		// stmt.execute : stmt.executeQuery와 달리 쿼리문 실행 결과를 따로 저장하지 않고 실행만 한다.
		stmt.execute("drop table table2k08"); // 테이블 지우는 쿼리문
		
		// mysql 닫기
		stmt.close();
		conn.close();
	}
}
