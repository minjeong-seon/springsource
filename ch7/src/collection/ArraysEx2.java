package collection;

import java.util.Arrays;
import java.util.Comparator;
/* 정렬
 * 	comparable 인터페이스: 기본 정렬 기준을 구현할 때 사용
 * 		1)compareTo(Object o)
 
 * 	comparator 인터페이스: 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 때 사용
 * 		1)compare(Object o)
 */

public class ArraysEx2 {
	public static void main(String[] args) {
		int arr[]= {37,21,56,99,88,58,62,15,39,78};
		String strArr[]= {"cat"," ","Dog","lion","tiger"};
		
		//(숫자)오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//(그 외)사전 순으로 정렬(공백>숫자>대문자>소문자 순으로 정렬)
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		//내림차순 정렬
		// 1) sort(T a[],, Comparator<? super T> c): Comparator(정렬기준)를 구현한 클래스를 작성 후 sort에 호출 
		Arrays.sort(strArr, new DescComp());
		// 2) comparator.reverseOrder 사용
		Arrays.sort(strArr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		//Arrays.sort(arr,Comparator.reverseOrder());	<--T는 참조타입만 가능하므로 int arr[]는 사용불가. Integer arr[]로 변경해야 함
		
	}
}


class DescComp implements Comparator<String>{
//compareTo: ch7>lang>StringEx2 참고
	//크다,이전(1) | 같다(0) | 작다,이후(-1)
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*-1;
	}
	
	
}