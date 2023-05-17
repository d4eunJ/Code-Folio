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
  