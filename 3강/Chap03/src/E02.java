// ��¥ : 5�� 4�� 
// ���� : ���¾�
// ���� : 2. �����ϱ�

public class E02 {
	public static void main(String[] args) {
				
		// �����ϱ�
		int k08_sum; // ������ �տ��� �ϴ� �� ����.
		k08_sum=0; // ����, ������ �� �ʱ�ȭ.
		
		for (int i=1;i<101;i++) 
		{
			k08_sum=k08_sum+i;
		}

		System.out.printf("2-1 : %d\n", k08_sum); // �����ϱ�(�� ���ϱ�)
		System.out.printf("2-2 : %d\n", k08_sum/100); // ���

		// �迭�� �����ϱ�
		int[] k08_v = {1,2,3,4,5};
		int k08_vSum; 
		k08_vSum = 0;
		
		for(int i=0;i<5;i++)
		{
			k08_vSum=k08_vSum+k08_v[i];
		}
		
		System.out.printf("2-3 : %d\n", k08_vSum); // �迭 ���� �����ϱ�(�� ���ϱ�)
	}
}
