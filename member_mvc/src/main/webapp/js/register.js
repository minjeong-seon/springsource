/**
 * form의 모든 요소가 비어있는지 확인(비어있으면 동작 막기)
 */
const form = document.querySelector("form");
form.addEventListener("submit", (e)=>{	
	if(!form.checkValidity()){
		e.preventDefault();
		e.stopPropagation();
	}
	form.classList.add("was-validated");
});

document.querySelector(".btn-danger").addEventListener("click",()=>{
	const userid = document.querySelector("#userid").value;
	fetch("dupId.do",{
		method: "post",
		body: new URLSearchParams({userid:userid})
	})
	.then((response)=>response.text())
	.then((result)=>{
		console.log(result);
		if(result.trim() == "true"){
			alert("사용하실 수 있는 아이디입니다.");
		}else{
			alert("사용하실 수 없는 아이디입니다.");
		}
	})
});

/*form.addEventListener("submit", (e)=>{
	e.preventDefault();
	const userid = document.querySelector("#userid");
	const password = document.querySelector("#password");
	const name = document.querySelector("#name");
	const gender = document.querySelector("#gender");
	const email = document.querySelector("#email");
	if(userid.value==""){
		alert("id를 입력해 주세요.");
		userid.select();
		return;
	}else if(password.value==""){
		alert("password를 입력해 주세요.");
		password.select();
		return;
	}else if(name.value==""){
		alert("이름을 입력해 주세요.");
		name.select();
		return;
	} else if(document.querySelector("#gender").value==""){
		alert("성별을 선택해 주세요.");
		return;
	}else if(email.value==""){
		alert("이메일을 입력해 주세요.");
		email.select();
		return;
	}form.submit();
})*/