//날짜 : 5월 30일 
//저자 : 송태양
//제목 : 1.  Basic Training (1) - 전국도시공원표준데이터
package kr.ac.kopoctc.algoritm.t1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E01_CityPark_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql 쿼리문 실행
		stmt.execute( 
					"create table citypark_k08("				// citypark 테이블 생성
					+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"	// 인덱스 만들기
					+ "manage_num 		varchar(50),"	// 관리번호
					+ "park_name 		varchar(50),"	// 공원명
					+ "park_flag		varchar(50),"	// 공원구분
					+ "address_road		varchar(200),"	// 소재지도로명주소
					+ "address_land		varchar(200),"	// 소재지지번주소
					+ "latitude			double,"		// 위도
					+ "longitude		double,"		// 경도
					+ "park_area		double,"		// 공원면적
					+ "park_facility_1	varchar(500),"	// 공원보유시설 
					+ "park_facility_2	varchar(500),"	// 공원보유시설
					+ "park_facility_3	varchar(500),"	// 공원보유시설
					+ "park_facility_4	varchar(500),"	// 공원보유시설
					+ "park_facility_5	varchar(500),"	// 공원보유시설
					+ "date				date," 			// 지정고시일
					+ "manage_agency	varchar(50),"	// 관리기관명
					+ "phone_num		varchar(50),"	// 전화번호
					+ "write_date		date,"			// 데이터기준일자
					+ "PRIMARY KEY(id)"					// 키 지정
					+ ") DEFAULT CHARSET = utf8;"	
					);
		
		// mysql 닫기
		stmt.close();
		conn.close();
	}
}

