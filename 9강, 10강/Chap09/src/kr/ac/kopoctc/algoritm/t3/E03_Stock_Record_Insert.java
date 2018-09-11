//날짜 : 5월 31일 
//저자 : 송태양
//제목 : 3.  Training - 일자별주가데이터 레코드 쓰기
package kr.ac.kopoctc.algoritm.t3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class E03_Stock_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db 접속 객체, 쿼리 저장 변수, 쿼리 실행 객체 -> 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08?rewriteBatchedStatements=true", "root", "1");
		String query = "insert into stock_k08 ("	// 테이블에 레코드 넣기 쿼리 
						+ "bsop_date, "				// 필드 목록
						+ "shrn_iscd, "
						+ "stck_prpr, "
						+ "stck_oprc, "
						+ "stck_hgpr, "
						+ "stck_lwpr,"
						+ "itmt_vol, "
						+ "itmt_tr_pbmn" 
						+ ") values (?, ?, ?, ?, ?, ?, ?, ?)";// 값 목록
		PreparedStatement ps = conn.prepareStatement(query);
		
		// 파일 저장 객체, 파일 읽기 객체, 레코드 저장 변수 -> 생성, 인스턴스화.
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String oneRec;
		
		//////// 파일 레코드 쪼개기 & db 테이블에 넣기////////////////
		int lineCnt = 0;
		int insertCnt = 0;

		while( (oneRec = br.readLine()) != null ) {
			lineCnt++;
			// 레코드 쪼개기
			String[] field = oneRec.split(","); 
			
			// db테이블에 레코드 넣기 쿼리 실행
			if(field.length >= 79) {
				ps.setString(1, field[1]);	// 일자
				ps.setString(2, field[2]);	// 단축코드
				ps.setString(3, field[3]);	// 종가
				ps.setString(4, field[4]);	// 시가
				ps.setString(5, field[5]);	// 최고가
				ps.setString(6, field[6]);	// 최저가
				ps.setString(7, field[77]);	// 장중 거래량
				ps.setString(8, field[78]);	// 장중 거래대금
				
				ps.addBatch();				// Batch에 쿼리를 저장
				ps.clearParameters();		
				if (++insertCnt % 10000 == 0) {	// Batch의 쿼리가 10000개일 경우
					ps.executeBatch(); 			// Batch의 쿼리를 실행
					ps.clearBatch();			// Batch 초기화
					System.out.printf("%d개 항목 중 %d개 항목 Insert OK\n", lineCnt, insertCnt);
				}
			}
		}
		ps.executeBatch();	// batch의 남은 쿼리를 실행
		System.out.printf("%d개 항목 중 %d개 항목 Insert OK\n", lineCnt, insertCnt);
		////////////////////////////////////////////////////////
		
		// 파일, db 닫기
		br.close();
		ps.close();
		conn.close();
		
	}
}
