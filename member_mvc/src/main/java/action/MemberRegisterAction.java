package action;

import javax.servlet.http.HttpServletRequest;

import domain.MemberDTO;
import service.MemberRegisterService;

public class MemberRegisterAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		/*
		 * String userId = request.getParameter("userid"); String password =
		 * request.getParameter("password"); 
		 * String name = request.getParameter("name");
		 * String gender = request.getParameter("gender"); 
		 * String email = request.getParameter("email");
		 * 
		 * MemberDTO dto = new MemberDTO(userId, password, name, gender, email);
		 */
		MemberDTO dto = new MemberDTO();
		dto.setUserid(request.getParameter("userid"));
		dto.setPassword(request.getParameter("password"));
		dto.setName(request.getParameter("name"));
		dto.setGender(request.getParameter("gender"));
		dto.setEmail(request.getParameter("email"));
		MemberRegisterService service = new MemberRegisterService();
		boolean result = service.register(dto);
		
		String path="";
		if(result) {
			path="/login.jsp";
		}else {
			path="/register.jsp";
		}
		
		return new ActionForward(false, path);
	}

}
