package inheritance;

public class SmartTv2 extends Tv2 {
	public SmartTv2(boolean power, int channel) {
		super(power, channel);  //매개변수를 받는 부모의 생성자 호출
		
	}

	boolean caption;

//	//디폴트(기본) 생성자
//	public SmartTv2() {
//		super();  //부모의 기본생성자(Tv2) 호출
//		
//	}
	
	void displayCaption(String text) {
		//caption이 true일 때만 text 입력값 출력
		if (caption) {
			System.out.println(text);
		}
	}



}
