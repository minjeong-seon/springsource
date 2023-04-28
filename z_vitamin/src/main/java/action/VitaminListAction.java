package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.VitaminDTO;
import service.VitaminListService;

public class VitaminListAction implements VitaminAction {
	@Override
	public VitaminActionForward execute(HttpServletRequest request) throws Exception {
		VitaminListService service = new VitaminListService();
		List<VitaminDTO> list =service.list();
		
		request.setAttribute("list", list);
		return new VitaminActionForward(false, "list.jsp");
	}

}
