package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.domain.BoardDTO;
import com.spring.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void listGet(Model model) {
		log.info("게시글 전체 목록 가져오기...");
		List<BoardDTO> list = service.getList();
		model.addAttribute("list", list);
	}
	
	@GetMapping("/register")
	public void registerGet(BoardDTO dto){
		log.info("새 글 등록 페이지 요청..." + dto);
	}
	
	@PostMapping("/register")
	public String registerPost(BoardDTO dto){
		log.info("새 글 등록 페이지 요청..." + dto);
		if(service.insert(dto)) {			
			return "redirect:/board/list";
		}else {
			return "/board/register";
		}	
	}
	
	@GetMapping("/read")
	public void readGet(int bno, Model model) {
		log.info("게시글 상세 보기 페이지 요청..."+bno);
		BoardDTO dto = service.read(bno);
		model.addAttribute("dto", dto);
	}
	
	
	
	
	
	
	
}
