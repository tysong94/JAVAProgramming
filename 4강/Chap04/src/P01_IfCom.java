// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : �ܼ���
public class P01_IfCom {
	public static void main(String[] args) {
		
		int k08iA, k08iB;
		
		k08iA = 1; // ù��° while�� �ʱⰪ
		while(true) 
		{
			k08iB = 1; // �ι�° while�� �ʱⰪ
			while(true) 
			{
				System.out.printf("*");
				if(k08iA == k08iB) {break;} // �ι�° while�� ���ǽ�
				k08iB++; // �ι�° while�� ������
			}
		System.out.printf("\n");
		if(k08iA == 30) break; // ù��° while�� ���ǽ�
		k08iA++; // ù��° while�� ������
		}
	
		// iB��ŭ�� ���� ��� �����ϴ� ���� 30�� �ݺ��Ѵ�. 
	}
}
