// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 숫자 읽기2
public class P10_NumCount2 {
	public static void main(String[] args) {
		
		int iNum_k08 = 1000004567; 

		String sNum_k08 = String.valueOf(iNum_k08); // 문자열 숫자
		String sNumVoice_k08 = ""; // 읽기를 누적하여 작성함.
		System.out.printf("==> %s[%d자리]\n", sNum_k08, sNum_k08.length()); //숫자가 몇자리인지 출력.
		
		String[] units_k08= {"영","일","이","삼","사","오","육","칠","팔","구"}; // 숫자 읽기
		String[] unitx_k08= {"","십","백","천","만","십","백","천","억","십"}; // 단위 읽기
		
		// 초기값 
		int num_k08, digit_k08; 
		num_k08 = 0; // 순서대로의 위치 -> 문자열에서 숫자 가져오기 & 숫자 읽기 가져오기 
		digit_k08 = sNum_k08.length()-1; // 거꾸로의 위치(자리수-1 -> 배열의 인덱스를 맞추기 위함) -> 해당 위치의 단위 읽기 가져오기.
		
		while(true) {
			
			// 탈출 조건식
			if(num_k08 >= sNum_k08.length()) { break; } // 위치가 자리수를 넘어가면 끝냄.(위치는 배열의 인덱스이므로 '0 ~ 자리수-1' 까지 해야한다.)
			
			// 해당 위치의 숫자와 숫자 읽기를 출력.
			System.out.printf("%s[%s]", 
					sNum_k08.substring(num_k08, num_k08+1), // 문자열 숫자에서 해당 위치의 숫자를 가져옴. 
					units_k08[Integer.parseInt(sNum_k08.substring(num_k08,num_k08+1))]); // 배열에서 해당 위치의 숫자읽기를 가져옴.
						
			// 해당 위치의 숫자가 "0"일 때
			if(sNum_k08.substring(num_k08,num_k08+1).equals("0")) 
			{ 
				// 해당 위치의 단위 읽기 가져오기가 "만"이나 "억"일 때 
				if(unitx_k08[digit_k08].equals("만") || unitx_k08[digit_k08].equals("억")) 
				{ 
					if(unitx_k08[digit_k08].equals("만") // 해당 위치의 단위읽기가 "만"이고
							&& sNum_k08.substring(num_k08-3,num_k08+1).equals("0000")) // 그 위의 자리수가 다 0이면 
					{ // 아무것도 안한다.(모두 0이면 단위도 출력하지 않음)
					}
					else 
					{
						sNumVoice_k08 = sNumVoice_k08 + unitx_k08[digit_k08]; // 읽기 = 읽기 + 단위읽기 가져오기	
					}
				}
				// "만"이나 "억"이 아니면
				else 
				{ // 아무것도 안함.(숫자읽기x, 단위읽기x)
				}
			} 
			// 해당 위치의 숫자가 "0"이 아닐 때
			else
			{
				sNumVoice_k08 = sNumVoice_k08 // 읽기 = 읽기 + 숫자읽기 가져오기 + 단위 읽기 가져오기
						+ units_k08[Integer.parseInt(sNum_k08.substring(num_k08,num_k08+1))]
						+ unitx_k08[digit_k08];
			}
			// 증감식
			// 위치를 한칸 옮긴다.(숫자읽기 위치는 ++, 단위읽기 위치는 --)
			num_k08++; digit_k08--;
		}
		// 위치가 자리수를 벗어나면 누적한 읽기를 출력한다.
		System.out.printf("\n%s[%s]\n", sNum_k08, sNumVoice_k08); // '문자열 숫자'와 '[읽기]'를 출력함.
			
	}
}
