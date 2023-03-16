package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {

	public static void main(String[] args) {
		//ArrayList에 Member 객체를 추가
		ArrayList<Member1>list=new ArrayList<>();
		list.add(new Member1("홍길동"));
		list.add(new Member1("이재용"));
		list.add(new Member1("선우용녀"));
		list.add(new Member1("정용진"));
		list.add(new Member1("만수르"));
		
		System.out.println(list);
		
		ArrayList<Member2>list2=new ArrayList<>();
		list2.add(new Member2("홍길동","12345","hong123"));
		list2.add(new Member2("이재용","11111","3sung"));
		list2.add(new Member2("권지용","65655","dragonK"));
		list2.add(new Member2("정용진","78945","ssggood"));
		list2.add(new Member2("만수르","10000","10Krich"));
		
		System.out.println(list2);  //MEmber2 클래스에서 오버라이드 된 toString 결과 출력 -> list2 확인용
		
		System.out.println(list2.size());
		
		System.out.println();
		//for(array): list는 .size()로 부름
		for (int i = 0; i < list2.size(); i++) {
			Member2 member=list2.get(i);
			System.out.println("ID: "+member.getId()+" | PW: "+member.getPassword()+" | Name: "+member.getName());
		}
		
		// Iterator: 인터페이스: List, Set, Map 구조에서 요소를 꺼내 쓰는 방법에 대한 통일성 제공
		// hasNext(): 다음 요소가 존재하는 경우 true
		// next(): 요소 가져오기
		System.out.println();
		System.out.println("ID        PW        Name");
		System.out.println("============================");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			Member2 member2 = (Member2) iterator.next();
			System.out.println(member2.getId()+"\t "+member2.getPassword()+"\t"+member2.getName());
		}
		
		System.out.println();
		System.out.println("ID        PW        Name");
		System.out.println("============================");
		//foreach(){} == foreach(클래스명 변수명a : 배열명b)
		//	-->변수a에 배열b를 담는다.
		//상수 i를 출력해야 하면 반복문에 앞서 따로 변수 선언을 해야 한다.
		for (Member2 member2 : list2) {
			System.out.println(member2.getId()+"\t "+member2.getPassword()+"\t"+member2.getName());
		}
		
		
		
	}
}
