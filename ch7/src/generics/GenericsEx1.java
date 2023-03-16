package generics;

import java.util.ArrayList;

/*Generics 
 * -컴파일 시 타입을 체크 해주는 기능
 * 
 * 장점
 * 	1) 타입 안정성 제공
 * 	2) 타입체크와 형변환을 생략할 수 있으므로 코드의 간결성 유지
 * 
 * <E>, <T>, <K,V>, <? extends T>, <? super T>, <?>

 * 
 */

public class GenericsEx1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();		//ArrayList<String>; ArryaList 안에는 String 타입만 추가 가능
		
		Box1 box1 = new Box1();
		box1.setItem("홍길동");
		
		String item = (String) box1.getItem();
		System.out.println(item);
		
		box1.setItem(100);
		Integer i=(Integer) box1.getItem();
		System.out.println(i);
		
		//부모 클래스(Box2)에서 <T>로 타입 정의하고 캐스팅 없이 형변환 하기
		Box2<String> box2 = new Box2<>();
		box2.setItem("태블릿PC 사면 비대면ㄱㄱ");
		item = box2.getItem();
		System.out.println("generics 적용 후: "+item);
		
		Box2<Integer> box3 = new Box2<>();
		box3.setItem(123);
		i = box3.getItem();
		System.out.println("generics 적용 후: "+i);
		
		

	}
}
