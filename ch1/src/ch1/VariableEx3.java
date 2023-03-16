package ch1;

//주석 : 상세설명

/*변수명
* 대소문자 구별, 길이에 제한 없음
* 예약어 사용 불가  ex)int true; int short;
* 숫자로 시작하면 안 됨   ex) int 7d;
* 특수문자는 _, $ 만 허용됨
* 변수의 첫글자는 항상 소문자로 입력   ex)int, boolean, ...etc
* 여러 단어로 이루어진 이름은 단어의 첫글자를 대문자로 입력   ex)lastIndexOf
* */

public class VariableEx3 {

	public static void main(String[] args) {
		//두 변수의 값 교환 -> y=10, x=20으로 바꾸기
		int x=10, y=20;
		//빈 공간 생성
		int temp=0;
		//둘 중 하나의 값을 빈 공간에 옮기기(x를 빈 곳에 옮김)
		temp=x;
		//나머지 값을 옮겨준다(y를 x가 떠난 자리에 옮기고, y자리에 x가 담긴 공간 입력)
        x=y;
        y=temp;
	    //출력
        System.out.println("x="+x+ ",y="+y);
        //풀어쓰기
        System.out.println("x="+x);
        System.out.println("y="+y);

	}

}
