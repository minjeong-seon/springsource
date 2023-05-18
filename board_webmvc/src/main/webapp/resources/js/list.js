/**
 *
 */
checkModal(result);

history.replaceState({}, null, null);

function checkModal(result) {
  if (result === "" || history.state) return;

  // result 값이 숫자(bno)면 게시글 등록, 그외 =문자 "success"면 수정/삭제 수행에 맞는 메시지 창 띄우기
  if (parseInt(result) > 0) {
    document.querySelector(".modal-body").innerHTML =
      "게시글 " + result + "번이 등록되었습니다.";
  } else {
    document.querySelector(".modal-body").innerHTML = "처리가 완료되었습니다.";
  }

  $("#registerModal").modal("show");
}
