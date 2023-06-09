<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- main slide image -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<!-- main category select box -->
<link rel="stylesheet" href="css/main.css" />
<!-- main category section -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css" />
<link href="https://fonts.googleapis.com/css?family=Work+Sans:200,400&display=swap" rel="stylesheet">
<!-- custom design css -->
<link rel="stylesheet" type="text/css" href="css/custom.css">
<style>
.work-sans {
	font-family: 'Work Sans', sans-serif;
}

#menu-toggle:checked+#menu {
	display: block;
}

.hover\:grow {
	transition: all 0.3s;
	transform: scale(1);
}

.hover\:grow:hover {
	transform: scale(1.02);
}

.carousel-open:checked+.carousel-item {
	position: static;
	opacity: 100;
}

.carousel-item {
	-webkit-transition: opacity 0.6s ease-out;
	transition: opacity 0.6s ease-out;
}

#carousel-1:checked ~ .control-1, #carousel-2:checked ~ .control-2,
	#carousel-3:checked ~ .control-3 {
	display: block;
}

.carousel-indicators {
	list-style: none;
	margin: 0;
	padding: 0;
	position: absolute;
	bottom: 2%;
	left: 0;
	right: 0;
	text-align: center;
	z-index: 10;
}

#carousel-1:checked ~ .control-1 ~ .carousel-indicators li:nth-child(1) .carousel-bullet,
	#carousel-2:checked ~ .control-2 ~ .carousel-indicators li:nth-child(2) .carousel-bullet,
	#carousel-3:checked ~ .control-3 ~ .carousel-indicators li:nth-child(3) .carousel-bullet
	{
	color: #000;
	/*Set to match the Tailwind colour you want the active one to be */
}
/* footer */
a {
	color: #333;
}

#level1 a {
	color: #fff;
}

#level2 a {
	margin-top: -70px;
}

#level3 span {
	display: block;
	margin-top: -70px;
	margin-left: 500px;
	font-size: 90%;
}

.fix_area {
	position: fixed;
	z-index: 9999;
	bottom: 50px;
	right: 50px;
}

.fix_area .cir_box {
	display: block;
	width: 60px;
	height: 60px;
	text-align: center;
	color: #fff;
	border-radius: 35px;
	box-sizing: border-box;
	padding: 6px;
	font-size: 15px;
	overflow: hidden;
	box-shadow: 1px 1px 6px #333;
}

.fix_area .totop {
	background-color: rgb(0, 154, 218);
	margin-top: 10px;
}

</style>
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