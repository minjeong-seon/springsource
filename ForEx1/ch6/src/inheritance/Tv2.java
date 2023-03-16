package inheritance;
/*parent class를 지정하지 않으면 최상위 parent인 object class가 존재함
 * 	ex)아래 Tv2의 parent class 는 object class임
 */

//this() : 생성자에서 다른 생성자를 호출
//this.변수명 : mine(내꺼) 생성자 - 매개변수와 이름이 같을 때 구별하기 위해 사용

//super() : 생성자에서 부모 생성자를 호출 
//super.변수명 : parent 생성자 - 부모가 가지고 있는 인스턴스 변수를 사용할 때

public class Tv2 {
	boolean power;
	int channel;
	

//	//디폴트(기본) 생성자
//	public Tv2() {
//		super();   //부모의 기본생성자 호출
//		
//	}
	
	public Tv2(boolean power, int channel) {
		super();
		this.power = power;
		this.channel = channel;
	}
	
	void power() {
		power=!power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
