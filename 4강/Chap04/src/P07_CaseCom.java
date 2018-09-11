// 날짜 : 5월 9일  
// 저자 : 송태양
// 제목 : case문 비교
public class P07_CaseCom {
	public static void main(String[] args) {
		
		for(int m_k08 = 1; m_k08 <= 12; m_k08++) // 월 반복문
		{
			System.out.printf("%d월 => ", m_k08);
			LOOP:for(int d_k08 = 1; d_k08 <= 31; d_k08++) // 일 반복문
			//break를 위해 LOOP표시자를 준다.
			{ 
				System.out.printf("%d", d_k08); 
				switch(m_k08) 
				{
				case 4: case 6: case 7: case 9: case 11: 
					if(d_k08 == 30) { break LOOP; } // 조건을 만족할 경우 for 반복문 자체를 멈추어야 하므로 LOOP를 멈춰야함.
					break; // switch문도 멈춤.
				// 4, 6, 7, 9, 11월 일 때 30일에서 멈춤.
				case 2: 
					if(d_k08 == 28) { break LOOP; } 
					break;
				// 2월 일 때 28일에서 멈춤.
				default :
					if(d_k08 == 31) { break LOOP; }
					break;
				// 그외 월일 때 31일이 되면 멈춤.
				}
				System.out.printf(",", d_k08); 
			}
			System.out.printf("\n");
		}
		
	}
}
