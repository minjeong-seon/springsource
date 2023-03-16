package ch3;

import java.util.Scanner;

// Math,random()으로 임의의 정수 만들기

public class SwitchEx4 {
	public static void main(String[] args) {
		//+, -, *, /, %
		
		//Math.random()을 이용하여 사용자로부터 두 개의 피연산자와 연산자를 입력받기
		//연산을 수행한 후 출력
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력하세요");
		String operator = sc.nextLine();   //--> ""으로 연산자를 입력받기 위한 식
		System.out.print("두 번째 숫자를 입력하세요");
		int num2 = Integer.parseInt(sc.nextLine());
		int result = 0;
		switch (operator) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		default:
			result=num1%num2;
			break;
		}
		System.out.printf(("%d %s %d = %d"), num1, operator, num2, result);
		//System.out.println ver : System.out.println(num1+operator+num2+ "="+result);
	}

}
