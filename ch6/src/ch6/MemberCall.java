package ch6;

/*변수의 메소드에 static이 붙으면 같은 static이면 문제되지 않음
 * static이 붙지 않은 변수/메소드를 호출하려면 인스턴스화 이후 가능
 */

public class MemberCall {
	//인스턴스 변수
	int iv=10;
	//클래스(static) 변수: 공통속성
	static int cv=20;
	
	//인스턴스 변수=클래스변수;
	int iv2=cv;
	//클래스 변수 = 인스턴스 변수; (에러발생)
	//	->인스턴스 변수의 값을 클래스 변수에 대입 불가
	//		->각 변수가 생성(사용)되는 시기가 다르기 때문
	//static int cv2=iv;  <--아직 iv의 값이 메모리에 저장되지 않음(인스턴스화를 하지 않아서)
	
	static void staticMethod() {
		System.out.println(cv);
		//System.out.println(iv);  --> new(인스턴스화) 이후에만 실행 가능
		//instanceMethod();  -->마찬가지로 아직 생성 전이라 실행 불가
	}
	
	
	void instanceMethod() {
		System.out.println(cv);
		//인스턴스메소드와 인스턴스 변수 iv는 생성되는 시기가 같아서 오류 발생x
		System.out.println(iv);
	}
}
