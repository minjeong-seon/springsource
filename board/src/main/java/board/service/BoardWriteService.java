package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardWriteService {
	public boolean insert(BoardDTO boardDTO) {
		return new BoardDAO().insertArticle(boardDTO);
	}
	
}
