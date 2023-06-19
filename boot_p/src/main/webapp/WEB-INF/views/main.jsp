<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp"%>
</head>
<body>
	<!-- 메인페이지 헤드2 -->

	<header class="header clearfix">
		<nav>
			<ul>
				<li><a href="#">공지사항</a></li>
				<li><a href="#">자주 묻는 질문</a></li>
				<li><a href="#">About</a></li>
			</ul>
		</nav>
	</header>


	<!-- 대문 이미지 슬라이드 -->
	<div id="carouselExampleCaptions" class="carousel slide">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/dish3.jpg" class="d-block w-100" alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5>First slide label</h5>
					<p>Some representative placeholder content for the first slide.</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="..." class="d-block w-100" alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5>Second slide label</h5>
					<p>Some representative placeholder content for the second slide.</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="..." class="d-block w-100" alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5>Third slide label</h5>
					<p>Some representative placeholder content for the third slide.</p>
				</div>
			</div>
		</div>
		<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span class="visually-hidden">Next</span>
		</button>
	</div>


	<!-- 음식 장르 선택 박스 -->
	<!-- 메뉴 선택 박스 -->
	<div class="main-category-btn-wrapper">
		<div class="category-btn-list-cover clearfix2">
			<ul class="category-btn-list">
				<li class="category-btn-item"><a href="..." class="category-btn-item-inn">
						<figure class="category-btn-boxing">
							<img src="img/korean_food.png" alt="" />
							<figcaption class="category-btn-item-subject">한식</figcaption>
						</figure>
					</a></li>
				<li class="category-btn-item"><a href="..." class="category-btn-item-inn">
						<figure class="category-btn-boxing">
							<img src="img/korean_food.png" alt="" />
							<figcaption class="category-btn-item-subject">한식</figcaption>
						</figure>
					</a></li>
				<li class="category-btn-item"><a href="..." class="category-btn-item-inn">
						<figure class="category-btn-boxing">
							<img src="img/korean_food.png" alt="" />
							<figcaption class="category-btn-item-subject">한식</figcaption>
						</figure>
					</a></li>
			</ul>
			<span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span>
		</div>
	</div>


	<!-- 중간 : 카테고리별 음식점 랭킹순 정렬 -->
	<!-- 음식점 사진 액자식 진열 -->
	<div class="cartegory_frame_wrap">
		<!-- 카테고리 섹션 반복구간 -->
		<div class="main_cartegory_name_section">
			<h4 class="main_cartegory_name">
				#한식<span class="Card__Section__Rest__Cnt">(검색결과수)</span>
			</h4>
			<a title="파스타" href="/recom_detail">
				<span class="Read__More__Text">더보기</span>
			</a>
		</div>
		<span class="section_line"></span>
		<div class="main_category_restaurant first_line">
			<ul class="first_category_line">
				<!-- 카테고리별 음식점 컨텐츠 반복구간 -->
				<li class="first_category_restaurant">
					<div class="restaurant_info_card">
						<a href="/product/view?productCd=28642" alt="음식점 상세정보 링크">
							<img class="restaurant_thumbnail" src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg" data-loaded="true" />
							<div class="desc_bottom">
								<div class="restaurant_name">
									<a href="..." alt="음식점 상세 정보 링크">
										#업체명 <span class="store_score"><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />4.4</span>
									</a>
								</div>
							</div>
						</a>
					</div>
				</li>
				<li class="first_category_restaurant">
					<div class="restaurant_info_card">
						<a href="/product/view?productCd=28642" alt="음식점 상세정보 링크">
							<img class="restaurant_thumbnail" src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg" data-loaded="true" />
							<div class="desc_bottom">
								<div class="restaurant_name">
									<a href="..." alt="음식점 상세 정보 링크">
										#업체명 <span class="store_score"><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />4.4</span>
									</a>
								</div>
							</div>
						</a>
					</div>
				</li>
			</ul>
		</div>
	</div>



	<!-- 중간 구성 끝 -->


	<%@ include file="include/footer.jsp"%>