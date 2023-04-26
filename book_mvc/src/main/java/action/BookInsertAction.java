package action;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookInsertService;


public class BookInsertAction implements BookAction {

	@Override
	public BookActionForward excute(HttpServletRequest request) throws Exception {
		//get or post에서 넘어오는 내용 가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("descriptiom");
		
		BookDTO insertDTO = new BookDTO(code, title, writer, price, description);
		
		//service를 통해 DB 작업
		BookInsertService service = new BookInsertService();
		boolean result = service.insertBook(insertDTO);
		
		String path = "";
		if(result) {
			path = "list.do";		//or  '/book_mvc/list.do'
		}else {
			path = "insert.jsp";
		}
		
		//ActionForward 객체 생성
		return new BookActionForward(true, path);
	}

}
