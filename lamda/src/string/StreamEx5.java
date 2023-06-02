package string;

import java.util.Arrays;
import java.util.stream.IntStream;

//최종연산
// count(), max(), min(), average(), sum()

public class StreamEx5 {
	public static void main(String[] args) {
		// IntStream : int ==> stream
		IntStream stream1 = Arrays.stream(new int [] {1,4,6,8,9});
		
		// 2의 배수는 몇 개인가?
		System.out.println("2의 배수 개수: "+stream1.filter(f-> f%2==0).count()+"개");
		
		// java.lang.IllegalStateException : stream has already been operated upon or closed 
		// stream은 일회용(한 번 사용하면 재사용 불가)이므로 스트림을 새로 생성해야 함(stream1 = Arrays.stream(new int [] {1,4,6,8,9});)
		stream1 = Arrays.stream(new int [] {1,4,6,8,9});
		System.out.println("2의 배수의 합: "+stream1.filter(f-> f%2==0).sum());
		
		//OptionalDouble
		stream1 = Arrays.stream(new int [] {1,4,6,8,9});
		System.out.println("2의 배수의 평균: "+stream1.filter(f-> f%2==0).average());
		
		//OptionalInt
		stream1 = Arrays.stream(new int [] {1,4,6,8,9});
		System.out.println("2의 배수 중 최솟값: "+stream1.filter(f-> f%2==0).min());
		
		//OptionalInt
		stream1 = Arrays.stream(new int [] {1,4,6,8,9});
		System.out.println("2의 배수 중 최댓값: "+stream1.filter(f-> f%2==0).max());

		//OptionalInt
		stream1 = Arrays.stream(new int [] {1,4,6,8,9});
		System.out.println("2의 배수 첫번째 값: "+stream1.filter(f-> f%2==0).findFirst());
		
	}

}
