package com.spring.service;

import com.spring.domain.Criteria;
import com.spring.domain.ReplyDTO;
import com.spring.domain.ReplyPageDTO;

public interface ReplyService {
	public ReplyDTO read(int rno);
	public boolean insertReply(ReplyDTO dto);
	//public List<ReplyDTO> getList(Criteria cri, int bno); <--댓글 목록만 처리
	public ReplyPageDTO getList(Criteria cri, int bno); // <--댓글 목록+총 댓글 수
	public boolean udpateReply(ReplyDTO dto);
	public boolean deleteReply(int rno);
}
