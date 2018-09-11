//��¥ : 5�� 31�� 
//���� : ���¾�
//���� : 3.  Training - ���ں��ְ������� ���ڵ� ����
package kr.ac.kopoctc.algoritm.t3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class E03_Stock_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db ���� ��ü, ���� ���� ����, ���� ���� ��ü -> ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08?rewriteBatchedStatements=true", "root", "1");
		String query = "insert into stock_k08 ("	// ���̺� ���ڵ� �ֱ� ���� 
						+ "bsop_date, "				// �ʵ� ���
						+ "shrn_iscd, "
						+ "stck_prpr, "
						+ "stck_oprc, "
						+ "stck_hgpr, "
						+ "stck_lwpr,"
						+ "itmt_vol, "
						+ "itmt_tr_pbmn" 
						+ ") values (?, ?, ?, ?, ?, ?, ?, ?)";// �� ���
		PreparedStatement ps = conn.prepareStatement(query);
		
		// ���� ���� ��ü, ���� �б� ��ü, ���ڵ� ���� ���� -> ����, �ν��Ͻ�ȭ.
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String oneRec;
		
		//////// ���� ���ڵ� �ɰ��� & db ���̺� �ֱ�////////////////
		int lineCnt = 0;
		int insertCnt = 0;

		while( (oneRec = br.readLine()) != null ) {
			lineCnt++;
			// ���ڵ� �ɰ���
			String[] field = oneRec.split(","); 
			
			// db���̺� ���ڵ� �ֱ� ���� ����
			if(field.length >= 79) {
				ps.setString(1, field[1]);	// ����
				ps.setString(2, field[2]);	// �����ڵ�
				ps.setString(3, field[3]);	// ����
				ps.setString(4, field[4]);	// �ð�
				ps.setString(5, field[5]);	// �ְ�
				ps.setString(6, field[6]);	// ������
				ps.setString(7, field[77]);	// ���� �ŷ���
				ps.setString(8, field[78]);	// ���� �ŷ����
				
				ps.addBatch();				// Batch�� ������ ����
				ps.clearParameters();		
				if (++insertCnt % 10000 == 0) {	// Batch�� ������ 10000���� ���
					ps.executeBatch(); 			// Batch�� ������ ����
					ps.clearBatch();			// Batch �ʱ�ȭ
					System.out.printf("%d�� �׸� �� %d�� �׸� Insert OK\n", lineCnt, insertCnt);
				}
			}
		}
		ps.executeBatch();	// batch�� ���� ������ ����
		System.out.printf("%d�� �׸� �� %d�� �׸� Insert OK\n", lineCnt, insertCnt);
		////////////////////////////////////////////////////////
		
		// ����, db �ݱ�
		br.close();
		ps.close();
		conn.close();
		
	}
}
