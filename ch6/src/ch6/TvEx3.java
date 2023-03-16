package ch6;

public class TvEx3 {

	public static void main(String[] args) {
		//객체 생성
		Tv3 tv=new Tv3();
		Tv3 tv2=new Tv3("white",7,false);
		
		//초기화(외부접근불가 상황) 하는 방법
		//1. 생성자
		//2. 멤버변수의 값 변경을 위한 메서드 제공
		
		
		//get메서드 불러오기(변수의 값을 리턴)
		//현재 채널에 대한 정보가 알고 싶을때
		System.out.println(tv2.getChannel());
		//현재 색상을 알고 싶을 때
		System.out.println(tv2.getColor());
		//현재 전원여부를 알고 싶을 때 <--boolean 타입은 is로 시작함
		System.out.println(tv2.isPower());
		
		//Tv2채널 변경(변수의 값을 변경)
		tv2.setChannel(150);
		System.out.println(tv2.getChannel());
		
		//tv 속성 값 변경
		//		->색상 변경
		//메서드 호출 시 void 인 경우 호출만 가능==syso에 넣을 수 없음
		tv.setColor("black");
		System.out.println(tv.getColor());
		
		//현재 전원여부 확인
		tv.setPower(true);
		System.out.println(tv.isPower());
	}
}
