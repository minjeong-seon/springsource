<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    <!-- 에러 발생 시 띄울 메시지 전용 페이지(jsp) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>에러가 발생했습니다. 잠시 후 다시 접속해 주세요.</p>
<!--
	 e.printStackTrace()  or  e.getMessage
		==> 어떤 에러가 났는지 에러 메시지 출력
	 -->
<p><%=exception.getMessage() %>
</p>
</body>
</html>