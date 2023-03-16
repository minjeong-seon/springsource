package ch2;

import java.util.Scanner;

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

public class OperatorEx5 {
	public static void main(String[] args) {
	    //문1)534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때
	    //학생 한 명당 몇 개를 갸질 수 있고, 연필의 나머지는 몇 개인지 출력하기
		//출력) 학생 1명 당 : 30개
		//     남은 연필 수 : 5개
		int pencil = 534, student = 30;
	     	System.out.println("한 명당 갖는 연필의 수 ="+(pencil/student));
			System.out.println("남은 연필의 수 ="+(pencil%student));
		
			
		//문2)사다리꼴 너비 구하기
		//윗변: 5, 아랫변: 10, 높이:7인 사다리꼴의 너비 구하기
		//변수 사용, 소수 자릿수까지 출력
		int top = 5, bottom = 10, height = 7;
		double area = (top+bottom)*height/2.0;
		//double area = (double)(top+bottom)*height/2; 로 강제형변환도 가능
			System.out.println("사다리꼴의 너비 = "+area);
		
			
		//문3)한달월급을 10년동안 저축할 때 최종 저축금액 구하기
		//조건: 사용자로부터 한달 월급 입력받기
		//출력예시: 10년 저축 금액 : 2000000
		Scanner sc = new Scanner(System.in);
		System.out.println("월급 입력");
		int salary = Integer.parseInt(sc. nextLine());
		int deposit = salary*(12*10);
			System.out.println("10년 저축 금액="+deposit);
				
		//문4) 화씨 온도를 섭씨 온도로 변경하기
		//화씨 온도가 100일 때 섭씨온도가 얼마인지 출력하기
		//섭씨온도 = 5/9*(화씨온도-32)임
		int fahr = 100;
		double cels = (double)5/9*(fahr-32);
			System.out.println("섭씨온도 : "+cels);	
			
			
		//문5)삼항연산자 이용(삼항연산자 2개 이용)
			// 조건 ? 참 : 거짓
		//	int num=10 일 때 num이 양수인지, 음수인지, 0인지 출력
		int num = 10;
		String result=num > 0 ? "양수" : (num < 0 ? "음수":"0");
			System.out.println(result);
		
		
		//문6)숫자를 입력받아 짝수인지, 홀수인지 출력하기 (삼항연산자 1개 이용)
			System.out.println("숫자를 입력하시오");	
		int input = Integer.parseInt(sc. nextLine());
		result = input%2==0 ? "짝수":"홀수";
			System.out.println(result);
			
			
			
			
	}

}
