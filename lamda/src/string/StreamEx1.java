package string;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 스트림 연산
 *  목적: 다양한 연산을 이용해 복잡한 작업들을 간단히 처리함
 *  연산 종류
 *  	1) 중간 연산 : 연산 결과가 스트림  ex) map(), filter(), skip(),...etc
 *  	2) 최종 연산 : 연산 결과가 스트림이 아닌 상태  ex) forEach(), reduce(). count(), max(), min(),....etc
 *  
 */

public class StreamEx1 {
	public static void main(String[] args) {
		//파일 객체에서 이름을 출력

		List<File> list = new ArrayList<File>();
		list.add(new File("c:\\file1.txt"));
		list.add(new File("c:\\file2.txt"));
		list.add(new File("c:\\file3.txt"));
		list.add(new File("c:\\file4.txt"));
		list.add(new File("c:\\file5.txt"));
		
		//이름만 수집한 후 출력
		List<String> fileNames = new ArrayList<String>();
		for (File file : list) {
			fileNames.add(file.getName());
		}
		
		for (String string : fileNames) {
			System.out.println(string);
		}
		
		System.out.println("-------------------------");
		
		//stream으로 처리
		// stream으로 변환 (list.stream()) -> 연산 (map(클래스명:메소드명)) -> 결과 출력
		
//		Stream<String> names = list.stream().map(File::getName);
//		names.forEach(f -> System.out.println(f));
		
		list.stream().map(File::getName).forEach(f->System.out.println(f));
		
		List<String> fruits = Arrays.asList("apple","melon","pear","grape");
		//fruits 대문자로 변경한 걸 새로운 리스트로 생성 후 출력
		List<String> upper = new ArrayList<String>();
		for (String string : fruits) {
			upper.add(string.toUpperCase());
		}
		for (String string : upper) {
			System.out.println(string);
		}
		
		System.out.println("----------스트림.ver-------------");
		
		fruits.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));;
		
		System.out.println("------------스트림2.ver-------------");
		
		fruits.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));;
	}
}
