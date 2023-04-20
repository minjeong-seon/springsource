package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.domain.LoginDTO;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("userid");
		String pwd = request.getParameter("password");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<h4>아이디 : "+id+"</h4>");
		out.print("<h4>비밀번호 : "+pwd+"</h4>");
				
		//session에 저장
		HttpSession session = request.getSession();
		session.setAttribute("loginDTO", new LoginDTO(id, pwd));
		//페이지 이동
		//session 사용(로그인(세션), 장바구니(쿠키) 같은 거) 시 => response.sendRedirect()
		//그러나 페이지끼리 데이터 공유 시 모든 데이터를 다 session에 담지는 않음
		//session을 사용하지 않는 데이터를 공유할 때는 forward() 사용  -ex) 게시판 작업
		//forward("다른 페이지b") : 해당 (포워드가 있는)페이지a가 가진 req, res를 다른 페이지로 넘겨줌(페이지 a가 페이지 b와 내용이 같아짐) 
		
		out.print("<h4><a href=\"session/request2.jsp\">이동</a></h4>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
