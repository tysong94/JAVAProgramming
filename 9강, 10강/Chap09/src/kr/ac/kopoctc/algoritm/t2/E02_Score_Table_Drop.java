//��¥ : 5�� 30�� 
//���� : ���¾�
//���� : 2.  Basic Training (2) - ���� ���̺� �����
package kr.ac.kopoctc.algoritm.t2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E02_Score_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		Statement stmt = conn.createStatement();
	
		// mysql ������ ����
		// ���̺� ����� ������
		stmt.execute("drop table score_k08;");
		
		// mysql �ݱ�
		stmt.close();
		conn.close();
	}
}
