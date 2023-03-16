package ch6;

public class Car {
	//멤버변수: 속성(property)
	// 		→제조사, 모델, 색상, 최대속도...etc
	//메서드: 기능(function)
	//  	→전진, 후진
	String company;
	String model;
	String color;
	int maxSpeed;
	
	void forward() {
		System.out.println("전진한다.");
	}
	void backward() {
		System.out.println("후진한다.");
	}
	
	
	
}
