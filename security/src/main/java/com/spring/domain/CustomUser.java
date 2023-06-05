package com.spring.domain;

import java.util.Collection;
import java.util.stream.Collectors;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;

/*
 * java.util.Collection interface
 * 		- java.util.List interface
 * 			ㄴ java.util.ArrayList
 * 			ㄴ java.util.LinkedList
 * 
 * 		- java.util.Set interface
 * 			ㄴ java.util.HashSet
 * 
 * 		- ? extends GrantedAuthority : == GrantedAuthority 와 자손들만 가능
 */
@Getter
public class CustomUser extends User {	
	
	private SqUserDTO dto;

	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);		
	}
	

	public CustomUser(SqUserDTO dto) {
		super(dto.getUserid(), dto.getPassword(), dto.getAuthorities()
													 .stream()
													 .map(auth -> new SimpleGrantedAuthority(auth.getAuthority()))
													 .collect(Collectors.toList()));
		this.dto = dto;
	}
}