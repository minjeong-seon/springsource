/**
 *
 */
const form = document.getElementById("operForm");
//삭제 버튼 누르면 operForm으로 /board/remove 보내기
document.querySelector(".btn-danger").addEventListener("click", () => {
  form.action = "/board/remove";
  form.submit();
});

// 목록 버튼 클릭 시 operForm 으로 board/list로 보내기
// bno 제거
document.querySelector(".btn-success").addEventListener("click", () => {
  form.firstElementChild.remove();
  form.action = "/board/list";
  form.submit();
});
