<%@page import="user.domain.UserDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>User List</h1>
<%
//List<UserDTO> list = (List<UserDTO>)request.getAttribute("list");
%>
<table class="table">
	<thead>
		<tr>
			<th scope="col">#</th>
			<th scope="col">이름</th>
			<th scope="col">태어난 해</th>
			<th scope="col">주소</th>
			<th scope="col">핸드폰</th>
		</tr>
	</thead>
	<tbody>
	<!-- var : 변수명(마음대로), item : setAttribute()에서 사용했던 이름 -->
		<c:forEach var="dto" items='${list}'>
			<tr>
				<th scope="row">${dto.no}</th>
				<td><a href="getPro.jsp?no=${dto.no}">${dto.username}</a></td>
				<td>${dto.birthYear}</td>
				<td>${dto.addr}</td>
				<td>${dto.mobile}</td>
			</tr>
		</c:forEach>

		<%
		//for(UserDTO dto : list){
		%>
		<%-- 		<tr>
			<th scope="row"><%=dto.getNo()%></th>
			<!-- 링크에 데이터를 딸려서 보내고 싶을 때는 링크 뒤에 '? '랑 같이 데이터 정보 붙이면 됨 -->
			<td><a href="getPro.jsp?no=<%=dto.getNo()%>"><%=dto.getUsername()%></a></td>
			<td><%=dto.getBirthYear()%></td>
			<td><%=dto.getAddr()%></td>
			<td><%=dto.getMobile()%></td>
		</tr> --%>
		<%
		//}
		%>
	</tbody>
</table>

<%@ include file="/include/footer.jsp"%>