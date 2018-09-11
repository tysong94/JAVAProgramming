//��¥ : 5�� 31�� 
//���� : ���¾�
//���� : 3.  Training - ���ں��ְ������� ���̺� �����
package kr.ac.kopoctc.algoritm.t3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E01_Stock_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		Statement stmt = conn.createStatement();
	
		// mysql ������ ����
		stmt.execute( 
					"create table stock_k08("			// stock ���̺� ����
					+ "id INT NOT NULL AUTO_INCREMENT,"	/*  �ε��� 					                    */
					+ "bsop_date		varchar(50),"	/*  NOT_NULL �ֽ� ���� ����                     */
					+ "shrn_iscd	 	varchar(50),"	/*  NOT_NULL �������� ���� �����ڵ�             */
					+ "stck_prpr		int,"			/*  �ֽ� ����                                   */
				    + "stck_oprc 		int,"          	/*  �ֽ� �ð�                                   */
				    + "stck_hgpr		int,"          	/*  �ֽ� �ְ�                                 */
				    + "stck_lwpr		int,"          	/*  �ֽ� ������                                 */
					+ "itmt_vol 		long,"     		/*  ���� �ŷ���                                 */
					+ "itmt_tr_pbmn 	long,"  		/*  ���� �ŷ����                               */
					+ "PRIMARY KEY(id, bsop_date, shrn_iscd)"	// PRIMARY KEY(����)�� id, shrn_iscd, bsop_date ���
					+  ") DEFAULT CHARSET=utf8;"				// �������� utf8�� ����
					);				
		
		// mysql �ݱ�
		stmt.close();
		conn.close();
	}
}

