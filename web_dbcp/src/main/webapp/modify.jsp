<%@page import="user.domain.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp"%>
<%
//UserDTO dto = (UserDTO)request.getAttribute("dto");
%>

<h1>회원 정보 수정</h1>
<form action="updatePro.jsp" method="post">
	<%-- <input type="hidden" name="no" value="<%dto.getNo() %>"/> --%>
	<input type="hidden" name="no" value="${dto.no}" />
	<div class="mb-3">
		<label for="username" class="form-label">기존 이름</label>
		<%-- <input type="text" class="form-control" id="username" name="username" value="<%=dto.getUsername()%>" readonly> --%>
		<input type="text" class="form-control" id="username" name="username" value="${dto.username }" readonly>
	</div>
	<div class="mb-3">
		<label for="re-name" class="form-label">변경 이름</label>
		<input type="text" class="form-control" id="re-name" name="re-name">
	</div>
	<div class="mb-3">
		<label for="addr" class="form-label">기존 주소</label>
		<%-- 		<input type="text" class="form-control" id="addr" name="addr" value="<%=dto.getAddr()%>" readonly> --%>
		<input type="text" class="form-control" id="addr" name="addr" value="${dto.addr }" readonly>
	</div>
	<div class="mb-3">
		<label for="addr" class="form-label">변경 주소</label>
		<input type="text" class="form-control" id="re-addr" name="re-addr">
	</div>
	<div class="mb-3">
		<label for="mobile" class="form-label">기존 번호</label>
		<%-- 		<input type="text" class="form-control" id="mobile" name="mobile" value="<%=dto.getMobile()%>" readonly> --%>
		<input type="text" class="form-control" id="mobile" name="mobile" value="${dto.mobile}" readonly>
	</div>
	<div class="mb-3">
		<label for="mobile" class="form-label">변경 번호</label>
		<input type="text" class="form-control" id="re-mobile" name="re-mobile">
	</div>
	<h6 class="msg" style="color: red"></h6>
	<button type="button" class="btn btn-primary">목록으로</button>
	<button type="submit" class="btn btn-success">수정</button>
</form>

<script src="js/modify.js"></script>
<%@ include file="/include/footer.jsp"%>