package ch6;

/*한 클래스 안에서 다른 메소드를 호출할 수 있음(객체생성 필요x)
 * 호출 시 메소드 타입에 맞춰서 호출(이름만 쓰면 됨)
 */

public class Calc3 {
	int plus(int x,int y) {
		return x+y;  //4)
	}
	
	double avg(int x,int y) {
		double sum=plus(x,y);  //3)
		return sum/2;  //2)
	}

	//다른 메소드 println을 호출함
	void excute() {
		println("실행결과 : "+avg(7,10)); //1)
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
