//��¥ : 5�� 30�� 
//���� : ���¾�
//���� : 1. Basic Training (1) - �������ð���ǥ�ص�����
package kr.ac.kopoctc.algoritm.t1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E02_CityPark_Table_Drop {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql ������ ����
		// ���̺� ����� ������
		stmt.execute("drop table citypark_k08;");
		
		// mysql �ݱ�
		stmt.close();
		conn.close();
	}
}
