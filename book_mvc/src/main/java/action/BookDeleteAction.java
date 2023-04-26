package action;

import javax.servlet.http.HttpServletRequest;

import service.BookDeleteService;

public class BookDeleteAction implements BookAction {
	@Override
	public BookActionForward excute(HttpServletRequest request) throws Exception {
		int code = Integer.parseInt(request.getParameter("code"));
		
		BookDeleteService service = new BookDeleteService();
		boolean result = service.deleteBook(code);
		
		String path = "";
		if(result) {
			path="list.do";
		}
		
		return new BookActionForward(true, path);
	}

}
