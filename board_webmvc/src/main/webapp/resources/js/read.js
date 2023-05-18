/**
 *
 */
const form = document.getElementById("operForm");
// 수정 버튼 클릭 시 operForm 보내기
// board/read로 전송
document.querySelector(".btn-info").addEventListener("click", () => {
  form.action = "/board/modify";
  form.submit();
});
// 목록 버튼 클릭 시 operForm 으로 board/list로 보내기
// bno 제거
document.querySelector(".btn-success").addEventListener("click", () => {
  form.firstElementChild.remove();
  form.action = "/board/list";
  form.submit();
});
