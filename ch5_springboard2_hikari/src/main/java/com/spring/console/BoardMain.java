package com.spring.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.BoardDTO;
import com.spring.service.BoardService;

public class BoardMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		BoardService service = (BoardService)ctx.getBean("board");
		
		//게시글 작성
//		BoardDTO dto = new BoardDTO();
//		dto.setTitle("꽃");
//		dto.setContent("자세히 보아야 예쁘다.");
//		dto.setWriter("나태주");
//		boolean result = service.insertBoard(dto);
//		System.out.println(result ? "입력성공" : "입력실패");
		
		
		//게시글 수정
//		BoardDTO updateDto = new BoardDTO();
//		updateDto.setBno(2);
//		updateDto.setTitle("돈");
//		updateDto.setContent("많으면 좋은 것");
//		if(service.updateBoard(updateDto)) {
//			System.out.println("수정 성공");
//		}
//		
//		//게시글 삭제
////		if(service.deleteBoard(2)) {
////			System.out.println("삭제 성공");
////			System.out.println();
////		}
//		System.out.println(service.deleteBoard(2) ? "삭제 성공" : "삭제 실패");
//		
//		//게시글 하나 조회
//		System.out.println(service.getRow(1));
//		System.out.println();
//		
		//게시글 목록 전체
		List<BoardDTO> list = service.getRows();
		for (BoardDTO boardDTO : list) {
			System.out.println(boardDTO);
		}
		
		
		
		
		
	}
}
