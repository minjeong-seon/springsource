package com.spring.memo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.memo.entity.Cart;
import com.spring.memo.entity.CartItem;
import com.spring.memo.entity.Item;

@SpringBootTest
public class CartItemRepositoryTest {

	@Autowired
	private CartItemRepository repo;
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Autowired
	private CartRepository cartRepo;
	
	@Test
	public void createCartItem() {
		
		Item item = itemRepo.findById(1L).orElseThrow();
		Cart cart = cartRepo.findById(3L).orElseThrow();
		
		CartItem cartItem = CartItem.builder()
														.cart(cart)
														.item(item)
														.count(1)
														.build();
		
		CartItem newItem = repo.save(cartItem);
		
		System.out.println(newItem);
	}
	
}
