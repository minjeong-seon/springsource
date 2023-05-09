package board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@ToString @Getter @Setter
public class PageDTO {

	//검색
	private String criteria;
	private String keyword;
	
	//페이지 나누기
	private int page;	//사용자가 요청할 페이지 번호
	private int amount;	//페이지 당 보여줄 게시글 수
	
	//listform 하단 페이지 번호
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	private int total;
	
	public PageDTO(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
	
	public PageDTO(String criteria, String keyword, int page, int amount, int total) {
		super();
		this.criteria = criteria;
		this.keyword = keyword;
		this.page = page;
		this.amount = amount;
		this.total = total;

		//현재 화면의 마지막 페이지 수
		// 1,  2,  3,  4 ... 10[다음] == 페이지 수 10개씩 보여준다는 뜻임
		// ex) 3페이지 클릭 => 페이지 수 10까지, 13페이지 클릭 => 20까지 보여줌
		endPage = (int)(Math.ceil(page / 10.0)) * 10;
		//현재 화면의 시작 페이지 수
		// 1 2 3 4...10 [다음]
		startPage = endPage-9;
		
		// 320 개의 총 게시물일 때 
		int realEnd = (int)(Math.ceil((total/1.0) / amount));
		
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
		
	}

	public PageDTO(String criteria, String keyword, int page, int amount) {
		super();
		this.criteria = criteria;
		this.keyword = keyword;
		this.page = page;
		this.amount = amount;
	}

	
	
}
