package com.spring.factorial;

import org.springframework.stereotype.Component;

@Component("rec")
public class RecCalc implements Calculator {

	@Override
	public long factorial(long num) {
		//재귀호출 : 메소드 안에서 자기 메소드를 호출하면서 최근에 자신을 부른 원래 함수가 스택에 차곡차곡 쌓이게 됨
		//(https://marobiana.tistory.com/79 참고하면 이해하기 쉽다.)
		//재귀호출로 factorial 구하기
		if(num==0) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}
}
