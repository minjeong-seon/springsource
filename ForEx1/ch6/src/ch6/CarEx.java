package ch6;

public class CarEx {

	public static void main(String[] args) {
		//Car 객체 생성
		Car car=new Car();
		//초기화 실행
		car.company="현대";
		car.model="아반떼";
		car.color="Green";
		car.maxSpeed=200;
		car.forward();
		
		System.out.println("제조사 "+car.company);
		System.out.println("모델명 "+car.model);
		System.out.println("색상 "+car.color);
		System.out.println("최대속도 "+car.maxSpeed);
		
		
		
		
	}

}
