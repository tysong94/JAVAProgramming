//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 16. CallBy
package E16_CallBy;

class Count1_k08 {
	public void update (CallByReference_k08 callByReference) {
		callByReference.count++;
	}
}

public class CallByReference_k08 {
	int count = 0;
	
	public static void main(String[] args) {
		// 객체, 인스턴스 생성
		CallByReference_k08 callByReference = new CallByReference_k08();
		Count1_k08 count1 = new Count1_k08();
		
		// 값 출력
		System.out.println("before : " + callByReference.count);
		
		// 객체 메소드 실행 후 값 출력
		count1.update(callByReference);
		System.out.println("after : " + callByReference.count);
	}
}
