//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 16. CallBy
package E16_CallBy;

class Count1_k08 {
	public void update (CallByReference_k08 callByReference) {
		callByReference.count++;
	}
}

public class CallByReference_k08 {
	int count = 0;
	
	public static void main(String[] args) {
		// ��ü, �ν��Ͻ� ����
		CallByReference_k08 callByReference = new CallByReference_k08();
		Count1_k08 count1 = new Count1_k08();
		
		// �� ���
		System.out.println("before : " + callByReference.count);
		
		// ��ü �޼ҵ� ���� �� �� ���
		count1.update(callByReference);
		System.out.println("after : " + callByReference.count);
	}
}
