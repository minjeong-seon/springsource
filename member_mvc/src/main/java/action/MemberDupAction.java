package action;

import javax.servlet.http.HttpServletRequest;

import service.MemberDupService;

public class MemberDupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String userid = request.getParameter("userid");
		MemberDupService service = new MemberDupService();
		boolean check = service.duplicateId(userid);
		
		if(check) {
			//사용할 수 있으면
			request.setAttribute("dupId", "true");
		}else {
			//사용할 수 없으면
			request.setAttribute("dupId", "false");
		}
		return new ActionForward(false, "check.jsp");
	}

}
