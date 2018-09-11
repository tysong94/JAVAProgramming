// 날짜 : 5월 9일 
// 저자 : 송태양
// 제목 : switch case문
public class E02_switchcase {
	public static void main(String[] args) {
		
		String k08_jumin="123456-1234567";
		
		switch(k08_jumin.charAt(7)) { // string은 사용 불가.
		case '1':
			System.out.println("20세기전 태어난 남자 사람\n");
			//break;
		case '2':
			System.out.println("20세기전 태어난 여자 사람\n");
			//break;
		case '3':
			System.out.println("20세기후 태어난 남자 사람\n");
			//break;
		case '4':
			System.out.println("20세기후 태어난 여자 사람\n");
			//break;
		default :
			System.out.println("사람\n");
			//break;
		}
		//break를 만날 때까지 수행되므로 break를 하지 않으면 한번 실행된 조건부터 마지막까지 모두 실행된다.
	}
}
