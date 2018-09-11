//날짜 : 5월 31일 
//저자 : 송태양
//제목 : 3.  Training - 일자별주가데이터 레코드 읽기
package kr.ac.kopoctc.algoritm.t4;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E04_Stock2_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db 접속 객체, 쿼리 입력 변수, 쿼리 실행 객체, 결과 저장 객체 -> 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08?rewriteBatchedStatements=true", "root", "1");
		String query;
		Statement stmt = conn.createStatement();
		ResultSet rset;	
		
		// 필드명 배열
		String[] field_name = {
				"ID",
				"표준 종목코드",
				"주식 영업 일자",
				"유가증권 단축 종목코드",
				"주식 종가",
				"주식 시가",
				"주식 최고가",
				"주식 최저가",
				"전일 대비 부호",
				"전일 대비",
				"전일 대비율",
				"전일 거래량",
				"누적 거래량",
				"누적 거래 대금",
				"매도호가1",
				"매수호가1",
				"총 매도호가 잔량",
				"총 매수호가 잔량",
				"매도 체결 합계",
				"매수 체결 합계",
				"매도 거래 대금(누적)",
				"매수 거래 대금(누적)",
				"매도 체결 건수",
				"매수 체결 건수",
				"52주일 최고가",
				"52주일 최저가",
				"52주일 최고가 일자",
				"52주일 최저가 일자",
				"시간외 단일가 최종 시간",
				"시간외 단일가 현재가",
				"시간외 단일가 전일 대비",
				"시간외 단일가 전일 대비 부호",
				"시간외 단일가 매도호가1",
				"시간외 단일가 매수호가1",
				"시간외 단일가 거래량",
				"시간외 단일가 거래 대금",
				"시간외 단일가 시가",
				"시간외 단일가 최고가",
				"시간외 단일가 최저가",
				"장개시전 시간외종가 거래량",
				"장개시전 시간외종가 거래 대금",
				"장종료후 시간외종가 거래량",
				"장종료후 시간외종가 거래 대금",
				"시장 분류 구분 코드",
				"주당 배당 금액",
				"상장 주수",
				"주식 기준가",
				"주식 액면가",
				"가중 평균 주식 가격",
				"종목 한도 비율",
				"외국인 한도 수량",
				"주문 가능 수량",
				"외국인 한도 소진 구분 코드",
				"외국인 보유 수량",
				"외국인 보유 비율",
				"HTS 외국인 소진율",
				"장중 최종 NAV",
				"전일 최종 NAV",
				"추적 오차율",
				"괴리율",
				"공매도차입증권매도체결수량",
				"공매도차입증권매도거래대금",
				"외국인 순매수",
				"락구분 코드",
				"분할 비율",
				"누적 분할 비율",
				"전체융자잔고비율",
				"베타 계수(90일)",
				"DEL 상관 계수",
				"DEL 강세 계수",
				"DEL 약세 계수",
				"DEL 강세 편차",
				"DEL 약세 편차",
				"DEL 강세 상관계수",
				"DEL 약세 상관계수",
				"주식 상한가",
				"주식 하한가",
				"증자 구분 코드",
				"장중 거래량",
				"장중 거래대금",
				"액면가 변경 구분 코드",
				"재평가 종목 사유 코드",
				"기관계 순매수",
				"수정주가 (교보:fnguide때문에 추가)",
				"주식 시가",
				"주식 최고가",
				"주식 최저가",
				"주식 종가",
				"누적 거래량",
				"누적 거래 대금",
				"분할 비율",
				"락구분 코드",
				"Buy-in 일반 체결가",
				"Buy-in 일반 종가 대비",
				"Buy-in 일반 체결량",
				"Buy-in 일반 체결 대금",
				"Buy-in 당일 체결가",
				"Buy-in 당일 종가 대비",
				"Buy-in 당일 체결량",
				"Buy-in 당일 체결 대금"
		};
		
		// 쿼리 입력, 쿼리 실행, 결과 저장
		query = String.format("select * from stock2_k08 where shrn_iscd = \"A005930\";");	// 삼성전자 레코드 출력 쿼리
//		query = String.format("select * from stock2_k08 where bsop_date = \"20150112\";");	// 20150112 레코드 출력 쿼리
		rset = stmt.executeQuery(query);
		
		// 레코드 읽어 출력하기
		while(rset.next()) {	// 레코드 한 줄 읽기									
			System.out.printf("************************************************\n");	
			for(int i = 1; i<= 100; i++) {	// 필드명, 필드 출력하기 
				System.out.printf("%s : %s\n", InsertBlank.BlankBackword(field_name[i-1], 35), rset.getString(i));
			}
			System.out.printf("************************************************\n");
		}
		
		// db 닫기
		rset.close();
		stmt.close();
		conn.close();
	}
}
