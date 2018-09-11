//날짜 : 5월 29일 
//저자 : 송태양
//제목 : 9. FreeWifi 레코드 읽기
package kr.ac.kopoctc.algoritm.achap9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E09_FreeWifi_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// 위도, 경도 값
		double lat = 37.3860521, lng = 127.1214038;
		
		// mysql 쿼리문 저장 변수 생성, 쿼리문 입력
		String queryTxt;
//		queryTxt = "select * from freewifi_k08";	
//		queryTxt = String.format("select * from freewifi_k08 where "
//				+ "SQRT( POWER(latitude - %f, 2) + POWER(longitude - %f, 2) ) = "
//				+ "(select MIN( SQRT( POWER(latitude - %f, 2) + POWER(longitude - %f, 2) ) ) from freewifi_k08);",
//				lat, lng, lat, lng);
//		queryTxt = "select * from freewifi_k08 where service_provider = 'SKT'";
		queryTxt = "select * from freewifi_k08 where inst_country = '수원시'";
		
		// mysql 쿼리문 전달 실행 및 결과 출력
		ResultSet rset = stmt.executeQuery(queryTxt);
		while(rset.next()) {
			System.out.printf("*(%d)****************************************\n", rset.getInt(1));
			System.out.printf("설치장소명 		: %s\n", rset.getString(2));
			System.out.printf("설치장소상세 	: %s\n", rset.getString(3));
			System.out.printf("설치시도명		: %s\n", rset.getString(4));
			System.out.printf("설치시군구명 	: %s\n", rset.getString(5));
			System.out.printf("설치시설구분		: %s\n", rset.getString(6));
			System.out.printf("서비스제공사명 	: %s\n", rset.getString(7));
			System.out.printf("와이파이SSID 	: %s\n", rset.getString(8));
			System.out.printf("설치년월 		: %s\n", rset.getString(9));
			System.out.printf("소재지도로명주소	: %s\n", rset.getString(10));
			System.out.printf("소재지지번주소 	: %s\n", rset.getString(11));
			System.out.printf("관리기관명 		: %s\n", rset.getString(12));
			System.out.printf("관리기관전화번호	: %s\n", rset.getString(13));
			System.out.printf("위도 			: %s\n", rset.getString(14));
			System.out.printf("경도 			: %s\n", rset.getString(15));
			System.out.printf("데이터기준일자 	: %s\n", rset.getString(16));
			System.out.printf("*********************************************");
		}
		
		rset.close();
		stmt.close();
		conn.close();
	}
}
