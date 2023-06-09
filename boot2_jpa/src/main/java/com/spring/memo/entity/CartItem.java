package com.spring.memo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
public class CartItem {
	
	@Id
	@Column(name = "cart_item_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne		// 여러개의 아이템이 하나의 카트에 담길 수 있는 관계
	@JoinColumn(name = "cart_id")
	private Cart cart;
	
	@ManyToOne		// 여러개의 아이템이 하나의 카트에 담길 수 있는 관계
	@JoinColumn(name = "item_id")
	private Item item;
	
	private int count; 		// 상품 수량
	
}
