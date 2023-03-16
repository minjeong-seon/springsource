package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class TvEx1 {

	public static void main(String[] args) {
		// 클래스로부터 객체를 만드는 과정: 인스턴스화 	
		// Tv의 객체를 생성한다(인스턴스화)
		
		//Tv tv=new Tv();  →클래스명  변수명=new 클래스명();
		
		//▼선언과 생성 나누어 보기
		Tv tv;  //객체 선언
		tv=new Tv();  //객체 생성
		
		System.out.println("색상 "+tv.color);
		System.out.println("채널 "+tv.channel);
		System.out.println("전원 on/off "+tv.power);
		
		System.out.println();
		
		//멤버변수(속성;property) 초기화 →.+space누르면 호출할 메서드 나옴
		tv.color="black";
		tv.channel=6;
		tv.power=true;
		
		//초기화 후 >> 출력 재확인
		System.out.println("색상 "+tv.color);
		System.out.println("채널 "+tv.channel);
		System.out.println("전원 on/off "+tv.power);
		
		System.out.println();
		
		//메소드 호출하기 →출력문에 .+space 눌러서 원하는 (.void) 메서드 실행(클래스Tv내용)
		tv.channelUp();
		System.out.println("채널 "+tv.channel);
		tv.power();
		System.out.println("전원on/off "+tv.power);
		
		System.out.println();
		
		Tv tv2=new Tv();
		tv2.color="white";
		tv2.channel=11;
		
		//tv켜기, 끄기
		tv2.power();
		
		System.out.println("색상 "+tv2.color);
		System.out.println("채널 "+tv2.channel);
		System.out.println("전원 on/off "+tv2.power);
		
		
	}
}
