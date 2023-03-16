package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class Car3 {
	//※멤버변수: 속성(property)
	// 		→제조사, 모델, 색상, 최대속도...etc
	//※메서드: 기능(function)
	//  	→전진, 후진
	String company;
	String model;
	String color;
	int maxSpeed;

	//기본(default) 생성자
	public Car3() {
		super();

	}

		public Car3(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}


		public Car3(String company, String model, String color, int maxSpeed) {
//		super();
//		this.company = company;
//		this.model = model;
//		this.color = color;
		this(company,model,color);
		this.maxSpeed = maxSpeed;
		}



	void forward() {
		System.out.println("전진한다.");
	}
	void backward() {
		System.out.println("후진한다.");
	}

	@Override
	public String toString() {
		return "Car3 [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	
}
