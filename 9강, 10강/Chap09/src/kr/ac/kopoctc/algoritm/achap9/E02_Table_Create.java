//��¥ : 5�� 29�� 
//���� : ���¾�
//���� : 2. ���̺� �����
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E02_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql�� ������ ����
		// stmt.execute : stmt.executeQuery�� �޸� ������ ���� ����� ���� �������� �ʰ� ���ุ �Ѵ�.
		stmt.execute(	"create table table2k08(" +				// ���̺� �����, ���̺�� ����(
						"name varchar(20)," +					// 20���� �̳� ������ name �ʵ�
						"studentid int not null primary key," +	// int�� studentid �ʵ�
						"kor int," +							// int�� kor �ʵ�
						"eng int," +							// int�� eng �ʵ�
						"mat int)" +							// int�� mat �ʵ�)
						"DEFAULT CHARSET=utf8;");				// �⺻ �� utf8�� ����.
		
		// mysql �ݾ��ֱ�
		stmt.close();
		conn.close();
	}
}
