<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<h1>About your Vitamin</h1>
<form action="" method="post">
	<div class="mb-3">
		<label for="" class="form-label">제품명</label>
		<input type="text" calss="form-control" name="productId" id="productId" value="${dto.productId }" readonly/>
	</div>
	<div class="mb-3">
		<label for="" class="form-label">제조사</label>
		<input type="text" calss="form-control" name="company" id="company" value="${dto.company }" readonly/>
	</div>
	<div class="mb-3">
		<label for="" class="form-label">구매 가격</label>
		<input type="text" calss="form-control" name="price" id="price" value="${dto.price }" readonly/>
	</div>
	<div class="mb-3">
		<label for="" class="form-label">제품설명</label>
		<input type="text" calss="form-control" name="description" id="description" value="${dto.description }" readonly/>
	</div>
	<div class="mb-3">
		<label for="" class="form-label">구매처</label>
		<input type="text" calss="form-control" name="location" id="location" value="${dto.location }" readonly/>
	</div>
	<button type="button" class="btn btn-primary">목록으로</button>
	<button type="button" class="btn btn-success">수정</button>
	<button type="button" class="btn btn-warning">삭제</button>
</form>
<script>
const String =${dto.productId };
</script>
<script src='<c:url value="/js/read.js"/>'></script>
<%@ include file="/include/footer.jsp" %>