//날짜 : 5월 31일 
//저자 : 송태양
//제목 : 3.  Training - 일자별주가데이터 레코드 읽기
package kr.ac.kopoctc.algoritm.t3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E04_Stock_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db 접속 객체, 쿼리 저장 변수, 쿼리 실행 객체, 결과 저장 객체 -> 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08?rewriteBatchedStatements=true", "root", "1");
		String query;
		Statement stmt = conn.createStatement();
		ResultSet rset;	
		
		// 쿼리 저장, 쿼리 실행, 결과 저장
//		query = String.format("select * from stock_k08 where shrn_iscd = \"A005930\";");	// 삼성전자 레코드 출력 쿼리
		query = String.format("select * from stock_k08 where bsop_date = \"20150112\";");	// 20150112 레코드 출력 쿼리
		rset = stmt.executeQuery(query);
		
		// 출력
		// 레코드 한 줄 불러오기
		while(rset.next()) {												
			// 레코드 한 줄 필드 불러오기
			System.out.printf("*******************************\n");		
			System.out.printf("     ID      : %s\n", rset.getString(1));	
			System.out.printf("일        자 : %s\n", rset.getString(2));
			System.out.printf("단 축  코 드 : %s\n", rset.getString(3));
			System.out.printf("종        가 : %s\n", rset.getString(4));
			System.out.printf("시        가 : %s\n", rset.getString(5));
			System.out.printf("고        가 : %s\n", rset.getString(6));
			System.out.printf("저        가 : %s\n", rset.getString(7));
			System.out.printf("거   래   량 : %s\n", rset.getString(8));
			System.out.printf("거 래  대 금 : %s\n", rset.getString(9));
			System.out.printf("*******************************\n");
		}
		
		// db 닫기
		rset.close();
		stmt.close();
		conn.close();
	}
}
