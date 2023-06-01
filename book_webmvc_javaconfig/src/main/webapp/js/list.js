/**
 1) 검색기준 선택여부 확인
2) 검색어 입력되었는지 확인
3) 1~2)가 전부 되었으면 submit
 */
const form = document.querySelector("form");
form.addEventListener("submit",(e)=>{
	e.preventDefault();

	const select = document.querySelector(".form-select");
	const keyword = document.querySelector(".form-control");
	//console.log(select.value);
	//const selectedVal = select.options[select.selectedIndex].value;
	if(select.value!="writer" && select.value!="title"){
		alert("검색 기준을 선택해 주세요.")
		return;
	}else if(keyword.value===""){
		alert("검색어를 확인해 주세요.");
		input.select();
		return;
	}
		form.submit();
})