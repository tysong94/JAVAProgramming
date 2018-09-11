// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 칸 맞춰 인쇄
import java.text.DecimalFormat;

public class P14_Print {
	public static void main(String[] args) {
		
		String item = "사과";
		int unit_price = 5000; // 단가
		int num = 500; // 수량
		int total = unit_price * num; // 합계
		
		System.out.printf("%4.4s\n", "a"); // 1칸씩 잡아먹음
		System.out.printf("%3.3s\n", "가"); // 1칸을 더 잡아먹는다. -> 칸수를 -1함.
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // 콤마를 찍기 위해 DecimalFormat 클래스 가져옴.
		
		// %20.20s -> 20칸을 먼저 잡고 문자열을 넣어 오른쪽 정렬함.
		
		// 헤더 찍기
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계"); 
		// 한글의 경우 '1칸씩 더' 잡아먹음 -> 2글자 이므로 10-2를 해준 칸을 잡아야 한다.
		System.out.printf("======================================================\n");
				
		// 값 찍기
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", 
				item, df.format(unit_price), df.format(num), df.format(total)); // 품목, 단가, 수량, 합계 출력
		// 숫자는 10칸을 그대로 적어준다.
		System.out.printf("======================================================\n");
		  
	
	}
}
