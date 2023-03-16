package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class CarEx2 {

	public static void main(String[] args) {
		//※Car2 객체 생성
		
		// 자동호출) 객체 생성 시 생성자가 자동으로 죄다 호출 됨(car2 설명 참고) :객체생성+초기화
		Car2 car = new Car2();
		
		//초기화(권장 방식은 아님)
		car.model = "스포티지";
		car.company = "KIA";
		car.color = "white";
		car.maxSpeed = 200;
		
		
		System.out.println("제조사 "+car.company);
		System.out.println("모델명 "+car.model);
		System.out.println("색상 "+car.color);
		System.out.println("최대속도 "+car.maxSpeed);
		
		
		System.out.println(); //enter
		
		//※자동호출과 직접호출의 차이
		//직접호출 →객체 생성과 초기화를 동시에 실행
		//직접호출 →매개변수가 있는 생성자를 호출하면서 객체 생성
		//▶직접호출하는 방식은 선호되지 않는다
		
		// 직접호출) 클래스에서 using fields 이용해서 직접 호출한 경우
		//()안에 생성자를 직접 호출하여 객체를 생성하는 방식 :매개변수가 있는 생성자
//		Car2 car2=new Car2("기아","레이","white",200);   
//		
//		System.out.println("제조사 "+car2.company);
//		System.out.println("모델명 "+car2.model);
//		System.out.println("색상 "+car2.color);
//		System.out.println("최대속도 "+car2.maxSpeed);
		
		
	
//		▼직접호출은 실행문에 매개변수=생성자가 대입된 값이 출력
//		public Car2(String company, String model, String color, int maxSpeed) {
//			super();
//			this.company = company;
//			this.model = model;
//			this.color = color;
//			this.maxSpeed = maxSpeed;
	
	
	}
}
