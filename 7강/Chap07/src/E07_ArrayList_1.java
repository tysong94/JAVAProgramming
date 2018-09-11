// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 7. ArrayList1
import java.util.ArrayList;

public class E07_ArrayList_1 {
		
	// ��� �ڵ尡 �ߺ��Ǿ� �޼ҵ�� ����.
	public static void prints(String str, ArrayList sAL)
	{
		System.out.printf("****************************\n");	// ����μ�
		System.out.printf("%s ArraySize : %d \n", str, sAL.size());		// ����� ����, sAL�� ũ�� �μ�
		for(int i = 0; i < sAL.size(); i++)								// sAL�� ��� �ε����� ����
		{
			System.out.printf("ArrayList %d = %s\n", i, sAL.get(i));	// �ε����� ���Ұ��� ���.
		}	
	}
	
	public static void main(String[] args) {
		
		// ArrayList sAL������ �����ϰ� ����
		ArrayList sAL = new ArrayList();
		
		// �߰� 
		// �迭����.add(��)
		sAL.add("abc");
		sAL.add("abcd");
		sAL.add("efga");
		sAL.add("������0");
		sAL.add("1234");
		sAL.add("12rk34");
		//sAL.add(356); -> �ڷ����� �ٸ��Ƿ� ������.
		
		prints("�߰�", sAL);
		
		// ���� 
		// �迭����.set(�ε���, ������);
		sAL.set(3, "�������");
		prints("����", sAL);
		
		// ����
		// �迭����.remove(�ε���);
		sAL.remove(4);
		prints("����", sAL);
		
		// ����(��������)
		// �迭����.sort(null);
		sAL.sort(null);
		prints("����", sAL);
		
		// ��� ����
		// �迭����.claer();
		sAL.clear();
		prints("��� ����", sAL);
		
	}
}
