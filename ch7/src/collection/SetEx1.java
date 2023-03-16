package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 인터페이스: 순서 존재x, 데이터 중복 x
//	>>구현클래스: HashSet, TreeSet,...

public class SetEx1 {
	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		
		for (int i = 0; i < 100; i++) {
			//String valueOf() : 지정된 값을 문자열로 변환하여 리턴
			set.add(String.valueOf(i));	//순서 없음. 지멋대로 출력함
		}
		
		//중복을 허용하지 않음 (배열에 9를 추가해도 이미 있는 값이므로 담지 않음)
		set.add("9");
		
		System.out.println(set);
		
		
		//접근 방법에 대한 통일성 부여
		Iterator<String> it=set.iterator();
		
		while (it.hasNext()) {
		System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
