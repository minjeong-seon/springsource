package collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*Arrays 클래스
 * 	-배열을 다루는데 유용한 메소드가 정의되어 있다
 * 	-모든 메소드는 static이다
 */

public class ArraysEx1 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		//toString(): 배열의 요소를 문자열로 출력
		System.out.println(arr);	//[I@4361bd48
		System.out.println(Arrays.toString(arr));	//[1, 2, 3, 4, 5]
		
		//deepToString(): 2차원 배열의 요소를 문자열로 출력 
		int arr2[][] = {{11,22},{21,22}};
		System.out.println(Arrays.toString(arr2));	//[[I@762efe5d, [I@5d22bbb7]
		System.out.println(Arrays.deepToString(arr2));	//[[11, 22], [21, 22]]
		
		//Arrays.equals(): 두 배열의 값이 동일하면 true 아니면 false
		String[] str1 = {"aaa","bbb"};
		String[] str2 = {"aaa","bbb"};
		System.out.println(Arrays.equals(str1, str2));;
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		//Arrays.deepEquals(): 두 2차원 배열의 값 비교
		//Returns true if the two specified arrays are deeply equal to one another.
		System.out.println(Arrays.deepEquals(str2D, str2D2));;

		
		//arr 배열을 arr3에 복사
		int arr3[]=new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr3[i]=arr[i];
		}System.out.println(Arrays.toString(arr3));
		
		//copyOf(int[] original, int newLength): (원본배열, 복사할 요소의 개수)
		int[] arr4 = Arrays.copyOf(arr, arr.length);		//<--전부 복사하고 싶을 때
		System.out.println(Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOf(arr,3);		//0~2범위까지 복사, newLength는 포함하지 않음
		System.out.println(Arrays.toString(arr5));
		
		//copyOfRange(int[] original, int from, int to): (원본배열, 시작위치, 끝위치-포함x)
		int[] arr6 = Arrays.copyOfRange(arr,2,4);
		System.out.println(Arrays.toString(arr6));
		
		//fill(): 배열의 모든 요소를 지정된 값으로 채우기(할당하기)
		int arr7[]=new int[5];
		Arrays.fill(arr7,5);		//void 가 리턴일 때, 메소드 호출만 하면 됨
		System.out.println(Arrays.toString(arr7));
		
		//sort(): 정렬
		int arr8[]= {3,2,0,1,4};
		Arrays.sort(arr8);
		System.out.println(Arrays.toString(arr8));
		
		//binarySerch(): 이진검색 -찾는 요소의 위치 리턴. 없는 값을 검색 시 난데없는 값 리턴됨.
		//순차검색: 차례대로 검색(정렬 필요 없음)
		//이진검색: 검색할 범위를 반복적으로 절반씩 줄이며 검색(*정렬 필수*)
		System.out.println(Arrays.binarySearch(arr8,4));
		System.out.println(Arrays.binarySearch(arr8,5));		//없는 값 검색
		
		//asList(): 배열을 List로 변환(크기는 변경 안 됨; 요소 추가가 안 된다는 의미)
		//<T...> : 가변인수
		//<T> : 기본타입이 아니어야 함
		List<Integer> list2=Arrays.asList(1,2,3,4,5,6,8);
		//List<Integer> list=Arrays.asList(arr8); -Type mismatch: cannot convert from List<int[]> to List<Integer>
		Integer[] arr9= {15,16,17,18};
		List<Integer> list3=Arrays.asList(arr9);
		System.out.println("list3: "+list3);
		
	}

}
