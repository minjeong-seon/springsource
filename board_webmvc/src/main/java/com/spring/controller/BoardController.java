package com.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardDTO;
import com.spring.domain.Criteria;
import com.spring.domain.PageDTO;
import com.spring.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void listGet(Model model, @ModelAttribute("cri") Criteria cri) {	//forward 되는 jsp 페이지에서 'cri'로 객체 불러서 사용 가능
		log.info("게시글 전체 목록 가져오기...");
		log.info("type "+Arrays.toString(cri.getTypeArr()));
		// 사용자가 요청한 번호에 맞는 게시물 목록 요청
		List<BoardDTO> list = service.getList(cri);
		//전체 게시물 숫자
		int total = service.getTotalCnt(cri);
		
		model.addAttribute("list", list);
		model.addAttribute("pageDTO", new PageDTO(cri, total));
	}
	
	@GetMapping("/register")
	public void registerGet(BoardDTO dto){
		log.info("새 글 등록 페이지 요청..." + dto);
	}
	
	@PostMapping("/register")
	public String registerPost(BoardDTO dto, RedirectAttributes rttr, Criteria cri){
		log.info("새 글 등록 페이지 요청..." + dto);
		
		if(service.insert(dto)) {			
			log.info("게시글 번호 : "+dto.getBno());
			
			rttr.addFlashAttribute("result", dto.getBno());
			//페이지 나누기 정보 주소줄에 같이 보내기
			rttr.addAttribute("page", cri.getPage());
			rttr.addAttribute("page", cri.getAmount());
			return "redirect:/board/list";
		}else {
			return "/board/register";
		}	
	}
	
	@GetMapping({"/read", "/modify"})
	public void readGet(int bno, Model model, @ModelAttribute("cri") Criteria cri) {
		log.info("게시글 상세 보기 페이지 요청..."+bno);
		log.info("게시글 수정 페이지 요청..."+bno);
		
		BoardDTO dto = service.read(bno);
		model.addAttribute("dto", dto);
	}
	
	// 수정, 삭제 요청을 진행할 때는 result(name)에 success를 담는다 => js에서 result 값이 int(bno)면 게시글 등록 수행
	@PostMapping("/modify")
	public String modifyPost(BoardDTO dto, RedirectAttributes rttr, Criteria cri) {
		log.info("게시글 수정 요청..."+cri);
		service.update(dto);
		rttr.addFlashAttribute("result","수정완료");
		
		//페이지 나누기 정보 주소줄에 같이 보내기
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("page", cri.getAmount());
		//검색 정보 주소줄에 보내기
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		return "redirect:/board/list";	
	}
	
	@GetMapping("/remove")
	public String removeGet(int bno, RedirectAttributes rttr, Criteria cri) {
		log.info("게시글 삭제 요청..."+cri);
		service.remove(bno);
		rttr.addFlashAttribute("result", "success");
		
		//페이지 나누기 정보 주소줄에 같이 보내기
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("page", cri.getAmount());
		//검색 정보 주소줄에 보내기
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		return "redirect:/board/list";
	}
	
}
