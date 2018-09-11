//��¥ : 5�� 30�� 
//���� : ���¾�
//���� : 1. Basic Training (1) - ���ڵ� �б�
package kr.ac.kopoctc.algoritm.t1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E04_CityPark_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// ����� ����, �浵 ��
		double lat = 37.3860521, lng = 127.1214038;
		
		// mysql ������ ���� ���� ����, ������ �Է�
		String queryTxt;
//		queryTxt = "select * from citypark_k08";	
		queryTxt = String.format("select * from citypark_k08 where "
				+ "SQRT( POWER(latitude - %f, 2) + POWER(longitude - %f, 2) ) = "
				+ "(select MIN( SQRT( POWER(latitude - %f, 2) + POWER(longitude - %f, 2) ) ) from citypark_k08);",
				lat, lng, lat, lng);

		// mysql ������ ���� ���� �� ��� ���
		ResultSet rset = stmt.executeQuery(queryTxt);
		while(rset.next()) {
			System.out.printf("*(�ε���%d)****************************************\n", rset.getInt(1));
			System.out.printf("������ȣ 		: %s\n", rset.getString(2));
			System.out.printf("������			: %s\n", rset.getString(3));
			System.out.printf("��������			: %s\n", rset.getString(4));
			System.out.printf("���������θ��ּ�	: %s\n", rset.getString(5));
			System.out.printf("�����������ּ�	: %s\n", rset.getString(6));
			System.out.printf("���� 			: %s\n", rset.getDouble(7));
			System.out.printf("�浵 			: %s\n", rset.getDouble(8));
			System.out.printf("��������			: %s\n", rset.getDouble(9));
			System.out.printf("���������ü�1	: %s\n", rset.getString(10));
			System.out.printf("���������ü�2 	: %s\n", rset.getString(11));
			System.out.printf("���������ü�3 	: %s\n", rset.getString(12));
			System.out.printf("���������ü�4	: %s\n", rset.getString(13));
			System.out.printf("���������ü�5	: %s\n", rset.getString(14));
			System.out.printf("��������� 		: %s\n", rset.getDate(15));
			System.out.printf("��������� 		: %s\n", rset.getString(16));
			System.out.printf("��ȭ��ȣ 		: %s\n", rset.getString(17));
			System.out.printf("�����ͱ������� 	: %s\n", rset.getDate(18));
			System.out.printf("***************************************************");
		}
		
		// mysql �ݱ�
		rset.close();
		stmt.close();
		conn.close();
	}
}
