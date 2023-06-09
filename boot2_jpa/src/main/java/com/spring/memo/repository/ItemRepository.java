package com.spring.memo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.memo.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation 참고
	//findBy + 필드명
	// 상품 이름으로 검색
	List<Item> findByItemNm(String itemNm);
	
	// 상품명 or 상품 상세설명으로 검색
	//findBy + 필드명 or + 필드명
	List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

	//특정 가격 미만인 상품 조회
	List<Item> findByPriceLessThan(int price);

	//특정 가격 미만인 상품 조회 후 상품명 내림차순 정렬
	List<Item> findByPriceLessThanOrderByItemNmDesc(int price);







}
