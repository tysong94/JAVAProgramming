//��¥ : 5�� 29�� 
//���� : ���¾�
//���� : 4. ���ڵ� ����
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E04_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql�� ������ ����
		// stmt.execute : stmt.executeQuery�� �޸� ������ ���� ����� ���� �������� �ʰ� ���ุ �Ѵ�.
		// ���ڵ带 �Է��ϴ� ������ ����
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('ȿ��', 209901, 95, 100, 95);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('����', 209902, 95, 95, 95);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('����', 209903, 100, 100, 100);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('����', 209904, 100, 95, 90);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('�ҿ�', 209905, 80, 100, 70);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('ť��', 209906, 100, 100, 70);");
		stmt.execute("insert into table2k08 (name, studentid, kor, eng, mat) values ('ȭ��', 209907, 70, 70, 70);");
		
		// mysql �ݱ�
		stmt.close();
		conn.close();
	}
}
