package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Casual_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css/style.css");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style type=\"text/css\">");
      out.write("html\r\n");
      out.write("{\r\n");
      out.write("margin:0; \r\n");
      out.write("padding:0; \r\n");
      out.write("font-size:100%;\r\n");
      out.write("}\r\n");
      out.write("body{background:grey; width:960px;margin:0 auto;padding:0;font-family:'Times New Roman,Sans-Serif';font-size:16px;clear:both;}\r\n");
      out.write("a{text-decoration:none;}\r\n");
      out.write("ul li{list-style-type:none;}\r\n");
      out.write(".clear{clear:both;}\r\n");
      out.write(".logo_head{border-bottom:1px solid white;}\r\n");
      out.write(".logo{padding:5px;float:left;clear:left;}\r\n");
      out.write(".search{float:left;margin:40px 0 0 200px;border:1px solid red;}\r\n");
      out.write(".search input[type='text']{padding:5px; background-color:#ccc; border-radius:30px; outline:none;}\r\n");
      out.write(".menu{float:right;}\r\n");
      out.write(".menu ul li {float:left;width:100px; border:1px  solid white;text-align:center;padding:5px;background:#E8E6F0}\r\n");
      out.write("\r\n");
      out.write(".menu ul li a:hover{text-decoration:none;background:blue;}\r\n");
      out.write(".content_images{margin-top:30px;}\r\n");
      out.write(".content_images img{padding:5px;}\r\n");
      out.write(".img1{ width:215px;float:left;padding:3px;}\r\n");
      out.write(".img2{ width:215px;float:left;padding:3px;margin-left:25px;}\r\n");
      out.write(".img3{ width:215px;float:left;padding:3px;margin-left:25px;}\r\n");
      out.write(".img4{ width:215px;float:right;padding:3px;margin-left:15px;}\r\n");
      out.write(".check1 input{margin-left:120px;}\r\n");
      out.write("p{text-align:center;color:white;}\r\n");
      out.write(".shoe{float:left;margin-left:240px;margin-top:100px;}\r\n");
      out.write(".content_images input[type=\"button\"]{margin-left:480px;margin-top:40px;}\r\n");
      out.write("footer{margin-top:10px;background-color:white;padding:10px}\r\n");
      out.write(".footers{margin-left:240px}\r\n");
      out.write(".contact {margin-top:80px;} p{color:red;}\r\n");
      out.write(".login{margin-top:60px;}\r\n");
      out.write(".register{color:white;}\r\n");
      out.write(".reg{margin-top:150px;}\r\n");
      out.write(".content_images input[type='submit']{margin-left:480px;margin-top:20px;}");
      out.write("</style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div  class=\"header\">\n");
      out.write("\t <div  class=\"logo_head\">\n");
      out.write("\t\t<div  class=\"logo\">\n");
      out.write("\t\t\t<img src=\"images/logo1.jpg\" alt=\"no logo\"  />\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div  class=\"search\">\n");
      out.write("\t\t\t<form method=\"post\" action=\"\">\n");
      out.write("\t\t\t<input type=\"text\" id=\"search\"  size=\"40\" autocomplete=\"off\" placeholder=\"enter your search\" />\n");
      out.write("\t\t\t<input type=\"submit\" />\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--end of logo_head-->\n");
      out.write("\t<div  class=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"\">Home</a></li>\n");
      out.write("\t\t\t<li><a href=\"\">Contact</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<form method=\"post\" action=\"Basket.java\">\n");
      out.write(" <div  class=\"content_images\">\n");
      out.write("\n");
      out.write("\t<div class=\"img1\">\n");
      out.write("\t\t<img src=\"images/c1.jpg\" alt=\"no image\"  />\n");
      out.write("\t\t<p>INR 1200</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c1\" /></span>\n");
      out.write("\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"img2\">\n");
      out.write("\t\t<img src=\"images/c2.jpg\" alt=\"no image\"  />\t\n");
      out.write("\t\t\t<p>INR 1400</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c2\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"img3\">\n");
      out.write("\t\t<img src=\"images/c3.jpg\" alt=\"no image\"  />\n");
      out.write("\t\t\t<p>INR 1600</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c3\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"img4\">\n");
      out.write("\t\t<img src=\"images/c4.jpg\" alt=\"no image\"  />\n");
      out.write("\t\t\t<p>INR 1600</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c4\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"img1\">\n");
      out.write("\t\t<img src=\"images/c5.jpg\" alt=\"no image\"  />\n");
      out.write("\t\t\t<p>INR 1800</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c5\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"img2\">\n");
      out.write("\t\t<img src=\"images/c6.jpg\" alt=\"no image\"  />\t\n");
      out.write("\t\t\t<p>INR 2000</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c6\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"img3\">\n");
      out.write("\t\t<img src=\"images/c7.jpg\" alt=\"no image\"  />\n");
      out.write("\t\t\t<p>INR 2100</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c7\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"img4\">\n");
      out.write("\t\t<img src=\"images/c8.jpg\" alt=\"no image\"  />\n");
      out.write("\t\t\t<p>INR 2100</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c8\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div  class=\"img1\">\n");
      out.write("\t\t<img src=\"images/c9.jpg\" alt=\"no image\"  />\n");
      out.write("\t\t\t<p>INR 2700</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c9\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"img2\">\n");
      out.write("\t\t<img src=\"images/c10.jpg\" alt=\"no image\"  />\t\n");
      out.write("\t\t\t<p>INR 2900</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c10\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div  class=\"img3\">\n");
      out.write("\t\t<img src=\"images/c11.jpg\" alt=\"no image\"  />\n");
      out.write("\t\t\t<p>INR 3100</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c11\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"img4\">\n");
      out.write("\t\t<img src=\"images/c12.jpg\" alt=\"no image\"  />\n");
      out.write("\t\t\t<p>INR 3400</p>\n");
      out.write("\t\t\t<span class=\"check1\"><input type=\"checkbox\" name=\"casual\" value=\"c12\" /></span>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<input type=\"submit\"  value=\"Add to Cart\"/>\n");
      out.write("\t\t\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("<img src=\"images/logo1.jpg\" alt=\"no logo\"  />\t\n");
      out.write("<span>&copy  All Rights Reserved.</span>\n");
      out.write("</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
