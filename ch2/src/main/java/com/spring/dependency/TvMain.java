package com.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {
//	String str = "String";	//	 ==new(인스턴스 생성)와 같은 의미(String 만 new가 없어도 됨)

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("config2.xml");
		TV tv = (TV)ctx.getBean("tv");

		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();


	}
}
