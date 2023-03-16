package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*stack : 데이터 후입선출
 * 	-수식계산, 수식 괄호검사, 워드 undo/redo, 웹브라우저 뒤로/앞으로
 * 	-순차적으로 데이터 추가>삭제 : 배열 기반인 ArrayList 가 적합
 * 
 *queue : 데이터 선입선출
 *		-최근 사용문서, 인쇄작업 대기목록, 버퍼
 *		-먼저 저장된 데이터부터 삭제하므로 데이터 추가/삭제가 용이한 LinkedList가 적합
 */

public class ListEx4 {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		Queue<String> queue=new LinkedList<>();
		
		//stack 삽입 (push)
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		//queue 삽입 (offer)
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		
		//stack 내용 꺼내기(pop)
		System.out.println("========*Stack*========");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		//queue 내용 꺼내기(poll)
		System.out.println("========*Queue*========");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
		
		
		
		
		
		
	}

}
