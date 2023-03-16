package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class Time {
	//멤버변수가 private 키워드를 사용하게 되면 == 외부접근 불가

	//속성: 시, 분, 초 (인스턴스 변수; 멤버변수)
	private int hour;
	private int minute;
	private int second;

	//▲위와 같이 private을 붙여 변수를 선언하면 시분초를 맞출 수 없음
	//	→ 메소드를 통해서만 클래스 속성의 값을 얻거나 변경할 수 있도록 제공
	//	→→ setters 사용하여 시분초 변경 가능(private으로 묶인 멤버변수를 메서드로 변경할 때 사용)

	public void setHour(int hour) {
		//0~23사이라면 시간 변경 허용
		if (hour<0 || hour>=23)
			return;  //if 조건에 걸리면 return됨(break역할이랑 비슷~)
		this.hour = hour;  //조건에 걸리지 않으면 메서드 값이 출력됨
	}


	public void setMinute(int minute) {
		//0~59사이라면 변수 변경 허용
		if (minute<0||minute>=59)
			return;
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		//0~59사이라면 변수 변경 허용
		if (second<0||second>=59)
			return;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
}
