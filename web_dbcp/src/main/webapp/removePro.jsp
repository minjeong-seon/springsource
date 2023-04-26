<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//개발자 화면임**
	//no 값 가져 오기
	int no = Integer.parseInt(request.getParameter("no"));
	
	UserDAO dao = new UserDAO();
	//삭제 결과에 따라 페이지 이동
	String path = "";
	if(dao.remove(no)){
		path="listPro.jsp";
	}else{
		path="getPro.jsp?no="+no;
	}
	response.sendRedirect(path);
%>