package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
	
		for (int i = 0;  set.size()<6; i++) {
			int num=(int)(Math.random()*45)+1;
			set.add(num);
			//[해설]
			//	-랜덤 난수 추출에 i값은 의미가 없음
			//	-set은 중복을 허용하지 않으므로 추출 값이 중복이면 중복이 아닐 때까지 for문으로 반복된다.
		}
		System.out.println(set);
		
		
		//sort(List<T>List): List 인터페이스가 처리할 수 있는 객체가 넘어와야 함(T는 Type)
		//	-->구현클래스: ArrayList, LinkedList, Stack, Vector, Queue... 가 넘어와야 한다는 뜻
		//Collections.sort(set);	//List 클래스가 아닌 Set을 넘김:  in the type Collections is not applicable 오류
		
		// Set 구조 > List 구조로 변경하여 꺼내기 가능
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println("오름차순 정렬 후: "+list);
		
		
		
		
		
		
		
	}

}
