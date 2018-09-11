//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 13. 접근제어자로 캡슐화하기
package E13_Capsulization_Main;

import E13_Capsulization_Time.Time_k08;

public class Main_k08 {
	public static void main(String[] args) {

		Time_k08 t = new Time_k08(12, 35, 30);
		System.out.println(t);
		
		t.setHour(t.getHour() + 1);
		System.out.println(t);
	}
}
