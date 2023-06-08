document.querySelector(".btn-primary").addEventListener("click",()=>{
	location.href=listPath;})
	
document.querySelector(".btn-success").addEventListener("click",()=>{
	location.href=modifyPath+"?code="+code;})
	
document.querySelector(".btn-danger").addEventListener("click",()=>{
	location.href=removePath+"?code="+code;})