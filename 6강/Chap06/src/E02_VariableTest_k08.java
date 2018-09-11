// 날짜 : 5월 28일 
// 저자 : 송태양
// 제목 : 2. 변수
public class E02_VariableTest_k08 {
	
	// 전역변수
	static int si_k08;
	
	// 지역변수
	public static void add_k08(int i) {
		si_k08++;
		i++;
		System.out.printf("add 메소드에서 si = [%d]\n", si_k08);
		System.out.printf("add 메소드에서 i = [%d]\n", i);
	}
	
	// 지역변수 리턴해주기.
	public static int add2_k08(int i) {
		si_k08++;
		i++;
		System.out.printf("add2 메소드에서 si = [%d]\n", si_k08);
		System.out.printf("add2 메소드에서 i = [%d]\n", i);
		return i;
	}
	
	public static void main(String[] args) {
		int mi;
		
		si_k08 = 1;
		mi = 1;
		System.out.printf("************************************\n");
		System.out.printf("메소드 호출 전 메인에서 si = [%d]\n", si_k08);
		System.out.printf("메소드 호출 전 메인에서 mi = [%d]\n", mi);
		System.out.printf("************************************\n");
		
		add_k08(mi);
		System.out.printf("************************************\n");
		System.out.printf("add 메소드 호출 후 메인에서 si = [%d]\n", si_k08);
		System.out.printf("add 메소드 호출 후 메인에서 mi = [%d]\n", mi);
		System.out.printf("************************************\n");
		
		mi = add2_k08(mi); // 변화된 mi 값을 리턴하여 받음.
		System.out.printf("************************************\n");
		System.out.printf("add2 메소드 호출 후 메인에서 si = [%d]\n", si_k08);
		System.out.printf("add2 메소드 호출 후 메인에서 mi = [%d]\n", mi);
		System.out.printf("************************************\n");
	}
}
