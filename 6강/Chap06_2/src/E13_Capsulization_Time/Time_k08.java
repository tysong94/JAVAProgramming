//��¥ : 5�� 28�� 
//���� : ���¾�
//���� : 13. ���������ڷ� ĸ��ȭ�ϱ�
package E13_Capsulization_Time;

public class Time_k08 {
	private int hour;
	private int minute;
	private int second;
	
	// ����Ʈ ������ -> ���� ��Ű�������� ��� ����
	// �ٸ� ��Ű�� �Ϸ��� -> public �Ǵ� protected ���
	
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
