package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;

import domain.BookDTO;
import service.BookListService;

public class BookListAction implements BookAction {

	@Override
	public BookActionForward excute(HttpServletRequest request) throws Exception {
		//get or set 넘어오는 내용 가져오기(List는 가져올 거 없으므로 안 해도 됨)
		//service를 통해 DB작업(BookListService에서 dao 객체 생성해서 연결한 거 불러다 쓰기)
		BookListService service = new BookListService();
		List<BookDTO> list =service.list();
		
		//list.jsp에 넘겨받은 db 정보 list에 담아 전달하기(jstl 하려고)
		request.setAttribute("list", list);
		
		return new BookActionForward(false, "list.jsp");
	}

}
