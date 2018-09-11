//��¥ : 5�� 30�� 
//���� : ���¾�
//���� : 2. Basic Training (2) - ���� ���ڵ� �б�
package kr.ac.kopoctc.algoritm.t2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class E04_Score_Record_Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// db ����, ���� ���� ����, ���� ���� ��ü, ��� ���� ��ü -> ����/�ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08", "root", "1");
		String query;
		Statement stmt = conn.createStatement();
		ResultSet rset; 
		
		// �� ������ �� ���ϱ�
		rset = stmt.executeQuery("select count(*) from score_k08;");// ���ڵ� ���� ���� ���� ����, ��� ����
		rset.next();												// ��� ������
		int allRec = rset.getInt(1);								// �ʵ�(ù��°) ������ = �� ���ڵ� ����
		int pageRec = 30;											// �������� ���ڵ� ����
		int page = allRec / pageRec;								// ������ ��
		if(allRec % pageRec != 0) page++;
		
		// ��¥ ��� ��ü -> ����, �ν��Ͻ�ȭ
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("������� : YYYY.MM.dd HH:MM:ss");
		
		//// �� ������ ��� //////////////////////////////////////////////////////////////////////////////////////
		for(int i = 1; i <= page; i++) {
			System.out.printf("                 ��������ǥ\n");
			System.out.printf("PAGE : %d          %s\n", i, sdf.format(cal.getTime()));
			System.out.printf("=================================================\n");
			System.out.printf("��ȣ  �̸�     ����   ����   ����   ����     ���\n");
			System.out.printf("=================================================\n");
			
			
			// ���ڵ� 30�� ��������
			query = "select "				// ���ڵ� 30���� �������� ���� ����
					+ "studentid, "			// ��ȣ
					+ "name, "				// �̸�
					+ "kor, "				// ����
					+ "eng, "				// ����
					+ "mat, "				// ����
					+ "kor + eng + mat, "	// ����
					+ "(kor + eng + mat)/3"	// ���
					+ " from score_k08 group by studentid order by studentid  limit " + (i-1)*30 + "," + 30 ;
			rset = stmt.executeQuery(query);// ���ڵ� 30�� �������� ���� ����, ��� ����
			
			//// �� ���ڵ� ���////////////////////////////////////////////////////
			for(int j = 1; j <= 30; j++) {
				// ���ڵ� �Ѱ� ��������
				rset.next();	
				// ���ڵ� �Ѱ� ���
				System.out.printf("%03d %-6s%7d%7d%7d%7d%9.0f\n", 
						rset.getInt(1), 
						rset.getString(2), 
						rset.getInt(3), 
						rset.getInt(4), 
						rset.getInt(5), 
						rset.getInt(6),
						rset.getDouble(7)
						);
				if(rset.getInt(1) == 1000) break;
			}
			///////////////////////////////////////////////////////////////////////
			
			//// �� ������ ��� ���////////////////////////////////////////////////
			// �� ������ �հ�, ��� �������� -> ���� ����, ���ڵ� ����, ���ڵ� ��������, ���ڵ� ���
			String query2 = "select "
					+ "sum(kor), sum(eng), sum(mat), sum(kor+ eng + mat), sum((kor + eng + mat) / 3), "
					+ "avg(kor), avg(eng), avg(mat), avg(kor + eng + mat), avg((kor + eng + mat) / 3)"
					+ " from (" + query + ") As subquery;";
			rset = stmt.executeQuery(query2);
			rset.next();
			
			System.out.printf("=================================================\n");
			System.out.printf("����������\n");
			System.out.printf("�հ�        %7d%7d%7d%7d%9.0f\n", rset.getInt(1), rset.getInt(2), rset.getInt(3), rset.getInt(4), rset.getDouble(5));
			System.out.printf("���        %7.0f%7.0f%7.0f%7.0f%9.0f\n", rset.getDouble(6), rset.getDouble(7), rset.getDouble(8), rset.getDouble(9), rset.getDouble(10));

			// ���� ������ ��� ���/////////////////////////////////////////////////
			// ���� ������ �հ�, ��� �������� -> ���� ����, ���ڵ� ����, ���ڵ� ��������, ���ڵ� ���
			String query3 = "select "
					+ "sum(kor), sum(eng), sum(mat), sum(kor+ eng + mat), sum((kor + eng + mat) / 3), "
					+ "avg(kor), avg(eng), avg(mat), avg(kor + eng + mat), avg((kor + eng + mat) / 3)"
					+ " from score_k08 where studentid <= " + (i * 30) ;
			rset = stmt.executeQuery(query3);
			rset.next();
			
			System.out.printf("=================================================\n");
			System.out.printf("����������\n");
			System.out.printf("�հ�        %7d%7d%7d%7d%9.0f\n", rset.getInt(1), rset.getInt(2), rset.getInt(3), rset.getInt(4), rset.getDouble(5));
			System.out.printf("���        %7.0f%7.0f%7.0f%7.0f%9.0f\n", rset.getDouble(6), rset.getDouble(7), rset.getDouble(8), rset.getDouble(9), rset.getDouble(10));
			System.out.println();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////			
		
		// db �ݱ�
		rset.close();
		stmt.close();
		conn.close();
	}
}
