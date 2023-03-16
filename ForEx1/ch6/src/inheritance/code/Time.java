package inheritance.code;
/*접근제어자: 캡슐화
 * 외부로부터의 데이터 보호
 * 외부에 불필요하고 내부적으로만 사용하는 부분을 감추기 위함
 * 
 */
public class Time {
	private int hour;
	public int minute;
	public int second;
	
	//set메서드 : 매개변수에 지정된 값을 검사하여 조건에 맞을 때만 멤버변수의 값을 변경함
	
	public void setHour(int hour) {
		if (hour<0||hour>23) return;
		//0~23 사이일 때만 실행
		this.hour = hour;
	}
	
	//get메서드 : 멤버변수의 값을 읽는 메서드
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if (hour<0||minute>59) return;
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if (hour<0||second>59) return;
		this.second = second;
	}
	
	
	

}