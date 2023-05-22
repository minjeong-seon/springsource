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

// 페이지 하단 페이지 번호 클릭 시
//a 태그 기본 기능 중지
//a 태그 href 값 가져와서 operForm 안의 page 요소 값에 넣기 + action form 전송
const operForm = document.getElementById("operForm");

const page = document.querySelector(".pagination");

page.addEventListener("click", (e) => {
  e.preventDefault();

  //a태그 안의 href 값 가져오기
  let href = e.target.getAttribute("href");

  //operForm 안의 page value 수정
  operForm.firstElementChild.value = href;
  //console.log(form);
  operForm.submit();
});

const amount = document.querySelector("#amount");
amount.addEventListener("change", (e) => {
  const val = e.target.value;
  //form안의 amount 요소 값
  const amount = document.querySelector("#operForm input:nth-child(2)");
  amount.value = val;

  operForm.submit();
});

// 제목 클릭 시 a태그 기능 중지(forEach 안에 있는 title을 클릭하는 것이므로 selecetAll)
// operForm의 action을 board/read 로 변경
// operForm에 bno 태그 추가해서 operForm 전송
const moves = document.querySelectorAll(".move");

moves.forEach((move) => {
  move.addEventListener("click", (e) => {
    e.preventDefault();

    const href = e.target.getAttribute("href");
    const bno = "<input type='hidden' name='bno' value='" + href + "'>";
    //[문제]]뒤로가기 할 때마다 url에 bno가 반복적으로 따라 붙어서 원하는 게시글을 볼 수 없음
    operForm.insertAdjacentHTML("beforeend", bno);
    operForm.action = "/board/read";
    //console.log(operForm);
    operForm.submit();
  });
});

//[해결1] read.js에 한 것처럼 jsp에 bno 태그 추가해놓고 remove로 넣었다 뺐다 하기

//[해결2]뒤로가기 이벤트 감지 시 ==> 새로고침 하기
window.onpageshow = function (event) {
  // persisted == true 일 때 wepage가 로딩될 때 캐시에서 읽어옴
  if (event.persisted) {
    location.reload(); //새로고침
  }
};

//검색 버튼 클릭 시
//type & keyword 입력여부 확인
//입력 안 된 경우 => 경고창 보여주기
//입력 된 경우 => form 전송
const searchForm = document.querySelector("#searchForm");
searchForm.addEventListener("submit", () => {
  e.preventDefault();

  const type = document.querySelector("#type");
  const keyword = document.querySelector("#keyword");

  if (type.value === "") {
    alert("검색 조건을 선택해 주세요.");
    type.focus();
    return;
  } else if (keyword.value === "") {
    alert("검색어를 입력해 주세요.");
    keyword.focus();
    return;
  }
  searchForm.submit();
});
