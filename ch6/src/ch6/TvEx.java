package ch6;


//특문: ※ → ← ▼ ◀ ▶ ▲
public class TvEx {
//반복적으로 실행되는 문장은 메소드로 만들 수 있음
	
	public static void main(String[] args) {
		// 클래스로부터 객체를 만드는 과정: 인스턴스화 	
		// Tv의 객체를 생성한다(인스턴스화)
		
		//Tv tv=new Tv();  →클래스명  변수명=new 클래스명();
		
		//▼선언과 생성 나누어 보기
		Tv tv;  //객체 선언
		tv=new Tv();  //객체 생성
		
		print(tv);  //static 메소드에 저장된 내용 호출(실행)을 위해
		//	..[static에 저장된 메소드명을 불러옴]
		
		System.out.println();
		
		//멤버변수(속성;property) 초기화 →.+space누르면 호출할 메서드 나옴
		tv.color="black";
		tv.channel=6;
		tv.power=true;
		
		//초기화 후 >> 출력 재확인
		print(tv);
		
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
		
		print(tv2);
		
		
	}
	//자주 실행하는 System.out.println(속성 어쩌고);를 메소드로 만들기 
	//메인메소드 }이후 오류 없이 실행되려면 메소드 앞에 static 붙여줘야 함
	static void print(Tv tv) {  //변수명 뒤에 붙는 이름은 아무 상관없음.
		System.out.println("색상 "+tv.color);
		System.out.println("채널 "+tv.channel);
		System.out.println("전원 on/off "+tv.power);
	}
}
