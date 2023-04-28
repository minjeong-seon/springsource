<%@page import="domain.VitaminDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/include/header.jsp"%>
<h1>💊내가 섭취하는 비타민💊</h1>
<table class="table">
	<thead>
		<tr>
			<th>제품명</th>
			<th>제조사</th>
			<th>가격</th>
			<th>제품 설명</th>
			<th>구매처</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items='${list}'>
			<tr>
				<td><a href='<c:url value="read.do?productId=${dto. productId}"/>'>${dto. productId}</a></td>
				<td>${dto.company }</td>
				<td>${dto.price }</td>
				<td>${dto.description }</td>
				<td>${dto.location }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@ include file="/include/footer.jsp"%>