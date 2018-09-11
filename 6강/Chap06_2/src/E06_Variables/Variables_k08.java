package E06_Variables;

public class Variables_k08 {
	
	// 가변인수를 이용한 합계 메소드
	public int sum_k08 (int... ints) {
		int sum = 0;
		for (int i : ints) {
			sum = sum + i;
		}
		return sum;
	}
	
	// 가변인수를 이용한 평균 메소드
	// 중복성을 최대한 줄여라.
	public int ave_k08 (int...ints) {
		int ave = 0;
		int sum = this.sum_k08(ints);
		ave = sum / ints.length;
		
		return ave;
	}
}
