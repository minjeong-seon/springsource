package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.BookDTO;
import com.spring.mapper.BookMapper;


@Service("bookService")
public class BookServiceImple implements BookService {
	@Autowired
	private BookMapper mapper;
	
//	public BookServiceImple(BookDAO bookDAO) {
//		super();
//		this.bookDAO = bookDAO;
//	}

	@Override
	public boolean insertBook(BookDTO insertDto) {
		return mapper.insert(insertDto)==1?true:false;
	}

	@Override
	public boolean updateBook(int price, int code) {
		return mapper.update(price, code)==1?true:false;
	}

	@Override
	public boolean deleteBook(int code) {
		return mapper.delete(code)==1?true:false;
	}

	@Override
	public BookDTO getBook(int code) {
		return mapper.selectOne(code);
	}

	@Override
	public List<BookDTO> getBookList() {
		return mapper.selectAll();
	}

}
