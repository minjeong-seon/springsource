package com.spring.dependency;

public class TvMain {
//	String str = "String";	//	 ==new(인스턴스 생성)와 같은 의미(String 만 new가 없어도 됨)

	public static void main(String[] args) {
//		SonySpeaker speaker = new SonySpeaker();
//		TV tv = new SamsungTv(speaker);
		
		//TV tv = new SamsungTv(new SonySpeaker());
		
		//자식 클래스에서 setter를 사용한 멤버변수 초기화 시
		SamsungTv tv = new SamsungTv();
		tv.setSpeaker(new SonySpeaker());
		
		//java.lang.NullPointerException
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

//		TvMain obj = new TvMain();
//		obj.test();
	}
//	public void test() {
//		System.out.println(str);		
//		System.out.println(str.length());		
//	}
}
