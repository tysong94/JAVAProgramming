// ��¥ : 5�� 16�� 
// ���� : ���¾�
// ���� : 7. ArrayList2
import java.util.ArrayList;

public class E08_ArrayList_2 {
	public static void main(String[] args) {
		
		int iTestMax = 1000000;
		
		// ArrayList iAL���� ����, ����
		ArrayList iAL = new ArrayList();
		
		// iAL������ ���� �߰��ϰ� ���
		System.out.printf("*******************************\n");
		for(int i = 0; i < iTestMax; i++)
		{
			iAL.add((int)(Math.random() * 1000000));
		}
		for(int i = 0; i < iAL.size(); i++)
		{
			System.out.printf("ArrayList %d = %d\n", i, iAL.get(i));
		}
		
		// iAL������ ���� �����ϰ� ���
		System.out.printf("*******************************\n");
		iAL.sort(null);
		for(int i = 0; i < iAL.size(); i++)
		{
			System.out.printf("ArrayList %d = %d\n", i, iAL.get(i));
		}
		
	}
}
