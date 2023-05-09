// 검색 클릭 시 검색기준 value, keyword 입력여부 확인
const form = document.querySelector("form");

form.addEventListener("submit",(e)=>{
	e.preventDefault();
	
	const criteria = document.querySelector("[name='criteria']");
	const keyword = document.querySelector("[name='keyword']");
	
	
	if(criteria.value == "n"){
		alert("검색 기준을 확인해 주세요");
		criteria.focus();
		return;
	}else if(keyword.value == ""){
		alert("검색어를 확인해 주세요");
		keyword.focus();
		return;
	}
	
	// page 태그의 value 값을 1로 변경
	document.querySelector("[name='page']").value = "1";
	
	form.submit();	
})

// 페이지 나누기 클릭
// a 태그 기능 중지
// href 값 가져오기
// page 값을 href 값 가져온 걸로 대체
// actionForm 가져온 후 전송

//const pageLinks = document.querySelectorAll(".page-link");
const actionForm = document.querySelector("#actionForm");

/*
pageLinks.forEach(pageLink => {
	pageLink.addEventListener("click",(e) => {
		e.preventDefault();
		
		//console.log(e.target);
		//console.log(e.target.href);
		//console.log(e.target.getAttribute("href"));
		
		const href = e.target.getAttribute("href");
		
		const page = document.querySelector("#actionForm input:nth-child(3)");
		page.value = href;
		
		//console.log(actionForm);
		actionForm.submit();
	})
})

*/

const bno = document.querySelector("#actionForm input:nth-child(1)");

// 이벤트 버블링 : 자식의 이벤트가 부모로 전달 됨
const pagination = document.querySelector(".pagination");
pagination.addEventListener("click",(e)=>{
	e.preventDefault();
		
	//console.log(e.target);
	//console.log(e.target.href);
	//console.log(e.target.getAttribute("href"));
	
	const href = e.target.getAttribute("href");
	
	const page = document.querySelector("#actionForm input:nth-child(4)");
	page.value = href;
	actionForm.action = "list.do";
	//console.log(actionForm);
	actionForm.submit();
})


//게시물 개수 변경이 일어날 때 actionForm 전송하기
//actionForm 안의 amount 값은 사용자의 선택값으로 변경 후 전송
const formSel = document.querySelector("select[name='amount']");
formSel.addEventListener("change", (e)=>{
	document.querySelector("#actionForm input:nth-child(5)").value = e.target.value;
	//경로가 섞이지 않도록 따로 지정
	actionForm.action = "list.do";
	actionForm.submit();
})

//title 클릭 시 
const moves = document.querySelectorAll(".move");
moves.forEach(move=>{
	move.addEventListener("click", (e)=>{
// a 태그 중지
	e.preventDefault();
//a 태그 안의 href 값(bno) 가져오기
	const href = e.target.getAttribute("href");
//actionForm 에 bno 태그 추가 후 actionForm 전송
	//const element = "<input type='hidden' name='bno' value='"+href+"'>";
	//actionForm.insertAdjacentHTML("afterbegin", element);
	
	//actionForm 안의 bno 찾아와서 value를 href로 지정
	bno.value = href;
	console.log(actionForm);
	actionForm.action = "cntUpdate.do";
	actionForm.submit();
	})
})














