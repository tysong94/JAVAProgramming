//날짜 : 5월 30일 
//저자 : 송태양
//제목 : 2. Basic Training (2) - 성적 레코드 쓰기
package kr.ac.kopoctc.algoritm.t2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class E03_Score_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, 쿼리문 저장 변수, 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08?rewriteBatchedStatements=true", "root", "1");
		String sql = "insert into score_k08 (studentid, name, kor, eng, mat) values (?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		// 데이터 생성 & mysql에 쿼리문 전달, 실행
		Student student;
		int count = 0;
		for(int i = 1; i <= 1000; i++) {
			student = new Student(i);
			
			// 기존 저장된 쿼리문에 필드값을 넣고 수행
			preparedStatement.setInt(1, student.studentid);	
			preparedStatement.setString(2, student.name);	
			preparedStatement.setInt(3, student.kor);
			preparedStatement.setInt(4, student.eng);
			preparedStatement.setInt(5, student.mat);
		
			preparedStatement.addBatch();				// sql문을 저장해놓음
			if(++count % 1000 == 0) {					// 1000개가 될 때
				preparedStatement.executeBatch();		// sql문을 수행.
				System.out.println("batch : " + count);	// 각 배치의 개수 출력
			}
		}
		
		// mysql 닫기
		preparedStatement.executeBatch();	// batch에 남은 쿼리문 수행
		preparedStatement.close();			
		conn.close();		
	}
}
