package ch6;
/*
 * 인스턴스 메소드: 인스턴스(객체)를 생성하고 사용해야 함
 * 클래스(static) 메소드: 인스턴스를 생상하지 않고도 바로 사용 가능 ==> 클래스명.메소드명();
 */
public class MyMath {
	long a, b;   //멤버(인스턴스)변수
	
	//멤버변수 사용(인스턴스 메소드)
	long add() {
		return a + b;
	}
	long substrack() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double devide() {
		return a / b;
	}

//	static long add2() {
//		return a + b;
//		//Cannot make a static reference to the non-static field b
//		//	=static 메소드 안에서는 인스턴스 변수를 바로 사용할 수 없음
//	}
	
	
	//기본형 지역변수 사용
	static long add(long a, long b) {
		return a + b;
	}
	static long substrack(long a, long b) {
		return a - b;
	}
	static long multiply(long a, long b) {
		return a * b;
	}
	static double devide(double a, double b) {
		return a / b;
	}
	
	
}
