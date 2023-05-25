package com.spring.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Criteria {
	private int page;	//페이지 번호
	//한 페이지 당 게시글 몇 개 보여줄 것인지
	//게시글 당 댓글 수
	private int amount;	
	
	private String type;	// 검색조건
	private String keyword;	//검색어
	
	public Criteria() {
		this(1,10);
	}
	
	public Criteria(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
	
	//검색쿼리문 작성을 위한 get메소드 작성
	public String[] getTypeArr() {
		//검색 기준 log.info에 배열로 찍힘 ex) 내용or작성자 == [C,W]
		// ex) http://localhost:8080/board/list?page=1&amount=10&type=TC&keyword=동해물과 ▶ Arrays.toString(getTypeArr) == [T, C]
		return type == null ? new String[] {} : type.split("");
	}
}
