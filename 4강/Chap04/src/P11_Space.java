// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : ���� ����
public class P11_Space {
	public static void main(String[] args) {
		
		for(int space_k08 = 0; space_k08 < 10; space_k08++) 
		{
			for(int num_k08 = 0; num_k08 < space_k08; num_k08++) // space�� ��ŭ ����
			{ 
				System.out.printf(" "); // space�� ��ŭ ������ ��´�.
			}
			System.out.printf("%d\n", space_k08); // ���鿡 ���̾� space���� ����ϰ� ������.
		}
	
	}
}
