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
 //HttpServletRequest request : 사용자의 요청을 처리
 //한글 깨지지 않게 데이터 가져오기(post 방식일 때만 한글 깨짐)
 request.setCharacterEncoding("utf-8");
 %>
 <h3>이름</h3>
 <%= request.getParameter("name")%>
 <%= request.getParameter("age")%>
</body>
</html>