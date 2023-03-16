package ch1;

//변수의 종류
//지역변수, 인스턴스 변수, 클래스 변수
//모든 변수는 유효 범위를 갖는다

public class VariableEx9 {
	public static void main(String[] args) {
	   int i = 4;
	   System.out.println(i);
	   //main 메소드 중괄호 범위 안에서만 유효
	   
	   
	   {
		   int j = 5;
		   System.out.println(j);
	   }
	   
	   //내부 중괄호를 벗어난 범위에 코드입력 시 출력되지 않는다.
	}

}
