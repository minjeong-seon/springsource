<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<nav class="navbar navbar-expand-lg bg-success" data-bs-theme="dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="index.jsp">도서 관리 시스템</a>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link active" aria-current="page" href="index.jsp">Home</a></li>
						<!-- set / get 페이지 중 set 페이지(데이터 저장된 페이지)를 불러와야 nullpointexception 없이 정보 읽을 수 있음 -->
						<li class="nav-item"><a class="nav-link" href="listPro.jsp">도서 목록</a></li>
						<li class="nav-item"><a class="nav-link" href="insert.jsp">도서 추가</a></li>
						<li class="nav-item"><a class="nav-link">Disabled</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<main>