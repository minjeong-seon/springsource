package service;

import persistence.BookDAO;

public class BookUpdateService {
	public boolean update(int price, int code) {
		return new BookDAO().update(price, code);
	}
}
