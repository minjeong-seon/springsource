<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>장바구니 비우기</h4>
<%
session.removeAttribute("products");
%>

<h4><a href="cart.html">상품 선택</a></h4>
</body>
</html>