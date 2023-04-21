<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp"%>
<%
//수정할 회원 정보를 보여준 후 새로운 값을 입력
int no = Integer.parseInt(request.getParameter("no"));

Class.forName("oracle.jdbc.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "javadb";
String password = "12345";
Connection con = DriverManager.getConnection(url, user, password);

String sql = "select*from usertbl where no=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setInt(1, no);
ResultSet rs = pstmt.executeQuery();
if (rs.next()) {
	String username = rs.getString("username");
	String addr = rs.getString("addr");
	String mobile = rs.getString("mobile");

	//수정버튼 누르면 새로운 값으로 업데이트
%>

<h1>회원 정보 수정</h1>
<form action="modifyPro.jsp" method="post">
	<input type="hidden" name="no" value="<%=no%>"/>
	<div class="mb-3">
		<label for="username" class="form-label">기존 이름</label>
		<input type="text" class="form-control" id="username" name="username" value="<%=username%>" readonly>
	</div>
	<div class="mb-3">
		<label for="re-name" class="form-label">변경 이름</label>
		<input type="text" class="form-control" id="re-name" name="re-name">
	</div>
	<div class="mb-3">
		<label for="addr" class="form-label">기존 주소</label>
		<input type="text" class="form-control" id="addr" name="addr" value="<%=addr%>" readonly>
	</div>
	<div class="mb-3">
		<label for="addr" class="form-label">변경 주소</label>
		<input type="text" class="form-control" id="re-addr" name="re-addr">
	</div>
	<div class="mb-3">
		<label for="mobile" class="form-label">기존 번호</label>
		<input type="text" class="form-control" id="mobile" name="mobile" value="<%=mobile%>" readonly>
	</div>
	<div class="mb-3">
		<label for="mobile" class="form-label">변경 번호</label>
		<input type="text" class="form-control" id="re-mobile" name="re-mobile">
	</div>
	<h6 class="msg" style="color: red"></h6>
	<button type="button" class="btn btn-primary">목록으로</button>
	<button type="submit" class="btn btn-success">수정</button>
</form>
<%
}
%>
<script src="modify.js"></script>
<%@ include file="/include/footer.jsp"%>