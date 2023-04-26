package action;

import javax.servlet.http.HttpServletRequest;

import service.BookUpdateService;

public class BookUpdateAction implements BookAction {

	@Override
	public BookActionForward excute(HttpServletRequest request) throws Exception {
		int code = Integer.parseInt(request.getParameter("code"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		BookUpdateService service = new BookUpdateService();
		boolean result = service.update(price, code);
		
		String path = "";
		if(result) {
			path = "list.do";	
		}else {	//실패는 나지 않지만 구조를 파악하기 위해 적는 것..
			path = "modify.do?code="+code;
		}
		return new BookActionForward(true, path);
	}

}
