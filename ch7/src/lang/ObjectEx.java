package lang;

/*java.lang 패키지: import 구문 없이 사용 가능
 *Object: 모든 클래스의 부모
 */

public class ObjectEx {
	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//lang 클래스에 담긴 equals 사용
		//String 타입은 equals 사용
		//equals(): obj1과 obj2가 같은 객체인가?
		if(obj1.equals(obj2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//삼항연산자 사용
		System.out.println(obj1==obj2?"같음":"다름");
		
		//부모object가 어떻게 넘겨주는지 확인; hashcode 값 확인
		System.out.println("obj1 toString"+obj1.toString());		//obj1 toStringjava.lang.Object@4926097b
		System.out.println("obj2 toString"+obj2.toString());	//obj2 toStringjava.lang.Object@762efe5d
		
		//======================================================
		//부모 : Person 클래스//
		
		//Value 부모: Object 클래스
		//부모 메소드 + Value 객체 메소드 사용 가능
		Value v1 = new Value(50);
		Value v2 = new Value(50);
		
		//Object 클래스에서 불러다 쓰는 equals는 주소값을 비교함
		//정수 값을 비교하기 위해서는 equals를 재정의 해야 함 => 오버라이딩 (Person 클래스에서 함)
		System.out.println(v1.equals(v2)?"v1==v2 같음":"v1==v2 다름");
		//boolean equals(Object obj) 호출
		//Object obj = v2
		//Value v = (Value)obj <--부모를 자식에 담는 거니까 강제형변환 필요
		
		//부모object가 어떻게 넘겨주는지 확인; hashcode 값 확인
		//toString 오버라이드 되어 있음
		System.out.println("v1 toString "+v1.toString());
		System.out.println("v2 toString "+v2.toString());
		
		Person p1 = new Person(80110581122L);
		Person p2 = new Person(80110581122L);
		System.out.println(p1.equals(p2)?"p1과 p2는 같은 사람":"p1과 p2는 다른 사람");
		
		//toString 이 오버라이딩 되어 있다면 참조변수명만 사용해도 됨(.toString 안 해도 된다는 뜻) >반대로, 오버라이딩 되어 있지 않으면 주소값만 출력됨
		System.out.println(p1);  //=p1.toString()
		System.out.println(p1.toString());
		
		//======================================================
		//부모 : Card 클래스//
		
		Card card1 = new Card();
		Card card2 = new Card("HEART",10);
		System.out.println(card1);
		System.out.println(card2);
		
		
	}

}
