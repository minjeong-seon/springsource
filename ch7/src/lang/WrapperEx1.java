package lang;

/*타입
 * 1)기본형: byte, short, int, long, double, float, boolean, char
 * 2)참조형: 배열, 클래스, 인터페이스
 * 
 * Wrapper 클래스
 * 	-8개의 기본형 타입을 객체로 다룰 때 사용
 * 	-ex)int의 wrapper 클래스는 Integer (기본 타입을 대문자로 치고 컨스하면 String처럼 쓸 수 있음)
 */

public class WrapperEx1 {
	public static void main(String[] args) {
		//정수형 타입을 다룰 때
		// 1)기본형
		int a=3;
		char ch='a';
		byte b=4;
		float f=1.14f;
		double d=82.6;
		boolean bl=false;
		long l=798654l;
		
		// 2)참조형: 클래스(인터페이스)가 만들어져 있다=메소드를 사용할 수 있다
		Integer i=new Integer(3); //The constructor Integer(int) is deprecated since version 9
		Integer i2=3;
		Integer i3=3;
		Character ch2=new Character('a');
		Character ch3='a';
		Byte b2=4;
		Float f2=1.145f;
		Double d2=82.6;
		Boolean bl2=false;
		Long l2=7896541l;
		
		System.out.println(i2.equals(i3));
		System.out.println(i2==i3);
	
		System.out.println("문자타입 숫자를 정수로 리턴: "+Integer.parseInt("10"));
		System.out.println("문자타입 숫자를 실수로 리턴: "+Double.parseDouble("10.987"));
		System.out.println("문자타입 숫자를 실수로 리턴: "+Float.parseFloat("10.123"));
		System.out.println("parseBoolean: "+Boolean.parseBoolean("abcd"));
	
		//기본형태로 선언된 변수는 참조형에 바로 대입 가능
		Integer i4=a;
		
	
	
	
	
	}

}
