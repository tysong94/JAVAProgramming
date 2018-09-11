// 날짜 : 5월 4일 
// 저자 : 송태양
// 제목 : 2. 누적하기

public class E02 {
	public static void main(String[] args) {
				
		// 누적하기
		int k08_sum; // 선언은 앞에서 하는 게 좋다.
		k08_sum=0; // 누적, 루프는 꼭 초기화.
		
		for (int i=1;i<101;i++) 
		{
			k08_sum=k08_sum+i;
		}

		System.out.printf("2-1 : %d\n", k08_sum); // 누적하기(합 구하기)
		System.out.printf("2-2 : %d\n", k08_sum/100); // 평균

		// 배열로 누적하기
		int[] k08_v = {1,2,3,4,5};
		int k08_vSum; 
		k08_vSum = 0;
		
		for(int i=0;i<5;i++)
		{
			k08_vSum=k08_vSum+k08_v[i];
		}
		
		System.out.printf("2-3 : %d\n", k08_vSum); // 배열 원소 누적하기(합 구하기)
	}
}
