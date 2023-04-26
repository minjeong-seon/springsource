package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.factory.TransactionFactory;

import action.Action;
import action.ActionFactory;
import action.ActionForward;
import action.DeleteAction;
import action.InsertAction;

@WebServlet("*.do") // *Url mapping : 클래스명이 아니라 다른 이름으로 url을 지정하는 것
// ==> *.do : 이름은 아무거나 되는데(*) 끝날 때는 .do로 끝나야 함
public class PatternController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String requestURI =  request.getRequestURI();	//requestURI /pattern/insert.do
		//프로젝트 == context
		String contextPath = request.getContextPath();	//contextPath /pattern
		String cmd = requestURI.substring(contextPath.length());	//cmd /insert.do
		
		System.out.println("requestURI "+requestURI);
		System.out.println("contextPath "+contextPath);
		System.out.println("cmd "+cmd);

		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = 	actionFactory.action(cmd);
		
		//생성된 action에 일 시키기(메소드 호출)
			ActionForward af = null;
			try {
				af = action.execute(request);
			} catch (Exception e) {				
				e.printStackTrace();
			}
		
			//반환값에 따라 페이지 이동(사용자에게 화면 보여줌)
			if(af.isRedirect()) {
				response.sendRedirect(af.getPath());
			}else {
				RequestDispatcher rd = request.getRequestDispatcher(af.getPath());
				rd.forward(request, response);
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}