<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
	session & cookie (서버쪽 기술)
	세션 : 서버쪽에 저장 (객체 상태로 저장 가능)
		-> 노출되면 안 되는 정보 저장
	쿠키 : 클라이언트 쪽에 저장 (객체로 저장 불가)/ 만료기간 지정/저장할 수 있는 양 제한적
		-> 필요하지만 외부에 노출되어도 상관 없는 정보 저장
	
	웹 스토리지 : 브라우저에 저장 (스크립트에서 할 수 있음)/ 영구저장 가능/ 쿠키보다 큰 데이터 저장
	로컬 스토리지 : 
	세션 스토리지 : 
	
	
	> http://localhost:8080/cookie/cookie1.jsp 요청
		> cookie1.jsp 응답(브라우저 헤더 정보에 쿠키 정보 같이 보냄)
			> 클라이언트 컴퓨터에 쿠키 정보 저장됨
				> http://localhost:8080/cookie/getCookie1.jsp  요청
					> 쿠키 저장소에 있는 http://localhost:8080이 저장해 놓은 값들이 따라감
						> 서버는 담아놓은 쿠키 정보를 확인할 수 있게 됨
 --%>
 <%
 	//서버에서 클라이언트한테 응답 시 특정 값을 붙여서 보내기
	//응답response.값붙이기addCookie(new Cookie(변수, 특정 값))
 	response.addCookie(new Cookie("name", "John"));
 	response.addCookie(new Cookie("gender", "Male"));
 	response.addCookie(new Cookie("age", "30"));
 	response.addCookie(new Cookie("addr", "Arizona"));
 %>
 <h3>쿠키 데이터가 저장되었습니다.</h3>
 <a href="getCookie1.jsp">쿠키 확인하러 가기</a>
</body>
</html>