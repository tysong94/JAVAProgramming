//��¥ : 5�� 30�� 
//���� : ���¾�
//���� : 1. Basic Training (1) - �������ð���ǥ�ص�����
package kr.ac.kopoctc.algoritm.t1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E03_CityPark_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, mysql ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/k08", "root", "wptkwkd94$");
		Statement stmt = conn.createStatement();
		
		// �������� ���� ����, ���� �б�, ���ڵ� ���� ��ü, �ν��Ͻ�, ���� ����.
		File f = new File("C:\\Users\\kopo\\Desktop\\Data\\�������ð���ǥ�ص�����.txt");
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
			
			// �ʵ尪 ����
			if (field[13].equals("")) { field[13] = "1900-01-01"; }
			if (field[7].equals("")) { field[7] = "0"; }
			field[7] = field[7].replaceAll("\"", "").replaceAll("'", "").replaceAll(",", "");
						
			// ������ ���� ����
			String queryTxt;
			
			// ���������� ���ڵ带 �Է�
			queryTxt = String.format("insert into citypark_k08("	// ���ڵ� �Է� ������
					+ "manage_num 		,"	// ������ȣ				// �ʵ�� �Է�
					+ "park_name 		,"	// ������
					+ "park_flag		,"	// ��������
					+ "address_road		,"	// ���������θ��ּ�
					+ "address_land		,"	// �����������ּ�
					+ "latitude			,"	// ����
					+ "longitude		,"	// �浵
					+ "park_area		,"	// ��������
					+ "park_facility_1	,"	// ���������ü� 
					+ "park_facility_2	,"	// ���������ü�
					+ "park_facility_3	,"	// ���������ü�
					+ "park_facility_4	,"	// ���������ü�
					+ "park_facility_5	,"	// ���������ü�
					+ "date				,"	// ���������
					+ "manage_agency	,"	// ���������
					+ "phone_num		,"	// ��ȭ��ȣ
					+ "write_date		"	// �����ͱ�������
					+ ") values ("
					+ "'%s', '%s', '%s', '%s', '%s',"				// �ʵ尪 �Է�
					+ "'%s', '%s', '%s', '%s', '%s',"
					+ "'%s', '%s', '%s', '%s', '%s',"
					+ "'%s', '%s'"
					+ ");",
					field[0], field[1], field[2], field[3], field[4],
					field[5], field[6], field[7], field[8], field[9],
					field[10], field[11], field[12], field[13], field[14],
					field[15], field[16]
					);
			
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
