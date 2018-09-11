//날짜 : 5월 29일 
//저자 : 송태양
//제목 : 5. 레코드 읽기
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E05_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// class를 못찾을 때 exception 처리, 
		Class.forName("com.mysql.jdbc.Driver"); // 라이브러리를 임포트 하면 알아서 로드 됨.(있어도 되고 업어도 됨)
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// mysql 쿼리문 실행 결과를 객체에 저장.
		ResultSet rset = stmt.executeQuery("select * from tablek08;");	// 모든 레코드 읽는 쿼리
		System.out.printf("  이름   학번  국어  영어  수학\n");			
		while(rset.next()) {											// 레코드를 순서대로 호출
			System.out.printf(	"%4s %6d   %3d   %3d   %3d \n", 		// 레코드의 필드값을 출력
								rset.getString(1), rset.getInt(2), rset.getInt(3), rset.getInt(4), rset.getInt(5));
		}
		
		// mysql 닫기
		rset.close();
		stmt.close();
		conn.close();
	}
}
