<%@page import="java.util.Arrays"%>
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
	request.setCharacterEncoding("utf-8");
//값을 하나만 가져옴
	//String animals = request.getParameter("animal");

//값이 여러 개인 경우 : getParameterValues() -> 배열로 가져옴
	String animals [] = request.getParameterValues("animal");

//<% 랑 같은 역할 : 브라우저 화면에 나타내기(태그 사용에 차이 있음)
	out.print("<h3>"+Arrays.toString(animals)+"</h3>");
//<%로 태그 안에 넣어서 화면에 표시하려면 아래와 같은 방법 사용

%>
<%-- <h3><%=Arrays.toString(animals) %></h3> --%>

<%-- ▲ jsp 주석 : 사용자가 개발자도구 창에서 코드 볼 수 없음--%>
<!--  ▼ html 주석 : 사용자가 개발자도구 창에서 코드 볼 수 있음 -->
<!-- <%=Arrays.toString(animals) %> --> 

</body>
</html>