package inheritance;

public class SmartTvEx2 {

	public static void main(String[] args) {
		//▼아래 객체생성 한번으로 →→ SmartTv2, Tv2, Object 인스턴스 모조리 생성
		SmartTv2 stv=new SmartTv2(false,10);   //SmartTv2(부모) 호출
		
		//상속여부 확인하기
		stv.channel=10;
		stv.channelUp();
		System.out.println("현재 채널: "+stv.channel);
		
		stv.power();
		System.out.println("전원상태: "+stv.power);
		
		stv.displayCaption("Hello World");
		stv.caption=true;
		stv.displayCaption("Hello World");


	}

}
