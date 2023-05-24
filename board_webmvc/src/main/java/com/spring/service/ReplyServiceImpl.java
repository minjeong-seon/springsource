package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.Criteria;
import com.spring.domain.ReplyDTO;
import com.spring.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private ReplyMapper reMapper;
	
	@Override
	public ReplyDTO read(int rno) {
		return reMapper.read(rno);
	}

	@Override
	public boolean insertReply(ReplyDTO dto) {
		return reMapper.insertReply(dto)==1?true:false;
	}

	@Override
	public List<ReplyDTO> getList(Criteria cri, int bno) {
		return reMapper.replyList(cri, bno);
	}

	@Override
	public boolean udpateReply(ReplyDTO dto) {
		return reMapper.updateReply(dto)==1?true:false;
	}

	@Override
	public boolean deleteReply(int rno) {
		return reMapper.deleteReply(rno)==1?true:false;
	}

}
