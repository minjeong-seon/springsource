package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import domain.SearchDTO;
import service.BookSearchService;

public class BookSearchAction implements BookAction{
	@Override
	public BookActionForward excute(HttpServletRequest request) throws Exception {
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		BookSearchService service = new BookSearchService();
		List<BookDTO> list = service.search(criteria, keyword);
		
//		request.setAttribute("criteria", criteria);
//		request.setAttribute("keyword", keyword);
		SearchDTO searchDto = new SearchDTO(criteria, keyword);
		request.setAttribute("searchDto", searchDto);
		request.setAttribute("list", list);
		
		return new BookActionForward(false, "list.jsp");
	}
	
}
