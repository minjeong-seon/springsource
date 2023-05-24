package com.spring.service;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.ReplyDTO;

public interface ReplyService {
	public ReplyDTO read(int rno);
	public boolean insertReply(ReplyDTO dto);
	public List<ReplyDTO> getList(Criteria cri, int bno);
	public boolean udpateReply(ReplyDTO dto);
	public boolean deleteReply(int rno);
}
