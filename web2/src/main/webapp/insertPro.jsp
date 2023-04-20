<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//개발자 화면(사용자가 보는 화면 X) = 백엔드 작업 영역
	
	request.setCharacterEncoding("utf-8");

	//form에서 입력받은 데이터 가져오기
	String username = request.getParameter("username");
	String birthYear = request.getParameter("birthYear");
	String addr = request.getParameter("addr");
	String mobile = request.getParameter("mobile") ;
	
	//DB insert 작업
	Class.forName("oracle.jdbc.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "javadb";
	String password = "12345";	
	Connection con = DriverManager.getConnection(url, user, password);
	
	String sql = "INSERT INTO userTBL(no, username, birthYear, addr, mobile) ";
	sql += "VALUES(user_seq.NEXTVAL, ?,?,?,?)";
	PreparedStatement pstmt = con.prepareStatement(sql);
	// ? 입력받아 저장하기
	pstmt.setString(1, username);
	pstmt.setInt(2, Integer.parseInt(birthYear));
	pstmt.setString(3, addr);
	pstmt.setString(4, mobile);
	
	//DML(insert, update, delete) 문 실행 시: executeUpdate(); 사용
	int count = pstmt.executeUpdate();
	
	//페이지 이동(사용자가 볼 수 있는 페이지로~)
	String path="";
	if(count>0){ //회원추가 성공 시 회원목록으로 페이지 이동
		path="list.jsp";
	}else{ //회원추가 실패 시 회원추가 페이지로 이동
		path="insert.jsp";
	}
	//페이지 이동
	response.sendRedirect(path);

%>