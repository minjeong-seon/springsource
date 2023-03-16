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
 *	1)try ~ catch 작성
 * 		>> catch(){} : 자식 혹은 부모만 입력 가능
 * 			ex)자식: ArithmeticException, 부모: Exception>RuntimeException
 * 			 ==>뭘 입력할 지 모르겠으면 그냥 Exception e로만 입력해도 됨(최상위 부모라서)
 * 
 *	2)예외 던지기(throw: 예외 발생시키기)
 *		->메인메소드를 호출하는 곳(jvm)에서 처리  (>>main 메소드 옆에 throw 예외case)
 *		
 */

//	public static void main(String[] args) {
//		// java.lang 패키지의 ArithmeticException 클래스
//		// java.lang.ArithmeticException: / by zero 
//		try {
//			System.out.println(3/0);
//		} catch (ArithmeticException e) {
//			//e.printStackTrace();  //개발 시 자주 쓰는 코드 형태 => 예외가 발생하는 구문을 추적해서 출력
//			//System.out.println("0으로 나눌 수 없습니다."); =>개발자가 원하는 구문 출력
//			System.out.println(e.getMessage()); //=>예외발생 시 자바가 제공하는 기본 메시지 출력
//		}
//		
//		
//	}

public class ExceptionEx1 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("");
		
		
		
		
	}
	
}
