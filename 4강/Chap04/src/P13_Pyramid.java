// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : �Ƕ�̵� ���
public class P13_Pyramid {
	public static void main(String[] args) {
		
		int star_k08, space_k08;
		
		star_k08 = 1; space_k08 = 20;
		
		while(true)
		{
			for(int i_k08 = 0; i_k08 < space_k08; i_k08++) { System.out.printf(" "); } // space �� ��ŭ ������ �����
			for(int i_k08 = 0; i_k08 < star_k08; i_k08++) { System.out.printf("*"); } // star �� ��ŭ ���� �����.
			System.out.printf("\n"); // ����, �� �� ��� ����
			
			space_k08 = space_k08-1; // space�� ���� �ϳ��� ���δ�.
			star_k08 = star_k08+2; // star�� ���� 2���� �ø���.
			
			if(space_k08 < 0) break; // space�� 0���� ������ ����.(�� 21�� ��� ����.)
		}

	}
}
