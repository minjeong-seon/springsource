package action;

import javax.servlet.http.HttpServletRequest;
//반복적인 메소드 인터페이스로 정의해놓기
public interface Action {
	public ActionForward execute(HttpServletRequest request) throws Exception;
}
