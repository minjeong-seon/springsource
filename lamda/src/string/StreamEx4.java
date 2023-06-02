package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 최종 연산 : collect
public class StreamEx4 {
	public static void main(String[] args) {
		
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("김나리", 99));
		stuList.add(new Student("이명박", 89));
		stuList.add(new Student("정수리", 69));
		stuList.add(new Student("노홍철", 79));
		
		// 새로운 리스트에 학생들의 점수를 저장하고 출력
		List<Integer> jumsuList = stuList.stream().map(s -> s.getJumsu()).collect(Collectors.toList());
		System.out.println(jumsuList);
		
		// 새로운 리스트에 대문자로 변경한 과일이름 수집하기
		List<String> fruits = Arrays.asList("apple","melon","pear","grape");
		List<String> upper = fruits.stream().map(f->f.toUpperCase()).collect(Collectors.toList());
		System.out.println(upper);
		
		
		
		
		
		
	}
}
