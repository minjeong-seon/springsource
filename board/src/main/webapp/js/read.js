document.querySelector(".btn-primary").addEventListener("click",()=>{
	location.href = "list.do";
})


//id=readform을 가져와서 
const readform = 	document.getElementById("readform");

document.querySelector("form").addEventListener("submit", (e)=>{
	//수정 클릭 시 submit 기능 중지
	e.preventDefault();
	//readform > modify.do로 전송
	readform.action = "modify.do";
	readform.submit();
})

//답변 클릭 시 
document.querySelector(".btn-secondary").addEventListener("click",()=>{
	readform.action = "replyView.do";
	readform.submit();
})