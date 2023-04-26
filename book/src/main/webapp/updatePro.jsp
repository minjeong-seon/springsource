<%@page import="book.persistence.BookDAO"%>
<%@page import="book.domain.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		request.setCharacterEncoding("utf-8");
		//update.jsp 가져오기
		int code=  Integer.parseInt(request.getParameter("code"));
		int price= Integer.parseInt(request.getParameter("price"));
		
		//DB작업
		BookDAO dao = new BookDAO();
		
		//페이지 이동 - 성공 시 목록으로
		if(dao.update(price, code)){
			response.sendRedirect("listPro.jsp");
		}else{
			/* price, code에서 오류가 날 확률이 없으므로 사실상 필요 없는 부분이긴 함 */
			response.sendRedirect("modifyPro.jsp?code="+code);
		}
	%>