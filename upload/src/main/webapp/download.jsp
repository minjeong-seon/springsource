<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//사용자가 다운로드 받기를 원하는 파일명
	String fileName = request.getParameter("fileName");

	//서버 폴더에서 사용자가 요청한 해당 파일 가져오기
	//자바 (ch7>io>FileInputEx5.java 두번째 코드 참고)
	FileInputStream fis = new FileInputStream("c:\\upload\\"+fileName);
	BufferedInputStream bis = new BufferedInputStream(fis);
	
	//jsp에 내장된 out 객체 말고 새로 out을 사용할 때
	out.clear();
	out=pageContext.pushBody();
	
	//브라우저에 파일 붙여서 보내기
	//uuid 값 제거 : subString() 사용 
	fileName = fileName.substring(fileName.indexOf("_")+1);
	//인코딩
	// replaceAll("\\+","%20") : 파일명에 공백이나 특수문자가 있으면 %2B로 대체
	fileName = URLEncoder.encode(fileName, "utf-8").replaceAll("\\+","%20");
	response.setContentType("application/octet-stream"); //MIME
	response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
	
	BufferedOutputStream bof = new BufferedOutputStream(response.getOutputStream());
	
	int numRead=0;
	byte[] b = new byte[4896];	//4kb
	while((numRead = bis.read(b))!=-1){
		bof.write(b,0,numRead);
	}
	bof.flush();
	bof.close();
	bis.close();
	
%>