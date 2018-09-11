//날짜 : 5월 29일 
//저자 : 송태양
//제목 : 4. 레코드 쓰기
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E04_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql에 쿼리문 실행
		// stmt.execute : stmt.executeQuery와 달리 쿼리문 실행 결과를 따로 저장하지 않고 실행만 한다.
		// 레코드를 입력하는 쿼리문 전달
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('효민', 209901, 95, 100, 95);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('보람', 209902, 95, 95, 95);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('은정', 209903, 100, 100, 100);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('지연', 209904, 100, 95, 90);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('소연', 209905, 80, 100, 70);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('큐리', 209906, 100, 100, 70);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('화영', 209907, 70, 70, 70);");
		
		// mysql 닫기
		stmt.close();
		conn.close();
	}
}
