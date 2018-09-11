//날짜 : 5월 29일 
//저자 : 송태양
//제목 : 1. JDBC 기본 프로그램
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E01_ResultSet {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		///////////기본 세트/////////////
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$"); 
		// mysql의 ip주소와 데이터베이스명, 계정, 비밀번호를 입력하여 mysql과 java(프로그램)를 연결.
		
		Statement stmt = conn.createStatement();
		// mysql에 java의 String 쿼리를 전달해주는 stmt 객체를 생성.
	
//		ResultSet rset = stmt.executeQuery("show databases;");
//		ResultSet rset = stmt.executeQuery("show tables;");
		ResultSet rset = stmt.executeQuery("select * from tablek08");
		// 데이터 저장 객체(ResultSet rset)에 쿼리를 실행한 결과 데이터(stmt.executeQuery("쿼리문")를 저장함.
		
		while(rset.next()) {						// rset.next() : 레코드를 순서대로 가져옴.
			System.out.println(rset.getString(1));	// rset.getString(1) : 레코드의 해당 번호의 필드값을 가져옴.
		}
		
		rset.close();	// 역순으로 닫아준다.
		stmt.close();	
		conn.close();
		////////////////////////////////
	}
}
