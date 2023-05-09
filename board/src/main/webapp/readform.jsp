<%@page import="board.domain.BoardDTO"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp"%>
<main>
	<h2>Board Read</h2>
	<form action="" method="post">
		<div class="row mb-3">
			<label for="inputName" class="col-sm-2 col-form-label">작성자</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputName" name="name" readonly value="${dto.name}">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputTitle" class="col-sm-2 col-form-label">제목</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputTitle" name="title" readonly value="${dto.title}">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputContent" class="col-sm-2 col-form-label">내용</label>
			<div class="col-sm-10">
				<textarea rows="10" class="form-control" id="inputContent" name="content" readonly>${dto.content}</textarea>
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputAttach" class="col-sm-2 col-form-label">첨부파일</label>
			<%-- 파일명에 ++ 같은 특수문자가 포함되어 있는 경우 : 다운로드 요청 시 ==> 문제 발생(인코딩 필요) --%>
			<div class="col-sm-10">
			<%
			//다운로드 받을 파일명 가져오기(EL <> 자바코드 호환 X)
			BoardDTO dto = (BoardDTO) request.getAttribute("dto");
			//첨부파일이 없는 게시글 조회 시 nullpointException 방지
			String attachFullName = dto.getAttach();

			if(attachFullName!=null){
				//작성자가 올린 파일명 분리하기
				String attachName = attachFullName.substring(attachFullName.indexOf("_")+1);
				//특수문자 포함된 파일명 인코딩으로 오류(문제) 없이 읽어 오기
				String encodeAttach = URLEncoder.encode(dto.getAttach(), "utf-8");
				out.print("	<a href='download.jsp?fileName="+encodeAttach+"'>");
				//브라우저 화면에는 작성자가 올린 파일명만 보이도록 하기
				out.print(attachName);
				out.print("</a>");
			}
			%>
			</div>
		</div>
		<button type="submit" class="btn btn-success">수정</button>
		<button type="button" class="btn btn-secondary">답변</button>
		<button type="button" class="btn btn-primary">목록보기</button>
	</form>
</main>
<form action="" id="readForm">
	<input type="hidden" name="bno" value="${dto.bno}" />
	<input type="hidden" name="criteria" value="${pageDto.criteria}" />
	<input type="hidden" name="keyword" value="${pageDto.keyword}" />
	<input type="hidden" name="page" value="${pageDto.page}" />
	<input type="hidden" name="amount" value="${pageDto.amount}" />
</form>
<script src='<c:url value="/js/read.js"/>'></script>
<%@ include file="include/footer.jsp"%>











