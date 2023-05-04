package board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@ToString @Getter @Setter
public class PageDTO {
	public PageDTO(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
	private String criteria;
	private String keyword;
	
	private int page;	//사용자가 요청할 페이지 번호
	private int amount;	//페이지 당 보여줄 게시글 수
}
