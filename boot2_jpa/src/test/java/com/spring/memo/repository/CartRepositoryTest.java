package com.spring.memo.repository;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.memo.entity.Cart;
import com.spring.memo.entity.Member;

@SpringBootTest
public class CartRepositoryTest {

	@Autowired
	private CartRepository repo;
	
	@Autowired
	private MemberRepository memberRepo;
	
//	@Test
//	public void createCart() {
//		//Optional<Member> : 데이터가 있을 수도 / 없을 수도 있음을 나타내므로 데이터를 불러올 수 없을 수도 있음
//		Optional<Member> member = memberRepo.findById(1L);
//		
//		member.ifPresent(mem -> {
//			Cart cart = Cart.builder().member(mem).build();
//			repo.save(cart);
//		});
//	}
	
	// 카트 조회
	@Test
	public void getCart() {
		repo.findById(3L).ifPresent(c -> System.out.println(c));
	}
	
	
	
	
	
}
