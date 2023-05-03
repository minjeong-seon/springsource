<%@page import="board.domain.BoardDTO"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp"%>
<main>
	<h2>Board Update</h2> <%-- 수정할 내용 보여주기 --%>
	<form action='<c:url value="/update.do"/>' method="post" enctype="multipart/form-data">
		<div class="row mb-3">
			<label for="inputName" class="col-sm-2 col-form-label">작성자</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputName" name="name" readonly value="${dto.name}">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputTitle" class="col-sm-2 col-form-label">제목</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputTitle" name="title"  value="${dto.title}">
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputContent" class="col-sm-2 col-form-label">내용</label>
			<div class="col-sm-10">
				<textarea rows="10" class="form-control" id="inputContent" name="content" >${dto.content}</textarea>
			</div>
		</div>
		<div class="row mb-3">
			<label for="inputAttach" class="col-sm-2 col-form-label">첨부파일</label>
			<div class="col-sm-10">
			<%
			BoardDTO dto = (BoardDTO) request.getAttribute("dto");
			String attachFullName = dto.getAttach();
					//첨부파일이 있으면 다운로드 받을 수 있도록 하기
			if(attachFullName!=null){
				String attachName = attachFullName.substring(attachFullName.indexOf("_")+1);
				String encodeAttach = URLEncoder.encode(dto.getAttach(), "utf-8");
				out.print("	<a href='download.jsp?fileName="+encodeAttach+"'>");
				out.print(attachName);
				out.print("</a>");
			}else{	//첨부파일이 없으면 첨부할 수 있도록 하기
				out.print("<div class='col-sm-10'><input type='file' class='form-control' id='inputAttach' name='attach'></div>");
			}
			%>
			</div>
			<div class="row mb-3">
			<label for="inputPassword" class="col-sm-2 col-form-label">비밀번호</label>
			<div class="col-sm-10">
				<input type="password" class="form-control" id="inputPassword" name="inputPassword" required>
			</div>
		</div>
		</div>
		<%-- action이 bno를 받기 위해 hidden으로 bno 숨겨놓기 --%>
		<input type="hidden" name="bno" value="${dto.bno}" />
		<button type="submit" class="btn btn-success">수정</button>
		<button type="button" class="btn btn-danger">삭제</button>
		<button type="button" class="btn btn-primary">목록보기</button>
	</form>
</main>
<form action="" id="modifyform">
	<input type="hidden" name="bno" value="${dto.bno}" />
	<input type="hidden" name="password" id ="password"  />
</form>
<script src='<c:url value="/js/modify.js"/>'></script>
<%@ include file="include/footer.jsp"%>











