package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class Car2 {
	//※멤버변수: 속성(property)
	// 		→제조사, 모델, 색상, 최대속도...etc
	//※메서드: 기능(function)
	//  	→전진, 후진
	String company;
	String model;
	String color;
	int maxSpeed;

	//※생성자	
	//[source-generate constructor using fields-finish]
	// →클래스명과 동일해야 하며, return 값이 없어야 한다
	// →생성자 오버로딩: 생성자는 여러 개 존재 가능
	// →생성자의 목적: 인스턴스가 생성될 때 호출됨
	//		 ▶인스턴스 초기화 담당(혹은 인스턴스 생성시 수행될 코드)
//		public Car2(String company, String model, String color, int maxSpeed) {
//		super();
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
	
	
	//※기본생성(:default 생성)
	//[source-generate constructors from superclass-finish]로 만듦
//		public Car2() {
//			super();
//
//		}
	

	void forward() {
		System.out.println("전진한다.");
	}
	void backward() {
		System.out.println("후진한다.");
	}
	
	
	
}
