<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//form 내용 가져오기
	request.setCharacterEncoding("utf-8");

	int no = Integer.parseInt(request.getParameter("no"));
	String rename = request.getParameter("re-name");
	String readdr = request.getParameter("re-addr");
	String remobile = request.getParameter("re-mobile");
	
	Class.forName("oracle.jdbc.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "javadb";
	String password = "12345";
	Connection con = DriverManager.getConnection(url, user, password);
	
	PreparedStatement pstmt = null;
	String sql = "";
	
	if(rename!="" && readdr!="" && remobile!=""){
		//이름, 주소, 폰번
		sql = "update usertbl set username=?, addr=?, mobile=?, where no=?";
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, rename);
		pstmt.setString(2, readdr);
		pstmt.setString(3, remobile);
		pstmt.setInt(4, no);
	}else{
		//셋 중 둘만 수정한 경우
		if(rename!="" && readdr!=""){
			//이름, 주소
			sql = "update usertbl set username=?, addr=? where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, rename);
			pstmt.setString(2, readdr);
			pstmt.setInt(3, no);
		}else if(rename!="" && remobile!=""){
			//이름, 폰번
			sql = "update usertbl set username=?, mobile=? where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, rename);
			pstmt.setString(2, remobile);
			pstmt.setInt(3, no);
		}else if(readdr!="" && remobile!=""){
			//주소, 폰번
			sql = "update usertbl set addr=?, mobile=? where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, readdr);
			pstmt.setString(2, remobile);
			pstmt.setInt(3, no);
			}else if(rename!=""){
			//셋 중 하나만 수정한 경우
			//이름만
			sql = "update usertbl set username=? where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, rename);
			pstmt.setInt(2, no);
		}else if(readdr!=""){
			//주소만
			sql = "update usertbl set addr=? where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, readdr);
			pstmt.setInt(2, no);
		}else if(remobile!=""){
			//번호만
			sql = "update usertbl set mobile=? where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, remobile);
			pstmt.setInt(2, no);
			}
	}
	
	// update 성공 시 get.jsp로 페이지 이동
	int count = pstmt.executeUpdate();
	String path = "";
	if(count>0){
		path = "get.jsp?no="+no;
	}else{
		path = "modify.jsp?no="+no;
	}
response.sendRedirect(path);
%>