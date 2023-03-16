package poly;
//[new class - superclass - browse - 클래스명 검색 - 패키지명 클릭 - done]

//Tv클래스를 상속받은 SmartTv
//public class 자손 클래스명 extends 조상 클래스명
public class SmartTv extends Tv {
	boolean caption;
	//-->default 값이 false임
	void displayCaption(String text) {
		//caption이 true일 때만 text 입력값 출력
		if (caption) {
			System.out.println(text);
		}
	}
}
