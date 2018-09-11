//��¥ : 5�� 30�� 
//���� : ���¾�
//���� : 1.  Basic Training (1) - �������ð���ǥ�ص�����
package kr.ac.kopoctc.algoritm.t1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E01_CityPark_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql ������ ����
		stmt.execute( 
					"create table citypark_k08("				// citypark ���̺� ����
					+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"	// �ε��� �����
					+ "manage_num 		varchar(50),"	// ������ȣ
					+ "park_name 		varchar(50),"	// ������
					+ "park_flag		varchar(50),"	// ��������
					+ "address_road		varchar(200),"	// ���������θ��ּ�
					+ "address_land		varchar(200),"	// �����������ּ�
					+ "latitude			double,"		// ����
					+ "longitude		double,"		// �浵
					+ "park_area		double,"		// ��������
					+ "park_facility_1	varchar(500),"	// ���������ü� 
					+ "park_facility_2	varchar(500),"	// ���������ü�
					+ "park_facility_3	varchar(500),"	// ���������ü�
					+ "park_facility_4	varchar(500),"	// ���������ü�
					+ "park_facility_5	varchar(500),"	// ���������ü�
					+ "date				date," 			// ���������
					+ "manage_agency	varchar(50),"	// ���������
					+ "phone_num		varchar(50),"	// ��ȭ��ȣ
					+ "write_date		date,"			// �����ͱ�������
					+ "PRIMARY KEY(id)"					// Ű ����
					+ ") DEFAULT CHARSET = utf8;"	
					);
		
		// mysql �ݱ�
		stmt.close();
		conn.close();
	}
}

