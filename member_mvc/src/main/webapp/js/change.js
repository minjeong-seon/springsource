/**
 * 기존 비밀번호, 새 비밀번호, 새 비밀번호 확인에 모든 값이 입력되었나 확인
 * 새 비밀번호 = 새 비밀번호 확인 동일한지 확인
 */
const form = document.querySelector("form")
/*form.addEventListener("submit",(e)=>{
	const newVal = document.querySelector("#floatingPassword2").value;
	const confirmVal = document.querySelector("#floatingPassword3").value;
	if(!form.cjcheckValidity() && newVal===currentVal){
		e.preventDefault();
		e.stopPropagation();
	}
	form.classList.add("was-validated");
})*/


form.addEventListener("submit", (e)=>{
	e.preventDefault();
	const currentpwd = document.querySelector("#floatingPassword1");
	const newpwd = document.querySelector("#floatingPassword2");
	const confirmpwd = document.querySelector("#floatingPassword3");
	if(currentpwd.value==""){
		alert("invalid password!");
		currentpwd.select();
		return;
	}else if(newpwd.value==""){
		alert("invalid password!");
		newpwd.select();
		return;
	}else if(confirmpwd.value==""){
		alert("invalid password!");
		confirmpwd.select();
		return;
	}
	if(newpwd.value !== confirmpwd.value){
		alert("비밀번호가 일치하지 않습니다.");
		return;
	}
	form.submit();
});
