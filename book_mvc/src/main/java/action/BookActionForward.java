package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class BookActionForward {
	//페이지 이동방식(true, false) , 페이지(String) 지정
	//이동방식 : false = forward   ||  true = sendRedirect
	
	private boolean isRedirect;
	private String path;
}
