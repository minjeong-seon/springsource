<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

	<!-- 메인페이지 헤드2 -게시판 안내- -->
	<div class="gnb-wrap">
		<div class="inner">
			<nav id="gnb" class="gnb">
				<ul class="gnb_ul">
					<li class=""><a href="..">
							<span>공지사항</span>
						</a></li>
					<li class=""><a href="..">
							<span>자주 묻는 질문</span>
						</a></li>
				</ul>
			</nav>
			<!--// gnb -->
		</div>
		<!--// inner -->
	</div>
	<main class="mt-5 pt-5">
	<div class="container-fluid px-4">
		<h1 class="mt-4">Board</h1>
 
		<div class="card mb-4">
			<div class="card-header">
				<a class="btn btn-primary float-end" href="register"> <!-- <i class="fas fa-table me-1"></i> -->
					<i class="fas fa-edit"></i> 글 작성
				</a>
			</div>
			<div class="card-body">
				<table class="table table-hover table-striped">
					<thead>
						<tr>
							<th>글번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>조회수</th>
							<th>작성일</th>
						</tr>
					</thead>
					<tbody>
						<%-- <c:forEach items="${boards}" var="board">
							<tr>
								<td>${board.bno}</td>
								<td><a href="get?bno=${board.bno} ">${board.title}</a></td>
								<td>${board.writer}</td>
								<td>${board.hitCount}</td>
								<td>${board.regDate}</td>
							</tr>
						</c:forEach> --%>
							<tr>
								<td>1</td>
								<td>글작성이 안돼요</td>
								<td>개똥이</td>
								<td>10</td>
								<td>2023-06-20</td>
							</tr>
							<tr>
								<td>2</td>
								<td>사진이 안올라가요</td>
								<td>소똥이</td>
								<td>15</td>
								<td>2023-06-21</td>
							</tr>
							<tr>
								<td>3</td>
								<td>지도가 안보여요</td>
								<td>말똥이</td>
								<td>14</td>
								<td>2023-06-21</td>
							</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	</main>


	<script type="module" src="js/main.js"></script>
	<%@ include file="../include/footer.jsp"%>