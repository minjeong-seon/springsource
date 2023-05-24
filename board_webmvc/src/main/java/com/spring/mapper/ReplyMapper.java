package com.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.domain.Criteria;
import com.spring.domain.ReplyDTO;

public interface ReplyMapper {
	public ReplyDTO read(int rno);
	public int insertReply(ReplyDTO dto);
	public List<ReplyDTO> replyList(@Param("cri") Criteria cri, @Param("bno") int bno);
	public int getCountByBno(int bno);
	public int updateReply(ReplyDTO dto);
	public int deleteReply(int rno);
}
