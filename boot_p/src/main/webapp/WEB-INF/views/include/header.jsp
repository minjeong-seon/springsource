<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/custom.css">
</head>
<body>
	<!-- 고정 헤드 -->
	<div class="desc_header">
		<div class="desc_header_wrap">
			<div class="main_logo">
				<a href="/">
					<img class="main_logo_img" src="img/korean_food.png" alt="로고" />
				</a>
			</div>
			<div class="search_bar">
				<div class="search_input_bar">
					<input class="search_input" placeholder="지역, 음식 또는 식당명 입력" value="" />
					<button class="search_icon" type="button" aria-label="검색하기 버튼"></button>
				</div>
			</div>
			<div class="auth_box">
				<a class="auth_login" href="/user/?mode=login">로그인</a>
				<a class="auth_register" href="/user/?mode=intro">회원가입</a>
			</div>
		</div>
	</div>