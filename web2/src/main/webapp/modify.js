/**
 * 최소 re-name, re-addr, re-mobile 셋 중에 하나는 값이 있어야 함
 *
 * 셋 다 빈칸일 때 submit 기능 막고 + 메시지 띄우기
 *  
 */
const form = document.querySelector("form");

form.addEventListener("submit", (e)=>{
	e.preventDefault();
	
	const rename = document.getElementById("re-name");
	const readdr = document.getElementById("re-addr");
	const remobile = document.getElementById("re-mobile");
	
	if(readdr.value.length > 0 || remobile.value.length > 0 || rename.value.legth>0){	
		form.submit();
	}else{
		document.querySelector(".msg").innerHTML="수정된 내용이 없습니다."
	}
})