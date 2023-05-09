package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {

	public static void main(String[] args) {
//		LgTv lgTv = new LgTv();
//		lgTv.turnOn();
//		lgTv.soundUp();
//		lgTv.soundDown();
//		lgTv.turnOff();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		TV samsungTv = (TV)ctx.getBean("samsung");
		samsungTv.powerOn();
		samsungTv.volumeUp();
		samsungTv.volumeDown();
		samsungTv.powerOff();
		
		TV samsungTv2 = (TV)ctx.getBean("samsung");
		System.out.println(samsungTv == samsungTv2 ? "같음" : "다름");
	}

}
