//��¥ : 5�� 29�� 
//���� : ���¾�
//���� : 3. ���̺� �����
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E03_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); // 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql�� ������ ����
		// stmt.execute : stmt.executeQuery�� �޸� ������ ���� ����� ���� �������� �ʰ� ���ุ �Ѵ�.
		stmt.execute("drop table table2k08"); // ���̺� ����� ������
		
		// mysql �ݱ�
		stmt.close();
		conn.close();
	}
}
