package board.service;

import java.util.List;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardSearchService {
	public List<BoardDTO> searchBoard(String criteria, String keyword){
		return new BoardDAO().search(criteria, keyword);
	}
}
