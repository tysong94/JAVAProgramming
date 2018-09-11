//날짜 : 5월 30일 
//저자 : 송태양
//제목 : 1. Basic Training (1) - 레코드 읽기
package kr.ac.kopoctc.algoritm.t1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E04_CityPark_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// 융기원 위도, 경도 값
		double lat = 37.3860521, lng = 127.1214038;
		
		// mysql 쿼리문 저장 변수 생성, 쿼리문 입력
		String queryTxt;
//		queryTxt = "select * from citypark_k08";	
		queryTxt = String.format("select * from citypark_k08 where "
				+ "SQRT( POWER(latitude - %f, 2) + POWER(longitude - %f, 2) ) = "
				+ "(select MIN( SQRT( POWER(latitude - %f, 2) + POWER(longitude - %f, 2) ) ) from citypark_k08);",
				lat, lng, lat, lng);

		// mysql 쿼리문 전달 실행 및 결과 출력
		ResultSet rset = stmt.executeQuery(queryTxt);
		while(rset.next()) {
			System.out.printf("*(인덱스%d)****************************************\n", rset.getInt(1));
			System.out.printf("관리번호 		: %s\n", rset.getString(2));
			System.out.printf("공원명			: %s\n", rset.getString(3));
			System.out.printf("공원구분			: %s\n", rset.getString(4));
			System.out.printf("소재지도로명주소	: %s\n", rset.getString(5));
			System.out.printf("소재지지번주소	: %s\n", rset.getString(6));
			System.out.printf("위도 			: %s\n", rset.getDouble(7));
			System.out.printf("경도 			: %s\n", rset.getDouble(8));
			System.out.printf("공원면적			: %s\n", rset.getDouble(9));
			System.out.printf("공원보유시설1	: %s\n", rset.getString(10));
			System.out.printf("공원보유시설2 	: %s\n", rset.getString(11));
			System.out.printf("공원보유시설3 	: %s\n", rset.getString(12));
			System.out.printf("공원보유시설4	: %s\n", rset.getString(13));
			System.out.printf("공원보유시설5	: %s\n", rset.getString(14));
			System.out.printf("지정고시일 		: %s\n", rset.getDate(15));
			System.out.printf("관리기관명 		: %s\n", rset.getString(16));
			System.out.printf("전화번호 		: %s\n", rset.getString(17));
			System.out.printf("데이터기준일자 	: %s\n", rset.getDate(18));
			System.out.printf("***************************************************");
		}
		
		// mysql 닫기
		rset.close();
		stmt.close();
		conn.close();
	}
}
