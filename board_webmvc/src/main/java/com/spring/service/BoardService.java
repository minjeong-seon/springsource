package com.spring.service;

import java.util.List;

import com.spring.domain.BoardDTO;

public interface BoardService {
	public List<BoardDTO> getList();
	public boolean insert(BoardDTO dto);
	public BoardDTO read(int bno);
}
