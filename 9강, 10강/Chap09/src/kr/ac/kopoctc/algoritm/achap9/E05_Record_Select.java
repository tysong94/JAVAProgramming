//��¥ : 5�� 29�� 
//���� : ���¾�
//���� : 5. ���ڵ� �б�
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E05_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// class�� ��ã�� �� exception ó��, 
		Class.forName("com.mysql.jdbc.Driver"); // ���̺귯���� ����Ʈ �ϸ� �˾Ƽ� �ε� ��.(�־ �ǰ� ��� ��)
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// mysql ������ ���� ����� ��ü�� ����.
		ResultSet rset = stmt.executeQuery("select * from tablek08;");	// ��� ���ڵ� �д� ����
		System.out.printf("  �̸�   �й�  ����  ����  ����\n");			
		while(rset.next()) {											// ���ڵ带 ������� ȣ��
			System.out.printf(	"%4s %6d   %3d   %3d   %3d \n", 		// ���ڵ��� �ʵ尪�� ���
								rset.getString(1), rset.getInt(2), rset.getInt(3), rset.getInt(4), rset.getInt(5));
		}
		
		// mysql �ݱ�
		rset.close();
		stmt.close();
		conn.close();
	}
}
