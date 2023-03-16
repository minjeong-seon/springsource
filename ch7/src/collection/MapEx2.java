package collection;

import java.util.Collection;
import java.util.Collections; 	//클래스: collection(인터페이스)에 사용할 메소드를 가지고 있음
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("가나다", 90);
		map.put("라마바", 100);
		map.put("사아자", 95);
		map.put("차카타", 98);
		map.put("김파하", 88);
		map.put("이문세", 89);

		//map에 담긴 요소 확인하기
		//enterSet(): map==>set 구조 변환
		//Entry: key와 value의 결합
		Set<Entry<String, Integer>> set=map.entrySet();
		
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
			System.out.println("이름: "+entry.getKey()+" | 점수: "+entry.getValue());
		}
		
		
		//keySet(): key 값만 받음
		Set<String> keys=map.keySet();
		System.out.println("참가자 명단: "+keys);
		
		//values()
		Collection<Integer> values = map.values();
		System.out.println("점수: "+values);
		
		//Collections 클래스: Collection(->interface)에 사용할 메소드들을 가지고 있음
		
		//총점, 평균, 최고점, 최저점 구하기
		int total = 0;
		Iterator<Integer> it2 = values.iterator();
		while (it2.hasNext()) {
			total+=it2.next();
		}System.out.println("총점: "+total);
			System.out.println("평균: "+(float)total/set.size());
			System.out.println("최고 점수: "+Collections.max(values));
			System.out.println("최고 점수: "+Collections.min(values));		
		
		//[해설]
		//total+=it2.next();	->점수를 하나씩 가져와 더하기
		//Collections 클래스 안에 있는 max 메소드 호출
		//Collections 클래스 안에 있는 min 메소드 호출
		
	}

}
