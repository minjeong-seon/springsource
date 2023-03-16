package ch6;

public class Card {
	//트럼프 카드
	//속성: 무늬(다이아, 스페이드, 클로버, 하트), 숫자, 카드의 폭&높이
	String kind;
	int number;
	
	//공통 속성(모든 카드의 높이와 폭은 일정함) 
	//		>> 클래스로 선언한다 == 앞에 static을 붙임
	//메소드에서 호출할 때는 [클래스명.변수명]으로 호출
	static int height;
	static int width;
	
	
}
