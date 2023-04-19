<%@page import="user.domain.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//login.jsp에서 사용자 입력값 가져 오기
	String id = request.getParameter("inputId");
	String pwd = request.getParameter("inputPassword");
	
	//DB 작업 (사용자가 입력한 아이디와 비밀번호가 회원 데이터에 있는지 확인)
	//DB 작업 결과에 따라 페이지 이동 (성공 시 index / 실패 시 login.jsp)
	
	//로그인 성공 시 -> 회원의 로그인 정보를 session에 저장 후 움직여야 함
	//session 에 저장
	session.setAttribute("loginDTO", new LoginDTO(id, pwd));
	//움직이기
	response.sendRedirect("index.jsp");
%>