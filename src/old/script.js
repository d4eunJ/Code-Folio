window.addEventListener('load', () => {
    const codefolioLoginBtn = document.querySelector('.codefolio-login');
    const snsLoginSection = document.querySelector('.sns-login');
    const backBtn = document.querySelector(".back-btn");
    const idLoginSection = document.querySelector('.id-login');
  
    codefolioLoginBtn.addEventListener('click', () => {
      snsLoginSection.style.display = 'none';
      idLoginSection.style.display = 'block';
    });

    backBtn.addEventListener('click', () => {
        snsLoginSection.style.display = 'block';
        idLoginSection.style.display = 'none';
      });
  });

  var slideIndex = 0;
    showSlides();

    function showSlides() {
        var i;
        var slides = document.getElementsByClassName("mySlides");
        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }
        slideIndex++;
        if (slideIndex > slides.length) {slideIndex = 1}
        slides[slideIndex-1].style.display = "block";
        setTimeout(showSlides, 3000); // 3초마다 자동으로 슬라이드 넘기기
      }