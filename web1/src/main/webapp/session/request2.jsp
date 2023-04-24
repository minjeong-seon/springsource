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
	<h2>request2 page</h2>
	<%-- request1 이 받은 name 사용 : HttpSession  객체 사용 
		
		1) 사용할 값을 담고 : setAttribute("key", "value")
		2) 필요한 곳에서 꺼내 쓰기 : getAttribute("key")
	
	--%>
	<%
		//LoginDTO loginDTO = (LoginDTO)session.getAttribute("loginDTO");
	
		// EL(Expression Language) : jsp에서 데이터 추출하는 표현식 
		//		setAttribute 에 담은 값 쉽게 찾아다 쓰기
		//		${이름.변수명} : 객체로 담았을 때
		//		${이름} : 개별로 담았을 때
	%>
	<h3>로그인 정보</h3>
	<ul>
		<%-- <li>아이디 : <%=session.getAttribute("id")%></li>
		<li>비밀번호 : <%=session.getAttribute("pwd")%></li> --%>
	<%-- 	<li>아이디 : <%=loginDTO.getId() %></li>
		<li>비밀번호 : <%=loginDTO.getPwd()%></li> --%>
		<li>아이디 : ${loginDTO.id}</li>
		<li>비밀번호 :${loginDTO.pwd}</li>
	</ul>
	
	
</body>
</html>