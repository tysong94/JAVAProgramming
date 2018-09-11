//��¥ : 5�� 30�� 
//���� : ���¾�
//���� : 2. Basic Training (2) - ���� ���ڵ� ����
package kr.ac.kopoctc.algoritm.t2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class E03_Score_Record_Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.jdbc.Driver"); 
		
		// mysql ����, ������ ���� ����, ������ ���� ��ü ����, �ν��Ͻ�ȭ
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.56.1/db_k08?rewriteBatchedStatements=true", "root", "1");
		String sql = "insert into score_k08 (studentid, name, kor, eng, mat) values (?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		// ������ ���� & mysql�� ������ ����, ����
		Student student;
		int count = 0;
		for(int i = 1; i <= 1000; i++) {
			student = new Student(i);
			
			// ���� ����� �������� �ʵ尪�� �ְ� ����
			preparedStatement.setInt(1, student.studentid);	
			preparedStatement.setString(2, student.name);	
			preparedStatement.setInt(3, student.kor);
			preparedStatement.setInt(4, student.eng);
			preparedStatement.setInt(5, student.mat);
		
			preparedStatement.addBatch();				// sql���� �����س���
			if(++count % 1000 == 0) {					// 1000���� �� ��
				preparedStatement.executeBatch();		// sql���� ����.
				System.out.println("batch : " + count);	// �� ��ġ�� ���� ���
			}
		}
		
		// mysql �ݱ�
		preparedStatement.executeBatch();	// batch�� ���� ������ ����
		preparedStatement.close();			
		conn.close();		
	}
}
