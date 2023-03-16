package ch2;

/*연산자의 종류
 * 1) 단항연산자 : +, -, ++, -- ~ !  (부호의 의미 -음, 양)
 * 2) 이항연산자
 *           -산술 : +, -, *, /, %, <<, >>, >>>
 *           -비교 : >, < >=, <=, ==, !=
 *           (==: 값이 같다면, !=: 값이 같지 않다면) ->결과값이 boolean
 *           -논리 : &&, ||, &, ^, |
 *           (&&: and, ||: or, ^: xor, &: and, |: or)  -의미는 같으나 효능 차이(앞쪽만 사용)
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =
 *            ex)a=4;
 *            
 *연산자 우선순위
 *           ex) 5+(3*4)
 *
 */

public class OperatorEx2 {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		
		//비교연산자 : 결과값이 boolean 의 형태로 나옴
	     System.out.println(num1==num2);
	     System.out.println(num1!=num2);
	     System.out.println(num1>=num2);
	     System.out.println(num1<=num2);
		
		boolean result = num1 == num2;
		System.out.println(result);

		//A:65, a:97
		char ch1 = 'A';
		char ch2 = 'B';
		System.out.println("ch1==ch2 = "+(ch1==ch2));
		System.out.println("ch1>=ch2 = "+(ch1>=ch2));
		System.out.println("ch1<=ch2 = "+(ch1<=ch2));
		System.out.println("ch1!=ch2 = "+(ch1!=ch2));
		
		//실수 타입은 정밀도 차이로 비교연산 시 차이가 발생한다
		double d1=0.4;
		float f1=0.4f;
		System.out.println("d1==f1 = "+(d1==f1));
		System.out.println("d1>=f1 = "+(d1>=f1));
		System.out.println("d1<=f1 = "+(d1<=f1));
		System.out.println("d1!=f1 = "+(d1!=f1));
		
		
		
		
		
	}

}
