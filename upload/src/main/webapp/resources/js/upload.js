/**
 *
 */
document.querySelector("#uploadBtn").addEventListener("click", () => {
  //FormData 객체 생성
  const formData = new FormData();

  //file 요소 가져오기
  let inputFiles = document.querySelector("#uploadFile").files;
  console.log(inputFiles);

  //가져온 file 요소를 formData에 추가
  //업로드 파일이 multiple인 경우를 대비
  for (let i = 0; i < inputFiles.length; i++) {
    formData.append("uploadFile", inputFiles[i]);
  }

  //비동기 형태로 formData 전송
  fetch("/uploadAjax", {
    method: "post",
    body: formData,
  })
    .then((response) => {
      if (!response.ok) {
        throw new Error("파일 업로드 실패");
      }
      return response.json();
    })
    .then((data) => {
      //console.log(data);
      showUploadFile(data);
    })
    .catch((error) => console.log(error));
});

function showUploadFile(uploadResult) {
  //도착한 데이터(파일업로드 정보)에서 파일이름을 li태그를 만들어서 보여주기
  let str = "";
  uploadResult.forEach((item) => {
    //fileType이 true(=image)라면 썸네일 이미지 보여주기
    if (item.fileType) {
      //썸네일 이미지 경로 생성
      let fileCallPath = encodeURIComponent(
        item.uploadPath + "\\s_" + item.uuid + "_" + item.fileName
      );

      //str += "<li><img src='/display?fileName=" + fileCallPath + "'></li>";

      //썸네일 이미지 클릭 시 ==> 원본 이미지 보여주기
      let originalFileCallPath = encodeURIComponent(
        item.uploadPath + "\\" + item.uuid + "_" + item.fileName
      );

      str += "<li>";
      str +=
        "<a href='/display?fileName=" +
        originalFileCallPath +
        "' data-lightbox='image'>";
      str +=
        "<div class='text-center'><img src='/display?fileName=" +
        fileCallPath +
        "'></a></div>";
      str += "<small>" + item.fileName + "</small>";
      str +=
        "<span data-file='" + fileCallPath + "' data-type='image'> X </span>";
      str += "</li>";
    } else {
      // .txt 파일인 경우 파일명만 보여주기
      //str += "<li>" + item.fileName + "</li>";

      //txt 파일 경로 생성
      let fileCallPath = encodeURIComponent(
        item.uploadPath + "\\" + item.uuid + "_" + item.fileName
      );

      str += "<li>";
      str += "<a href='/download?fileName=" + fileCallPath + "'>";
      str +=
        "<div class='text-center'><img src='/resources/img/txt-file.png'></div>";
      str += "<small>" + item.fileName + "</small></a>";
      str +=
        "<span data-file='" + fileCallPath + "' data-type='file'> X </span>";
      str += "</li>";
    }
  });
  document
    .querySelector(".uploadResult ul")
    .insertAdjacentHTML("beforeend", str);
}

// x버튼 클릭 시  alert() 창 띄우기
document.querySelector(".uploadResult").addEventListener("click", (e) => {
  //자식한테 이벤트가 일어나면 부모에게 전파
  //실제 이벤트가 발생한 대상 : 자식 ==> e.target
  //이벤트를 감지한 부모 ==> e.currentTarget

  // 1) 첨부 목록 정리
  // 2) 서버 폴더에 저장된 파일 제거
  //   -이미지: 썸네일, 원본 이미지 다 지우기
  //   -txt: 파일 제거

  //data- 에 있는 값 가져오기
  const targetFile = e.target.dataset.file;
  const targetType = e.target.dataset.type;
  console.log(e.target);

  //x 가 선택된 li 가져오기
  const li = e.target.closest("li");

  const formData = new FormData();
  formData.append("fileName", targetFile);
  formData.append("type", targetType);
  // const data = new URLSearchParams(formData);

  fetch("/deleteFile", {
    method: "post",
    body: formData,
  })
    .then((response) => {
      if (!response.ok) {
        throw new Error("파일 제거 실패");
      }
      return response.text();
    })
    .then((data) => {
      console.log(data);
      li.remove();
    })
    .catch((error) => console.log(error));
});
