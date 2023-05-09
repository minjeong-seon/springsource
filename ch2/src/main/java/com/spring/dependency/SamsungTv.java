package com.spring.dependency;

public class SamsungTv implements TV {
	
	private Speaker speaker;		//has a (포함)관계
	
	//매개변수를 받지 않는 생성자 : default 생성자
	public SamsungTv() {	
		System.out.println("SamsungTV 인스턴스 생성 - default 생성자");
	}
	
	public SamsungTv(Speaker speaker) {
		super();
		this.speaker = speaker;	//멤버변수 초기화
		System.out.println("SamsungTV 인스턴스 생성 - 인자 생성자");
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV - 전원 On");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV - 전원 Off");
	}
	@Override
	public void volumeUp() {
		//System.out.println("SamsungTV - 볼륨 Up");	//Tv에 내장된 스피커 사용
		speaker.volumeUp();		//Sony스피커 사용
	}
	@Override
	public void volumeDown() {
		//System.out.println("SamsungTV - 볼륨 Down");
		speaker.volumeDown();
	}
}
