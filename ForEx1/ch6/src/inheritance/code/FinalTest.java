package inheritance.code;
//final 클래스: 상속 금지
public final class FinalTest {

	final int MAX_SIZE=10;   //상수 : 초기화 이후에는 값 변경 불가

	static final int MIN_SIZE=0;	//공유(공통) 상수
	//final 메소드: 오버라이딩 금지
	final void getMaxSize() {
		final int LV = MAX_SIZE;   //상수
		
	}
}
