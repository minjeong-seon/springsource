package com.spring.domain;
// 페이지 나누기 정보 객체
// 요청된 페이지 : pageNum
// 한 페이지 당 목록 수 : amount

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class PageDTO {
	private int startPage;	// 시작 페이지
	private int endPage; 	//마지막 페이지
	private boolean prev;
	private boolean next;
	// 전체 게시물 개수 : total
	private int total;
	
	private Criteria cri;
	
	public PageDTO(Criteria cri, int total) {
		this.total = total;
		this.cri = cri;	
		
		// ex) 사용자가 5page 요청 시, 하단 페이지 번호: 1... 5...10 (한번에 보여지는 페이지 번호는 10개씩으로 설정)
		this.endPage = (int)(Math.ceil(cri.getPageNum() / 10.0)) * 10;
		this.startPage = this.endPage - 9;
		
		// 끝나는 페이지 재계산 : realEnd
		int realEnd = (int)(Math.ceil((total / 1.0) / cri.getAmount()));
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}
}
