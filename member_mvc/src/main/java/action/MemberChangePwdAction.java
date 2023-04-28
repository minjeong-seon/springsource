package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.ChangeDTO;
import domain.MemberDTO;
import service.MemberChangePwdService;
import service.MemberLoginService;

public class MemberChangePwdAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		//post 가져오기
		ChangeDTO dto = new ChangeDTO();
		dto.setUserid(request.getParameter("userid"));
		dto.setCurrentPassword(request.getParameter("current-password"));
		dto.setNewPassword(request.getParameter("new-password"));
		dto.setConfirmPassword( request.getParameter("confirm-password"));
		
		//userid와 현재비번에 일치하는 회원이 있는지 확인
		MemberLoginService check = new MemberLoginService();
		MemberDTO checkAccount = check.login(dto.getUserid(), dto.getCurrentPassword());
		
		String path = "";
		if(checkAccount !=null) {
			//일치하면 비번 변경 서비스 호출
			MemberChangePwdService service = new MemberChangePwdService();
			if(service.changepwd(dto)) {
				//로그인 되어 있던 기존 세션 해제(모든 세션 사요나라)
				HttpSession session = request.getSession();
				session.invalidate();
				path = "login.jsp";
			}
		}else {
			//불일치하면 비번 변경페이지로 되돌아가기
				path = "change.jsp";
		}
		return new ActionForward(true, path);
	}

}
