//��¥ : 5�� 31�� 
//���� : ���¾�
//���� : 3.  Training - ���ں��ְ������� ���̺� �����
package kr.ac.kopoctc.algoritm.t3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E02_Stock_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db ���� ��ü, ���� ���� ��ü -> ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		Statement stmt = conn.createStatement();
	
		// ���� ����
		stmt.execute("drop table stock_k08;"); // ���̺� ����� ������
		
		// db �ݱ�
		stmt.close();
		conn.close();
	}
}
