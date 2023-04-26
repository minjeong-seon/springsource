package service;

import domain.BookDTO;
import persistence.BookDAO;

public class BookInsertService {
	public boolean insertBook(BookDTO insertDTO) {

		BookDAO dao = new BookDAO();
		return dao.insert(insertDTO);
	}
}
