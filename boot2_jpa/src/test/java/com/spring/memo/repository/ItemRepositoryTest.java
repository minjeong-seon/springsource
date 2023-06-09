package com.spring.memo.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.memo.entity.Item;
import com.spring.memo.entity.ItemSellStatus;

@SpringBootTest
public class ItemRepositoryTest {

	// ItemRepository 가 잘 작성되었는지 테스트 : 단위 테스트
	
	@Autowired
	private ItemRepository repo;
	
	@Test
	public void itemCreateTest() {
		Item item = new Item();
//		item.setItemNm("터치 선풍기");
//		item.setPrice(75000);
//		item.setStockNumber(30);
//		item.setItemDetail("신일");
//		item.setItemSellStatus(ItemSellStatus.SELL);
//		item.setRegTime(LocalDateTime.now());
//		item.setUpdateTime(LocalDateTime.now());
//		
//		repo.save(item);
		
		//builder ver
//		item = Item.builder()
//									.itemNm("오메가3")
//									.price(38000)
//									.stockNumber(50)
//									.itemDetail("면역증강")
//									.itemSellStatus(ItemSellStatus.SELL)
//									.regTime(LocalDateTime.now())
//									.updateTime(LocalDateTime.now())
//									.build();
		
		item = Item.builder()
				.itemNm("AAA건전지")
				.price(4800)
				.stockNumber(10)
				.itemDetail("20개입")
				.itemSellStatus(ItemSellStatus.SELL)
				.regTime(LocalDateTime.now())
				.updateTime(LocalDateTime.now())
				.build();
		

		
		// consol 창에 insert 데이터 찍어보기
		Item newItem = repo.save(item);
		System.out.println(newItem);
	}
	

	//조회
//	@Test
//	public void getItem() {
////		Optional<Item> item = repo.findById(1L);
////		item.ifPresent(ele -> System.out.println(ele));
//		
//		repo.findById(1L).ifPresent(ele -> System.out.println(ele));
//		
//		// item 데이터가 존재하면 cnosol에 나타내고, 존재하지 않으면 에러 던지기
//		Item item = repo.findById(2L).orElseThrow(EntityNotFoundException::new);
//		System.out.println(item);
//	}
	
//	//전체 조회
//	@Test
//	public void getItems() {
//	
//		List<Item> itemList = repo.findAll();
//		itemList.forEach(e -> System.out.println(e));
//	}
	
	
//	@Test
//	public void getNameOrDetail() {
//	
////		List<Item> itemList = repo.findByItemNm("블루투스 스피커");
////		itemList.forEach(e -> System.out.println(e));
//		
//		//상품명으로 조회(상품명이 정확하게 일치해야 함)
//		//repo.findByItemNm("블루투스 스피커").forEach(e -> System.out.println(e));
//
//		//상품명 or 상품 상세설명으로 조회
//		 repo.findByItemNmOrItemDetail("블루투스 스피커", "중국산")
//		 .forEach(e -> System.out.println(e));
//	}
	
	
//	// 상품가격이 100000원 미만인 상품 조회
//	@Test
//	public void getItemByPrice() {
//
//		 repo.findByPriceLessThan(100000)
//		 .forEach(e -> System.out.println(e));
//	}
	
	// 상품 가격이 20만원 미만인 상품을 상품명 내림차순으로 조회
//	@Test
//	public void getItemByPrice() {
//
//		 repo.findByPriceLessThanOrderByItemNmDesc(200000)
//		 .forEach(e -> System.out.println(e));
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
