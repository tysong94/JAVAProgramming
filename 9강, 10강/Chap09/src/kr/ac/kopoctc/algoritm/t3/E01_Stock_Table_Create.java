//날짜 : 5월 31일 
//저자 : 송태양
//제목 : 3.  Training - 일자별주가데이터 테이블 만들기
package kr.ac.kopoctc.algoritm.t3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E01_Stock_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql 접속, mysql 쿼리문 전달 객체 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		Statement stmt = conn.createStatement();
	
		// mysql 쿼리문 실행
		stmt.execute( 
					"create table stock_k08("			// stock 테이블 생성
					+ "id INT NOT NULL AUTO_INCREMENT,"	/*  인덱스 					                    */
					+ "bsop_date		varchar(50),"	/*  NOT_NULL 주식 영업 일자                     */
					+ "shrn_iscd	 	varchar(50),"	/*  NOT_NULL 유가증권 단축 종목코드             */
					+ "stck_prpr		int,"			/*  주식 종가                                   */
				    + "stck_oprc 		int,"          	/*  주식 시가                                   */
				    + "stck_hgpr		int,"          	/*  주식 최고가                                 */
				    + "stck_lwpr		int,"          	/*  주식 최저가                                 */
					+ "itmt_vol 		long,"     		/*  장중 거래량                                 */
					+ "itmt_tr_pbmn 	long,"  		/*  장중 거래대금                               */
					+ "PRIMARY KEY(id, bsop_date, shrn_iscd)"	// PRIMARY KEY(복합)로 id, shrn_iscd, bsop_date 사용
					+  ") DEFAULT CHARSET=utf8;"				// 문자형을 utf8로 설정
					);				
		
		// mysql 닫기
		stmt.close();
		conn.close();
	}
}

