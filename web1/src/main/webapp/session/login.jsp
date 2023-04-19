<%@page import="user.domain.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("userid");
	String pwd = request.getParameter("password");
	
	//session 에 값을 개별로 담기
	/* session.setAttribute("id", id);
	session.setAttribute("pwd", pwd); */
	
	//session 에 값을 한번에 담기 : DTO 객체 사용
	session.setAttribute("loginDTO", new LoginDTO(id, pwd));
%>
<h4>아이디 : <%=id%></h4>
<h4>비밀번호 : <%=pwd %></h4>
<h4><a href="request2.jsp">이동</a></h4>

</body>
</html>