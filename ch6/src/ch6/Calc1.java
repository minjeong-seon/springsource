package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲

//클래스 구성요소: '멤버변수, 메서드, 생성자'가 ← 필수는 아님

public class Calc1 {
	//+,-,*,/  -->사칙연산 기능을 가진 클래스 만들기 <<생성자 자동 생성ver.
	
	//+ :외부에서 두 개의 숫자를 받아 더하기 한 후 결과 보내기
	int add(int num1, int num2) {
		int sum=num1+num2; //수행할 내용
		return sum;  //수행 후 사용자에 리턴할 값
		// ▼한 줄로 줄일 수 있다.
		//return num1+num2;
	}
	
	//- :외부에서 두 개의 숫자를 받아 빼기 한 후 결과 보내기
	int subtrack(int num1, int num2) {
		return num1-num2;
	}
	//* :외부에서 두 개의 숫자를 받아 곱하기 한 후 결과 보내기
	int multiple(int num1, int num2) {
		return num1*num2;
	}
	/// :외부에서 두 개의 숫자를 받아 나누기 한 후 결과 보내기
	int division(int num1, int num2) {
		return num1/num2;
	}
	
	
	
	
	
}
