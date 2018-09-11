// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 5. 배열의 최대, 최소값 찾기
public class E05_Array_MaxMin {
	public static void main(String[] args) {
		
		int[] iArray = { 1, 7, 2, 3, 5, 11, 212, 33, 44, 78, 2121, 11, 5, 18, 0, 1 };
		
		for(int i = 0; i < iArray.length; i++)
		{
			System.out.printf("iArray[%d] = %d\n", i, iArray[i]);
		}
		
		// Max 찾기
		int iMaxPt = 0;			// 처음 위치
		int iMax = iArray[0];	// 처음 배열값
				
		for(int i = 0; i < iArray.length; i++)	// 모든 원소에 대하여
		{
			if(iMax < iArray[i])				// iMax의 기존값보다 해당 원소값이 크면
			{
				iMaxPt = i;						// iMaxPt의 기존의 위치를 해당 위치로 바꿈
				iMax = iArray[i];				// iMax의 기존값을 해당 원소값으로 바꿈
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", iMaxPt, iMax);	// 최종 최대값의 위치와 값을 출력한다.
		
		// Min 찾기
		int iMinPt = 0;			// 처음 위치
		int iMin = iArray[0];	// 처음 배열값
				
		for(int i = 0; i < iArray.length; i++)	// 모든 원소에 대하여
		{
			if(iMin > iArray[i])				// iMin의 기존값보다 해당 원소값이 작으면
			{
				iMinPt = i;						// iMinPt의 기존의 위치를 해당 위치로 바꿈
				iMin = iArray[i];				// iMin의 기존값을 해당 원소값로 바꿈
			}
		}
		System.out.printf("MIN : iArray[%d] = %d\n", iMinPt, iMin);	// 최종 최소값의 위치와 값을 출력한다.

		
		
	}
}
