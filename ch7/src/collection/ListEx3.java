package collection;

import java.util.LinkedList;

/*배열과 List는 동일한 개념
 * 	-배열은 index 크기 변경 불가 (변경하려면 새로운 배열 생성 후 데이터 복사 필요)
 * 	-비순차적인 데이터의 추가/삭제에 시간이 오래 소요됨(=중간에 데이터 추가/삭제 작업이 불편함ㅠ)
 * 
 * 	=> 배열의 개선: List (그러나 ArrayList 내부적으로는 배열의 동작방식과 똑같이 작동)
 * 
 * LinkedList
 * 	-ArrayList의 단점 보완
 * 
 * 					읽기(접근시간)		추가/삭제		비고
 * ArrayList			빠르다			 느리다		순차적인 추가/삭제는 더 빠름, 비효율적인 메모리 사용
 * LinkedList			느리다			 빠르다		데이터가 많을수록 접근성이 떨어짐
 * 
 */

public class ListEx3 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("딸기");
		list.add("사과");
		list.add("멜론");
		list.add("용과");
		list.add("두리안");
		list.add("자두");
		list.add("복숭아");
		list.add("수박");
		
		for (String fruit : list) {
			System.out.println(fruit);
		}
		
		
		
		
	}

}
