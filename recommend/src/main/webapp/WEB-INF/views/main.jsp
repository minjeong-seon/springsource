<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp"%>
</head>

<body>
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


	<!-- 대문 이미지 슬라이드 -->
	<div id="carouselExampleCaptions" class="carousel slide">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/DISH22.jpg" class="d-block w-100" style="height: 560px;">
				<div class="carousel-caption d-none d-md-block">
					<h5>-Michel Bras</h5>
					<p>"요리사는 행복을 파는 사람이다."</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="..." class="d-block w-100" alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5>-Honore de Balzac</h5>
					<p>"배가 비어있으면 정신도 빌 수밖에 없다."</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="..." class="d-block w-100" alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5>-George Bernard Shaw</h5>
					<p>"음식에 대한 사랑처럼 진실된 사랑은 없다."</p>
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


	<!-- 메뉴 선택 박스 -->
	<section class="box highlight">
		<ul class="special">
			<li><a href="#korean" id="scroll_move">
					<img src="img/korean.png" alt="" /> <span>한식</span>
				</a></li>
			<li><a href="#japanese" id="scroll_move">
					<img src="img/japanese.png" alt="" /> <span>일식</span>
				</a></li>
			<li><a href="#chinese" id="scroll_move">
					<img src="img/chinese.png" alt="" /> <span>중식</span>
				</a></li>
			<li><a href="#western" id="scroll_move">
					<img src="img/western.png" alt="" /> <span>양식</span>
				</a></li>
			<li><a href="#fastfood" id="scroll_move">
					<img src="img/fastfood.png" alt="" /> <span>패스트 푸드</span>
				</a></li>
			<li><a href="#desert" id="scroll_move">
					<img src="img/desert.png" alt="" /> <span>카페</span>
				</a></li>
		</ul>
	</section>


	<!-- 중간 : 카테고리별 음식점 랭킹순 정렬 -->
	<div class="category_section_wrap">
		<!-- 라인 반복 -->
		<section id="korean" class="bg-white category_section_line_wrap">
			<span class="food_category_name"><a href="..">#한식</a></span>
			<div class="container mx-auto flex items-center flex-wrap ">
				<!-- 라인 내 음식점 반복구간 -->
				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>
			</div>
		</section>
		<!-- 일식 카테고리 -->
		<section id="japanese" class="bg-white category_section_line_wrap">
			<span class="food_category_name"><a href="..">#일식</a></span>
			<div class="container mx-auto flex items-center flex-wrap ">
				<!-- 라인 내 음식점 반복구간 -->
				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>
			</div>
		</section>
		<!-- 중식 카테고리 -->
		<section id="chinese" class="bg-white category_section_line_wrap">
			<span class="food_category_name"><a href="..">#중식</a></span>
			<div class="container mx-auto flex items-center flex-wrap ">
				<!-- 라인 내 음식점 반복구간 -->
				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>
			</div>
		</section>
		<!-- 양식 카테고리 -->
		<section id="western" class="bg-white category_section_line_wrap">
			<span class="food_category_name"><a href="..">#양식</a></span>
			<div class="container mx-auto flex items-center flex-wrap ">
				<!-- 라인 내 음식점 반복구간 -->
				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>
			</div>
		</section>
		<!-- 패스트푸드 카테고리 -->
		<section id="fastfood" class="bg-white category_section_line_wrap">
			<span class="food_category_name"><a href="..">#패스트 푸드</a></span>
			<div class="container mx-auto flex items-center flex-wrap ">
				<!-- 라인 내 음식점 반복구간 -->
				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>
			</div>
		</section>
		<!-- 카페 카테고리 -->
		<section id="desert" class="bg-white category_section_line_wrap">
			<span class="food_category_name"><a href="..">#카페</a></span>
			<div class="container mx-auto flex items-center flex-wrap ">
				<!-- 라인 내 음식점 반복구간 -->
				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>

				<div class="w-full md:w-1/3 xl:w-1/4 p-6 flex flex-col hover:grow hover:shadow-lg restaurant_link">
					<a href="#" class="">
						<img src="https://file.rankingdak.com/image/RANK/PRODUCT/PRD001/20230106/IMG1672nhu966250394_330_330.jpg">
						<div class="pt-3 flex items-center ">
							<figcaption>
								<a href="..." alt="음식점 상세 정보 링크">
									#상호명 <strong class="point search_point "></strong>
								</a>
								<div class="count">
									<span><img class="score_image" src="https://dcicons.s3.ap-northeast-1.amazonaws.com/new/images/mobile/common_react/review__newstar__img.png" />3.8</span><span class="review">(77)</span>
								</div>
							</figcaption>
							<div class="save_restaurant">
								<!-- 좋아요 누른 하트 : class="fa fa-heart"  -->
								<span class="icon is-small"><i class="fa fa-heart-o" aria-hidden="true"></i></span> &nbsp;<span class="like-num"></span>
							</div>
						</div>
					</a>
				</div>
			</div>
		</section>
	</div>
	

<script type="module" src="src/main.js"></script>
<%@ include file="include/footer.jsp"%>