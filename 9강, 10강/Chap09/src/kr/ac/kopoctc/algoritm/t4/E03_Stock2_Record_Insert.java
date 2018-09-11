//날짜 : 5월 31일 
//저자 : 송태양
//제목 : 3.  Training - 일자별주가데이터(모든 필드) 레코드 쓰기
package kr.ac.kopoctc.algoritm.t4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class E03_Stock2_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db 접속 객체, 쿼리 입력 변수, 쿼리 실행 객체 -> 생성, 인스턴스화
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08?rewriteBatchedStatements=true", "root", "1");
		String query = "insert IGNORE into stock2_k08 (" 
						+	"	stnd_iscd	,"
						+	"	bsop_date	,"
						+	"	shrn_iscd	,"
						+	"	stck_prpr	,"
						+	"	stck_oprc	,"
						+	"	stck_hgpr	,"
						+	"	stck_lwpr	,"
						+	"	prdy_vrss_sign	,"
						+	"	prdy_vrss	,"
						+	"	prdy_ctrt	,"
						+	"	prdy_vol	,"
						+	"	acml_vol	,"
						+	"	acml_tr_pbmn	,"
						+	"	askp1	,"
						+	"	bidp1	,"
						+	"	total_askp_rsqn	,"
						+	"	total_bidp_rsqn	,"
						+	"	seln_cntg_smtn	,"
						+	"	shnu_cntg_smtn	,"
						+	"	seln_tr_pbmn	,"
						+	"	shnu_tr_pbmn	,"
						+	"	seln_cntg_csnu	,"
						+	"	shnu_cntg_csnu	,"
						+	"	w52_hgpr	,"
						+	"	w52_lwpr	,"
						+	"	w52_hgpr_date	,"
						+	"	w52_lwpr_date	,"
						+	"	ovtm_untp_bsop_hour	,"
						+	"	ovtm_untp_prpr	,"
						+	"	ovtm_untp_prdy_vrss	,"
						+	"	ovtm_untp_prdy_vrss_sign	,"
						+	"	ovtm_untp_askp1	,"
						+	"	ovtm_untp_bidp1	,"
						+	"	ovtm_untp_vol	,"
						+	"	ovtm_untp_tr_pbmn	,"
						+	"	ovtm_untp_oprc	,"
						+	"	ovtm_untp_hgpr	,"
						+	"	ovtm_untp_lwpr	,"
						+	"	mkob_otcp_vol	,"
						+	"	mkob_otcp_tr_pbmn	,"
						+	"	mkfa_otcp_vol	,"
						+	"	mkfa_otcp_tr_pbmn	,"
						+	"	mrkt_div_cls_code	,"
						+	"	pstc_dvdn_amt	,"
						+	"	lstn_stcn	,"
						+	"	stck_sdpr	,"
						+	"	stck_fcam	,"
						+	"	wghn_avrg_stck_prc	,"
						+	"	issu_limt_rate	,"
						+	"	frgn_limt_qty	,"
						+	"	oder_able_qty	,"
						+	"	frgn_limt_exhs_cls_code	,"
						+	"	frgn_hldn_qty	,"
						+	"	frgn_hldn_rate	,"
						+	"	hts_frgn_ehrt	,"
						+	"	itmt_last_nav	,"
						+	"	prdy_last_nav	,"
						+	"	trc_errt	,"
						+	"	dprt	,"
						+	"	ssts_cntg_qty	,"
						+	"	ssts_tr_pbmn	,"
						+	"	frgn_ntby_qty	,"
						+	"	flng_cls_code	,"
						+	"	prtt_rate	,"
						+	"	acml_prtt_rate	,"
						+	"	stdv	,"
						+	"	beta_cfcn	,"
						+	"	crlt_cfcn	,"
						+	"	bull_beta	,"
						+	"	bear_beta	,"
						+	"	bull_dvtn	,"
						+	"	bear_dvtn	,"
						+	"	bull_crlt	,"
						+	"	bear_crlt	,"
						+	"	stck_mxpr	,"
						+	"	stck_llam	,"
						+	"	icic_cls_code	,"
						+	"	itmt_vol	,"
						+	"	itmt_tr_pbmn	,"
						+	"	fcam_mod_cls_code	,"
						+	"	revl_issu_reas_code	,"
						+	"	orgn_ntby_qty	,"
						+	"	adj_prpr	,"
						+	"	fn_oprc	,"
						+	"	fn_hgpr	,"
						+	"	fn_lwpr	,"
						+	"	fn_prpr	,"
						+	"	fn_acml_vol	,"
						+	"	fn_acml_tr_pbmn	,"
						+	"	fn_prtt_rate	,"
						+	"	fn_flng_cls_code	,"
						+	"	buyin_nor_prpr	,"
						+	"	buyin_nor_prdy_vrss	,"
						+	"	buyin_nor_vol	,"
						+	"	buyin_nor_tr_pbmn	,"
						+	"	buyin_tod_prpr	,"
						+	"	buyin_tod_prdy_vrss	,"
						+	"	buyin_tod_vol	,"
						+	"	buyin_tod_tr_pbmn"
						+ ") values ("
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?"
						+ ")";
		PreparedStatement ps = conn.prepareStatement(query);
		
		// 파일 저장 객체, 파일 읽기 객체, 레코드 저장 변수 -> 생성, 인스턴스화.
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String oneRec;
		
		//////// 파일 레코드 읽고 db에 레코드 쓰기 ////////////////
		int lineCnt = 0;	// 총 레코드 수
		int insertCnt = 0;	// 쓴 레코드 수
		while( (oneRec = br.readLine()) != null ) {// 레코드 읽고 저장
			lineCnt++;
			String[] field = oneRec.split(",");		// 레코드 쪼개기
			for(int i = 1; i <= 99; i++) {			// 쿼리 완성시키기
													
				if(field.length < i) {				// 조건 1 : 필드가 부족할 경우 null을 채워 넣음		
					ps.setString(i, null);			
					continue;
				}
				if(field[i-1].equals("")) {			// 조건 2 : 필드가 비었을 경우 null을 채워 넣음
					ps.setString(i, null);
				} 
				else {
					ps.setString(i, field[i-1]);	// 아무것도 아니면 필드값을 넣음.
				}
			}
			ps.addBatch();							// Batch에 쿼리를 저장
			if (++insertCnt % 10000 == 0) {			// Batch에 쿼리가 10000개가 저장되면
				ps.executeBatch(); 					// Batch의 쿼리를 실행
				ps.clearParameters();				// Parameter 초기화
				ps.clearBatch();					// Batch 초기화
				System.out.printf("%d개 항목 중 %d개 항목 Insert OK\n", lineCnt, insertCnt);
			}
		}
		ps.executeBatch();							// Batch의 남은 쿼리를 실행
		System.out.printf("%d개 항목 중 %d개 항목 Insert OK\n", lineCnt, insertCnt);
		////////////////////////////////////////////////////////
		
		// 파일, db 닫기
		br.close();
		ps.close();
		conn.close();
		
	}
}
