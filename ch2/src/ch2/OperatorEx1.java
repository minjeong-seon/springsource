package ch2;

/*연산자의 종류
 * 1) 단항연산자 : +, -, ++, -- ~ !  (부호의 의미 -음, 양)
 * 2) 이항연산자
 *           -산술 : +, -, *, /, %, <<, >>, >>>
 *           -비교 : >, < >=, <=, ==, !=
 *           (==: 값이 같다면, !=: 값이 같지 않다면)
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

public class OperatorEx1 {
	public static void main(String[] args) {
		// 후위증가연산자 : 값이 참조된 후 증가시킴   ex)j++;
		//++,-- 는 전위, 후위 둘 다 가능 
		//+를 하나 더 붙이면 결과값에 1씩 더해짐
	//int i=5;
	//i++; // i=i+1
	//System.out.println(i);		
	//int i=5;
	//++j; // j=j+1
	//System.out.println(j);		
		
		//전위연산자는 대입연산자(=) 뒷내용을 우선 연산>후위연산자는 대입연산자 앞내용을 우선 연산한다
		//후위연산자를 더 자주 쓰지만 대입연산자 우선순위에서 밀리기 때문에 그런 경우 +1을 적는 편이 낫다
		int i=5, j=0;
		j=i++;  //1)j=i; 2)i=i+1
		System.out.println("j=i++실행 후 i="+i+",j= "+j);
		
		i=5;
		j=0;
		j=++i;  //1)i=i+1 2)j=i; 
		System.out.println("j=++i실행 후 i="+i+",j= "+j);
		
		// ! : true->false, false->true
		// 피연산자가 boolean 값을 가질 때만 사용 가능
		// ex) !true, !false  ->!3과 같은 논리 외 값은 사용 불가
		boolean play=true;
		System.out.println("play="+play);
		System.out.println("!play="+!play);
		
		
		
		
		
	}

}
