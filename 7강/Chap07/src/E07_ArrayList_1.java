// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 7. ArrayList1
import java.util.ArrayList;

public class E07_ArrayList_1 {
		
	// 출력 코드가 중복되어 메소드로 만듦.
	public static void prints(String str, ArrayList sAL)
	{
		System.out.printf("****************************\n");	// 헤더인쇄
		System.out.printf("%s ArraySize : %d \n", str, sAL.size());		// 출력할 문자, sAL의 크기 인쇄
		for(int i = 0; i < sAL.size(); i++)								// sAL의 모든 인덱스에 대해
		{
			System.out.printf("ArrayList %d = %s\n", i, sAL.get(i));	// 인덱스와 원소값을 출력.
		}	
	}
	
	public static void main(String[] args) {
		
		// ArrayList sAL변수를 선언하고 생성
		ArrayList sAL = new ArrayList();
		
		// 추가 
		// 배열변수.add(값)
		sAL.add("abc");
		sAL.add("abcd");
		sAL.add("efga");
		sAL.add("가나다0");
		sAL.add("1234");
		sAL.add("12rk34");
		//sAL.add(356); -> 자료형이 다르므로 에러남.
		
		prints("추가", sAL);
		
		// 수정 
		// 배열변수.set(인덱스, 수정값);
		sAL.set(3, "내용수정");
		prints("수정", sAL);
		
		// 삭제
		// 배열변수.remove(인덱스);
		sAL.remove(4);
		prints("삭제", sAL);
		
		// 정렬(오름차순)
		// 배열변수.sort(null);
		sAL.sort(null);
		prints("정렬", sAL);
		
		// 모두 삭제
		// 배열변수.claer();
		sAL.clear();
		prints("모두 삭제", sAL);
		
	}
}
