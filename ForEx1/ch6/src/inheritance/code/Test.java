package inheritance.code;
//import문: 다른 패키지에 있는 클래스를 사용할 때 필요

import java.util.Date;
import java.util.Scanner;
import exam.Account;
//java.lang 패키지에 있는 클래스를 사용할 때는 import구문 x
//	-->자주 사용하는 패키지는 기본적으로 사용할 수 있도록 되어있음

//접근제어자(modifier) : 멤버 또는 클래스에 사용되어 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한(캡슐화)
// 	=외부로부터 데이터 보호 + 외부에 불필요/내부에서만 사용되는 부분 감추기 위해 사용
//	접근범위:(넓음)-- public > protected > default(생략) > private --(좁읍)
//		사용되는 범위: ->클래스, 멤버변수, 메소드, 생성자
//		
//private : 같은 클래스 내에서만 접근 가능
//default : 같은 패키지 내에서만 접근 가능
//protected : 같은 패키지 내 접근 가능 + 다른 패키지에 있는 자식 클래스에서 접근 가능
//public : 접근 제한이 전혀 없음

//제어자
//	: static, final, abstract, ...etc
//	->static(공통적) : 멤버변수, 메서드, 초기화블럭
//	->final(못바꿈, 최종의 맛) : 클래스, 멤버변수, 지역변수
//	->static final / final static : 공유(공통) 상수
//	->abstract, ... 

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account(null, null, 0);
		
		Date date = new Date();
		
		//
		String str = "Hello";
		
		
	}
}
