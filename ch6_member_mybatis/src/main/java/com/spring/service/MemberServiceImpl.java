package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.MemberDTO;
import com.spring.mapper.MemberMapper;
@Service("member")
public class MemberServiceImpl implements MemberService {
	@Autowired
	public MemberMapper mapper;
	
	@Override
	public boolean insert(MemberDTO dto) {
		return mapper.insertMember(dto)==1?true:false;
	}
	
	@Override
	public boolean update(MemberDTO dto) {
		return mapper.updateMember(dto)==1?true:false;
	}
	
	@Override
	public boolean delete(String userid, String password) {
		return mapper.deleteMember(userid, password)==1?true:false;
	}
	
	@Override
	public List<MemberDTO> getRows() {
		return mapper.getRows();
	}

	@Override
	public MemberDTO getRow(String userid) {
		return mapper.getRow(userid);
	}


}
