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


<!-- 바디-->
<div class="section-latest">
	<div class="container">
		<div class="row gutter-v1 align-items-stretch mb-5">
			<div class="col-12">
				<h1 class="section-title">검색 결과(nn건)</h1>
			</div>
			<div class="">
				<div class="row">
					<!-- 검색결과 리스트 반복 구간 -->
					<div class="col-12">
						<div class="post-entry horizontal d-md-flex">
							<div class="media">
								<a href="#">
									<img src="/img/korean.png" alt="음식점 썸네일" class="img-fluid">
								</a>
							</div>
							<div class="content_text">
								<span>
									<p class="store_category_result">
										<a href="#" class="store_name">상호명</a>
										&nbsp; &nbsp; 멕시코,남미음식
									</p>
									<div style="display: inline-block; vertical-align: top;">
										<img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" alt="img" />
									</div>
									<div style="display: inline-block;">
										<span class="review">3.8점(77)</span>
									</div>
									<div class="save_restaurant">
										<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
										<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
									</div>
								</span>
								<p class="store_link_result">
									<a href="">홈페이지 바로 가기</a>
								</p>
								<p class="store_address_result">서울특별시 마포구 월드컵로3길 14 지하1층</p>
								<div class="review_info">
									<p class="likes">
										<span>12</span>명이 추천했습니다.
									</p>
								</div>
							</div>
						</div>
					</div>
					<!-- 반복 구간 종료 -->

				</div>
			</div>
		</div>
	</div>
</div>
<!-- 테스트 끝 -->

<script type="module" src="js/main.js"></script>
<%@ include file="../include/footer.jsp"%>