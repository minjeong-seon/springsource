package ch2;

/*연산자의 종류
 * 1) 단항연산자 : +, -, ++, -- ~ !  (부호의 의미 -음, 양)
 * 2) 이항연산자
 *           -산술 : +, -, *, /, %, <<, >>, >>>
 *           -비교 : >, < >=, <=, ==, !=
 *           (==: 값이 같다면, !=: 값이 같지 않다면) ->결과값이 boolean
 *           -논리 : &&, ||, &, ^, |
 *           (&&- and, ||- or, ^- xor, &- and, |- or)  -의미는 같으나 효능 차이(앞쪽만 사용)
 * 3) 삼항연산자 : ? :
 * 4) 대입연산자 : =
 *            ex)a=4;
 *            
 *연산자 우선순위
 *           ex) 5+(3*4)
 *
 */

public class OperatorEx3 {
	public static void main(String[] args) {
		
		int charcode='A';
		System.out.println(charcode);
		
		if((charcode>=65) && (charcode<=90)){
           System.out.println("대문자");			
		}
		
		int x=15;
		if((x > 10 && x < 20)) {
			System.out.println("x는 10과 20 사이에 존재한다");
		}
		
		//논리연산자 : true / flase 를 주고 결과도 true / false로 나옴
		//&&(and 결합) : ex) x는 10보다 크고, 20보다 작다
		// x > 10 && x < 20 
		//||(or결합) : ex) i는 2의 배수 또는 3의 배수다
		// i%2==0 || i%3==0
		// i는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다
		// (i%2==0 || i%3==0) && i%6!=0
		
		
		
	}

}
