package kr.ac.kopoctc.algoritm.t4;

public class InsertBlank {
	// �ڿ� ��ũ�� ���̴� �޼ҵ�
	public static String BlankBackword(String str, int kan){
				
		byte[] byteArr = str.getBytes();		// ���ڿ� -> ����Ʈ �迭
				
		int blankCount = kan - byteArr.length; // �� ����Ʈ���� ���� ����Ʈ�� ���.
			
		String blank = ""; 						// ���� ����Ʈ����ŭ ������ ����.
		for(int i = 1; i <= blankCount; i++) {
			blank = blank + " ";
		}
		
		return str = str + blank; 				// �������� + ���� ��ȯ.
	}
}
