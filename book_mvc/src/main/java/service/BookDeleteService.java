package service;

import persistence.BookDAO;

public class BookDeleteService {
	public boolean deleteBook(int code) {
		return new BookDAO().remove(code);
	}
}
