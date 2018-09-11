//날짜 : 5월 31일 
//저자 : 송태양
//제목 : 3.  Training - 일자별주가데이터 테이블 지우기
package kr.ac.kopoctc.algoritm.t3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E02_Stock_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db 접속 객체, 쿼리 실행 객체 -> 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		Statement stmt = conn.createStatement();
	
		// 쿼리 실행
		stmt.execute("drop table stock_k08;"); // 테이블 지우기 쿼리문
		
		// db 닫기
		stmt.close();
		conn.close();
	}
}
