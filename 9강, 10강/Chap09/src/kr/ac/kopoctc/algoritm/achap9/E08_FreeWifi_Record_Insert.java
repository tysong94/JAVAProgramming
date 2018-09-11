//��¥ : 5�� 29�� 
//���� : ���¾�
//���� : 8. FreeWifi ���ڵ� �Է�
package kr.ac.kopoctc.algoritm.achap9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E08_FreeWifi_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// �������� ���� ����, ���� �б�, ���ڵ� ���� ��ü, �ν��Ͻ�, ���� ����.
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\���������������ǥ�ص�����2.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String oneRec;
		
		/////// �ʵ�� ���ڵ� �ɰ���///////////////
		if((oneRec = br.readLine()) == null) {
			System.out.printf("�� �����Դϴ�.\n");
			return;
		}
		String[] field_name = oneRec.split("\t");
		
		//////// ������ ���ڵ� �ɰ��� & mysql �����ͺ��̽��� �ֱ�////////////////
		int lineCnt = 2;
		while( (oneRec = br.readLine()) != null ) {
			String[] field = oneRec.split("\t");
			
			// ������ ���� ����
			String queryTxt;
			// ���������� ���ڵ带 �Է�
			queryTxt = String.format("insert into freewifi_k08("
//					+ "id MEDIUMINT NOT NULL AUTO_INCREMENT," // �ε��� �����
					+ "inst_place,"	// ��ġ��Ҹ�
					+ "inst_place_detail,"	// ��ġ��һ� 
					+ "inst_city,"	// ��ġ�õ���
					+ "inst_country,"	// ��ġ�ñ�����
					+ "inst_place_flag,"	// ��ġ�ü�����
					+ "service_provider,"	// �����������
					+ "wifi_ssid,"	// ��������SSID
					+ "inst_date,"	// ��ġ��� -> ������ ��
					+ "place_addr_road,"	// ���������θ��ּ� 
					+ "place_addr_land,"	// �����������ּ�
					+ "manage_office,"	// ���������
					+ "manage_office_phone,"	// ���������ȭ��ȣ
					+ "latitude,"	// ����
					+ "longitude,"	// �浵
					+ "write_date)"	// �����ͱ�������
					+ "values ("
					+ "'%s', '%s', '%s', '%s', '%s'"
					+ ", '%s', '%s', '%s', '%s', '%s'"
					+ ", '%s', '%s', '%s', '%s', '%s');",
					field[0], field[1], field[2], field[3], field[4],
					field[5], field[6], field[7], field[8], field[9],
					field[10], field[11], field[12], field[13], field[14]);
			// ������ ����(����)
			stmt.execute(queryTxt);
			System.out.printf("%d��° �׸� Insert OK [%s]\n", lineCnt, queryTxt);
			
			lineCnt++;
		}
		//////////////////////////////////////////////////////////////////////////
		
		// ����, mysql �ݱ�
		br.close();
		stmt.close();
		conn.close();
	}
}
