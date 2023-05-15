/**
 * form submit 되기 전에 유효성 검증
 * 
 * 	1) 내용이 비어 있지 않아야 함(단, description은 허용)
 * 	2) 코드는 무조건 4자리 입력되었는지 확인(pk라 중복이면 insert 안 됨)
 * 	3) 가격은 숫자로 입력되었는지 확인
 * 
 * 	세 가지 조건 만족 시 form submit 하기
 */
document.querySelector(".btn-success").addEventListener("click",()=>{
	location.href=path;})

const re = /^\d{4}/;
const form = document.querySelector("form");
 form.addEventListener("submit",(e)=>{
	 e.preventDefault();
	 const code = document.getElementById("code");
	 const title = document.getElementById("title");
	 const writer = document.getElementById("writer");
	 const price = document.getElementById("price");
	
	if(!re.test(code.value)){
		/**code.value === "" || code.value.length !== 4 || isNaN(code.value)  */
		alert("코드를 확인해 주세요.");
		code.select();
		return;
	}else if(title.value === ""){
		alert("도서명을 확인해 주세요.");
		title.select();
		return;
	}else if(writer.value === ""){
		alert("저자명을 확인해 주세요.");
		writer.select();
		return;
	}else if( price.value === "" || isNaN(price.value)){
		alert("가격을 확인해 주세요.");
		price.select();
		return;
	}
	form.submit();
 })