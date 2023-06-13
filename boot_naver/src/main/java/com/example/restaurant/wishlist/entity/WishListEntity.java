package com.example.restaurant.wishlist.entity;

import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Entity 클래스는 DB작업용 DTO 라고 할 수 있음
// 데이터 전송: view(jsp) <-dto-> controller <-dto-> service <-entity-> DB
//		DTO : jsp --> controller로 데이터 넘길 때 DTO 이용함
//		Entity : service <--> DB 로 데이터 넘길 때는 Entity 이용

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class WishListEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	private String title;
	
	private String category;
	
	private String address;
	
	private String roadAddress;
	
	private String homePageLink;
	
	private String imageLink;
	
	private boolean isVisit;
	private int visitCount;
	private LocalDateTime lastVisitDate;
}
