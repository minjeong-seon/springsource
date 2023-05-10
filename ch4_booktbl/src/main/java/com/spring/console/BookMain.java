package com.spring.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.BookDTO;
import com.spring.service.BookService;

public class BookMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		//service 호출
		BookService service = (BookService)ctx.getBean("bookService");
		
		//도서 추가
//		BookDTO insertDto = new BookDTO(1006, "모두의 알고리즘", "이승찬", 25000, "파이썬으로 구현하는 알고리즘");
//		if(service.insertBook(insertDto)) {
//			System.out.println("입력 성공");
//		}
		
		//도서 금액 수정
		BookDTO updateDto = new BookDTO();
		updateDto.setCode(1005);
		updateDto.setPrice(23000);
		if(service.updateBook(updateDto)) {
			System.out.println("수정 성공");
			System.out.println();
		}
		
		//도서 상세보기
		BookDTO getRow = service.getBook(1004);
		System.out.println(getRow);
		System.out.println();
		
		//도서 삭제
		if(service.deleteBook(1006)) {
			System.out.println("삭제 성공");
		};
		
		
		//전체 도서 목록 가져오기
		List<BookDTO> list = service.getBookList();
		for(BookDTO bookDTO : list) {
			System.out.println(bookDTO);
		}
		
	}

}
