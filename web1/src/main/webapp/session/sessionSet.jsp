<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//session값 새로 지정
	session.setAttribute("color", "blue");
	session.setAttribute("cake", "chocolate mousse");
	//원래 페이지로 이동
	response.sendRedirect("sessionTest1.jsp");
%>