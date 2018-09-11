//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 13. 접근제어자로 캡슐화하기
package E13_Capsulization_Time1;

import E13_Capsulization_Time.Time_k08;

public class Time1_k08 extends Time_k08 {

	protected Time1_k08(int hour, int minute, int second) {
		super(hour, minute, second);
	}
}
