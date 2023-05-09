package com.spring.basic;

public class SamsungTv implements TV {
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
		System.out.println("SamsungTV - 볼륨 Up");
	}
	@Override
	public void volumeDown() {
		System.out.println("SamsungTV - 볼륨 Down");
	}
}
