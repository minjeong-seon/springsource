package com.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {
//	String str = "String";	//	 ==new(인스턴스 생성)와 같은 의미(String 만 new가 없어도 됨)

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//		TV tv = (TV)ctx.getBean("samsungTv");		@component로 생성 시 id는 클래스명 사용(앞자리 소문자)
		TV tv = (TV)ctx.getBean("tv");	// @Component("tv")
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();


	}
}
