package ch1;

//주석 : 상세설명

/* 리터럴
 * 대입되는 값(상수)
 * 정수형 : long
 */

public class VariableEx4 {

	public static void main(String[] args) {
		//접미사 : L, F, D, ...etc
		long big = 100_000_000_000l;
		float f = 0.14159f;
		double d = 0.141592; //double은 뒤에 접미사 없어도 출력 가능
		
		//접두사 : 0(8진수), 0x(16진수), 0b(2진수) -잘 안 씀
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		System.out.println(octNum);
		System.out.println(hexNum);
		System.out.println(binNum);

		//타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은 허용
		// 'A' =2byte, int : 4 byte 이므로,int에 문자 타입 저장 가능
		int i = 'A';
		System.out.println(i);
		
		//"" : 문자열
		//String: 참조 타입 -기본타입이 아니므로 시작문자는 항상 대문자
		String name = "hong";
		name = name + "77";
		System.out.println(name);
		
		//printf() : 형식화된 출력, enter 없음(그래서 뒤에 \n을 입력해야 함)
		// %d : 10진 정수의 형식 출력
		// %c : 문자
		// %s : 문자열
		// %f : 부동소수점(실수)
		int age = 25;
		System.out.printf("age=%d\n",age);
		
		char ch1 ='a';
		String str1="abcd";
		double d1 =3.141592;
		//각 타입에 맞는 printf 코딩 짜기
		System.out.printf("ch1=%c\n", ch1);
		System.out.printf("str1=%s\n", str1);
		System.out.printf("d1=%f\n", d1);
		//% 뒤에 정수나 실수를 삽입하여 좌/우 정렬 및 소숫점 자릿수 지정 가능
		System.out.printf("d1=%10f\n", d1);
		System.out.printf("d1=%-10f\n", d1);
		System.out.printf("d1=%.3f\n", d1);
		
		
		
		
	}

}
