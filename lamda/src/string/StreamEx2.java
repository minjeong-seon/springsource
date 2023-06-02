package string;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("바둑","포도","바질","비둘기","바이트", "바둑");
		
		//'바' 로 시작하는 요소를 새로운 리스트에 추가 후 출력
		List<String> baList = new ArrayList<String>();
		for (String string : list) {
			if(string.startsWith("바")) {
				baList.add(string);
			}
		}
		for (String string : baList) {
			System.out.println(string);
		}
		
		System.out.println("------------filter-------------");
		
		// filter() : 스트림 요소 걸러내기
		list.stream().filter(str -> str.startsWith("바")).forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("김나리", 99));
		stuList.add(new Student("이명박", 89));
		stuList.add(new Student("정수리", 69));
		stuList.add(new Student("노홍철", 79));
		stuList.add(new Student("김호철", 39));
		
		// 성이 '김'인 학생들의 이름 출력
		for (Student stu : stuList) {
			if(stu.getName().startsWith("김")) {
				System.out.println(stu.getName());
			}
		}
		
		System.out.println("------------filter-------------");
		
		stuList.stream().filter(stu -> stu.getName().startsWith("김"))
								.forEach(s -> System.out.println(s.getName()));
		
		System.out.println("------------filter-toString------------");
		
		stuList.stream().filter(stu -> stu.getName().startsWith("김")).forEach(System.out::println);
		
		System.out.println("------------distinct-------------");
		
		// distinct() : 중복 요소 제거
		List<String> list2 = Arrays.asList("바둑","포도","바질","비둘기","바이트", "바둑");
		list2.stream().distinct().forEach(System.out::println);
		
		
		System.out.println("-------------------------");
		
		//Arrays.asList() : array ==> list
		//Stream.of() : array ==> stream
		Stream<File> stream = Stream.of(new File("d:\\test1.txt"), new File("d:\\test2.txt"), new File("d:\\test3.txt"), 
				new File("d:\\test1.java"), new File("d:\\test1.bak"), new File("d:\\test"));
		
		// 파일 확장자 추출한 후 중복을 제거하여 출력하기
		// 파일명 추출 > 확장자 추출 > 확장자 수집 > 중복제거 > 출력
		// peek() : 연산 중간 결과 확인
		stream.map(File::getName)
				.filter(f -> f.indexOf(".") > -1)
				.peek(f -> System.out.println("필터 통과 후 "+f))
				.map(f -> f.substring(f.lastIndexOf(".")+1))
				.distinct()
				.forEach(System.out::println);	
		
	}
}
