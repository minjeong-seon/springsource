package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.domain.AddDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CalcController {
	@GetMapping("/add")
	public void addForm() {
		log.info("add요청");
	}
	
	//사용자 입력값 가져오기
	// 1) HttpServletRequest 사용하기
	// 2) 변수 사용 : (1) 변수명=폼태크 name과 일치 / 폼태그 name과 일치하지 않을 때는 @RequestMapping
	// 3) 바인딩 객체 사용
	
	// 2) 변수 사용 시 
//	@PostMapping("/add")
//	public void addPost(int num1, int num2) {
//		log.info("add Post 요청");
//		log.info("num1 "+num1);
//		log.info("num2 "+num2);
//		log.info("num1 + num2 "+(num1+num2));
//	}
	
	// 3) 바인딩 객체 사용 시
	/*
	 * @PostMapping("/add") public void addPost(AddDTO dto) {
	 * log.info("add Post 요청"); log.info("num1 "+dto.getNum1());
	 * log.info("num2 "+dto.getNum2());
	 * log.info("num1 + num2 "+(dto.getNum1()+dto.getNum2())); }
	 */
	
	@PostMapping("/add")
	public String addPost(@ModelAttribute("add") AddDTO dto, @ModelAttribute("page") String page, Model model) {
		log.info("add Post 요청");
		log.info("num1 "+dto.getNum1());
		log.info("num2 "+dto.getNum2());
		log.info("page "+page);
		int result = dto.getNum1()+dto.getNum2();
		log.info("result = "+(result));		//result 값을  result.jsp에서 사용하고 싶다면? =model 객체 사용
		
		model.addAttribute("result", result);
		//model.addAttribute("page", page);
		
		return "result";	 //  /WEB-INF/views/result.jsp + forward 방식(=주소와 페이지가 다름)으로 이동 
	}
}
