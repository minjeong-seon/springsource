package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.spring.interceptor.AuthCheckInterceptor;

@Configuration
public class SecurityConfig {
	//비밀번호 암호화 빈 생성
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	/*
	 * spring-boot-starter-security : 시큐리티 작업에 필요한 라이브러리 모음(pom.xml)
	 * 		==> 프로젝트에 시큐리티가 적용이 되어버림 --> but, 비번 암호화만 필요한 상황(boot_member)
	 * 			==> form login 동작되어버리므로 멈춰야 함▼
	 */
	
	//비번 암호화 외 다른 시큐리티 기능 멈추기
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().anyRequest().permitAll().and().httpBasic().and().csrf().disable();
		
		return http.getOrBuild();
	}

}
