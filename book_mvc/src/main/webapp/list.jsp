<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/include/header.jsp"%>
<h1>📕도서 목록📕</h1> 
<form action='<c:url value="/search.do"/>' class="row g-3 justify-content-center">
	<div class="col-auto">
		<select class="form-select" name="criteria">
			<option selected <c:out value="${searchDto.criteria == null ? 'selected' : '' }"/> >검색 기준</option>
			<option value="writer" <c:out value="${searchDto.criteria == 'writer' ? 'selected' : '' }"/> >저자명</option>
			<option value="title" <c:out value="${searchDto.criteria == 'title' ? 'selected' : '' }"/> >제목</option>
		</select>
	</div>
	<div class="col-md-5">
		<input type="text" class="form-control" placeholder="검색어" name="keyword" value="${searchDto.keyword }"/>
	</div>
	<div class="col-auto">
		<button type="submit" class="btn btn-secondary">search</button>
	</div>
</form>
<table class="table">
	<thead>
		<tr>
			<th>code</th>
			<th>title</th>
			<th>writer</th>
			<th>price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items='${list }'>
			<tr>
				<td>${dto.code}</td>
				<td><a href='<c:url value="read.do?code=${dto.code}"/>'>${dto.title}</a></td>
				<td>${dto.writer}</td>
				<td>${dto.price}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<script src='<c:url value="/js/list.js"/>'></script>
<%@ include file="/include/footer.jsp"%>