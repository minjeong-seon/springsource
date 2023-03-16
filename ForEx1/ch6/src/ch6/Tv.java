package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲

/*java: 객체지향언어 
 * 		-코드의 재사용성이 높다
 * 		-코드 관리가 용이하다
 * 		-신뢰성 높은 프로그래밍을 가능하게 한다
 *
 *클래스: 객체를 정의해 놓은 것
 *클래스 용도: 객체를 생성하는데 사용
 *
 *객체: 실제로 존재하는 사물/개념
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
