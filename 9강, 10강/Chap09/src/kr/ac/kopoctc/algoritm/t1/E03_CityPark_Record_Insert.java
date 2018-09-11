//날짜 : 5월 30일 
//저자 : 송태양
//제목 : 1. Basic Training (1) - 전국도시공원표준데이터
package kr.ac.kopoctc.algoritm.t1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E03_CityPark_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// 와이파이 파일 저장, 파일 읽기, 레코드 저장 객체, 인스턴스, 변수 생성.
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\전국도시공원표준데이터.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String oneRec;
		
		/////// 필드명 레코드 쪼개기///////////////
		if((oneRec = br.readLine()) == null) {
			System.out.printf("빈 파일입니다.\n");
			return;
		}
		String[] field_name = oneRec.split("\t");
		
		//////// 나머지 레코드 쪼개기 & mysql 데이터베이스에 넣기////////////////
		int lineCnt = 2;
		while( (oneRec = br.readLine()) != null ) {
			String[] field = oneRec.split("\t");
			
			// 필드값 정제
			if (field[13].equals("")) { field[13] = "1900-01-01"; }
			if (field[7].equals("")) { field[7] = "0"; }
			field[7] = field[7].replaceAll("\"", "").replaceAll("'", "").replaceAll(",", "");
						
			// 쿼리문 저장 변수
			String queryTxt;
			
			// 쿼리문으로 레코드를 입력
			queryTxt = String.format("insert into citypark_k08("	// 레코드 입력 쿼리문
					+ "manage_num 		,"	// 관리번호				// 필드명 입력
					+ "park_name 		,"	// 공원명
					+ "park_flag		,"	// 공원구분
					+ "address_road		,"	// 소재지도로명주소
					+ "address_land		,"	// 소재지지번주소
					+ "latitude			,"	// 위도
					+ "longitude		,"	// 경도
					+ "park_area		,"	// 공원면적
					+ "park_facility_1	,"	// 공원보유시설 
					+ "park_facility_2	,"	// 공원보유시설
					+ "park_facility_3	,"	// 공원보유시설
					+ "park_facility_4	,"	// 공원보유시설
					+ "park_facility_5	,"	// 공원보유시설
					+ "date				,"	// 지정고시일
					+ "manage_agency	,"	// 관리기관명
					+ "phone_num		,"	// 전화번호
					+ "write_date		"	// 데이터기준일자
					+ ") values ("
					+ "'%s', '%s', '%s', '%s', '%s',"				// 필드값 입력
					+ "'%s', '%s', '%s', '%s', '%s',"
					+ "'%s', '%s', '%s', '%s', '%s',"
					+ "'%s', '%s'"
					+ ");",
					field[0], field[1], field[2], field[3], field[4],
					field[5], field[6], field[7], field[8], field[9],
					field[10], field[11], field[12], field[13], field[14],
					field[15], field[16]
					);
			
			// 쿼리문 전달(실행)			
			stmt.execute(queryTxt);
			System.out.printf("%d번째 항목 Insert OK [%s]\n", lineCnt, queryTxt);
			
			lineCnt++;
		}
		//////////////////////////////////////////////////////////////////////////
		
		// 파일, mysql 닫기
		br.close();
		stmt.close();
		conn.close();
	}
}
