package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class metodEx1 {
	//반환(리턴)타입 메서드명(타입 변수명...){}
	//반환타입 →메서드 호출 시 수행될 코드
	//	→→void, 변수타입, 배열도 메소드로 작성 가능
	
	void add1() {
		return;  //←타입이 void일 때는 써도 되고 안 써도 됨
	}

	int add2() {
		//타입이 void가 아니면 돌아갈 때 int 값 가지고 돌아감
		return 0;
	}

	String add3() {
		//타입이 void가 아니면 돌아갈 때 String 값 가지고 돌아감
		return "abcd";
	}
	
	char add4() {
		//타입이 void가 아니면 돌아갈 때 char 값 가지고 돌아감
		return 'a';
	}
	
	double add5() {
		//타입이 void가 아니면 돌아갈 때 double 값 가지고 돌아감
		return 0;
	}
	
	float add6() {
		//타입이 void가 아니면 돌아갈 때 float 값 가지고 돌아감
		return 0.1f;
	}
	
	int[] add7() {
		//타입이 void가 아니면 돌아갈 때 int 값 가지고 돌아감
		return new int[]{10,11,12};
	}
	
	//▼매개변수가 있는 메서드▼//
	
	void add8(int a, int b) {
		//==a와 b의 값이 있어야 한다 : 메소드 호출 시 처리
		//매개변수를 이용한 어떤 작업을 주로 수행
		System.out.println(a+b);
	}
	
	//외부에서 a와 b의 값을 받아서 리턴하는 메서드를 만들 때
	int add9(int a, int b) {
		//==a와 b의 값이 있어야 한다 : 메소드 호출 시 처리
		//매개변수를 이용한 어떤 작업을 주로 수행
		//ex) a+b를 한 후 리턴할 때 아래 내용으로 작성
		return a+b;	
	}
	
	double add10(int a, int b) {
		return a+b;
	}
	
	
	
	
}
