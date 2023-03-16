package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class Tv4 {
	//private : 외부접근 불가
	
	private String color;   //색상: 변수 선언
	private int channel;   //채널: 변수 선언
	private boolean power;   //전원: 변수 선언
	//final : 상수(대문자로 표현함)
//	final int volume;
	//final field의 값을 초기화 하지 않으면 아래▼ 오류 발생
		//오류: the blank final field volume may not have been initialized(초기화되지 않았다)
	final int volume=10;
	//final field의 값은 한번만 초기화 할 수 있으므로 반복 시 아래▼ 오류 발생
	//##The final field Tv4.volume cannot be assigned
	//따라서, final은 선언&초기화를 동시에 한번만 진행한다.
	public Tv4() {
		super();
	}

	public Tv4(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
//		this.volume=15;  ←error ##참고
	}

	void power() {
		power=!power;
	}
	
	int channelUp() {
		channel++;
		return channel;
	}
	
	void channelDown() {
		channel--;
	}

	
	
	//Getter & Setter 메서드
	//[Alt+Shift+S]>[Generate getters and setters]>[all box checked]>[generate]
	
	//getters: 변수의 값을 리턴하는 형태
	public String getColor() {
		return color;
	}
	//setters: 변수의 값을 변경하는 형태
	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
//boolean 타입은 is로 시작
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}


}
