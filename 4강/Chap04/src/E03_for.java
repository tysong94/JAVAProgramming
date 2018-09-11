// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : for문
public class E03_for {
	public static void main(String[] args) {
		
		// 기본 for문
		// i가 0부터 9일 때까지 누적.
		int k08sum=0;
		for(int i=0;i<10;i++) { 
			k08sum=k08sum+i;
		}
		System.out.printf("sum %d\n", k08sum);
	
		// 복합 for문
		// i의 범위 X j의 범위 만큼 반복문이 실행됨.
		// i=1일 때 j=1...9, i=2일때 j=1...9 ...와 같이 반복된다. 
		for(int k08i=1;k08i<10;k08i++) {
			System.out.printf("*********************\n");
			System.out.printf("     구구단 %d단\n", k08i);
			System.out.printf("*********************\n");
			for(int k08j=1;k08j<10;k08j++) {
				System.out.printf(" %d * %d = %d\n", k08i, k08j, k08i*k08j);
			}
		}
	
	}
}
