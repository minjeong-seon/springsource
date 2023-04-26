<%@page import="user.persistence.UserDAO"%>
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
	
	UserDAO dao = new UserDAO();
	boolean flag = dao.insert(username, birthYear, addr, mobile);
	
	//페이지 이동(사용자가 볼 수 있는 페이지로~)
	String path="";
	if(flag){ //회원추가 성공 시 회원목록으로 페이지 이동
		path="listPro.jsp";
	}else{ //회원추가 실패 시 회원추가 페이지로 이동
		path="insert.jsp";
	}
	//페이지 이동
	response.sendRedirect(path);

%>