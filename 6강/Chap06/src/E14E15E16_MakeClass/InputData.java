//��¥ : 5�� 19�� 
//���� : ���¾�
//���� : 14. Ŭ���� �����
package E14E15E16_MakeClass;

public class InputData {
	// ���� ���� ////////////////////////////
	// �� ����� �ڷ�
	String[] name;
	int[] kor;
	int[] eng;
	int[] mat;
	int[] sum;
	double[] ave;
			
	// �� �ο��� ��ŭ �迭 ���� ////////////////////////////
	public InputData (int iPerson) {
		this.name = new String[iPerson];
		this.kor = new int[iPerson];
		this.eng = new int[iPerson];
		this.mat = new int[iPerson];
		this.sum = new int[iPerson];
		this.ave = new double[iPerson];	
	}
	
	// �� ���ҿ� �ڷ� �ֱ� ////////////////////////////
	public void SetData(int i, String name, int kor, int eng, int mat) {
		// �� ����� �ڷ�
		this.name[i] = name;
		this.kor[i] = kor;
		this.eng[i] = eng; 
		this.mat[i] = eng; 
		
		this.sum[i] = this.kor[i] + this.eng[i] + this.mat[i];
		this.ave[i] = this.sum[i] / 3.0;
	}
}
