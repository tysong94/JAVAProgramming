// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : for��
public class E03_for {
	public static void main(String[] args) {
		
		// �⺻ for��
		// i�� 0���� 9�� ������ ����.
		int k08sum=0;
		for(int i=0;i<10;i++) { 
			k08sum=k08sum+i;
		}
		System.out.printf("sum %d\n", k08sum);
	
		// ���� for��
		// i�� ���� X j�� ���� ��ŭ �ݺ����� �����.
		// i=1�� �� j=1...9, i=2�϶� j=1...9 ...�� ���� �ݺ��ȴ�. 
		for(int k08i=1;k08i<10;k08i++) {
			System.out.printf("*********************\n");
			System.out.printf("     ������ %d��\n", k08i);
			System.out.printf("*********************\n");
			for(int k08j=1;k08j<10;k08j++) {
				System.out.printf(" %d * %d = %d\n", k08i, k08j, k08i*k08j);
			}
		}
	
	}
}
