//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 17. Ŭ���� �����
package E17_MakeClass;

public class ReportSheet_k08 {
	public static void main(String[] args) {
		
		int iPerson = 10;
		
		InputData_k08 inData = new InputData_k08(iPerson);
		
		for(int i = 0; i < iPerson; i++) {
			String name = String.format("ȫ��%02d", i);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			
			inData.SetData_k08(i, name, kor, eng, mat);
		}
		
		for(int i = 0; i < iPerson; i++) {
			System.out.printf(
					"��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n", 
					i, inData.name[i], inData.kor[i], inData.eng[i], inData.mat[i], inData.sum[i], inData.ave[i]);
		}
		
	}
}
