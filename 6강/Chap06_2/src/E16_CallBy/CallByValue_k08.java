//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 16. CallBy
package E16_CallBy;

class Count_k08 {
	public void update (int count) {
		count++;
	}
}

public class CallByValue_k08 {
	int count = 0;
	
	public static void main(String[] args) {
		// ��ü, �ν��Ͻ� ����
		CallByValue_k08 callByValue = new CallByValue_k08();
		Count_k08 count = new Count_k08();
		
		// �� ���
		System.out.println("before : " + callByValue.count);
				
		// ��ü �޼ҵ� ���� �� �� ���
		count.update(callByValue.count);
		System.out.println("after : " + callByValue.count);
	}
}
