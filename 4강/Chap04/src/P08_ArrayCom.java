// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : Array이용 비교
public class P08_ArrayCom {
	public static void main(String[] args) {
		
		int[] LMD_k08 = {31,28,31,30,31,30,31,31,30,31,30,31};
		// 각 월의 마지막 일을 배열로 넣음.
		
		for(int m_k08 = 1; m_k08 <= 12; m_k08++) // m이 1 부터 12일 때까지 실행.
		{ 
			System.out.printf("%d월 => ", m_k08); // m을 출력
			for(int d_k08 = 1; d_k08 <= 31; d_k08++) // d가 1부터 31일 때까지 실행.
			{ 
				System.out.printf("%d", d_k08); // d를 출력
				if(d_k08 == LMD_k08[m_k08-1] ) { break; } // m월일 때 d가 마지막 일(배열의 m-1번째 원소)이면 멈춤.
				System.out.printf(","); //마지막 일이 아니면 콤마를 찍음, 마지막 일이면 콤마를 안 찍음
			}
			System.out.printf("\n");
		}
		
	}
}
