//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 8. �޼ҵ� �����ε�(����)
package E08_MethodOverloading2;

public class Score {
	
	void score(int kor, int eng, int mat) {
			
		int sum = kor + eng + mat;
		int ave = sum / 3;
		
		System.out.printf("3�� ����ǥ\n");
		System.out.printf("=========================================\n");
		System.out.printf("�̸�   ���� ���� ���� ���� ���\n");
		System.out.printf("=========================================\n");
		System.out.printf("���¾�  %d  %d  %d  %d  %d\n", kor, eng, mat, sum, ave);
		System.out.println();
	}
	
	void score(int kor, int eng, int mat, int sci) {
		
		int sum = kor + eng + mat + sci;
		int ave = sum / 4;
		
		System.out.printf("4�� ����ǥ\n");
		System.out.printf("=========================================\n");
		System.out.printf("�̸�   ���� ���� ���� ���� ���� ���\n");
		System.out.printf("=========================================\n");
		System.out.printf("���¾�  %d  %d  %d  %d  %d  %d\n", kor, eng, mat, sci, sum, ave);
		System.out.println();
	}
	
	void score(int kor, int eng, int mat, int sci, int soc) {
		
		int sum = kor + eng + mat + sci + soc;
		int ave = sum / 5;
		
		System.out.printf("5�� ����ǥ\n");
		System.out.printf("=========================================\n");
		System.out.printf("�̸�   ���� ���� ���� ���� ��ȸ ���� ���\n");
		System.out.printf("=========================================\n");
		System.out.printf("���¾�  %d  %d  %d  %d  %d  %d  %d\n", kor, eng, mat, sci, soc, sum, ave);
		System.out.println();
	}

}
