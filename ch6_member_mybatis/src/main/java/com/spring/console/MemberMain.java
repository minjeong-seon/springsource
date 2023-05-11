package com.spring.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.MemberDTO;
import com.spring.service.MemberService;

public class MemberMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		MemberService service = (MemberService) ctx.getBean("member");
		
		//회원등록
//		MemberDTO insert = new MemberDTO("sleep", "bed111", "김수면", 1, "sleepingbear@naver.com");
//		if(service.insert(insert)) {
//			System.out.println("입력 성공");
//		}
		
		//회원수정
//		MemberDTO update = new MemberDTO();
//		update.setUserid("sugarush");
//		update.setPassword("930308");
//		update.setEmail("sugaboss@gmail.com");
//		System.out.println(service.update(update)?"수정 성공":"수정 실패");
//
//		//회원삭제
//		if(service.delete("sleep", "김수면")) {
//			System.out.println("삭제 성공");
//		};
		
		//회원상세조회
		System.out.println(service.getRow("taetae_s2"));
		
		//회원전체조회
		List<MemberDTO> list = service.getRows();
		for (MemberDTO memberDTO : list) {
			System.out.println(memberDTO);
		}
		
		
		
		
		
	}
}
