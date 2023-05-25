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
let page = 1;

let chat = document.querySelector(".chat");

showList(page);

function showReplyPage(total) {
  let endPage = Math.ceil(page / 10.0) * 10;
  let startPage = endPage - 9;
  let prev = startPage != 1;
  let next = false;
  if (endPage * 10 >= total) {
    endPage = Math.ceil(total / 10.0);
  }
  if (endPage * 10 < total) {
    next = true;
  }

  let str = "<ul class='pagination justify-content-center'>";
  if (prev) {
    str +=
      "<li class='page-item'><a class='page-link' href='" +
      (startPage - 1) +
      "'>Previous</a></li>";
  }

  for (let i = startPage; i <= endPage; i++) {
    let active = page == i ? "active" : "";
    str +=
      "<li class='page-item " +
      active +
      "'><a class='page-link' href='" +
      i +
      "'>" +
      i +
      "</a></li>";
  }

  if (next) {
    str +=
      "<li class='page-item'><a class='page-link' href='" +
      (endPage + 1) +
      "'>Next</a></li>";
  }

  str += "</ul>";
  document.querySelector(".card-footer").innerHTML = str;
}

//댓글 페이지 번호 클릭 시 a태그 중지
document.querySelector(".card-footer").addEventListener("click", (e) => {
  e.preventDefault();

  //href에 있는 값 가져오기(=페이지 번호)
  page = e.target.getAttribute("href");

  //showList(가져온 값) 호출
  showList(page);
});

function showList(pageNum) {
  //현재 게시물에 대한 댓글 가져오기
  // page: page || 1  ==> page 변수값이 존재하면 page값 사용, 없으면 1(초기값)
  replyService.getList({ bno: bno, page: page || 1 }, (total, result) => {
    console.log("read.js에서 확인");
    console.log(total);
    console.log(result);

    //요청 페이지가 -1일 때(=새 댓글 작성 시)
    if (pageNum == -1) {
      //마지막 페이지 알아내기(새글은 마지막 페이지에 등록되니까!)
      page = Math.ceil(total / 10.0);
      showList(page);
      return;
    }

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
      str += "<div class='btn-group btn-group-sm'>";
      str += " <button class='btn btn-warning' type='button'>수정</button>";
      str += "<button class='btn btn-danger' type='button'>삭제</button>";
      str += "</div>";
      str += "</li>";
    }

    chat.innerHTML = str;
    showReplyPage(total); //현재 게시글에 달린 총 댓글 수를 이용한 페이지 나누기 함수 호출
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
      showList(-1);
    }
  );
});

//수정 버튼 클릭 시 모달 창 띄우기
//이벤트 버블링(전파) : 자식의 이벤트가 부모에게 전달됨 ==> 부모에 이벤트를 작성해도 됨

//자식에 이벤트 걸기
// document.querySelectorAll(".btn-warning").forEach((updateBtn) => {
//   updateBtn.addEventListener("click", () => {});
// });

//부모에 이벤트 걸기
chat.addEventListener("click", (e) => {
  //어느 <li>에 속한 이벤트가 발생했는지(=몇 번째 댓글에 있는 수정버튼이 클릭됐는지)
  /// e.target : 이벤트 발생 대상
  /// e.target.closest("키워드") : 이벤트 발생 대상에서 가장 가까운(방향: ▲위) "키워드"를 찾음
  let li = e.target.closest("li"); // = 사용자가 클릭한 수정버튼이 속한 부모 li 찾기
  console.log("이벤트 발생 ", li);

  //rno 가져오기 (data-* 속성값 가져오기 : dataset)
  let rno = li.dataset.rno;
  console.log("rno ", rno);

  if (e.target.classList.contains("btn-warning")) {
    //댓글 수정 버튼 클릭 시 해당 댓글 하나 가져오기
    replyService.get(rno, (result) => {
      console.log(result);

      //modal 창 안에 result 내용 보여주기
      document.querySelector(".modal-body #rno").value = result.rno;
      document.querySelector(".modal-body #reply").value = result.reply;
      document.querySelector(".modal-body #replyer").value = result.replyer;

      //jQuery : document.queryselector = $ 로 간단하게 표현 가능
      $("#replyModal").modal("show");
    });
  } else if (e.target.classList.contains("btn-danger")) {
    //댓글 삭제 버튼 클릭 시
    replyService.remove(rno, (result) => {
      if (result === "success") {
        console.log("삭제요청");
        alert("댓글이 삭제되었습니다.");
        showList(page);
      }
    });
  }
});

//modal 창에서 수정버튼 클릭 시 -> 댓글 수정
document
  .querySelector(".modal-footer .btn-primary")
  .addEventListener("click", () => {
    //modal 창 안에 있는 rno, reply 가져와서 js 객체 생성
    const updateReply = {
      rno: document.querySelector(".modal-body #rno").value,
      reply: document.querySelector(".modal-body #reply").value,
    };

    replyService.update(updateReply, (result) => {
      //modal 창 닫기
      if (result === "success") {
        $("#replyModal").modal("hide");
        showList(page);
      }
    });
  });
