const form = document.getElementById("operForm");

// 수정 버튼 클릭 시 operForm 보내기
// board/read로 전송
document.querySelector(".btn-info").addEventListener("click", () => {
  form.action = "/board/modify";
  form.submit();
});

// 목록 버튼 클릭 시 operForm 으로 board/list로 보내기
// bno 제거
document.querySelector(".btn-secondary").addEventListener("click", () => {
  form.firstElementChild.remove();
  form.action = "/board/list";
  form.submit();
});

//댓글 보여줄 영역 가져오기
let chat = document.querySelector(".chat");

showList(1);

function showList(page) {
  //현재 게시물에 대한 댓글 가져오기
  // page: page || 1  ==> page 변수값이 존재하면 page값 사용, 없으면 1(초기값)
  replyService.getList({ bno: bno, page: page || 1 }, (result) => {
    //도착한 데이터를 화면에 보여주기
    if (result == null || result.length == 0) {
      chat.innerHTML = "";
      return;
    }
    let str = "";
    for (let idx = 0; idx < result.length; idx++) {
      str +=
        "<li class='list-group-item border-bottom' data-rno='" +
        result[idx].rno +
        "'>";
      str += "<div class='d-flex justify-content-between'>";
      str +=
        "<strong class='primary-font'>" + result[idx].replyer + "</strong>";
      str +=
        "<small class='text-muted text-right'>" +
        replyService.displayTime(result[idx].replydate) +
        "</small>";
      str += "</div>";
      str += "<p>" + result[idx].reply + "</p>";
      str += "</li>";
    }
    chat.innerHTML = str;
  });
}

//(댓글 등록 버튼 클릭 시)댓글 작업 호출
//reply.js에서 아래 {댓글정보}는 reply에 담고, ()=>{} 함수는 callback에 담음
const reply = document.querySelector("#reply");
const replyer = document.querySelector("#replyer");
document.querySelector("#replyForm").addEventListener("submit", (e) => {
  e.preventDefault();

  replyService.add(
    { bno: bno, reply: reply.value, replyer: replyer.value },
    (result) => {
      //alert(result);
      //textarea에 작성되어 있는 내용 지우기
      reply.value = "";
      replyer.value = "";
    }
  );
});

//댓글 하나 가져오기
replyService.get(2, (result) => {
  console.log(result);
});
