package action;

import javax.servlet.http.HttpServletRequest;

public interface VitaminAction {
	public VitaminActionForward execute(HttpServletRequest request) throws Exception;
}
