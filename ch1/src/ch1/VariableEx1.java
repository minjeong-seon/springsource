package ch1;

// 변수: 메모리 공간
// 타입 변수명 = 값; -> int num =1;
// 메모리에 어떤 값을 저장할 것인가에 따라 타입이 결정된다
// 문자('가'  char(2byte)), 문자열("가나다")
// 숫자(정수: integer) : byte(1byte), short(2byte), int(4byte), long(8byte)
//    (실수; 부동소숫점) : float(4byte), double(8byte)
// 1byte = 8bite (타입과 크기가 다르면 미스매치가 뜬다) : 1byte = -128 ~ 127
// java 문장의 끝엔 항상 ;를 찍어야 마무리 된다

public class VariableEx1 {

	public static void main(String[] args) {
		int a=10, b=5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

	}

}
