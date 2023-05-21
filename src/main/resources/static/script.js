//login.html
function showLoginForm() {
  var emailButton = document.getElementsByClassName("email")[0];
  var loginForm = document.getElementById("loginForm");

  emailButton.addEventListener("click", function() {
    loginBtnGroup.style.display = "none";
    loginForm.style.display = "block";
  });
}
function hideLoginForm(){
  var backButton = document.getElementsByClassName("back")[0];
  var loginForm = document.getElementById("loginForm");

  backButton.addEventListener("click", function() {
    loginBtnGroup.style.display = "block";
    loginForm.style.display = "none";
  });
}

function login() {
  // 입력된 이메일과 비밀번호 가져오기
  var email = document.getElementById("inputEmail").value;
  var password = document.getElementById("inputPassword").value;
  
  // 서버와의 비교 로직 구현
  // ...
  
  // 예시: 비교 로직을 통해 로그인이 성공했을 경우
  if (email === "user@example.com" && password === "password") {
    // 로그인 후 페이지로 이동
    alert("로그인되었습니다.");
    window.location.href = "main.html";
  } else {
    // 로그인 실패 처리
    alert("아이디 또는 비밀번호가 올바르지 않습니다.");
  }
}

//feed.html
var slideIndex = 0;
      showSlides();

      function showSlides() {
          var i;
          var slides = document.getElementsByClassName("slides");
          for (i = 0; i < slides.length; i++) {
              slides[i].style.display = "none";
          }
          slideIndex++;
          if (slideIndex > slides.length) {
              slideIndex = 1;
          }
          slides[slideIndex - 1].style.display = "block";
          setTimeout(showSlides, 2500); // 이미지 변경 시간 (2초)
      }
