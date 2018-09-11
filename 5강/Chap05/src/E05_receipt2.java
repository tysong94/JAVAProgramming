import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// 날짜 : 5월 14일 
// 저자 : 송태양
// 제목 : 영수증 출력 2
public class E05_receipt2 {
	public static void main(String[] args) {
		
		String itemname1_k08, itemname2_k08; // 품목
		String itemcode1_k08, itemcode2_k08; // 품목코드
		int price1_k08, price2_k08; // 단가
		int num1_k08, num2_k08; // 수량
		
		// 품목1 내용
		itemname1_k08 = "풀무원샘물";
		itemcode1_k08 = "8809169718205";
		price1_k08 = 1000;
		num1_k08 = 1;
		
		// 품목2 내용
		itemname2_k08 = "바나나요구르트";
		itemcode2_k08 = "8809169213444";
		price2_k08 = 1600;
		num2_k08 = 1;
				
		// 세금 계산
		int aftertax = (price1_k08 * num1_k08) + (price2_k08 * num2_k08); // 세후 가격
		int taxPercent = 10; double taxRate = taxPercent/100.0; // 세율
		int pretax, tax;
		pretax = (int)(aftertax / (1+taxRate));
		tax = aftertax - pretax; // 세금 = 세후가격-세전가격
		
		// 세전가격 = 세후가격 / (1 + 세율) -> int로 내림 처리

		// 콤마 찍기
		// DecimalFormat 변수 df로 format 메소드 호출.
		// 사용법 : System.out.printf("%s", df.format(숫자))
		DecimalFormat df = new DecimalFormat();
		
		// 날짜 찍기
		// 시간 가져오기 : Calendar 변수 cal로 getTime 메소드 호출
		// 시간형을 문자형으로 바꿈 : SimpleDateFormat 변수 sdf로 format 메소드 호출.
		// 사용법 : System.out.printf("%s", sdf.format(cal.getTime))
		// 출력 모양이 다르게 여러번 나오므로 출력형이 다른 여러 변수를 생성하여 사용한다.
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY/MM/dd"); 
		
		// 칸 맞추기
		// 한글은 화면상 2칸을 차지, 그 외는 1칸
		// 총 41칸
		System.out.printf("충주(양평)휴게소\n");
		System.out.printf("충북충주시가금면용전리380-4\n");
		System.out.printf("최병권 677-85-00239 TEL:043-857-9929\n");
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("[정상등록]%s 190049   POS번호: 0002\n", sdf.format(cal.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("품목코드              단가  수량     금액\n");
		System.out.printf("-----------------------------------------\n");
		// 19칸(품목코드) + 7칸(단가) + 6칸(수량) + 9칸(금액) = 41칸
		System.out.printf("%s\n", itemname1_k08);
		System.out.printf("%-19.19s%7.7s%6.6s%9.9s\n", itemcode1_k08, df.format(price1_k08), df.format(num1_k08), df.format(price1_k08 * num1_k08));
		System.out.printf("%s\n", itemname2_k08);
		System.out.printf("%-19.19s%7.7s%6.6s%9.9s\n", itemcode2_k08, df.format(price2_k08), df.format(num2_k08), df.format(price2_k08 * num2_k08));
		System.out.printf("\n");
		// 14칸(한글) + 27칸(숫자) = 41칸
		System.out.printf("과세 물품 합계%27.27s\n", df.format(pretax));
		System.out.printf("부    가    세%27.27s\n", df.format(tax));
		System.out.printf("합          계%27.27s\n", df.format(aftertax));
		System.out.printf("026-비씨카드사%27.27s\n", "00/00A");
		// 16칸(한글 :) + 25칸(숫자) = 41칸
		System.out.printf("카  드  번  호 :%25.25s\n", "5522-20**-****-BADD");
		System.out.printf("카  드  매  출 :%25.25s\n", df.format(aftertax));
		System.out.printf("거  래  구  분 :%22.22s\n", "일시불");
		System.out.printf("카  드  번  호 :%25.25s\n", "04-KICC         75549250");
		System.out.printf("가 맹 점 번 호 :%25.25s\n", "");
		System.out.printf("받  은  금  액 :%25.25s\n", df.format(aftertax));
		System.out.printf("거    스    름 :%25.25s\n", df.format(0));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("주문번호 :      0920\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("판매원 : 000002 편의점2\n");
		System.out.printf("%s-0002-0922\n", sdf2.format(cal.getTime()));
		System.out.printf("연동모듈:[00138705  %s190049]\n", sdf.format(cal.getTime()));
			
	}
}
