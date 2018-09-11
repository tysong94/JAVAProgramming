//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 16. CallBy
package E16_CallBy;

class Count_k08 {
	public void update (int count) {
		count++;
	}
}

public class CallByValue_k08 {
	int count = 0;
	
	public static void main(String[] args) {
		// 객체, 인스턴스 생성
		CallByValue_k08 callByValue = new CallByValue_k08();
		Count_k08 count = new Count_k08();
		
		// 값 출력
		System.out.println("before : " + callByValue.count);
				
		// 객체 메소드 실행 후 값 출력
		count.update(callByValue.count);
		System.out.println("after : " + callByValue.count);
	}
}
