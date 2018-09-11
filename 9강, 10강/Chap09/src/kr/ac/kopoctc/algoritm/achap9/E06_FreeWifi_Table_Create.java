//날짜 : 5월 29일 
//저자 : 송태양
//제목 : 6. FreeWifi 테이블 만들기
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E06_FreeWifi_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql 쿼리문 실행
		stmt.execute( 
					"create table freewifi_k08("				// freewifi 테이블 생성
					+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"	// 인덱스 만들기
					+ "inst_place 			varchar(50),"	// 설치장소명
					+ "inst_place_detail 	varchar(500),"	// 설치장소상세 
					+ "inst_city			varchar(50),"	// 설치시도명
					+ "inst_country			varchar(50),"	// 설치시군구명
					+ "inst_place_flag		varchar(50),"	// 설치시설구분
					+ "service_provider		varchar(50),"	// 서비스제공사명
					+ "wifi_ssid			varchar(500),"	// 와이파이SSID
					+ "inst_date			varchar(50),"	// 설치년월 -> 정제할 것
					+ "place_addr_road		varchar(200),"	// 소재지도로명주소 
					+ "place_addr_land		varchar(200),"	// 소재지지번주소
					+ "manage_office		varchar(50),"	// 관리기관명
					+ "manage_office_phone	varchar(50),"	// 관리기관전화번호
					+ "latitude				double,"		// 위도
					+ "longitude			double,"		// 경도
					+ "write_date			date,"			// 데이터기준일자
					+ "PRIMARY KEY(id)"						// 키 지정
					+ ") DEFAULT CHARSET = utf8;"	
					);
		// mysql 닫기
		stmt.close();
		conn.close();
	}
}
