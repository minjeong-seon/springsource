<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>결과</h1>
<!-- AddDTO dto 바인딩 객체 사용 -->
<!-- 
<h3>${addDTO.num1}+${addDTO.num2} = ${result}</h3>
-->

<!-- @ModelAttribute("add") 어노테이션 사용-->
<h3>${add.num1}+${add.num2} = ${result}</h3>
<h4>${page}</h4>
</body>
</html>