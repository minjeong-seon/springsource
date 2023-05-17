package com.spring.mapper;

import java.util.List;

import com.spring.domain.BoardDTO;

public interface BoardMapper {
	public List<BoardDTO> getList();
	public int register(BoardDTO dto);
	public BoardDTO read(int bno);
}
