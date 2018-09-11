// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 단순비교
public class P01_IfCom {
	public static void main(String[] args) {
		
		int k08iA, k08iB;
		
		k08iA = 1; // 첫번째 while의 초기값
		while(true) 
		{
			k08iB = 1; // 두번째 while의 초기값
			while(true) 
			{
				System.out.printf("*");
				if(k08iA == k08iB) {break;} // 두번째 while의 조건식
				k08iB++; // 두번째 while의 증감식
			}
		System.out.printf("\n");
		if(k08iA == 30) break; // 첫번째 while의 조건식
		k08iA++; // 첫번째 while의 증감식
		}
	
		// iB만큼의 별을 찍고 개행하는 것을 30번 반복한다. 
	}
}
