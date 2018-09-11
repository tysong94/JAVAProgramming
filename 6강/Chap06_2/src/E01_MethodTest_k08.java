// 날짜 : 5월 28일 
// 저자 : 송태양
// 제목 : 1. 메소드
public class E01_MethodTest_k08 {
	
	// 메소드 생성
	public static void iamMethod_k08() {	// static 메소드 : 프로그램을 시작하면 바로 쓸 수 있게 함.
		System.out.printf("나는 메소드야~\n");
	}
	
	public static void main(String[] args) {
		// 메소드 사용, 메소드 호출 방법  
		E01_MethodTest_k08.iamMethod_k08(); // 클래스.메소드 : 다른 클래스에 있는 메소드의 경우.
		iamMethod_k08();					// 메소드 : 자기 클래스 안에 있는 메소드의 경우.
	}	

}
