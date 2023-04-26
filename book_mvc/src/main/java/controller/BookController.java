package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.BookAction;
import action.BookActionFactory;
import action.BookActionForward;

@WebServlet("*.do")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 처리
		request.setCharacterEncoding("utf-8");
		//요청 분석: 1) 요청 경로 2)context 경로 3)~.do 추출
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String cmd = requestURI.substring(contextPath.length());
		
		//action 생성 - BookActionFactory
		BookActionFactory baf = BookActionFactory.getInstance();
		BookAction action = baf.action(cmd);
				
		//생성된 action에 일 시키기
		BookActionForward af = null;
		try {
			af= action.excute(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//이동방식에 따라 페이지 보여주기
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
