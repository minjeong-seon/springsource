package com.spring.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.domain.MemberDTO;

public interface MemberService {
	public boolean insert(MemberDTO dto);
	public boolean update(MemberDTO dto);
	public boolean delete(@Param("userid") String userid, @Param("password") String password);
	public List<MemberDTO> getRows();
	public MemberDTO getRow(@Param("userid") String userid);
}
