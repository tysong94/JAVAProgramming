//��¥ : 5�� 29�� 
//���� : ���¾�
//���� : 1. JDBC �⺻ ���α׷�
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E01_ResultSet {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		///////////�⺻ ��Ʈ/////////////
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$"); 
		// mysql�� ip�ּҿ� �����ͺ��̽���, ����, ��й�ȣ�� �Է��Ͽ� mysql�� java(���α׷�)�� ����.
		
		Statement stmt = conn.createStatement();
		// mysql�� java�� String ������ �������ִ� stmt ��ü�� ����.
	
//		ResultSet rset = stmt.executeQuery("show databases;");
//		ResultSet rset = stmt.executeQuery("show tables;");
		ResultSet rset = stmt.executeQuery("select * from tablek08");
		// ������ ���� ��ü(ResultSet rset)�� ������ ������ ��� ������(stmt.executeQuery("������")�� ������.
		
		while(rset.next()) {						// rset.next() : ���ڵ带 ������� ������.
			System.out.println(rset.getString(1));	// rset.getString(1) : ���ڵ��� �ش� ��ȣ�� �ʵ尪�� ������.
		}
		
		rset.close();	// �������� �ݾ��ش�.
		stmt.close();	
		conn.close();
		////////////////////////////////
	}
}
