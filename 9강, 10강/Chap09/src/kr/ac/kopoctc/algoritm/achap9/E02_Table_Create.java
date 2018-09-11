//날짜 : 5월 29일 
//저자 : 송태양
//제목 : 2. 테이블 만들기
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E02_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql에 쿼리문 실행
		// stmt.execute : stmt.executeQuery와 달리 쿼리문 실행 결과를 따로 저장하지 않고 실행만 한다.
		stmt.execute(	"create table table2k08(" +				// 테이블 만들기, 테이블명 지정(
						"name varchar(20)," +					// 20글자 이내 문자형 name 필드
						"studentid int not null primary key," +	// int형 studentid 필드
						"kor int," +							// int형 kor 필드
						"eng int," +							// int형 eng 필드
						"mat int)" +							// int형 mat 필드)
						"DEFAULT CHARSET=utf8;");				// 기본 언어를 utf8로 지정.
		
		// mysql 닫아주기
		stmt.close();
		conn.close();
	}
}
