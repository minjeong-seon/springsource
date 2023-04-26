<%@page import="book.persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	int code=  Integer.parseInt(request.getParameter("code"));
	
	BookDAO dao = new BookDAO();
	
	if(dao.remove(code)){
		response.sendRedirect("listPro.jsp");
	}

%>