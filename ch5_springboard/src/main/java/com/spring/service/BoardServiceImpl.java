package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.BoardDTO;
import com.spring.persistence.BoardDAO;

@Service("board")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDao;
	@Override
	public boolean insertBoard(BoardDTO dto) {
		return boardDao.inseert(dto);
	}

	@Override
	public boolean updateBoard(BoardDTO dto) {	
		return boardDao.update(dto);
	}

	@Override
	public boolean deleteBoard(int bno) {
		return boardDao.delete(bno);
	}

	@Override
	public BoardDTO getRow(int bno) {
		return boardDao.getRow(bno);
	}

	@Override
	public List<BoardDTO> getRows() {
		return boardDao.getRows();
	}

}
