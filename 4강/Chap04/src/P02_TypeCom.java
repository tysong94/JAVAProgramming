// ��¥ : 5�� 9��  
// ���� : ���¾�
// ���� : ������, ������ ��
public class P02_TypeCom {
	public static void main(String[] args) {
		
	// ������ ��
		int i_k08;
		double d_k08;
		
		i_k08 = 10/3; // i = 3
		d_k08 = 10/3.0; // d = 3.333...
		
		// int�� double�� ������ ����� �Ǽ��� �����̴�.
		// i = 3.000000 != d = 3.333333...(�񱳽� int�� double�� ����ȯ�Ǿ ���� ������ ����.)
		if(i_k08 == d_k08) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n", (double)i_k08,d_k08); 
		
		// ���� ��ȿ���ڱ��� ǥ�õ� �� ������ �ٸ���.
		// d = 3.333... != 3.333333
		if(d_k08==3.333333) System.out.printf("equal\n");
		else System.out.printf("Not equal[3.333333][%f]\n", d_k08);
		
		// d�� double���� int�� ����ȯ -> �Ҽ��� �ڸ��� ������.
		// d = 3 = i = 3
		d_k08=(int)d_k08;
		if(i_k08==d_k08) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n", (double)i_k08,d_k08);
		
		// i�� int, double�� �μ� -> int�� �Ҽ��� �ڸ� ǥ��x, double�� �Ҽ��� �ڸ� ǥ��o.
		System.out.printf("int�� �μ�[%d][%f]\n", i_k08, d_k08);
		System.out.printf("double�� �μ�[%f][%f]\n", (double)i_k08, d_k08);
		
	// char ��
		// char�� =='����'�� ���� ��. 
		char a_k08='c';
		
		if(a_k08=='b') System.out.printf("a�� b�̴�\n");
		if(a_k08=='c') System.out.printf("a�� c�̴�\n");
		if(a_k08=='d') System.out.printf("a�� d�̴�\n");
		
	// String ��
		// String�� Ŭ���� �Լ� .equals("���ڿ�")�� ���.
		String aa_k08="abcd";
		
		if(aa_k08.equals("abcd")) System.out.printf("aa�� abcd�̴�.\n");
		else System.out.printf("aa�� abcd�� �ƴϴ�.\n");
		
	// boolean ��
		// boolean�� (����) �Ǵ� (!����) �� ���� ��. 
		boolean b_k08=true;
		
		if(!!b_k08) System.out.printf("b�� �ƴϰ� �ƴϸ� ���̴�.\n");
		else System.out.printf("b�� �ƴϰ� �ƴϸ� �����̴�.\n");
		
		
		
	}
}
