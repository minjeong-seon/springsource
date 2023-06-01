package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BookDTO;
import com.spring.domain.SearchDTO;
import com.spring.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/book")
@Slf4j
public class BookController {
	
	@Autowired
	private BookService service;	
	
	
	//http://localhost:8080/book/insert + GET
	//  /product/insert.jsp 보여주기
//	@GetMapping("/insert")
//	public String insertForm() {
//		log.info("도서 정보 추가 폼 요청");		
//		return "/product/insert";
//	}
//	
//	// http://localhost:8080/book/insert + POST 	
//	@PostMapping("/insert")
//	public String insertPost(BookDTO dto) {
//		log.info("도서 정보 추가");
//		
//		//입력값 가져오기 - HttpServletRequest, 변수, ~~DTO
//		//서비스 작업
//		try {
//			boolean insertFlag = service.insert(dto);
//			if(insertFlag) {
//				//입력 성공 시 목록 보여주기
//				return "redirect:/book/list";
//			}else {
//				//입력 실패 시 insert.jsp 보여주기
//				return "/product/insert";
//			}			
//		} catch (Exception e) {
//			System.out.println("오류");
//			return "/product/insert";
//		}		
//	}
//	
//	
//	// http://localhost:8080/book/list + GET => list.jsp 보여주기
//	@GetMapping("/list")
//	public String listForm(Model model) {
//		log.info("도서 정보 목록 요청");
//		
//		//사용자가 작성한 값 가져오기
//		//service 작업
//		List<BookDTO> list = service.getList();		
//		//list 에 담긴 정보를 list.jsp에 보여주고 싶다면?
//		model.addAttribute("list", list); //== request.setAttribute()		
//		return "/product/list";
//	}
//	
//	// http://localhost:8080/book/read?code=1001 + GET
//	@GetMapping("/read")
//	public String readGet(int code, Model model) {
//		log.info("read 요청 "+code);
//		
//		BookDTO dto = service.get(code);
//		model.addAttribute("dto", dto);
//		
//		return "/product/read";
//	}
	
	
	//http://localhost:8080/book/insert + GET
	//  /book/insert.jsp 보여주기
	
	@GetMapping("/insert")
	public void insertForm() {
		log.info("도서 정보 추가 폼 요청");			
	}
	
	// http://localhost:8080/book/insert + POST 	
	@PostMapping("/insert")
	public String insertPost(BookDTO dto) {
		log.info("도서 정보 추가");
		
		//입력값 가져오기 - HttpServletRequest, 변수, ~~DTO
		//서비스 작업
		try {
			boolean insertFlag = service.insert(dto);
			if(insertFlag) {
				//입력 성공 시 목록 보여주기
				return "redirect:/book/list";
			}else {
				//입력 실패 시 insert.jsp 보여주기
				return "/book/insert";
			}			
		} catch (Exception e) {
			System.out.println("오류");
			return "/book/insert";
		}		
	}
	
	
	// http://localhost:8080/book/list + GET => book/list.jsp 보여주기
	@GetMapping("/list")
	public void listForm(Model model) {
		log.info("도서 정보 목록 요청");
		
		//사용자가 작성한 값 가져오기
		//service 작업
		List<BookDTO> list = service.getList();		
		//list 에 담긴 정보를 list.jsp에 보여주고 싶다면?
		model.addAttribute("list", list); //== request.setAttribute()		
	}
	
	// http://localhost:8080/book/read?code=1001 + GET => book/read.jsp
	// http://localhost:8080/book/modify?code=1008 [수정할 대상 보여주기]
	@GetMapping({"/read", "/modify"})		//2개도 지정 가능
	public void readGet(int code, Model model) {
		log.info("read 요청 "+code);
		log.info("도서 정보 수정 화면 요청..."+ code);
		
		BookDTO dto = service.get(code);
		model.addAttribute("dto", dto);	
		//viewResolver 동작(요청 경로 이용) 
	}

	//도서정보 수정 성공 시 book/read로 이동
	@PostMapping("/modify")
	public String updatePost(BookDTO dto, RedirectAttributes rttr) {
		log.info("도서 정보 수정 요청..." + dto);
		service.update(dto);
		rttr.addAttribute("code", dto.getCode());
		return "redirect:/book/read";
	}
	
	@GetMapping("/remove")
	public String removeGet(int code, RedirectAttributes rttr) {
		log.info("도서 정보 삭제..."+code);
		service.delete(code);
		rttr.addAttribute("code", code);
		return "redirect:/book/list";
	}
	
	@GetMapping("/search")
	public String searchGet(SearchDTO search, Model model) {
		log.info("도서 정보 검색" + search);
		
		List<BookDTO> list = service.getSearchList(search.getCriteria(), search.getKeyword());
		
		model.addAttribute("list", list);
		model.addAttribute("searchDTO", search);
		
		return "/book/list";
	}
	
	
	
	
}












