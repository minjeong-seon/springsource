package ch7;
//Exception 상속
public class MyExceptionEx {

	public static void main(String[] args) {
		try {
			test();
		} catch (MyException e) {
			e.printStackTrace();
		}

	}
	
	public static void test() throws MyException {
		//강제예외발생
		throw new MyException("사용자 정의 예외 발생");
	}
}
