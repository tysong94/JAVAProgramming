// ��¥ : 5�� 9�� 
// ���� : ���¾�
// ���� : ������ �־� ��(ã��)
public class P03_ScopeCom {
	public static void main(String[] args) {
		
		// ������ �־� ���� �� �ε�ȣ�� ���.(>, <, >=, <=)
		// ������ �������� ��� ���� ���̿� &&, || �����ڸ� ���.
		int v_k08;
		
		for(int i_k08 = 0; i_k08 < 300; i_k08++) 
		{
			v_k08 = 5 * i_k08;
			// v = 5*i
			
			if(0 <= v_k08 && v_k08 < 10) { System.out.printf("�� %d\n", v_k08); }
			// v�� ���� ������ �� "�� v" ���
			
			else if(10 <= v_k08 && v_k08 < 100) { System.out.printf("�� %d\n", v_k08); }
			// v�� ���� ������ �� "�� v" ���
			
			else if(100 <= v_k08 && v_k08 < 1000) { System.out.printf("�� %d\n", v_k08); }
			// v�� ���� ������ �� "�� v" ���
			
			else { System.out.printf("õ %d\n", v_k08); }
			// v�� �� ���� ����(���⼭�� õ)�� �� "õ v" ��� 
		}
		
	}
}
