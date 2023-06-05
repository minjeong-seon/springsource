package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.SqUserAuthorityDTO;
import com.spring.domain.SqUserDTO;
import com.spring.mapper.MemberMapper;
@Service

public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper mapper;
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Transactional
	@Override
	public boolean register(SqUserDTO dto) {
		//비밀번호 암호화(암호화된 원본 비번을 입력받은 비번에 세팅)
		dto.setPassword(encoder.encode(dto.getPassword()));
		
		//회원가입
		boolean result = mapper.register(dto)==1;
		
		//회원권한 부여
		mapper.registerAuth(new SqUserAuthorityDTO(dto.getUserid(), "ROLE_USER"));
		//mapper.registerAuth(new SqUserAuthorityDTO(dto.getUserid(), "ROLE_ADMIN"));
		return result;
	}




}
