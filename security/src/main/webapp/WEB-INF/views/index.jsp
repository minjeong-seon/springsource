<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@ include file="include/header.jsp"%>
<!-- Page Heading -->
<div id="content">
	<h3>메인 페이지</h3>

	<!-- security:authorize access="!isAuthenticated()" : 인증되지 않았다면(=로그인하지 않았다면) -->
	<security:authorize access="!isAuthenticated()">
		<div class="row">
			<div class="col">
				<a href="/security/register">회원가입</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<a href="/security/login">로그인</a>
			</div>
		</div>
	</security:authorize>
	
	<security:authorize access="isAuthenticated()">
		<div class="row">
			<div class="col">
				<a href="/security/userpage">유저 페이지</a>
			</div>
		</div>

		<div class="row">
			<div class="col">
				<a href="/security/adminpage">관리자 페이지</a>
			</div>
		</div>
		<div class="row">
			<form action="/logout" method="post">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<button class="btn btn-info" type="submit">로그아웃</button>
			</form>
		</div>
	</security:authorize>


</div>

<%@ include file="include/footer.jsp"%>