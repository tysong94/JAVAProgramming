//��¥ : 5�� 30�� 
//���� : ���¾�
//���� : 2.  Basic Training (2) - ���� ���̺� �����
package kr.ac.kopoctc.algoritm.t2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E01_Score_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		Statement stmt = conn.createStatement();
	
		// mysql ������ ����
		stmt.execute( 
					"create table score_k08("		// score ���̺� ����
					+ "studentid 	int,"			// �й�
					+ "name 		varchar(10),"	// �̸�
					+ "kor			int,"			// ����
					+ "eng			int,"			// ����
					+ "mat			int,"			// ����
					+ "PRIMARY KEY(studentid)"		// Ű ����
					+ ") DEFAULT CHARSET = utf8;"	
					);
		
		// mysql �ݱ�
		stmt.close();
		conn.close();
	}
}

