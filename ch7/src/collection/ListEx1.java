package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*컬렉션 프레임워크: 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합 
 * ->인터페이스를 사용하여 구현
 * 
 * 	*컬렉션(collection): 여러 데이터들을 모아 놓은 것
 * 	*프레임워크(framework): 표준화, 정형화된 프로그래밍 방식 
 * 
 * (유사한 개념)
 * 	라이브러리(library):  공통으로 사용될만한 유용한 기능을 모듈화
 * 
 *Collection > List/Set -- Map
 *
 *@@!!아래 내용 암기 필수!!@@
 *
 *	*List 인터페이스: 순서 존재, 데이터 중복 허용
 *		>>구현클래스: ArrayList, LinkedList, Stack, Vector, Queue...
 *	*Set 인터페이스: 순서 존재x, 데이터 중복 x
 *		>>구현클래스: HashSet, TreeSet,...
 *	*Map 인터페이스: key-value 쌍으로 이루어진 데이터 집합(순서 x, key는 중복 x, value는 중복 허용)
 *  	>>구현클래스: HashMap, TreeMap, HashTable, Properties,...
 *  
 *  <E> or <T>, <K,V>: 지네릭스(;generics) 개념 ==> 타입 지정
 *  	E: element 타입 지정
 *  
 *  타입: 참조 타입(대문자)만 지정 가능
 *  Iterator: 인터페이스: List, Set, Map 구조에서 요소를 꺼내 쓰는 방법에 대한 통일성 제공
 */

public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();  //list1이라는 빈 공간(배열, 기본 16칸) 생성
		ArrayList<String> list2 = new ArrayList<>();
		
		//size(): 배열의 length와 같은 개념(Returns the number of elements in this list.) -list에 담긴 값의 수 리턴
		System.out.println("size(): "+list1.size());
		
		//isEmpty(): Returns true if this list contains no elements.
		System.out.println("list2.isEmpty(): "+list2.isEmpty());
		
		//add(): list(배열)에 element(요소) 추가
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add("자바");
		list2.add("html");
		list2.add("script");
		list2.add("서블릿");
	
		System.out.println(list1);
		System.out.println(list2);
		
		//배열->리스트로 변환도 가능
		// 1)배열에 추가할 내용이 없는 경우
		String fruits[]= {"apple", "grape", "melon","strawberry", "banana"};
		List<String> list3=Arrays.asList(fruits);
		System.out.println(list3);
		
//		list3.add("cherry");
//		System.out.println(list3); //이렇게 하면 runtime exception error 발생
		
		// 2)배열에 추가할 내용이 있는 경우 -새롭게 인스턴스 생성
		List<String> list4=new ArrayList<>(Arrays.asList(fruits));
		list4.add("cherry");
		System.out.println(list4);
		
		//add(int index, 요소): index 위치에 요소 추가
		list1.add(3,6);
		System.out.println("특정 위치에 추가 후: "+list1);
		
		//set(int index, Integer element): index 위치를 요소로 변경
		list1.set(3, 7);
		System.out.println("특정 위치에 요소 변경: "+list1);
		
		//remove(int index): index 위치 요소 제거. 
		list2.remove(2);
		System.out.println("특정 위치 요소 제거"+list2);
		//remove(Object o): list에서 o를 제거
		list4.remove("banana");
		System.out.println("Object로 특정 위치 요소 제거: "+list4);
		
		//get(int index): 
		System.out.println("특정 위치 요소 가져오기: "+	list2.get(1));
		
		//indexOf(): ()안 요소의 위치 가져오기
		System.out.println("특정 요소의 위치 가져오기(서블릿): "+list2.indexOf("서블릿"));
		
		//sort: 사전 기준 list 오름차순 정렬 (Collections 클래스에 있는 sort 메소드 호출)
		//sort(List<T>List): List 인터페이스가 처리할 수 있는 객체가 넘어와야 함(T는 Type)
		//	-->구현클래스: ArrayList, LinkedList, Stack, Vector, Queue... 가 넘어와야 한다는 뜻
		Collections.sort(list4);
		System.out.println("오름차순 정렬 후: "+list4);
		
		//생성한 객체에서도 sort를 호출하여 기준을 부여하면 정렬 할 수 있다.
		//Comparator.naturalOrder(): 오름차순 기준 부여
		//내림차순으로 정렬하려면 아래와 같이 진행
		list1.sort(Comparator.reverseOrder());
		System.out.println("내림차순 정렬: "+list1);
		
		
	}

}
