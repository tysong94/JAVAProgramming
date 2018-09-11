// 날짜 : 5월 16일 
// 저자 : 송태양
// 제목 : 2. 고정길이 필드 추출
import java.text.DecimalFormat;

public class E02_ExtractError {
	public static void main(String[] args) {
		
		// 문자열 배열 선언, 초기화(항목별 배열)
		String[] itemlist = 
		{
			"01  초코에몽180m    3,780    1      3,780",
			"02  BE정장벨트15   15,000    1     15,000", 
			"03  (G)기본고무     2,980    1      2,980", 
			"04* 서울우유 2.3    4,950    1      4,950", 
			"05  그릭 베리믹     5,980    1      5,980", 
			"06  하림 치킨너     8,480    1      8,480", 
			"07  로레일헤어오   13,300    1     13,300", 
			"08  바나나스페셜    5,980    1      5,980", 
			"09  로투스비스킷    2,980    2      5,960", 
			"10  풀무원 치즈&    4,700    1      4,700", 
			"11  균)HG 은사수      990    1          1", 
			"12* 햇감자(국산)    1,440    1      1,440", 
			"13  커피맛우유 2    4,250    1      4,250", 
			"14  트리오 투명     2,750    1      2,750", 
			"15  노브랜드 매     9,800    1      9,800", 
			"16  밀키푸딩커스    2,980    1      2,980", 
			"17* (990)EF양파       990    1         10", 
			"18* 달링다운냉장   10,130    1     10,130", 
			"19* 제주등심카레    4,060    1      4,060", 
			"20  데톨핸드워시    3,900    1      3,900", 
			"21* 냉동블루베리   12,400    2     24,800", 
			"22* 얼갈이김치      5,000    1      5,000", 
			"23* 파김치          5,000    1      5,000", 
			"24* 청송사과 5입    9,800    1      9,800", 
			"25  스판반팔티 R    9,900    1      9,900", 
			"26  DW트렌치코트   39,900    1     39,900", 
			"27* 치키타 슈퍼     5,180    1      5,180", 
			"28* 당근              520    1        520", 
			"29  허쉬초콜릿드    1,000    1      1,000", 
			"30* 락토핏유산균1,000,000    1  1,000,000"	
		};
		
		// String, Int 변수 선언
		String notTotal = ""; // 금액이 아닌 부분 
		
		String priceStr = ""; // 단가 문자열
		String numStr = "";	  // 수량 문자열
		String totalStr = ""; // 금액 문자열
		
		int priceInt = 0;	  // 단가 정수형
		int numInt = 0;		  // 수량 정수형
		int totalInt = 0;	  // 금액 정수형
		
		// 콤마 객체 생성, 변수 선언
		DecimalFormat df = new DecimalFormat();
		
		// 단가, 수량, 금액 문자열 -> 정수형 바꾸고 계산하기. 
		for(int i = 0; i < itemlist.length; i++)
		{
			byte[] itemByte = itemlist[i].getBytes();		// 한 문자열을 바이트 배열로 쪼갬.
			
			notTotal = new String(itemByte, 0, 30);			// 금액이 아닌 부분 문자열.
						
			priceStr = new String(itemByte, 16, 9);			// 단가 문자열(바이트로 잘라냄.)
			priceStr = priceStr.replaceAll(",", "").trim(); // ','와 '공백' 없애기 
			priceInt = Integer.parseInt(priceStr);			// 문자열 -> 정수형
					
			numStr	= new String(itemByte, 25, 5);			// 수량 문자열 -> 정수형(동일하게 시행)
			numStr = numStr.replaceAll(",", "").trim();		
			numInt = Integer.parseInt(numStr);
			
			totalStr = new String(itemByte, 30, 11);		// 금액 문자열 -> 정수형(동일하게 시행)
			totalStr = totalStr.replaceAll(",",  "").trim();
			totalInt = Integer.parseInt(totalStr);
			
			// 오류 찾아내고 수정하고 출력하기.
			if(totalInt != priceInt * numInt)				// 금액이 단가 * 수량과 같지 않으면 
			{
				totalInt = priceInt * numInt;				// 금액을 수정
				totalStr = df.format(totalInt);				// 금액 정수형 -> 문자열(콤마찍음)
				
				System.out.printf("***************************\n");
				System.out.printf("오류[%s]\n", itemlist[i]); 				// 오류 -> 그대로 한 문자열 출력
				System.out.printf("수정[%s%11s]\n", notTotal, totalStr);	// 수정 -> 금액만 바꾸어 넣고 출력
				System.out.printf("***************************\n");
			}
		}
		
//		System.out.println(notTotal);
//		System.out.println(priceInt);
//		System.out.println(numInt);
//		System.out.println(totalInt);
		
	}
}
