package E06_Variables;

public class Variables_k08 {
	
	// �����μ��� �̿��� �հ� �޼ҵ�
	public int sum_k08 (int... ints) {
		int sum = 0;
		for (int i : ints) {
			sum = sum + i;
		}
		return sum;
	}
	
	// �����μ��� �̿��� ��� �޼ҵ�
	// �ߺ����� �ִ��� �ٿ���.
	public int ave_k08 (int...ints) {
		int ave = 0;
		int sum = this.sum_k08(ints);
		ave = sum / ints.length;
		
		return ave;
	}
}
