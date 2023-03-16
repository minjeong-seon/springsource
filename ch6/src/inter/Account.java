package inter;
/* 인터페이스
 * 추상화 클래스
 * 추상 클래스보다 추상화 정도가 높음 => 일반메서드, 멤버변수가 가질 수 없음
 * 기본 설계도
 * 
 * 모든 멤버변수는 public/static/final(생략가능)임 ==>상수
 * 모든 메소드는 public abstract다.(생략가능) ==>추상메소드
 * 단, static 메소드와 default 메소드는 사용가능(jdk8 이후)
 */
public interface Account {
	//The blank final field x,y may not have been initialized
	//int x,y;   //초기화가 되지 않아서 오류 발생
	int x=0, y=0;  //모든 멤버변수는 public/static/final(생략가능)임
	
//	void stop() {} //Abstract methods do not specify a body 오류
	//모든 메소드는 public abstract다.(생략가능)
	void stop();
	
	//단, static 메소드와 default 메소드는 사용가능(jdk8 이후)
	static void print() {}
	default void add() {}
	
}
