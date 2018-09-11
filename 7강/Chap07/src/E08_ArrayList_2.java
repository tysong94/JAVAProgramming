// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 7. ArrayList2
import java.util.ArrayList;

public class E08_ArrayList_2 {
	public static void main(String[] args) {
		
		int iTestMax = 1000000;
		
		// ArrayList iAL변수 선언, 생성
		ArrayList iAL = new ArrayList();
		
		// iAL변수에 원소 추가하고 출력
		System.out.printf("*******************************\n");
		for(int i = 0; i < iTestMax; i++)
		{
			iAL.add((int)(Math.random() * 1000000));
		}
		for(int i = 0; i < iAL.size(); i++)
		{
			System.out.printf("ArrayList %d = %d\n", i, iAL.get(i));
		}
		
		// iAL변수의 원소 정렬하고 출력
		System.out.printf("*******************************\n");
		iAL.sort(null);
		for(int i = 0; i < iAL.size(); i++)
		{
			System.out.printf("ArrayList %d = %d\n", i, iAL.get(i));
		}
		
	}
}
