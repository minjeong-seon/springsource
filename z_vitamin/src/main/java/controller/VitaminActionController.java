package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.VitaminAction;
import action.VitaminActionFactory;
import action.VitaminActionForward;

@WebServlet("*.do")
public class VitaminActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글처리 인코딩
		request.setCharacterEncoding("utf-8");
		
		// 1) 사용자 요청 분석 -> context 경로 파악 -> ~.do 추출
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String cmd = requestURI.substring(contextPath.length());
		
		// 2) 공장 가동시키기 - 공장 객체 불러와서 메소드 호출
		VitaminActionFactory vaf = VitaminActionFactory.getInstance();
		VitaminAction action = vaf.action(cmd);
		
		// 3) 서블릿이 받은 request(HttpServletRequest)를 액션에 넘김
		VitaminActionForward vf = null;
		try {
			vf=action.execute(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Last)  이동방식에 따른 페이지 지정 - false = forward, true = sendRedirect
		if(vf.isRedirect()) {
			response.sendRedirect(vf.getPath());
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(vf.getPath());
			rd.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
