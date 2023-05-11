package com.spring.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.PersonDTO;
import com.spring.service.PersonService;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		PersonService service = (PersonService)ctx.getBean("person");
		
		//삽입
//		PersonDTO insertPerson = new PersonDTO("sam101", "샘");
//		System.out.println(service.insertPerson(insertPerson)?"성공":"실패");
		
		//수정
		System.out.println(service.updatePerson(new PersonDTO("sam101", "샘 스미스"))?"성공":"실패");
		
		//삭제
		System.out.println(service.deletePerson("kim1111")?"성공":"실패");
		
		//하나만 조회
		System.out.println(service.getRow("lulu89"));
	
		//전체 조회
		List<PersonDTO> list = service.getRows();
		for (PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
	}

}
