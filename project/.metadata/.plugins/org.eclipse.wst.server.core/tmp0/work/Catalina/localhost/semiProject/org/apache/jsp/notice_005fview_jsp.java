/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2022-08-19 13:04:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import semi.culture.mvc.noticeboard.model.vo.Notice;
import semi.culture.mvc.member.model.vo.Member;

public final class notice_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/common/header.jsp", Long.valueOf(1660793869263L));
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1660793869268L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("semi.culture.mvc.member.model.vo.Member");
    _jspx_imports_classes.add("semi.culture.mvc.noticeboard.model.vo.Notice");
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
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
	String path = request.getContextPath();
	Member loginMember = null;
	
	if(session.getAttribute("loginMember")!=null){
		loginMember = (Member)session.getAttribute("loginMember");
	}

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
      out.write("        section #enroll-container {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #9A161F;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        section #enroll-container input {\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        section #enroll-container table {\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        section #enroll-container table th {\r\n");
      out.write("            padding: 0 10px;\r\n");
      out.write("            text-align: right;\r\n");
      out.write("            font-size: x-large;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        section #enroll-container table td {\r\n");
      out.write("            padding: 0 10px;\r\n");
      out.write("            text-align: left;\r\n");
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
      out.write("\t\r\n");
      out.write("\t<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <!-- 나의 js 코드 -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("     <script>\r\n");
      out.write("        function reserveZoneOn() {\r\n");
      out.write("            $('#reserveZone').css('display', 'block').addClass('.show');\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // function completeSelect() {\r\n");
      out.write("\r\n");
      out.write("        // }\r\n");
      out.write("\r\n");
      out.write("        function openImage() {\r\n");
      out.write("            window.open('https://www.kopis.or.kr/upload/pfmIntroImage/PF_PF194394_220711_0123230.jpg', 'detail', 'width=500px, height=500px')\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
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
      out.write("/main2\"> \r\n");
      out.write("                    <img src=\"logo_ver3.svg\" class=\"navbar-brand-logo_custom\" style=\"width:120px; height:120px;\">\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <nav class=\"navbar_menu_custom\" style=\"margin-bottom:-60px; \">\r\n");
      out.write("                <ul class=\"navbar_menu_custom\">\r\n");
      out.write("                    <li class=\"nav-item \"><a href=\"");
      out.print(path );
      out.write("/main2\">홈</a></li> \r\n");
      out.write("                    <li class=\"nav-item \"><a href=\"");
      out.print(path );
      out.write("/musical\">뮤지컬</a></li> \r\n");
      out.write("                    <li class=\"nav-item\"><a href=\"");
      out.print(path );
      out.write("/drama\">연극</a></li>\r\n");
      out.write("                    <li class=\"nav-item \"><a href=\"");
      out.print(path );
      out.write("/classic\">클래식</a></li>\r\n");
      out.write("                    <li class=\"nav-item \"><a href=\"");
      out.print(path );
      out.write("/korean\">국악</a></li>\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" role=\"button\" id=\"board\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">게시판</a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"board\">\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/notice_list\">공지게시판</a></li> \r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/review_list\">리뷰게시판</a></li> \r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/QnA_list\">문의게시판</a></li> \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"navbar_icons_custom \" style=\"margin-top:-60px;\">\r\n");
      out.write("            \t");
 if(loginMember != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"h5 mt-2\">");
      out.print(loginMember.getUser_name() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t님 반갑습니다\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t                <li>\r\n");
      out.write("\t                    <a href=\"");
      out.print(path );
      out.write("/login\">\r\n");
      out.write("\t                        <i class=\"fa-solid fa-user\"></i>\r\n");
      out.write("\t                    </a>\r\n");
      out.write("\t                </li>\r\n");
      out.write("\t                <li>\r\n");
      out.write("\t                    <a href=\"");
      out.print(path );
      out.write("/enroll\">\r\n");
      out.write("\t                        <i class=\"fa-solid fa-user-plus\"></i>\r\n");
      out.write("\t                    </a>\r\n");
      out.write("\t                </li>\r\n");
      out.write("\t            ");
} 
      out.write("\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" role=\"button\" id=\"myPage\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">마이페이지</a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"myPage\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/myPage\">마이페이지 메인</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/Memberupdate\">회원정보수정</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/bookCompleteList\">예매내역</a></li>\r\n");
      out.write("                        ");
 if(loginMember != null){ 
      out.write("\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"");
      out.print(path );
      out.write("/logout\">로그아웃</a></li>\r\n");
      out.write("                        ");
} 
      out.write("\r\n");
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
      out.write("    \r\n");
      out.write("    ");

    Notice notice = (Notice)request.getAttribute("notice");
	

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!--공지사항 -->\r\n");
      out.write("    <div class=\"board_wrap\">\r\n");
      out.write("        <div class=\"board_title\">\r\n");
      out.write("            <div style=\"margin-bottom: 15px;\">\r\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"70\" height=\"50\" fill=\"currentColor\" class=\"bi bi-bell\" viewBox=\"0 0 16 16\" style=\"margin-top:-15px\">\r\n");
      out.write("                <path d=\"M8 16a2 2 0 0 0 2-2H6a2 2 0 0 0 2 2zM8 1.918l-.797.161A4.002 4.002 0 0 0 4 6c0 .628-.134 2.197-.459 3.742-.16.767-.376 1.566-.663 2.258h10.244c-.287-.692-.502-1.49-.663-2.258C12.134 8.197 12 6.628 12 6a4.002 4.002 0 0 0-3.203-3.92L8 1.917zM14.22 12c.223.447.481.801.78 1H1c.299-.199.557-.553.78-1C2.68 10.2 3 6.88 3 6c0-2.42 1.72-4.44 4.005-4.901a1 1 0 1 1 1.99 0A5.002 5.002 0 0 1 13 6c0 .88.32 4.2 1.22 6z\"/>\r\n");
      out.write("              </svg>\r\n");
      out.write("                <strong>공지사항</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("            <style>\r\n");
      out.write("                .color1 {\r\n");
      out.write("                    color: #9A161F;\r\n");
      out.write("                    font-size: small;\r\n");
      out.write("                }\r\n");
      out.write("            </STYLE>\r\n");
      out.write("            <div class=\"color1\">cultureshock의 따끈따끈한 새소식과 알고 계시면 도움이 되는 공지사항을 한눈에 보실수 있습니다.</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"board_view_wrap\">\r\n");
      out.write("            <div class=\"board_view\">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"title\">\r\n");
      out.write("                   ");
      out.print(notice.getNoticeTitile() );
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"info\">\r\n");
      out.write("                    <dl>\r\n");
      out.write("                        <dt>번호</dt>\r\n");
      out.write("                        <dd>");
      out.print(notice.getNoticeNum() );
      out.write("</dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                        <dt>글쓴이</dt>\r\n");
      out.write("                        <dd>관리자</dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                        <dt>작성일</dt>\r\n");
      out.write("                        <dd>");
      out.print(notice.getNoticeCreateDate() );
      out.write("</dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                    <dl>\r\n");
      out.write("                        <dt>조회</dt>\r\n");
      out.write("                        <dd>");
      out.print(notice.getNoticeReadCount() );
      out.write("</dd>\r\n");
      out.write("                    </dl>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cont\" style=\"font-size:25px; text-align:left;\">\r\n");
      out.write("                   ");
      out.print(notice.getNoticeContent());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                </div>\r\n");
      out.write("                 <div style=\"margin-top:20px; margin-bottom:40px; font-size:20px; width:20px height:30px; \" >\r\n");
      out.write("                         <button style=\"background-color:#9A161F;  color:white\" type=\"button\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/notice_edit?noticeNo=");
      out.print(notice.getNoticeNum());
      out.write("'\">수정</button>\r\n");
      out.write("                          <button   type=\"button\" onclick=\"location.href='");
      out.print(path );
      out.write("/notice_list'\">목록</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--<a href=\"#\">수정</a>-->\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
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
