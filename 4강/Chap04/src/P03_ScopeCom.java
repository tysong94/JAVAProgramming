// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : 범위를 주어 비교(찾기)
public class P03_ScopeCom {
	public static void main(String[] args) {
		
		// 범위를 주어 비교할 땐 부등호를 사용.(>, <, >=, <=)
		// 조건이 여러개일 경우 조건 사이에 &&, || 연산자를 사용.
		int v_k08;
		
		for(int i_k08 = 0; i_k08 < 300; i_k08++) 
		{
			v_k08 = 5 * i_k08;
			// v = 5*i
			
			if(0 <= v_k08 && v_k08 < 10) { System.out.printf("일 %d\n", v_k08); }
			// v가 일의 단위일 때 "일 v" 출력
			
			else if(10 <= v_k08 && v_k08 < 100) { System.out.printf("십 %d\n", v_k08); }
			// v가 십의 단위일 때 "십 v" 출력
			
			else if(100 <= v_k08 && v_k08 < 1000) { System.out.printf("백 %d\n", v_k08); }
			// v가 백의 단위일 때 "일 v" 출력
			
			else { System.out.printf("천 %d\n", v_k08); }
			// v가 그 외의 단위(여기서는 천)일 때 "천 v" 출력 
		}
		
	}
}
