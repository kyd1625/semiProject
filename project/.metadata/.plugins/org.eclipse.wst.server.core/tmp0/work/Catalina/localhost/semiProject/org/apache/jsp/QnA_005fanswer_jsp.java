/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2022-07-29 06:28:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class QnA_005fanswer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1659075413107L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1659072968848L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
	String path = request.getContextPath();


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <!-- ========Around ============시작-->\r\n");
      out.write("    <!-- SEO Meta Tags-->\r\n");
      out.write("    <meta name=\"description\" content=\"Around - Multipurpose Bootstrap Template\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"bootstrap, business, consulting, coworking space, services, creative agency, dashboard, e-commerce, mobile app showcase, multipurpose, product landing, shop, software, ui kit, web studio, landing, html5, css3, javascript, gallery, slider, touch, creative\">\r\n");
      out.write("    <meta name=\"author\" content=\"Createx Studio\">\r\n");
      out.write("    <!-- Viewport-->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- Favicon and Touch Icons-->\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"apple-touch-icon.png\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"favicon-32x32.png\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"favicon-16x16.png\">\r\n");
      out.write("    <link rel=\"manifest\" href=\"site.webmanifest\">\r\n");
      out.write("    <link rel=\"mask-icon\" color=\"#5bbad5\" href=\"safari-pinned-tab.svg\">\r\n");
      out.write("    <meta name=\"msapplication-TileColor\" content=\"#766df4\">\r\n");
      out.write("    <meta name=\"theme-color\" content=\"#ffffff\">\r\n");
      out.write("    <!-- Page loading styles-->\r\n");
      out.write("    <style>\r\n");
      out.write("        .page-loading {\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            right: 0;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            -webkit-transition: all .4s .2s ease-in-out;\r\n");
      out.write("            transition: all .4s .2s ease-in-out;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("            visibility: hidden;\r\n");
      out.write("            z-index: 9999;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .page-loading.active {\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("            visibility: visible;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .page-loading-inner {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            -webkit-transform: translateY(-50%);\r\n");
      out.write("            transform: translateY(-50%);\r\n");
      out.write("            -webkit-transition: opacity .2s ease-in-out;\r\n");
      out.write("            transition: opacity .2s ease-in-out;\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .page-loading.active>.page-loading-inner {\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .page-loading-inner>span {\r\n");
      out.write("            display: block;\r\n");
      out.write("            font-family: 'Inter', sans-serif;\r\n");
      out.write("            font-size: 1rem;\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            color: #737491;\r\n");
      out.write("        }\r\n");
      out.write("        /* button 추가 */\r\n");
      out.write("        \r\n");
      out.write("        .button1 {\r\n");
      out.write("            background-color: #9A161F;\r\n");
      out.write("            border: none;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 15px 30px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            margin: 4px 2px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            margin-left: 1100px;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("            margin-top: -100px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .button2 {\r\n");
      out.write("            background-color: #9A161F;\r\n");
      out.write("            border: none;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 15px 30px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            margin: 4px 2px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("        /* button 추가 */\r\n");
      out.write("        /* div margin 추가 */\r\n");
      out.write("        \r\n");
      out.write("        .marT {\r\n");
      out.write("            margin-top: -30px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        div.mar {\r\n");
      out.write("            margin-left: -85px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        div.mar1 {\r\n");
      out.write("            margin-left: -45px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        div.mar2 {\r\n");
      out.write("            margin-left: -5px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        div.mar3 {\r\n");
      out.write("            margin-left: 35px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        div.mar-top {\r\n");
      out.write("            margin-top: 150px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        div.mar-top-1 {\r\n");
      out.write("            margin-top: 120px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        h5.mar-top {\r\n");
      out.write("            margin-top: -10px;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        p.mar-top {\r\n");
      out.write("            margin-top: -10px;\r\n");
      out.write("            margin-left: 35px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .page-spinner {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            width: 2.75rem;\r\n");
      out.write("            height: 2.75rem;\r\n");
      out.write("            margin-bottom: .75rem;\r\n");
      out.write("            vertical-align: text-bottom;\r\n");
      out.write("            border: .15em solid #766df4;\r\n");
      out.write("            border-right-color: transparent;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            -webkit-animation: spinner .75s linear infinite;\r\n");
      out.write("            animation: spinner .75s linear infinite;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        @-webkit-keyframes spinner {\r\n");
      out.write("            100% {\r\n");
      out.write("                -webkit-transform: rotate(360deg);\r\n");
      out.write("                transform: rotate(360deg);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        @keyframes spinner {\r\n");
      out.write("            100% {\r\n");
      out.write("                -webkit-transform: rotate(360deg);\r\n");
      out.write("                transform: rotate(360deg);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <!-- Page loading scripts-->\r\n");
      out.write("    <script>\r\n");
      out.write("        (function() {\r\n");
      out.write("            window.onload = function() {\r\n");
      out.write("                var preloader = document.querySelector('.page-loading');\r\n");
      out.write("                preloader.classList.remove('active');\r\n");
      out.write("                setTimeout(function() {\r\n");
      out.write("                    preloader.remove();\r\n");
      out.write("                }, 2000);\r\n");
      out.write("            };\r\n");
      out.write("        })();\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- Vendor Styles-->\r\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(path );
      out.write("/vendor/simplebar/dist/simplebar.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(path );
      out.write("/vendor/tiny-slider/dist/tiny-slider.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(path );
      out.write("/vendor/flatpickr/dist/flatpickr.min.css\" />\r\n");
      out.write("    <!-- Main Theme Styles + Bootstrap-->\r\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(path );
      out.write("/css/theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- =======================around 끝=======================-->\r\n");
      out.write("\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/style.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <title>cultureshock</title>\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/b4c02836de.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(path );
      out.write("/dist/vendor/flatpickr/dist/flatpickr.min.css\" />\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/b4c02836de.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\"> -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"page-loading active\">\r\n");
      out.write("        <div class=\"page-loading-inner\">\r\n");
      out.write("            <div class=\"page-spinner\"></div><span>Loading...</span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ==============헤더시작=============== -->\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav class=\"navbar_custom\">\r\n");
      out.write("            <div class=\"navbar_logo_custom\" style=\"margin-left: 150px; padding: bottom 80px;\">\r\n");
      out.write("                <a href=\"");
      out.print(path );
      out.write("/main2.html\">\r\n");
      out.write("                    <img src=\"logo_bigger.svg\" class=\"navbar-brand-logo_custom\" style=\"width:120px; height:120px;\">\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <nav class=\"navbar_menu_custom\" style=\"margin-bottom:-60px; \">\r\n");
      out.write("                <ul class=\"navbar_menu_custom\">\r\n");
      out.write("                    <li class=\"nav-item \"><a href=\"");
      out.print(path );
      out.write("/main2.jsp\">홈</a></li>\r\n");
      out.write("                    <li class=\"nav-item \"><a href=\"");
      out.print(path );
      out.write("/musical.jsp\">뮤지컬</a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a href=\"");
      out.print(path );
      out.write("/drama.jsp\">연극</a></li>\r\n");
      out.write("                    <li class=\"nav-item \"><a href=\"");
      out.print(path );
      out.write("/classic.jsp\">클래식</a></li>\r\n");
      out.write("                    <li class=\"nav-item \"><a href=\"");
      out.print(path );
      out.write("/korean.jsp\">국악</a></li>\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" role=\"button\" id=\"board\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">게시판</a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"board\">\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/notice_list.jsp\">공지게시판</a></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/review_list.jsp\">리뷰게시판</a></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/QnA_list.jsp\">문의게시판</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"navbar_icons_custom \" style=\"margin-top:-60px;\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"login.html\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"sign up.html\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user-plus\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" role=\"button\" id=\"myPage\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">마이페이지</a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"myPage\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/myPage.jsp\">마이페이지 메인</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/update.jsp\">회원정보수정</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/myPage.jsp\">예매내역</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- ===================헤더끝=====================-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>");
      out.write("\r\n");
      out.write("    <!--공지사항 -->\r\n");
      out.write("    <div class=\"board_wrap\">\r\n");
      out.write("        <div class=\"board_title\">\r\n");
      out.write("            <div style=\"margin-bottom: 30px;\">\r\n");
      out.write("\r\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"70\" height=\"50\" fill=\"currentColor\" class=\"bi bi-envelope\" viewBox=\"0 0 16 16\" style=\"margin-top:-15px\">\r\n");
      out.write("                    <path d=\"M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z\"/>\r\n");
      out.write("                </svg>\r\n");
      out.write("                <strong>문의 게시판</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("            <style>\r\n");
      out.write("                .color1 {\r\n");
      out.write("                    color: #9A161F;\r\n");
      out.write("                    font-size: small;\r\n");
      out.write("                }\r\n");
      out.write("            </STYLE>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"board_view_wrap\">\r\n");
      out.write("            <div class=\"board_view\">\r\n");
      out.write("                <div class=\"title\">\r\n");
      out.write("                    글 제목이 들어갑니다.\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                    <dl>\r\n");
      out.write("                        <dt>번호</dt>\r\n");
      out.write("                        <dd>1</dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                        <dt>글쓴이</dt>\r\n");
      out.write("                        <dd>김이름</dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                        <dt>작성일</dt>\r\n");
      out.write("                        <dd>2021.1.16</dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                        <dt>조회</dt>\r\n");
      out.write("                        <dd>33</dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cont\" style=\"font-size:17px; text-align:left;\">\r\n");
      out.write("                    안녕하세요.\r\n");
      out.write("                    <BR>안녕하세요.\r\n");
      out.write("                    <BR>안녕하세요.\r\n");
      out.write("                    <BR>안녕하세요.\r\n");
      out.write("                    <BR>안녕하세요.\r\n");
      out.write("                    <BR>안녕하세요.\r\n");
      out.write("                    <BR>감사합니다.\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 답변 시작 -->\r\n");
      out.write("                <div class=\"mb-3 pb-1\">\r\n");
      out.write("                    <textarea style=\"width: 1000px; height: 150px; font-size:15px;\" class=\"form-control\" rows=\"10\" placeholder=\"관리자 답변\" required></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6 col-md-8\">\r\n");
      out.write("                    <button class=\"btn btn-primary-2 btn-block\" type=\"submit\">제출</button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- 답변 끝 -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"bt_wrap\">\r\n");
      out.write("                <a href=\"QnA_list.html\" class=\"on\">목록</a>\r\n");
      out.write("                <a href=\"QnA_edit.html\">수정</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--<a href=\"#\">수정</a>-->\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- ===================푸터 시작================-->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <nav class=\"foot_custom\">\r\n");
      out.write("            <ul class=\"foot_icons_custom\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"https://facebook.com\" target=\"_blank\">\r\n");
      out.write("                        <i class=\"fa-brands fa-facebook\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"https://google.com\" target=\"_blank\">\r\n");
      out.write("                        <i class=\"fa-brands fa-google\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"https://twitter.com\" target=\"_blank\">\r\n");
      out.write("                        <i class=\"fa-brands fa-twitter\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"https://github.com\" target=\"_blank\">\r\n");
      out.write("                        <i class=\"fa-brands fa-github\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <br/><br/>\r\n");
      out.write("            <h3 style=\"color:#F4EFEA;\">COPYRIGHT ⓒ KOREA PERFORMING ARTS BOX OFFICE INFORMATION SYSTEM</h3>\r\n");
      out.write("            <h6 style=\"color:#F4EFEA;\"> When you visit or interact with our sites, services or tools, we or our authorized<br/> service providers may use cookies for storing information to help provide you with a <br/> better, faster and safer experience and for marketing purposes.</h6>\r\n");
      out.write("            <br/>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- ================== 푸터 끝 ==================-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js\" integrity=\"sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js\" integrity=\"sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- JS Implementing Plugins -->\r\n");
      out.write("    <script src=\"./assets/vendor/hs-mega-menu/dist/hs-mega-menu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- JS Global Compulsory -->\r\n");
      out.write("    <script src=\"./assets/vendor/bootstrap/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"vendor/imagesloaded/imagesloaded.pkgd.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/shufflejs/dist/shuffle.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/parallax-js/dist/parallax.min.js\"></script>\r\n");
      out.write("    <!-- Vendor scrits: js libraries and plugins-->\r\n");
      out.write("    <script src=\"vendor/bootstrap/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/simplebar/dist/simplebar.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/smooth-scroll/dist/smooth-scroll.polyfills.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/jarallax/dist/jarallax.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/tiny-slider/dist/min/tiny-slider.js\"></script>\r\n");
      out.write("    <script src=\"vendor/flatpickr/dist/flatpickr.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/flatpickr/dist/plugins/rangePlugin.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"vendor/tiny-slider/dist/min/tiny-slider.js\"></script>\r\n");
      out.write("    <script src=\"vendor/lightgallery.js/dist/js/lightgallery.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/lg-video.js/dist/lg-video.min.js\"></script>\r\n");
      out.write("    <!-- Main theme script-->\r\n");
      out.write("    <script src=\"js/theme.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
