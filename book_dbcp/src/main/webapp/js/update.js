document.querySelector(".btn-primary").addEventListener("click",()=>{
	location.href="listPro.jsp";})

document.querySelector(".btn-danger").addEventListener("click",()=>{
	location.href="removePro.jsp?code="+code;
	})
	
const form = document.querySelector("form");
 form.addEventListener("submit", (e)=>{
	e.preventDefault();
	if(price.value === "" || isNaN(price.value)){
		alert("도서 가격을 확인해 주세요.");
		price.select();
		return;
	}form.submit();
})