package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Spring Framework
//	인스턴스를 생성하고 관리함 : 모든 인스턴스를 생성,관리하지는 않고 저장한 인스턴스만 처리
//												인스턴스 생성 : singleton 방식으로 생성하기

public class HelloApp {

	public static void main(String[] args) {
		
		System.out.println("======= 컨테이너 구동 전 =======");
		
		//src/main/resource ==> classpath
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println("======= 컨테이너 구동 후 =======");
		MessageBean msg = new MessageBeanEn();
		msg.sayHello("홍길동");

		
	}

}
