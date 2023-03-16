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

public class ExceptionEx3 {
	public static void main(String[] args) {
	//null을 이용한 참조형 초기화
		//null: 아직 값이 할당되지 않았음
		
		String data = null;
		Account account = null;
		
		int[] arr = null;
		
		//참조변수의 값 출력
		System.out.println(data);
		System.out.println(account);
		System.out.println(arr);
		// java.lang.NullPointerException 발생상황
		//	->참조변수가 가리키고 있는 곳을 접근(.)/[] 시 발생
		// 	ex)String data = "Hello"; 와 같이 변수 우측에 (= ###)를 하지 않은 것
//		System.out.println(arr[0]);
//		System.out.println(data.length());
	}
}
