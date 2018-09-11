// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 비정형 비교3
public class P06_AtypicalCom3 {
	public static void main(String[] args) {
		
		for(int m_k08 = 1; m_k08 < 13; m_k08++) // 월 반복문
		{
			System.out.printf("%d월 => ", m_k08);
			for(int d_k08 = 1; d_k08 < 32; d_k08++) // 일 반복문 
			{
				System.out.printf("%d", d_k08);
								
				if((m_k08 == 4 || m_k08 == 6 || m_k08 == 7 || m_k08 == 9 || m_k08 == 11) && (d_k08==30)) { break; }
				// 4, 6, 7, 9, 11월 일 때 30일에서 멈춤.
				if((m_k08 == 2) && (d_k08 == 28)) { break; }
				// 2월 일 때 28일에서 멈춤.
				if(d_k08 == 31) { break; } 
				// 31일이 되면 멈춤.
				
				// 비정형 비교 2에서  중첩 if의 각 조건식을 한 조건문에서 && 연산자로 묶음.
																
				System.out.printf(",", d_k08);
				// 끝나지 않으면 콤마를 찍는다.
			}
			System.out.printf("\n");
		}
		
	}
}

