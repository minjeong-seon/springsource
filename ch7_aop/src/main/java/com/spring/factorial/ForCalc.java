package com.spring.factorial;

import org.springframework.stereotype.Component;

@Component("forc")
public class ForCalc implements Calculator {

	@Override
	public long factorial(long num) {
		//for문으로 factorial 구하기
		long result = 1;
		for (int i = 1; i <= 10; i++) {
			result *= i;
		}
		return result;
	}

}
