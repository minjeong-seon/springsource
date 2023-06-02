package lamda;

/*
 * 람다식
 *  -함수형 언어
 *  -메서드를 하나의 식으로 표현
 *  -익명 클래스 객체
 *  
 *  -함수형 인터페이스 다양하게 제공(java.util.Function)
 */

public class Lamda1 {
	//java method ==> lamda
	//자바 메서드
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	//lamda
	// (int a, int b)->{return a > b ? a : b;}
	//(int a, int b) -> a > b ? a : b   실행할 구문이 1개면 중괄호, 리턴, ; 생략 가능
	//(a, b) -> a > b ? a : b		변수 타입 생략 가능
	
	
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	//lamda
	//(String name, int i) -> {System.out.println(name + "=" + i);}
	//(String name, int i) -> System.out.println(name + "=" + i)
	//(name, i) -> System.out.println(name + "=" + i)
	
	int square(int x) {
		return x*x;
	}
	
	//lamda
	//(int x) -> {return x*x;}
	//(int x) -> x*x
	//(x) -> x*x
	
	int roll() {
		return (int)(Math.random()*6);
	}
	
	//lamda
	//() -> {return (int)(Math.random()*6);}
	//() -> (int)(Math.random()*6)
	
	
}
