package com.spring.memo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.memo.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {

	@Autowired
	private MemberRepository repository;
	
	@Test
	public void createMember() {
		Member member = Member.builder()
													.name("김제육")
													.email("jeyuk@gmail.com")
													.address("서울시 마포구 연희동")
													.password("kim123")
													.build();
		
		repository.save(member);
	}
	
}
