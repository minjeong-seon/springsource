package com.spring.mapper;

import com.spring.domain.SqUserAuthorityDTO;
import com.spring.domain.SqUserDTO;

public interface MemberMapper {
	public int register(SqUserDTO dto);
	public int registerAuth(SqUserAuthorityDTO dto);
	public SqUserDTO read(String userid);
	
}
