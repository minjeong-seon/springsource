package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲

/*메소드 작성
 * 	→리턴(반환)타입 메소드명()[]
 * 	→리턴타입 메소드명(타입 변수명,.....){}
 * 		▲소괄호 안에 매개변수가 들어가는 메소드
 * 	→→void, 변수타입, 배열도 메소드로 작성 가능함(※-metodEx1 참고)
 * ▶특정 작업을 수행하는 일련의 문장들을 하나로 묶어 놓은 것
 * ▶수학의 함수와 유사한 특징을 가진다
 */

public class Tv2 {
	String color;   //색상: 변수 선언
	int channel;   //채널: 변수 선언
	boolean power;   //전원: 변수 선언
	
	//※기능(function) ▶ 메서드 
	//  →켜기, 끄기, 볼륨 높이기, 낮추기, 채널 변경...etc
	//※메인 메서드: 메인 메서드가 없으면 클래스가 실행되지 않는다
	//	→public static void main(String[] args) {}
	
	//메소드 ▼
	//void : 메소드 실행 후 리턴 값 없음(※)
	void power() {
		power=!power;
	}
	//채널을 증가하고 현재 채널을 리턴
	//int : 메소드 실행 후 int 값을 가지고 돌아감 ==> return 변수명;(※)
	int channelUp() {
		channel++;
		return channel;
	}
	
	void channelDown() {
		channel--;
	}


}
