package ch7;

/*compile Error: 컴파일 시 발생하는 에러(코드에 바로 빨간 줄 그어지는 거)
 *runtime Error: 실행 시 발생하는 에러
 *logical Error: (논리적 에러)실행은 되지만 의도와 다르게 동작하는 에러
 *
 *Error(에러): 코드에 의해서 수습될 수 없는 심각한 오류 (ex-메모리부족, 스택오버플로우,...etc)
 *Exception(예외): 코드에 의해서 수습될 수 있는 미약한 오류
 * 
 * Exception
 * 	1)Exception 클래스: 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 * 	2)RuntimeException 클래스: 프로그래머의 실수로 발생하는 예외
 * 		ex) 배열 인덱스 범위 벗어나는 것, NullPoitnException, ClassCastException,...etc
 * 
 * Exception 처리방법
 * 	try ~ catch 작성
 * 		>> catch(){} : 자식 혹은 부모만 입력 가능
 * 			ex)자식: ArithmeticException, 부모: Exception>RuntimeException
 * 			 ==>뭘 입력할 지 모르겠으면 그냥 Exception e로만 입력해도 됨(최상위 부모라서)
 */

public class ExceptionEx4 {
	public static void main(String[] args) {
		int arr[]=new int[0];
		try {
			getAverage(arr);
		} catch (Exception e) {
//			e.printStackTrace();   //오류 추적
			System.out.println(e.getMessage());   //예외 메시지 출력(40번 행)
		}
		
	}
	//getAverage 메서드에 예외 선언
	// == getAverage를 호출하면 예외가 발생할 수 있음
	//메소드명() throws 예외명 <-형태로 사용
	//throws: 발생한 예외를 호출한 곳으로 넘겨주는 것
	static double getAverage(int arr[]) throws Exception {
		//강제로 예외 발생 시키기
		if(arr.length==0) {
//			//컴파일 시 예외
			throw new Exception("비어있는 배열입니다.");  //예외를 던짐
//			//실행 시 예외처리
//			throw new RuntimeException("비어있는 배열입니다.");  //예외를 던짐
		}return getTotal(arr)/arr.length;
	}
	static int getTotal(int arr[]) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}return total;
	}
}
