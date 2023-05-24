/**
 * 댓글 처리 자바스크립트 모듈
 */

let replyService = (function () {
  //reply : 댓글 작성 자바스크립트 객체
  //callback : function
  function add(reply, callback) {
    console.log("add 함수");

    fetch("/replies/new", {
      method: "post",
      headers: {
        "content-type": "application/json",
      },
      body: JSON.stringify(reply),
    })
      .then((response) => {
        //결과가 도착하게 되면 자동으로 호출됨(비동기 호출)
        if (!response.ok) {
          throw new Error("입력 오류");
        }
        return response.text(); //"success" 담김
      })
      .then((data) => {
        //data 안에는 response.text() 값이 들어있음(="success")
        //넘겨받은 함수를 호출하게 됨
        if (callback) {
          callback(data);
        }
      })
      .catch((error) => console.log(error));
  } //add 함수 종료

  function getList(param, callback) {
    let bno = param.bno;
    let page = param.page;

    fetch("/replies/pages/" + bno + "/" + page)
      .then((response) => {
        if (!response.ok) {
          throw new Error("리스트 없음");
        }
        return response.json();
      })
      .then((data) => {
        //data가 도착해서 함수가 호출되면 넘겨받은 함수 호출
        if (callback) {
          callback(data);
        }
      })
      .catch((error) => console.log(error));
  } // getList 종료

  function displayTime(timeVal) {
    const today = new Date(); //오늘 날짜

    let gap = today.getTime() - timeVal; //오늘 날짜 - 작성 날짜

    //댓글작성날짜 Date 객체 생성
    let dateObj = new Date(timeVal);

    let str = "";
    //작성날짜를 보여줄 때 24시간 안에 작성했는지 초과했는지
    //24시간 내 >> 시/분/초 형태, 초과 시 >> 년/월/일 형태
    if (gap < 1000 * 60 * 60 * 24) {
      let hh = dateObj.getHours();
      let mi = dateObj.getMinutes();
      let ss = dateObj.getSeconds();

      return [
        //시분초를 두 자릿수로 표현 ex) 6:52:36 -> 06:52:36
        (hh > 9 ? "" : "0") + hh,
        ":",
        (mi > 9 ? "" : "0") + mi,
        ":",
        (ss > 9 ? "" : "0") + ss,
      ].join("");
    } else {
      const yy = dateObj.getFullYear();
      const mm = dateObj.getMonth() + 1;
      const dd = dateObj.getDate();
      return [
        //년월일을 yy/mm/dd로 표현 ex) 23/05/24
        yy,
        "/",
        (mm > 9 ? "" : "0") + mm,
        "/",
        (dd > 9 ? "" : "0") + dd,
        "/",
      ].join("");
    }
  }

  function get(rno, callback) {
    fetch("/replies/" + rno)
      .then((response) => {
        if (!response.ok) {
          throw new Error("댓글 없음");
        }
        return response.json();
      })
      .then((data) => {
        if (callback) {
          callback(data);
        }
      })
      .catch((error) => console.log(error));
  }

  return {
    add: add,
    getList: getList,
    displayTime: displayTime,
    get: get,
  };
})();
