package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach2 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A","B","C","D","E");
		
		//list.stream().forEach(null);
		list.forEach(item -> System.out.println(item));
		list.forEach(System.out::println);
		
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("김나리", 99));
		stuList.add(new Student("이명박", 89));
		stuList.add(new Student("정수리", 69));
		stuList.add(new Student("노홍철", 79));
		
		stuList.forEach(student->System.out.println(student.getName()+" : "+student.getJumsu()));
	
	//Map 구조
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("A", 10);
	map.put("B", 20);
	map.put("C", 30);
	map.put("D", 40);
	map.put("E", 50);

	for(Map.Entry<String, Integer> entry : map.entrySet()) {
		System.out.println("Item : "+entry.getKey()+", Count : "+entry.getValue());
	}

	System.out.println();
	
	map.forEach((k,v) -> System.out.println("Item : "+k+", Count : "+v));
	
	System.out.println();
	
	//k 값이 E일 때 hello, E 출력문을 추가
	map.forEach((k,v) ->{
		System.out.println("Item : "+k+", Count : "+v);
		if("E".equals(k)) {
			System.out.println("hello, E");
		}
	});
	
	}
}
