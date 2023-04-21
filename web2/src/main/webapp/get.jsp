<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/include/header.jsp" %>
<%
int no = Integer.parseInt(request.getParameter("no"));
//out.print("no"+no);

//DB작업
Class.forName("oracle.jdbc.OracleDriver");
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "javadb";
String password = "12345";	
Connection con = DriverManager.getConnection(url, user, password);

String sql = "select * from usertbl where no=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setInt(1, no);
ResultSet rs = pstmt.executeQuery();
if(rs.next()){
	String username = rs.getString ("username");
	String birthYear = rs.getString ("birthYear");
	String addr = rs.getString ("addr");
	String mobile = rs.getString ("mobile");
	
%>
<h1>회원 상세 조회</h1>
<form action="" method="post">
  <div class="mb-3">
    <label for="username" class="form-label">name</label>
    <input type="text" class="form-control" id="username" readonly value="<%=username%>">
  </div>
   <div class="mb-3">
    <label for="birthYear" class="form-label">birthYear</label>
    <input type="text" class="form-control" id="birthYear" readonly value=<%=birthYear %>>
  </div>
     <div class="mb-3">
    <label for="addr" class="form-label">addr</label>
    <input type="text" class="form-control" id="addr" readonly value=<%=addr %>>
  </div>
  <div class="mb-3">
    <label for="mobile" class="form-label">mobile</label>
    <input type="text" class="form-control" id="mobile" readonly value=<%=mobile %>>
  </div>
  <input type="hidden" name="no" value="<%=no%>" id="no"/>
  <button type="button" class="btn btn-primary">목록으로</button>
  <button type="button" class="btn btn-success">수정</button>
  <button type="button" class="btn btn-danger">삭제</button>
</form>	
<%
	}
%>
<script>
//자바 변수에 담긴 값 사용
const no = <%=no%>
</script>
<script src="get.js"></script>
<%@ include file = "/include/footer.jsp" %>