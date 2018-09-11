//날짜 : 5월 29일 
//저자 : 송태양
//제목 : 8. FreeWifi 레코드 입력
package kr.ac.kopoctc.algoritm.achap9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E08_FreeWifi_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// 와이파이 파일 저장, 파일 읽기, 레코드 저장 객체, 인스턴스, 변수 생성.
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\전국무료와이파이표준데이터2.txt");
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
			
			// 쿼리문 저장 변수
			String queryTxt;
			// 쿼리문으로 레코드를 입력
			queryTxt = String.format("insert into freewifi_k08("
//					+ "id MEDIUMINT NOT NULL AUTO_INCREMENT," // 인덱스 만들기
					+ "inst_place,"	// 설치장소명
					+ "inst_place_detail,"	// 설치장소상세 
					+ "inst_city,"	// 설치시도명
					+ "inst_country,"	// 설치시군구명
					+ "inst_place_flag,"	// 설치시설구분
					+ "service_provider,"	// 서비스제공사명
					+ "wifi_ssid,"	// 와이파이SSID
					+ "inst_date,"	// 설치년월 -> 정제할 것
					+ "place_addr_road,"	// 소재지도로명주소 
					+ "place_addr_land,"	// 소재지지번주소
					+ "manage_office,"	// 관리기관명
					+ "manage_office_phone,"	// 관리기관전화번호
					+ "latitude,"	// 위도
					+ "longitude,"	// 경도
					+ "write_date)"	// 데이터기준일자
					+ "values ("
					+ "'%s', '%s', '%s', '%s', '%s'"
					+ ", '%s', '%s', '%s', '%s', '%s'"
					+ ", '%s', '%s', '%s', '%s', '%s');",
					field[0], field[1], field[2], field[3], field[4],
					field[5], field[6], field[7], field[8], field[9],
					field[10], field[11], field[12], field[13], field[14]);
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
