package com.spring.memo.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.memo.entity.Item;
import com.spring.memo.entity.Member;
import com.spring.memo.entity.OrderItem;
import com.spring.memo.entity.OrderStatus;
import com.spring.memo.entity.Orders;

@SpringBootTest
public class OrderRepositoryTest {
	@Autowired
	private OrderRepository repo;
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired
	private OrderItemRepository oiRepo;
	
	@Autowired
	private ItemRepository itemRepo;
	
//	@Test
//	public void createOrders() {
//		Member member = memberRepo.findById(1L).orElseThrow();
//		
//		Orders order = Orders.builder()
//				.member(member)
//				.orderStatus(OrderStatus.ORDER)
//				.orderDate(LocalDateTime.now())
//				.build();
//		
//		repo.save(order);
//	}
	
	// order를 통해 member 정보 조회
//	@Test
//	public void getOrder() {
//		repo.findById(1L).ifPresent(o -> System.out.println(o));
//	}
	
//	@Test
//	public void createOrderItem() {
//		Item item = itemRepo.findById(1L).orElseThrow();
//		Orders order = repo.findById(1L).orElseThrow();
//		
//		OrderItem orderItem = OrderItem.builder()
//																.item(item)
//																.orders(order)
//																.orderPrice(75000)
//																.count(1)
//																.regTime(LocalDateTime.now())
//																.updateTime(LocalDateTime.now())
//																.build();
//		
//		oiRepo.save(orderItem);
//	}
	
	
	// order를 통해 orderItem 정보 조회
	@Test
	public void getOrder() {
		oiRepo.findById(1L).ifPresent(o -> System.out.println(o));
	}
	
	
	
	
	
	
}
