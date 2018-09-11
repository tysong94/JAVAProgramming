//��¥ : 5�� 31�� 
//���� : ���¾�
//���� : 3.  Training - ���ں��ְ������� ���ڵ� �б�
package kr.ac.kopoctc.algoritm.t3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E04_Stock_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db ���� ��ü, ���� ���� ����, ���� ���� ��ü, ��� ���� ��ü -> ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08?rewriteBatchedStatements=true", "root", "1");
		String query;
		Statement stmt = conn.createStatement();
		ResultSet rset;	
		
		// ���� ����, ���� ����, ��� ����
//		query = String.format("select * from stock_k08 where shrn_iscd = \"A005930\";");	// �Ｚ���� ���ڵ� ��� ����
		query = String.format("select * from stock_k08 where bsop_date = \"20150112\";");	// 20150112 ���ڵ� ��� ����
		rset = stmt.executeQuery(query);
		
		// ���
		// ���ڵ� �� �� �ҷ�����
		while(rset.next()) {												
			// ���ڵ� �� �� �ʵ� �ҷ�����
			System.out.printf("*******************************\n");		
			System.out.printf("     ID      : %s\n", rset.getString(1));	
			System.out.printf("��        �� : %s\n", rset.getString(2));
			System.out.printf("�� ��  �� �� : %s\n", rset.getString(3));
			System.out.printf("��        �� : %s\n", rset.getString(4));
			System.out.printf("��        �� : %s\n", rset.getString(5));
			System.out.printf("��        �� : %s\n", rset.getString(6));
			System.out.printf("��        �� : %s\n", rset.getString(7));
			System.out.printf("��   ��   �� : %s\n", rset.getString(8));
			System.out.printf("�� ��  �� �� : %s\n", rset.getString(9));
			System.out.printf("*******************************\n");
		}
		
		// db �ݱ�
		rset.close();
		stmt.close();
		conn.close();
	}
}
