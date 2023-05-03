package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardUpdateService;
import board.util.BoardUploadUtils;

public class BoardUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		BoardUploadUtils utils = new BoardUploadUtils();
		Map<String, String> formData = utils.uploadFile(request);
		//formData 값들을 BoardDTO 객체 생성 후 담기
		//file 이 입력된 경우와 입력이 안된 경우
		BoardDTO dto = new BoardDTO();
		dto.setBno(Integer.parseInt(formData.get("bno")));
		dto.setTitle(formData.get("title"));
		dto.setContent(formData.get("content"));
		dto.setPassword(formData.get("password"));
		if(formData.containsKey("attach")) {
			dto.setAttach(formData.get("attach"));
		}
		BoardUpdateService service = new BoardUpdateService();
		
		String path = "";
		if(service.update(dto)) {
			path = "read.do?bno="+dto.getBno();
		}else {
			System.out.println("비밀번호가 맞지 않습니다 화면에 띄우기!!!");
			path = "modify.do?bno="+dto.getBno();
		}		
		
		return new ActionForward(true, path);
	}

}
