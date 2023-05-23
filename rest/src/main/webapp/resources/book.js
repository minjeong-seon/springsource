/**
 * ajax : fetch, jquery, axios
 */

// 버튼 클릭 시, 화면 깜빡임 없이(비동기식==> ajax) 도서전체목록 가져오기
const content = document.querySelector(".table tbody");
let result = "";

document.querySelector(".btn-outline-primary").addEventListener("click", () => {
  fetch("/booklist")
    .then((response) => response.json())
    .then((data) => {
      data.forEach((book) => {
        result += "<tr><th>" + book.code + "</th>";
        result += "<td>" + book.title + "</td>";
        result += "<td>" + book.writer + "</td>";
        result += "<td>" + book.price + "</td></tr>";
      });

      content.innerHTML = result;
    })
    .catch((error) => console.log(error));
});

//사용자가 입력한 코드와 일치하는 도서 정보 조회
document.querySelector(".btn-info").addEventListener("click", () => {
  //사용자가 입력한 코드 가져오기
  const code = document.querySelector("#code").value;
  fetch("/" + code)
    .then((response) => {
      if (!response.ok) {
        throw new Error("url 확인");
      }
      return response.json();
    })
    .then((data) => {
      result += "<tr><th>" + data.code + "</th>";
      result += "<td>" + data.title + "</td>";
      result += "<td>" + data.writer + "</td>";
      result += "<td>" + data.price + "</td></tr>";
      content.innerHTML = result;
    })
    .catch((error) => console.log(error));
});

//도서정보입력
const form = document.querySelector("#insertForm");
form.addEventListener("submit", (e) => {
  // 폼 전송 시 기존 기능 중지
  e.preventDefault();

  // 폼 안의 데이터 가져오기
  // 자바스크립트 객체로 생성 : {key : value}
  let data = {
    code: document.querySelector("#code1").value,
    title: document.querySelector("#title").value,
    writer: document.querySelector("#writer").value,
    price: document.querySelector("#price1").value,
    description: document.querySelector("#description").value,
  };

  //데이터를 같이 보내는 fetch
  //
  fetch("/create", {
    method: "POST",
    headers: {
      "content-type": "application/json",
    },
    //JSON.stringify() : js 객체를 json 형태로 변환
    body: JSON.stringify(data),
  })
    .then((response) => {
      if (!response.ok) {
        throw new Error("데이터 확인");
      }
      return response.text();
    })
    .then((data) => {
      if (data === "success") {
        alert("입력 성공");
      }
    })
    .catch((error) => alert(error));
});

//삭제버튼 클릭 시 code 가져온 후 삭제
document.querySelector(".btn-danger").addEventListener("click", () => {
  const code = document.querySelector("#code").value;
  fetch("/" + code, {
    method: "delete",
  })
    .then((response) => {
      if (!response.ok) {
        throw new Error("코드 확인");
      }
      return response.text();
    })
    .then((data) => {
      if (data === "success") {
        alert("삭제 성공");
      }
    })
    .catch((error) => alert(error));
});

//도서 가격 수정
const updateForm = document.querySelector("#updateForm");
updateForm.addEventListener("submit", (e) => {
  e.preventDefault();
  //updateForm 안의 데이터 가져와서 자바스크립트 객체로 생성
  let data = {
    code: document.querySelector("#code2").value,
    price: document.querySelector("#price2").value,
  };

  fetch("/update", {
    method: "PUT",
    headers: {
      "content-type": "application/json",
    },
    body: JSON.stringify(data),
  })
    .then((response) => {
      if (!response.ok) {
        throw new Error("데이터 확인");
      }
      return response.text();
    })
    .then((data) => {
      if (data === "success") {
        alert("수정 성공");
      }
    })
    .catch((error) => alert(error));
});
