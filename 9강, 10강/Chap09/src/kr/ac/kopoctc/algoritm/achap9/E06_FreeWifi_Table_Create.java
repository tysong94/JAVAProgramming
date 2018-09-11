//��¥ : 5�� 29�� 
//���� : ���¾�
//���� : 6. FreeWifi ���̺� �����
package kr.ac.kopoctc.algoritm.achap9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E06_FreeWifi_Table_Create {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
	
		// mysql ������ ����
		stmt.execute( 
					"create table freewifi_k08("				// freewifi ���̺� ����
					+ "id MEDIUMINT NOT NULL AUTO_INCREMENT,"	// �ε��� �����
					+ "inst_place 			varchar(50),"	// ��ġ��Ҹ�
					+ "inst_place_detail 	varchar(500),"	// ��ġ��һ� 
					+ "inst_city			varchar(50),"	// ��ġ�õ���
					+ "inst_country			varchar(50),"	// ��ġ�ñ�����
					+ "inst_place_flag		varchar(50),"	// ��ġ�ü�����
					+ "service_provider		varchar(50),"	// �����������
					+ "wifi_ssid			varchar(500),"	// ��������SSID
					+ "inst_date			varchar(50),"	// ��ġ��� -> ������ ��
					+ "place_addr_road		varchar(200),"	// ���������θ��ּ� 
					+ "place_addr_land		varchar(200),"	// �����������ּ�
					+ "manage_office		varchar(50),"	// ���������
					+ "manage_office_phone	varchar(50),"	// ���������ȭ��ȣ
					+ "latitude				double,"		// ����
					+ "longitude			double,"		// �浵
					+ "write_date			date,"			// �����ͱ�������
					+ "PRIMARY KEY(id)"						// Ű ����
					+ ") DEFAULT CHARSET = utf8;"	
					);
		// mysql �ݱ�
		stmt.close();
		conn.close();
	}
}
