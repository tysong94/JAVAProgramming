//��¥ : 5�� 29�� 
//���� : ���¾�
//���� : 9. FreeWifi ���ڵ� �б�
package kr.ac.kopoctc.algoritm.achap9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E09_FreeWifi_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// ����, �浵 ��
		double lat = 37.3860521, lng = 127.1214038;
		
		// mysql ������ ���� ���� ����, ������ �Է�
		String queryTxt;
//		queryTxt = "select * from freewifi_k08";	
//		queryTxt = String.format("select * from freewifi_k08 where "
//				+ "SQRT( POWER(latitude - %f, 2) + POWER(longitude - %f, 2) ) = "
//				+ "(select MIN( SQRT( POWER(latitude - %f, 2) + POWER(longitude - %f, 2) ) ) from freewifi_k08);",
//				lat, lng, lat, lng);
//		queryTxt = "select * from freewifi_k08 where service_provider = 'SKT'";
		queryTxt = "select * from freewifi_k08 where inst_country = '������'";
		
		// mysql ������ ���� ���� �� ��� ���
		ResultSet rset = stmt.executeQuery(queryTxt);
		while(rset.next()) {
			System.out.printf("*(%d)****************************************\n", rset.getInt(1));
			System.out.printf("��ġ��Ҹ� 		: %s\n", rset.getString(2));
			System.out.printf("��ġ��һ� 	: %s\n", rset.getString(3));
			System.out.printf("��ġ�õ���		: %s\n", rset.getString(4));
			System.out.printf("��ġ�ñ����� 	: %s\n", rset.getString(5));
			System.out.printf("��ġ�ü�����		: %s\n", rset.getString(6));
			System.out.printf("����������� 	: %s\n", rset.getString(7));
			System.out.printf("��������SSID 	: %s\n", rset.getString(8));
			System.out.printf("��ġ��� 		: %s\n", rset.getString(9));
			System.out.printf("���������θ��ּ�	: %s\n", rset.getString(10));
			System.out.printf("�����������ּ� 	: %s\n", rset.getString(11));
			System.out.printf("��������� 		: %s\n", rset.getString(12));
			System.out.printf("���������ȭ��ȣ	: %s\n", rset.getString(13));
			System.out.printf("���� 			: %s\n", rset.getString(14));
			System.out.printf("�浵 			: %s\n", rset.getString(15));
			System.out.printf("�����ͱ������� 	: %s\n", rset.getString(16));
			System.out.printf("*********************************************");
		}
		
		rset.close();
		stmt.close();
		conn.close();
	}
}
