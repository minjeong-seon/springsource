package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	//@RequestMapping(value="/read", method = RequestMethod.GET)
	@GetMapping("/read")
	public void readGet() {
		log.info("read 요청");
	}
	
	//@RequestMapping(value="/register", method = RequestMethod.GET)
	@GetMapping("/register")
	public void registerGet() {
		log.info("register 요청");
	}	
	
	//BoardDTO(forward() 형태일 때만 .jsp에 전달 가능)
	//read 이동
	//RedirectAttributes : 일회성으로 데이터 전달
//	@PostMapping("/register")
//	public String registerPost(BoardDTO dto, RedirectAttributes rttr) {
//		log.info("글 등록");
//		//boardDTO 객체에 담긴 값을 read.jsp에서 사용하고 싶다면?
//		//forward() 형태로 넘길 때만 BoardDTO 값이 유지됨
//		//①addAttribute() : 주소줄에 데이터가 따라감(객체상태로는 값 전달 불가)
////		rttr.addAttribute("name", dto.getName());
////		rttr.addAttribute("password", dto.getPassword());
////		rttr.addAttribute("title", dto.getTitle());
////		rttr.addAttribute("content", dto.getContent());
//		
//		//②addFlashAttribute() : session을 사용함 == 객체 상태로 전달 가능
//		rttr.addFlashAttribute("boardDTO", dto);
//		return "redirect:/board/read";
//	}
//	
//	//@RequestMapping(value="/modify", method = RequestMethod.GET)
//	@GetMapping("/modify")
//	public void modifyGet() {
//		log.info("modify 요청");
//	}	
	
	
	
	//@ModelAttribute("name") : 괄호는 생략 가능, Model 객체 대신 사용
	//											: 도메인 객체에 담을 때 이름 지정하는 기능
	// registerPost(BoardDTO dto) : jsp 페이지가 값을 가져올 때 ${boardDTO.name}
	// registerPost(@ModelAttribute("name") BoardDTO dto) : jsp 페이지가 값을 가져올 때${{dto.name}
	@PostMapping("/register")
	public void registerPost(@ModelAttribute("dto") BoardDTO dto, RedirectAttributes rttr) {
		log.info("글 등록");
		
		//BoardDTO 값이 유지가 되려면 forward로 움직여야 함
		
	}
	
	//@RequestMapping(value="/modify", method = RequestMethod.GET)
	@GetMapping("/modify")
	public void modifyGet() {
		log.info("modify 요청");
	}	
	
	
	
	//@RequestMapping(value="/remove", method = RequestMethod.GET)
	@GetMapping("/remove")
	public void removeGet() {
		log.info("remove 요청");
	}
}
