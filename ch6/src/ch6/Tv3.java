package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class Tv3 {
	//private : 외부접근 불가
	
	private String color;   //색상: 변수 선언
	private int channel;   //채널: 변수 선언
	private boolean power;   //전원: 변수 선언
	
	
	public Tv3(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
	}

	public Tv3() {
		super();
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
