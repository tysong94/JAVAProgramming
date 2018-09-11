//��¥ : 5�� 31�� 
//���� : ���¾�
//���� : 4. Advantage Training - ���ں��ְ������� ���̺� �����
package kr.ac.kopoctc.algoritm.t4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E01_Stock2_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db ���� ��ü, ���� ���� ��ü -> ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		Statement stmt = conn.createStatement();
	
		// db ���� ����
		stmt.execute( 
					"create table stock2_k08("			// stock ���̺� ����
				
//				+ 	"	id INT NOT NULL AUTO_INCREMENT,"/*  �ε��� 					                    */
				+	"	stnd_iscd	varchar(50)	,"		/*  NOT_NULL ǥ�� �����ڵ�                      */
				+	"	bsop_date	int	,"			/*  NOT_NULL �ֽ� ���� ����                     */
				+	"	shrn_iscd	varchar(50)	,"		/*  NOT_NULL �������� ���� �����ڵ�             */
				+	"	stck_prpr	int	,"			/*  �ֽ� ����                                   */
				+	"	stck_oprc	int	,"			/*  �ֽ� �ð�                                   */
				+	"	stck_hgpr	int	,"			/*  �ֽ� �ְ�                                 */
				+	"	stck_lwpr	int	,"			/*  �ֽ� ������                                 */
				+	"	prdy_vrss_sign	varchar(50),"		/*  ���� ��� ��ȣ                              */
				+	"	prdy_vrss	int	,"			/*  ���� ���                                   */
				+	"	prdy_ctrt	float	,"		/*  ���� �����                                 */
				+	"	prdy_vol	long	,"		/*  ���� �ŷ���                                 */
				+	"	acml_vol	long	,"		/*  ���� �ŷ���                                 */
				+	"	acml_tr_pbmn	long	,"	/*  ���� �ŷ� ���                              */
				+	"	askp1	int	,"				/*  �ŵ�ȣ��1                                   */
				+	"	bidp1	int	,"				/*  �ż�ȣ��1                                   */
				+	"	total_askp_rsqn	long	,"	/*  �� �ŵ�ȣ�� �ܷ�                            */
				+	"	total_bidp_rsqn	long	,"	/*  �� �ż�ȣ�� �ܷ�                            */
				+	"	seln_cntg_smtn	long	,"	/*  �ŵ� ü�� �հ�                              */
				+	"	shnu_cntg_smtn	long	,"	/*  �ż� ü�� �հ�                              */
				+	"	seln_tr_pbmn	long	,"	/*  �ŵ� �ŷ� ���(����)                        */
				+	"	shnu_tr_pbmn	long	,"	/*  �ż� �ŷ� ���(����)                        */
				+	"	seln_cntg_csnu	int	,"		/*  �ŵ� ü�� �Ǽ�                              */
				+	"	shnu_cntg_csnu	int	,"		/*  �ż� ü�� �Ǽ�                              */
				+	"	w52_hgpr	int	,"			/*  52���� �ְ�                               */
				+	"	w52_lwpr	int	,"			/*  52���� ������                               */
				+	"	w52_hgpr_date	int	,"		/*  52���� �ְ� ����                          */
				+	"	w52_lwpr_date	int	,"		/*  52���� ������ ����                          */
				+	"	ovtm_untp_bsop_hour	int	,"	/*  �ð��� ���ϰ� ���� �ð�                     */
				+	"	ovtm_untp_prpr	int	,"		/*  �ð��� ���ϰ� ���簡                        */
				+	"	ovtm_untp_prdy_vrss	int	,"	/*  �ð��� ���ϰ� ���� ���                     */
				+	"	ovtm_untp_prdy_vrss_sign varchar(50)	,"	/*  �ð��� ���ϰ� ���� ��� ��ȣ                */
				+	"	ovtm_untp_askp1	int	,"		/*  �ð��� ���ϰ� �ŵ�ȣ��1                     */
				+	"	ovtm_untp_bidp1	int	,"		/*  �ð��� ���ϰ� �ż�ȣ��1                     */
				+	"	ovtm_untp_vol	long	,"	/*  �ð��� ���ϰ� �ŷ���                        */
				+	"	ovtm_untp_tr_pbmn	long,"	/*  �ð��� ���ϰ� �ŷ� ���                     */
				+	"	ovtm_untp_oprc	int	,"		/*  �ð��� ���ϰ� �ð�                          */
				+	"	ovtm_untp_hgpr	int	,"		/*  �ð��� ���ϰ� �ְ�                        */
				+	"	ovtm_untp_lwpr	int	,"		/*  �ð��� ���ϰ� ������                        */
				+	"	mkob_otcp_vol	long	,"	/*  �尳���� �ð������� �ŷ���                  */
				+	"	mkob_otcp_tr_pbmn	long,"	/*  �尳���� �ð������� �ŷ� ���               */
				+	"	mkfa_otcp_vol	long	,"	/*  �������� �ð������� �ŷ���                  */
				+	"	mkfa_otcp_tr_pbmn	long,"	/*  �������� �ð������� �ŷ� ���               */
				+	"	mrkt_div_cls_code	varchar(50),"	/*  ���� �з� ���� �ڵ�                         */
				+	"	pstc_dvdn_amt	long	,"	/*  �ִ� ��� �ݾ�                              */
				+	"	lstn_stcn	long	,"		/*  ���� �ּ�                                   */
				+	"	stck_sdpr	int	,"			/*  �ֽ� ���ذ�                                 */
				+	"	stck_fcam	float	,"		/*  �ֽ� �׸鰡                                 */
				+	"	wghn_avrg_stck_prc	double,"	/*  ���� ��� �ֽ� ����                         */
				+	"	issu_limt_rate	float	,"	/*  ���� �ѵ� ����                              */
				+	"	frgn_limt_qty	long	,"	/*  �ܱ��� �ѵ� ����                            */
				+	"	oder_able_qty	long	,"	/*  �ֹ� ���� ����                              */
				+	"	frgn_limt_exhs_cls_code	varchar(50),"	/*  �ܱ��� �ѵ� ���� ���� �ڵ�                  */
				+	"	frgn_hldn_qty	long	,"	/*  �ܱ��� ���� ����                            */
				+	"	frgn_hldn_rate	float	,"	/*  �ܱ��� ���� ����                            */
				+	"	hts_frgn_ehrt	float	,"	/*  HTS �ܱ��� ������                           */
				+	"	itmt_last_nav	float	,"	/*  ���� ���� NAV                               */
				+	"	prdy_last_nav	float	,"	/*  ���� ���� NAV                               */
				+	"	trc_errt	float	,"		/*  ���� ������                                 */
				+	"	dprt	float	,"			/*  ������                                      */
				+	"	ssts_cntg_qty	long	,"	/*  ���ŵ��������Ǹŵ�ü�����                  */
				+	"	ssts_tr_pbmn	long	,"	/*  ���ŵ��������Ǹŵ��ŷ����                  */
				+	"	frgn_ntby_qty	long	,"	/*  �ܱ��� ���ż�                               */
				+	"	flng_cls_code	varchar(50),"		/*  ������ �ڵ�                                 */
				+	"	prtt_rate	float	,"		/*  ���� ����                                   */
				+	"	acml_prtt_rate	float	,"	/*  ���� ���� ����                              */
				+	"	stdv	float	,"			/*  ��ü�����ܰ����                            */
				+	"	beta_cfcn	float	,"		/*  ��Ÿ ���(90��)                             */
				+	"	crlt_cfcn	float	,"		/*  DEL ��� ���                               */
				+	"	bull_beta	float	,"		/*  DEL ���� ���                               */
				+	"	bear_beta	float	,"		/*  DEL �༼ ���                               */
				+	"	bull_dvtn	float	,"		/*  DEL ���� ����                               */
				+	"	bear_dvtn	float	,"		/*  DEL �༼ ����                               */
				+	"	bull_crlt	float	,"		/*  DEL ���� ������                           */
				+	"	bear_crlt	float	,"		/*  DEL �༼ ������                           */
				+	"	stck_mxpr	int	,"			/*  �ֽ� ���Ѱ�                                 */
				+	"	stck_llam	int	,"			/*  �ֽ� ���Ѱ�                                 */
				+	"	icic_cls_code	varchar(50),"		/*  ���� ���� �ڵ�                              */
				+	"	itmt_vol	long	,"		/*  ���� �ŷ���                                 */
				+	"	itmt_tr_pbmn	long	,"	/*  ���� �ŷ����                               */
				+	"	fcam_mod_cls_code	varchar(50),"	/*  �׸鰡 ���� ���� �ڵ�                       */
				+	"	revl_issu_reas_code	varchar(50),"	/*  ���� ���� ���� �ڵ�                       */
				+	"	orgn_ntby_qty	long	,"	/*  ����� ���ż�                               */
				+	"	adj_prpr	int	,"			/*  �����ְ� (����:fnguide������ �߰�)          */
				+	"	fn_oprc	int	,"				/*  �ֽ� �ð�                                   */
				+	"	fn_hgpr	int	,"				/*  �ֽ� �ְ�                                 */
				+	"	fn_lwpr	int	,"				/*  �ֽ� ������                                 */
				+	"	fn_prpr	int	,"				/*  �ֽ� ����                                   */
				+	"	fn_acml_vol	long,"			/*  ���� �ŷ���                                 */
				+	"	fn_acml_tr_pbmn	long	,"	/*  ���� �ŷ� ���                              */
				+	"	fn_prtt_rate	float	,"	/*  ���� ����                                   */
				+	"	fn_flng_cls_code	varchar(50),"	/*  ������ �ڵ�                                 */
				+	"	buyin_nor_prpr	int	,"		/* Buy-in �Ϲ� ü�ᰡ                           */
				+	"	buyin_nor_prdy_vrss	int	,"	/* Buy-in �Ϲ� ���� ���                        */
				+	"	buyin_nor_vol	long	,"	/* Buy-in �Ϲ� ü�ᷮ                           */
				+	"	buyin_nor_tr_pbmn	long,"	/* Buy-in �Ϲ� ü�� ���                        */
				+	"	buyin_tod_prpr	int	,"		/* Buy-in ���� ü�ᰡ                           */
				+	"	buyin_tod_prdy_vrss	int	,"	/* Buy-in ���� ���� ���                        */
				+	"	buyin_tod_vol	long	,"	/* Buy-in ���� ü�ᷮ                           */
				+	"	buyin_tod_tr_pbmn	long,"	/* Buy-in ���� ü�� ���                        */
				
				+ "PRIMARY KEY(bsop_date, shrn_iscd)"	// PRIMARY KEY�� shrn_iscd, bsop_date ���
				+  ") DEFAULT CHARSET=utf8;"				// �������� utf8�� ����
					);
		
		// db �ݱ�
		stmt.close();
		conn.close();
	}
}

