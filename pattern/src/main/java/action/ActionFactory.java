package action;

import javax.servlet.http.HttpServletRequest;

/*
 * 디자인 패턴 : 개발 방식 정의
 * 
 * 싱글톤(singleton) 패턴
 * 	>객체 생성하는 메소드가 여러번 호출되어도 단 하나의 객체만 생성 가능(인스턴스1개만)
 * 	>메모리 낭비 방지 가능
 *  (private으로 막아서 외부에서 계속 인스턴스 생성해서 heap메모리 낭비하는 걸 막을 수 있음)
 */

public class ActionFactory {
	private static ActionFactory actionFactory;
	
	//생성자: The constructor ActionFactory() : private으로 설정해서 외부에서 접근 불가
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		if(actionFactory == null) {
			actionFactory = new ActionFactory();
		}return actionFactory;
	}
	
	//Action 리턴 메소드(action)
	//어디서 요청이 왔는지(cmd)에 따라 Action 생성
	Action action;	
	public Action action(String cmd) {
		if(cmd.equals("/insert.do")) {
			action = new InsertAction();
		}else if(cmd.equals("/list.do")) {
			
		}else if(cmd.equals("/update.do")) {
			
		}else if(cmd.equals("/delete.do")) {
			action = new DeleteAction();
			}
		return action;
	}
			
	
	
	
	
	
	
	
}
