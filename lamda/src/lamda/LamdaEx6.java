package lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaEx6 {
	public static void main(String[] args) {
		// 문자열을 리턴하는 기능 구현
		Supplier<String> s = () -> "good!";
		System.out.println(s.get());
		
		// 문자열을 입력받아서 문자열의 길이가 0인지 판단하는 기능 구현
		Predicate<String> p = a -> a.length()==0;
		System.out.println(p.test("good2!"));
		
		// 문자열을 입력받아서 문자열을 출력하는 기능 구현
		Consumer<String> c = b -> System.out.println(b);
		c.accept("good3!");
		
		// 문자열을 입력받아서 정수로 리턴하는 기능 구현
		Function<String, Integer> f = x -> Integer.parseInt(x)+100;
		System.out.println(f.apply("123"));
		
	}
}
