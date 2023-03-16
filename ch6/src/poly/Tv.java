package poly;
//특문: ※ → ← ▼ ◀ ▶ ▲

/*다형성(polymorphism) : 여러가지 형태를 가질 수 있는 능력(*상속일 때만 가능)
 * 		->하나의 참조변수로 여러 타입의 객체를 참조할 수 있는 것
 * 		->부모 타입의 참조변수로 자식 타입의 객체를 다룰 수 있는 것
 */

public class Tv {
	//※객체의 정의※//
	//※속성(property) ▶ 멤버변수: 프로그램에 필요한 부분만 생성
	//	→크기, 길이, 높이, 색상, 벌륨, 채널...etc
	String color;   //색상: 변수 선언
	int channel;   //채널: 변수 선언
	boolean power;   //전원: 변수 선언
	
	//※기능(function) ▶ 메서드 
	//  →켜기, 끄기, 볼륨 높이기, 낮추기, 채널 변경...etc
	//※메인 메서드: 메인 메서드가 없으면 클래스가 실행되지 않는다
	//	→public static void main(String[] args) {}
	
	//메소드 ▼
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
