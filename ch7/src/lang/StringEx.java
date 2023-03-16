package lang;

/*String 클래스
 *	->변경 불가능한(immutable) 클래스
 *	==: 주소값 비교(String 타입 비교 시 사용X)
 * 	equals(): 값 비교(String 타입일 때 사용. char는 X)
 * 	equalsIgnoreCase(): 대소문자 구별하지 않고 값 비교
 */

public class StringEx {
	public static void main(String[] args) {
		//String 클래스의 동작 구현
		//String은 문자열을 다루는 일이 많기 때문에 new를 사용하지 않고도 인스턴스를 생성할 수 있도록 되어 있음
		
		//문자열 만들기 방식: 
		//1) 문자열 literal 지정; 문자열 재사용  ==> heap에 동일 값이 있는지 탐색 > 있으면 같은 주소(stack) 재사용**
		//2) new를 사용하는 방식  ==> 변수 stack에 저장 > heap에 값 저장
		String str2="Hello"; //1)리터럴 지정 방식
		String str4="Hello";
		String str = new String("안녕하세요."); //2)new 를 쓰는 인스턴스 생성 방식
		String str3 = new String("안녕하세요.");
//		str2=str2+str;
		
		//문자열 비교
		System.out.println(str3.equals(str)); //equals : heap에 저장된 값 비교
		System.out.println(str==str3); //stack에 저장된 주소 비교
		
		//String 클래스에는 equals가 오버라이딩 되어 있음(값을 비교하도록) ==> *문자열은 == 사용x
		System.out.println(str.equals(str3));
		//str2와 str4는 리터럴 지정이라 값이 같으면 주소값도 같으므로 ==을 쓰면 true가 출력된다.(문자열 비교는 ==쓰면 안되는 이유)
		System.out.println(str2==str4);
		
	}

}
