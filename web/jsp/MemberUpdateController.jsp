protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

request.setCharacterEncoding("UTF-8");

String username = request.getParameter("username");
String password1 = request.getParameter("password1;");
String password2 = request.getParameter("password2;");
String email = request.getParameter("email");
String birthday = request.getParameter("birthday");

Member m = new Member(username,password1, password2, email, birthday);

Member updateMem = new MemberService().updateMember(m);

if (updateMem != null) {
    HttpSession session = request.getSession();
    session.setAttribute("alertMsg", "성공적으로 회원정보를 수정했습니다.");
    session.setAttribute("loginUser", updateMem);
}

response.sendRedirect(request.getContextPath() + "");
