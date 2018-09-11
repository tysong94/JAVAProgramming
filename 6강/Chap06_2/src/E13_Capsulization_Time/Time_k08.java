//날짜 : 5월 28일 
//저자 : 송태양
//제목 : 13. 접근제어자로 캡슐화하기
package E13_Capsulization_Time;

public class Time_k08 {
	private int hour;
	private int minute;
	private int second;
	
	// 디폴트 접근자 -> 같은 패키지에서만 사용 가능
	// 다른 패키지 하려면 -> public 또는 protected 사용
	
	public Time_k08(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) return;
		this.second = second;
	}

	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
}
