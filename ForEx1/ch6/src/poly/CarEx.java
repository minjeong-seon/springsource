package poly;

public class CarEx {

	public static void main(String[] args) {
		//다형성 초기화
		Car car1 = new FireEngine();		
		Car car2 = new Ambulance();
		
		Car car = null;
		
		FireEngine fireEngine =  new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine.water();
		car=fireEngine;   //Car car = new FireEngine();와 같음
		
		//좌 부모 우 자식일 때만 부모의 메소드 접근이 가능하지만 강제형변환을 통해서 접근할 수 있다.
		fireEngine2 = (FireEngine) car;   //casting; 강제 형변환
		fireEngine2.water();
		
		//java.lang.ClassCastException 런타임오류 발생하는 경우
//		FireEngine fe = (FireEngine) new Car();
//		fe.drive();  
		
	
		
	}
}
