package com.spring.basic;

public class TvMain {

	public static void main(String[] args) {
//		LgTv lgTv = new LgTv();
//		lgTv.turnOn();
//		lgTv.soundUp();
//		lgTv.soundDown();
//		lgTv.turnOff();
		
		TV samsungTv = new LgTv();
		samsungTv.powerOn();
		samsungTv.volumeUp();
		samsungTv.volumeDown();
		samsungTv.powerOff();
	}

}
