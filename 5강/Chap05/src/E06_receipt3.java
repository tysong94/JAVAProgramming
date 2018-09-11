import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// 날짜 : 5월 14일 
// 저자 : 송태양
// 제목 : 영수증 출력 3
public class E06_receipt3 {
	
////////// 칸 맞추기 메소드 ////////////////////////////////////////////////////////////////////////	
	
	// 문자열의 칸 계산(바이트 계산) 메소드
	public static int getByteSize(String str) 
	{
	    int en = 0;
	    int ko = 0;
	    int etc = 0;
	    
	    char[] string = str.toCharArray(); 								// 문자열 -> 문자 배열			

	   
	    for (int j = 0; j < string.length; j++) 						// 첫번째 문자부터 맨 마지막 문자까지 바이트 누적.			
	    {
	    	if (string[j] >= 'A' && string[j] <= 'z') 					// 영어이면 영어 1바이트 누적
	        { en++; }   
	        else if (string[j] >= '\uAC00' && string[j] <= '\uD7A3') 	// 한글이면 한글 2바이트 누적
	        { ko++; ko++; }
	        else 														// 그외이면 그외 1바이트 누적
	        { etc++; }													
	    }
	   
	    return (en + ko + etc);											// 총 바이트를 더하여 반환한다.							
	}
	
	// 문자열 -> 12바이트 문자열
	public static String String12Byte(String str) 
	{
	    int en = 0;
	    int ko = 0;
	    int etc = 0;
	    int count = 0;

	    
	    char[] charArr = str.toCharArray(); 							// 문자열 -> 문자 배열

	    
    	for (int j = 0; j < charArr.length; j++) 						// 문자열을 12바이트까지 누적하고 해당 글자수를 계산
	    {
	       	if (charArr[j] >= 'A' && charArr[j] <= 'z') 					
	       	{ en++; }					
	        else if (charArr[j] >= '\uAC00' && charArr[j] <= '\uD7A3') 
	        { ko++; ko++; }	
	        else 														
	        { etc++; }														
	         
	        if(en + ko + etc < 12) { count = j; }						// 12바이트 미만이면 글자수 반환	
	        if(en + ko + etc == 12) { count = j; break; } 				// 12바이트가 되면 멈추고 해당 글자수 반환
	        else if(en + ko + etc == 13) { count = j - 1; break; }		// 13바이트가 되면 멈추고 해당 글자수 -1 반환
	    }
	    
	    
	    char[] charArr12 = new char[count+1];							// 12바이트로 쪼갠 문자 -> 배열에 다시 넣음(12바이트가 된 글자수만큼)
	    for(int i = 0; i < count+1; i++) { charArr12[i] = charArr[i]; }

	    str = String.valueOf(charArr12); 								// 문자 배열(12바이트 이하) -> 문자열 재조합 
	      
	    return str; 													// 자른 문자열 반환.
	}
	
	// 12바이트 문자열 공백맞추기
	public static String BlankInsert(String str)
	{
		
		if(getByteSize(str) < 11)							// 문자열이 11바이트 미만이면 
		{
			String blank = "";								// 기존 문자열 + 남은 바이트만큼 공백
			for(int i = 1; i <= 12 - getByteSize(str); i++)
			{
				blank = blank + " ";
			}
			str = str + blank;
		}
		else if(getByteSize(str) == 11)						// 문자열이 11바이트이면
		{
			str = str + " ";								// 기존 문자열 + 1바이트 공백
		}
		else 												// 문자열이 12바이트이면
		{
		}													// 아무것도 안함.
		
		return str;											// 
	}
	
/////////// 메인 메소드 //////////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {

		// 변수 선언, 초기화 //////////////////////////////////////////////////////////////////////
		
		// 상품명배열
		String[] itemname_k08 = 
		{
			"초코에몽180ml*4", "BE정장벨트15F-16BK", "(G)기본고무줄4-7", "서울우유 2.3L", "그릭 베리믹스95g#8", "하림 치킨너겟480+1", "로레일헤어오일브라", "바나나스페셜 240ml", "로투스비스킷312.5G", "풀무원 치즈&치즈", 
			"균)HG 은사수세미 2", "햇감자(국산)", "커피맛우유 240ML*4", "트리오 투명한생각", "노브랜드 매일채움", "밀키푸딩커스터드2", "(990)EF양파", "달링다운냉장꾸리살", "제주등심카레용", "데톨핸드워시리필20",
			"냉동블루베리1.13kg", "얼갈이김치", "파김치", "청송사과 5입/봉", "스판반팔티 R넥BLAC", "DW트렌치코트NAVYS", "치키타 슈퍼프리미", "당근", "허쉬초콜릿드링크", "락토핏유산균" 
		};
		
		// 단가 배열
		int[] priceArr_k08 = 
		{ 
			3780, 15000, 2980, 4950, 5980, 8480, 13300, 5980, 2980, 4700, 
			990, 1440, 4250, 2750, 9800, 2980, 990, 10130, 4060, 3900, 
			12400, 5000, 5000, 9800, 9900, 39900, 5180, 520, 1000, 1000000,
		};
		
		// 수량 배열
		int[] numArr_k08 = 
		{ 
			1, 1, 1, 1, 1, 1, 1, 1, 2, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			2, 1, 1, 1, 1, 1, 1, 1, 1, 1 
		}; 
		
		// 면세여부 배열
		boolean[] taxFreeArr_k08 = 
		{ 
			false, false, false, true, false, false, false, false, false, false,
			false, true, false, false, false, false, true, true, true, false,	
			true, true, true, true, false, false, true, true, false, false,
		};
		
		// * 배열 (면세여부에 따른)
		String[] star_k08 = new String[taxFreeArr_k08.length];
		for(int i = 0; i < taxFreeArr_k08.length; i++)
		{
			if(taxFreeArr_k08[i] == true)
			{
				star_k08[i] = "*"; 
			}
			else
			{
				star_k08[i] = "";
			}
		}
		
		// 세금계산 ////////////////////////////////////////////////////////////////////////////	
		
		// 총액 계산
		int totalPrice_k08 = 0;
		for(int i = 0; i < priceArr_k08.length; i++)
		{
			totalPrice_k08 += priceArr_k08[i] * numArr_k08[i];
		}
				
		// 면세물품 가격
		int taxFreePrice_k08 = 0;
		for(int i = 0; i < priceArr_k08.length; i++)
		{
			if(taxFreeArr_k08[i] == true)
			{
				taxFreePrice_k08 += priceArr_k08[i] * numArr_k08[i];
			}
		}
				
		// 과세물품 세후 가격
		int taxPrice_k08 = totalPrice_k08 - taxFreePrice_k08;
				
		// 과세물품 세금 계산
		int aftertax = taxPrice_k08; // 세후 가격
		int taxPercent = 10; double taxRate = taxPercent/100.0; // 세율
		int pretax, tax; // 세전가격, 세금
		pretax = (int)(aftertax / (1 + taxRate)); // 세전가격 = 세후가격 / (1 + 세율) -> int로 내림 처리
		tax = aftertax - pretax; // 세금 = 세후가격-세전가격
				
		// 포맷 설정 /////////////////////////////////////////////////////////////////////////	
			
		// 콤마 찍기
		// DecimalFormat 변수 df로 format 메소드 호출.
		// 사용법 : System.out.printf("%s", df.format(숫자))
		DecimalFormat df = new DecimalFormat();
		
		// 날짜 찍기
		// 시간 가져오기 : Calendar 변수 cal로 getTime 메소드 호출
		// 시간형을 문자형으로 바꿈 : SimpleDateFormat 변수 sdf로 format 메소드 호출.
		// 사용법 : System.out.printf("%s", sdf.format(cal.getTime))
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");

		// 출력 //////////////////////////////////////////////////////////////////////////////
		System.out.printf("emart         이마트 죽전점 (031)888-1234\n");
		System.out.printf("              206-86-50913               \n");
		System.out.printf("              용인시 수지구 도은대로 552 \n");
		System.out.printf("영수증 미지참시 교환/환불 불가(30일내)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드지참)\n");
		System.out.printf("체크카드/신용카드 청구취소 반영은\n");
		System.out.printf("최대 3~5일 소요 (주말, 공휴일제외)\n");
		System.out.printf("\n");
		System.out.printf("[구 매]%s     POS:0009-2418\n", sdf.format(cal.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("    상 품 명         단가 수량       금액\n");
		System.out.printf("-----------------------------------------\n");
		for(int i = 0; i < priceArr_k08.length; i++)
		{
			System.out.printf("%02d", i+1); 					 						// 번호 -> 2칸 
			System.out.printf("%-2s", star_k08[i]); 				 					// * -> 2칸 
			System.out.printf("%s", BlankInsert(String12Byte(itemname_k08[i])));		// 상품명 -> 12칸
			System.out.printf("%9.9s", df.format(priceArr_k08[i])); 					// 단가 -> 9칸(1,000,000)
			System.out.printf("%5.5s", df.format(numArr_k08[i])); 						// 수량 -> 5칸(1,000)
			System.out.printf("%11.11s\n", df.format(priceArr_k08[i]*numArr_k08[i])); 	// 금액 -> 11칸(100,000,000)
		}
		System.out.printf("            (*)면 세  물 품%14.14s\n", df.format(taxFreePrice_k08));
		System.out.printf("               과 세  물 품%14.14s\n", df.format(pretax));
		System.out.printf("               부   가   세%14.14s\n", df.format(tax));
		System.out.printf("               합        계%14.14s\n", df.format(totalPrice_k08));
		System.out.printf("결 제 대 상 금 액%24.24s\n", df.format(totalPrice_k08));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0024 하  나           5417**8890/07850246\n");
		System.out.printf("카드결제%30.30s\n", "일시불 / " + df.format(totalPrice_k08));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("홍*두 고객님의 포인트 현황입니다.", "");
	}
}
