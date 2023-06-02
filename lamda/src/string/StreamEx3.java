package string;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
	public static void main(String[] args) {
		
		// skip(int), limit(int) : 스트림 자르기(건너뛰기, 대상 개수 제한)
		// 
		
		List<String> list = Arrays.asList("딸기","바나나","사과","석류","복숭아","수박");
		
		// 앞의 두 요소는 건너뛰기 + 3개 요소만 출력하기
		list.stream().skip(2).limit(3).forEach(System.out::println);
	}
}
