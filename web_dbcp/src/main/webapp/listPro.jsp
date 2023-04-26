<%@page import="user.domain.UserDTO"%>
<%@page import="java.util.List"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//list 조회할 수 있는 메소드 포함된 객체 불러오기
	UserDAO dao = new UserDAO();
	//list 조회하는 메소드 불러오기
	List<UserDTO> list = dao.getList();
	
	//list를 list.jsp에서 보여주기(페이지끼리 데이터 공유)
	// 1) session에 담기 : session.setAttribute(); --> sendRediriect
	//		브라우저로 요청 --> 브라우저 종료까지 유지
	//		-서버에 저장하므로 서버자원 필요
	//		-로그인, 장바구니 등의 데이터만 세션에 담는다
	
	// 2) request에 담기 : request에 담아서(setAttribute();) pageContext.forward() 사용
	//		결과 페이지 request == 내용 보여주는 페이지 requset
	//		ex) listPro.jsp 의 req == list.jsp의 req 일치시키기
	request.setAttribute("list", list);
	pageContext.forward("list.jsp");
%>