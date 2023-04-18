package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * jsp == servlet : 하는 일(=할 수 있는 일)이 같음 => 사용자 요청 처리
 * jsp : 화면에 구현하기 편함+태그가 존재함
 * servlet : 클래스 장점 가지고 있음
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//get method에만 작동
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		//화면에 보여주기	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h3> 이름 : " +name+ "</h3>");
		out.print("<h3> 나이 : " +age+ "</h3>");
	}

	//post method에만 작동
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		//post 메소드일 때 파라미터 받아서 get에 작성했던 메소드 실행하기(재귀호출)
		doGet(request, response);
	
	}

}
