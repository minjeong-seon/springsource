<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String id = request.getParameter("userid");
	String pwd = request.getParameter("password") ;

	//loginPro에서 id, pwd 값을 공유하고 싶으면
	//setAttribute), getAttribute(), removeAttribute()
	request.setAttribute("id", id);
	request.setAttribute("pwd", pwd);
	
	//loginPro.jsp에 login.jsp가 가진 req, res를 넘겨줌(loginPro.jsp == login.jsp)
	pageContext.forward("loginPro.jsp");
%>