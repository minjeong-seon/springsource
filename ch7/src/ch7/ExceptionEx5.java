package ch7;
//try ~ catch ~ finally
//try ~ finally

public class ExceptionEx5 {
	public static void main(String[] args) {
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			//예외와 상관없이 항상 수행되어야 하는 구문 작성
			System.out.println("반드시 실행");
		}
		
		
		
		
		try {
			
		} finally {
			
		}
	}
}
