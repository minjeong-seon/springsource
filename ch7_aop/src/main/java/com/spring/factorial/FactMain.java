package com.spring.factorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// AOP : 횡단관심사를 프레임워크로 처리하는 것
// 주된 관심사 : factorial 구하기
// 횡단 관심사 : rec와 forc 중 어떤 방법이 더 빠른지/시간이 얼마나 걸리는지?

public class FactMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Calculator cal = (Calculator) ctx.getBean("rec");
		System.out.println("===========================");
		System.out.println("10 ! = "+cal.factorial(10));
		//55000
		
		cal=(Calculator) ctx.getBean("forc");
		System.out.println("===========================");
		System.out.println("10 ! = "+cal.factorial(10));
		// 8400
		
		
	}
}
