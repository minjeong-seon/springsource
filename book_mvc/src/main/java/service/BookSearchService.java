package service;

import java.util.List;

import domain.BookDTO;
import persistence.BookDAO;

public class BookSearchService {
	public List<BookDTO> search(String criteria, String keyword){
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.getSeacrchList(criteria, keyword);
		return list;
	}
}
