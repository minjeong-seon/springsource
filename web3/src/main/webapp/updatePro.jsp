<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//form 내용 가져오기
	request.setCharacterEncoding("utf-8");

	int no = Integer.parseInt(request.getParameter("no"));
	String rename = request.getParameter("re-name");
	String readdr = request.getParameter("re-addr");
	String remobile = request.getParameter("re-mobile");
	
	UserDAO dao = new UserDAO();
	
	String path = "";
	if(dao.update(no, rename, readdr, remobile)){
		path = "getPro.jsp?no="+no;
	}else{
		path = "modifyPro.jsp?no="+no;
	}
response.sendRedirect(path);
%>