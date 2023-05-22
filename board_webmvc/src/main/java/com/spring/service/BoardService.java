package com.spring.service;

import java.util.List;

import com.spring.domain.BoardDTO;
import com.spring.domain.Criteria;

public interface BoardService {
	public List<BoardDTO> getList(Criteria cri);
	public boolean insert(BoardDTO dto);
	public BoardDTO read(int bno);
	public boolean update(BoardDTO dto);
	public boolean remove(int bno);
	public int getTotalCnt(Criteria cri);
}
