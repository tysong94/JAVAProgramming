// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 4. 구분자 필드 추출 2
public class E04_ExtractSplit2 {
	
	public static String sNumRead(String sNum) 
	{
			String sNumRead = "";	// 읽기를 누적하여 작성함.
						
			String[] readNum = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"}; // 숫자 읽기
			String[] readUnit= {"",   "십", "백", "천", "만", "십", "백", "천", "억", "십"}; // 단위 읽기
			
			// 인덱스 초기값.
			int index, readUnitIndex; 
			index = 0;						// 순서대로의 위치 -> 문자열에서 숫자 가져오기 & 숫자 읽기 가져오기 
			readUnitIndex = sNum.length()-1;// 거꾸로의 위치(자리수-1 -> 배열의 인덱스를 맞추기 위함) -> 해당 위치의 단위 읽기 가져오기.
			
			
			while(true) {
				
				// 탈출 조건식
				if(index >= sNum.length()) // 자리수를 넘어가면 끝냄.
				{ 
					break; 
				}
				
				// 해당 위치의 숫자가 "0"일 때
				if(sNum.substring(index,index+1).equals("0")) 
				{ 
					// 해당 위치의 단위 읽기 가져오기가 "만"이나 "억"일 때 
					if(readUnit[readUnitIndex].equals("만") || readUnit[readUnitIndex].equals("억")) 
					{ 
						if (sNum.length() > 8 && readUnit[readUnitIndex].equals("만") && sNum.substring(index-3, index+1).equals("0000")) {
							
						} else {
							sNumRead = sNumRead + readUnit[readUnitIndex];
						}
						// 읽기 = 읽기 + 단위읽기 가져오기	
					}
					// "만"이나 "억"이 아니면
					else 
					{ // 아무것도 안함.(숫자읽기x, 단위읽기x)
					}
				} 
				// 해당 위치의 숫자가 "0"이 아닐 때
				else
				{
					sNumRead = sNumRead // 읽기 = 읽기 + 숫자읽기 가져오기 + 단위 읽기 가져오기
							+ readNum[Integer.parseInt(sNum.substring(index,index+1))]
							+ readUnit[readUnitIndex];
				}
				// 증감식
				// 위치를 한칸 옮긴다.(숫자읽기 위치는 ++, 단위읽기 위치는 --)
				index++; readUnitIndex--;
			}
			// 위치가 자리수를 벗어나면 누적한 읽기를 출력한다.
			
			return sNumRead;
	}
	
		
	public static void main(String[] args) {
		
		String[] data = 
		{
				"구  분,일반인,어린이,청소년,기  타",
				"서울,4650852,33687,302942,438487",
				"부산,887382,7605,78249,100000000",
				"대구,412557,6826,88361,4891",
				"인천,732950,7407,89892,47337",
				"광주,195723,2154,36617,3934",
				"대전,226276,3339,33324,67",
				"울산,131883,1388,23391,117",
				"세종,8381,127,1143,21",
				"경기,3058839,25172,311296,181143",
				"강원,76747,1374,17349,583",
				"충북,117505,829,20523,0",
				"충남,111603,1740,29569,3",
				"전북,90102,729,16710,0",
				"전남,193230,3312,46166,13",
				"경북,133707,3367,34359,949",
				"경남,209266,2643,45865,0",
				"제주,37889,2702,13087,60"
		};
		
		System.out.println(sNumRead("1000000000"));
		
		System.out.printf("대중교통 이용자유형별 이용인원(2014)\n");
		
		// 첫번째 문자열(필드명) ,로 나누어 문자열 배열 만듦.
		String[] field_name = data[0].split(",");
				
		// 나머지 문자열(데이터)
		for(int i = 1; i < data.length; i++)
		{
			String[] field = data[i].split(",");							// 해당 문자열을 ,로 나누어 문자열 배열로 만듦.
			System.out.printf("************************************\n");	
			for(int j = 0; j < field_name.length; j++)						// 처음 필드부터 마지막 필드까지.
			{
				if(j == 0)
				{ 
					System.out.printf(" %s : %s\n", field_name[j], field[j] );  // 필드명(첫번째문자열)과 필드(해당 문자열)를 출력.
				}
				else
				{ 
					System.out.printf(" %s : %s\n", field_name[j], sNumRead(field[j]));
				}
			}
			System.out.printf("************************************\n");
		}
		
	}
}
