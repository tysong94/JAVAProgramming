//��¥ : 5�� 29�� 
//���� : ���¾�
//���� : 7. FreeWifi ���̺� �����
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E07_FreeWifi_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql ������ ����
		// ���̺� ����� ������
		stmt.execute("drop table freewifi_k08;");
		
		// mysql �ݱ�
		stmt.close();
		conn.close();
	}
}
