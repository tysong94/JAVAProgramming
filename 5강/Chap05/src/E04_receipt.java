import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// 날짜 : 5월 14일 
// 저자 : 송태양
// 제목 : 영수증 출력 1
public class E04_receipt {
	public static void main(String[] args) {
		
		// 세금 계산
		int aftertax_k08 = 14000; // 세후 가격
		int taxPercent_k08 = 10; double taxRate_k08 = taxPercent_k08/100.0; // 세율
		
		int pretax_k08, tax_k08; // 세전가격, 세금
		pretax_k08 = (int)(aftertax_k08 / (1 + taxRate_k08)); // 세전가격 = 세후가격 / (1 + 세율) -> int로 내림 처리
		tax_k08 = aftertax_k08 - pretax_k08; // 세금 = 세후가격-세전가격
		// 콤마 찍기
		// DecimalFormat 변수 df로 format 메소드 호출.
		// 사용법 : System.out.printf("%s", df.format(숫자))
		DecimalFormat df = new DecimalFormat();
		
		// 날짜 찍기
		// 시간 가져오기 : 캘린더 변수 cal로 getTime 메소드 호출
		// 시간형을 문자형으로 바꿈 : SimpleDateFormat 변수 sdf로 format 메소드 호출.
		// 사용법 : System.out.printf("%s", sdf.format(cal.getTime))
		// 출력 모양이 다르게 여러번 나오므로 출력형이 다른 여러 변수를 생성하여 사용한다.
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY-MM-dd HH:mm"); 
		
		// 칸맞추기
		// 한글은 화면상 2칸을 차지, 그 외는 1칸
		// 총 41칸
		System.out.printf("\n");
		System.out.printf("              영  수  증\n");
		System.out.printf("=========================================\n");
		System.out.printf("종로상회(분당서현점) 129-17-77924\n");
		System.out.printf("이상철 031 781 1596\n");
		System.out.printf("성남시 분당구 서현동 269-3\n");
		System.out.printf("테이블명 : 12\n");
		System.out.printf("주문번호 : %s 01 00041\n", sdf.format(cal.getTime()));
		System.out.printf("=========================================\n");
		// 8칸(주문합계) + 33칸(숫자) = 41칸
		System.out.printf("주문합계%33.33s\n", df.format(aftertax_k08));
		System.out.printf("할인금액%33.33s\n", df.format(0));
		System.out.printf("받을금액%33.33s\n", df.format(aftertax_k08));
		System.out.printf("=========================================\n");
		// 6칸(한글) + 12칸(숫자) + 5칸(공백) + 6칸(한글) + 12칸(숫자) = 41칸
		System.out.printf("현  금%12.12s     과  세%12.12s\n", df.format(0), df.format(pretax_k08));
		System.out.printf("카  드%12.12s     세  액%12.12s\n", df.format(aftertax_k08), df.format(tax_k08));
		System.out.printf("포인트%12.12s     면  세%12.12s\n", df.format(0), df.format(0));
		System.out.printf("%23.23s영수금액%10.10s\n", "", df.format(aftertax_k08));
		System.out.printf("=========================================\n");
		System.out.printf("         [우리카드 신용 승인]\n");
		System.out.printf("승 인 일 시 : %s\n", sdf2.format(cal.getTime()));
		System.out.printf("카 드 번 호 : 55222059****2021\n");
		System.out.printf("승 인 번 호 : 79753574  할부개월 : 00\n");
		System.out.printf("승 인 금 액 : %s\n", df.format(aftertax_k08));
		System.out.printf("가 맹 번 호 : 730461774  /  비씨카드사\n");
		System.out.printf("사업자 번호 : 129-17-77924\n");
		System.out.printf("=========================================\n");
		System.out.printf("%s CASHIER :           직원\n", sdf3.format(cal.getTime()));
		System.out.printf("=========================================\n");
		System.out.printf("감사 합니다.\n");
		
		
		
		
	}
}
