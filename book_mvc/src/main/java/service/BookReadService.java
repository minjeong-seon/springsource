package service;

import domain.BookDTO;
import persistence.BookDAO;

public class BookReadService {
	
		public BookDTO read(int code) {
			BookDAO dao = new BookDAO();
			BookDTO read = dao.getRow(code);
			return read;
		}
}
