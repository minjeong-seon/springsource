package ch1;

//변수 : 단 하나의 값만 저장할 수 있는 메모리 공간
//타입 변수명 = 값;  ==>  int num = 1;
//메모리에 어떤 값을 저장할 것인가에 따라 타입이 결정됨
//*기본타입 하기 정리 참고*
//문자 : 문자('가' - char(2byte)), 문자열("가나다") -문자도 쌍따옴표 안에 써도 됨
//1byte = 8bite (타입과 크기가 다르면 미스매치가 뜬다) : 1byte = -128 ~ 127
//type mismatch를 방지하기 위해 정수 대부분은 int를 사용하고 short는 잘 사용하지 않는다
//숫자 : 정수 - byte(1byte), short(2byte), int(4byte), long(8byte) -사용하는 공간의 차이에 따라 다르게 사용
//논리 : 참(true), 거짓(false)  -boolean 타입 사용

public class VariableEx2 {

	public static void main(String[] args) {
		int a=128, b=5;  //변수의 선언(int a;)과 초기화(a=num)
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

		double d1 = 0.12345678909;
		float f1 = 0.123456789f;   //float는 뒤에 항상 f 붙여야 출력됨
		
		// "" + : 앞의 문자열""와 + 뒷 내용을 연결하여 출력
		System.out.println("d1="+d1);
		System.out.println("f1="+f1);
		
		// boolean 논리 타입
		boolean b1 = true;
		System.out.println(b1);

		// char, String 문자 타입
		// 각 알파벳에는 유니코드가 존재하여 a=98, A=65에서 숫자 하나씩 증가
		char ch1='a';
		System.out.println(ch1);
		System.out.println(ch1+1);
		
		
	}

}
