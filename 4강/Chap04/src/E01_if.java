// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : if문
public class E01_if {
	public static void main(String[] args) {
		
		int k08_score = 70;
		int k08_num = 0;
		
		//if(스코프 생략 -> 실행문이 한 줄 일때 가능.)
		if(k08_score>60) 
			System.out.println("합격입니다.");
		
		//if
		if(k08_score>60) {
			System.out.println("합격입니다."); // 조건이 참이면 실행
		}
		
		//if ~ else
		if(k08_score>60) {
			System.out.println("합격입니다."); // 조건이 참이면 실행
		} else {
			System.out.println("불합격입니다."); // 조건이 거짓이면 실행
		}
		
		//if ~ else if ~ else
		if(k08_num>0) {
			System.out.println("양수입니다."); // 조건1이 참이면 실행
		} else if(k08_num<0) {
			System.out.println("음수입니다."); // 조건1이 거짓이고 조건 2가 참이면 실행
		} else {
			System.out.println("영입니다."); // 조건1, 2 모두 충족하지 않으면 실행
		}
		
		if(k08_score>=90) {
			System.out.println("A등급"); // 조건1이 참이면 실행
		} else if(k08_score>=80 && k08_score<90) {
			System.out.println("B등급"); // 조건1이 거짓이고 조건 2가 참이면 실행
		} else if(k08_score>=70 && k08_score<80) {
			System.out.println("C등급"); // 조건1, 2가 거짓이고 조건 3이 참이면 실행
		} else {
			System.out.println("F등급"); // 조건을 모두 충족하지 않으면 실행
		}
		
	}
}
