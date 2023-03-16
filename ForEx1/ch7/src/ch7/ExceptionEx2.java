package ch7;

/*compile Error: 컴파일 시 발생하는 에러(코드에 바로 빨간 줄 그어지는 거)
 *runtime Error: 실행 시 발생하는 에러
 *logical Error: (논리적 에러)실행은 되지만 의도와 다르게 동작하는 에러
 *
 *Error(에러): 코드에 의해서 수습될 수 없는 심각한 오류 (ex-메모리부족, 스택오버플로우,...etc)
 *Exception(예외): 코드에 의해서 수습될 수 있는 미약한 오류
 * 
 * Exception
 * 	1)Exception: 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 * 	2)RuntimeException: 프로그래머의 실수로 발생하는 예외
 * 		ex) 배열 인덱스 범위 벗어나는 것, NullPoitnException, ClassCastException,...etc
 * 
 * Exception 처리방법
 * 	try ~ catch 작성
 * 		>> catch(){} : 자식 혹은 부모만 입력 가능
 * 			ex)자식: ArithmeticException, 부모: Exception>RuntimeException
 * 			 ==>뭘 입력할 지 모르겠으면 그냥 Exception e로만 입력해도 됨(최상위 부모라서)
 */

public class ExceptionEx2 {
	public static void main(String[] args) {
		//java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		//배열 인덱스 잘못 지정했을 때 발생하는 오류 ==> if문으로 확인
//			if (args.length==1) {
//				System.out.println(args[0]);
//			}else {
//				System.out.println("실행방법 확인");
//			}
		
		try { //서로 다른 타입의 에러가 발생한 경우 타입별로 출력을 다르게 하기//
			//ArrayIndexOutOfBoundsException
			System.out.println(args[0]);
			//ArithmeticException
			System.out.println(3/0);
			//catch문을 여러개 부를 수 있다(단, ()안을 각각 다르게 적어야 함//마지막은 부모)
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행방법 확인");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}catch (Exception e) {
			System.out.println("오류 발생");
		}
		
		
	}
}
