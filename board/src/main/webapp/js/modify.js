document.querySelector(".btn-primary").addEventListener("click",()=>{
	location.href = "list.do";
})

/*document.querySelector("form").addEventListener("submit",(e)=>{
	location.href="update.do";
})*/


document.querySelector(".btn-danger").addEventListener("click", (e)=>{
	//삭제 버튼 클릭 시 modifyform 전송(action은 delete.do)
	//사용자가 입력한 비밀번호가 일치하는지 확인
	const password=document.querySelector("#inputPassword")
	if(password.value==""){
		alert("비밀번호가 일치하지 않습니다.");
		password.focus();
		return;
	}else{	
		//비밀번호가 일치하면 입력된 비번을 hidden 폼 안에 있는 비번.value 값으로 setting
		document.querySelector("#password").value=password.value;
		//id=readform을 가져와서
		const modifyform = 	document.getElementById("modifyform"); 
		//readform > modify.do로 전송
		modifyform.action = "delete.do";
		modifyform.method="post";
		modifyform.submit();
	}
	
})
