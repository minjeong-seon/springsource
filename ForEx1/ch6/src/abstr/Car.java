package abstr;

//추상메소드를 가지는 경우 >> 무조건 추상클래스가 되어야 한다.

public abstract class Car {
	//추상메소드는 {구현부}가 없다.
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void stopCar() {
		System.out.println("시동을 끕니다.");
	}
	
	//오버라이딩 금지
	final public void run() {
		startCar();
		drive();
		stop();
		stopCar();
	}
	
	
	
}
