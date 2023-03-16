package ch5;
//특문: ※ → ← ▼ ◀ ▶ ▲

/*null : 참조타입에서 주소에 값이 할당되지 않았음을 의미
 *String : char 배열에 기능을 추가한 개념
 * 
 */
public class ArrayEx7 {
	public static void main(String[] args) {
		//main 메소드에 선언된 배열도 불러올 수 있다.
		//menu-run-run configurations-arguments-program arguments 입력-[Run]
		System.out.println(args[0]);
		
		
		String name[]=new String[3];
		System.out.println(name[0]);   //출력: null 
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		//값 할당하기 =초기화
		name[0]="kim";
		name[0]="lee";
		name[0]="park";
		System.out.println(name[0]);
		System.out.println(name[0].charAt(2));
		
		//string 내용 중 일부 출력하기
		String str="ABCDE";
		System.out.println(str.charAt(2));
		
		//문자열(String)을 비교할 때는 ==, !=을 사용하지 않는다
		//str.equals, str.equalsIgnoreCase을 사용한다
		//	str.equals: 대소문자 구별하여 비교
		//	equalsIgnoreCase: 대소문자 무시하고 비교
		System.out.println(str.equals("abcde"));
		System.out.println(str.equalsIgnoreCase("abcde"));
		
		//문자열로 결과값 출력하기▼
		System.out.println(str.equals("abcde")?"일치함":"일치하지 않음");
		//혹은▼
		if(str.equals("abcde")){
			System.out.println("일치함");
		}else {
			System.out.println("일치하지 않음");
		}
		
	}
}
