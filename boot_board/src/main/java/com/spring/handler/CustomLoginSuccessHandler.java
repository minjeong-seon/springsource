package com.spring.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {
	// 원래) 로그인 성공 후 -> 시작페이지로 돌아감(default)
	// 로그인 성공 후 특정 작업 추가/이동할 경로 지정용 클래스
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// 로그인 사용자의 권한 확인
	
		List<String> roleNames = new ArrayList<>();
			authentication.getAuthorities().forEach(auth -> roleNames.add(auth.getAuthority()));
			
		if(roleNames.contains("ROLE_ADMIN")) {
			response.sendRedirect("/member/admin");
			return;
		}
		if(roleNames.contains("ROLE_MEMBER") || roleNames.contains("ROLE_MANAGER") ) {
			response.sendRedirect("/board/list");
			return;
		}
		
		
		
		response.sendRedirect("/");
	}

}
