package org.apache.jsp.Frontend_005fJava.Frontend_0020Java.assets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tranngchu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("         <link rel=\"stylesheet\" href=\"./assets/css/reset.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"./assets/css/base.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"./assets/css/main.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("\n");
      out.write("        <title>TRangchu</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"container\">\n");
      out.write("    <div class=\"container_header\">\n");
      out.write("      <header class=\"header\">\n");
      out.write("        <div class=\"grid\">\n");
      out.write("          <nav class=\"header_nav\">\n");
      out.write("            <ul class=\"header_list\">\n");
      out.write("              <li class=\"nav_item\">Trang chủ</li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"header_list\">\n");
      out.write("              <li class=\"nav_item font-weight nav_item-line account_hover\">Super Admin\n");
      out.write("                <div class=\"account\">\n");
      out.write("                  <a href=\"#\">Tài khoản</a>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("\n");
      out.write("              <li class=\"nav_item font-weight\">Đăng xuất</li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("        </div>\n");
      out.write("      </header>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <div class=\"sidebar-body w3-bar-block  w3-card \" style=\"width:20%\">\n");
      out.write("        <a href=\"index.html\" class=\"w3-bar-item w3-button\" style=\"color: #0984e3;\">Trang chủ</a>\n");
      out.write("        <div class=\"w3-dropdown-hover\">\n");
      out.write("          <!-- CHI NHÁNH -->\n");
      out.write("          <button class=\"w3-button\">Các chi nhánh\n");
      out.write("            <i class=\"fa fa-caret-down\"></i>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"w3-dropdown-content w3-bar-block\">\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button\" \">Cửa hàng 1</a>\n");
      out.write("            <a href=\"# \" class=\"w3-bar-item w3-button \">Cửa hàng 2</a>\n");
      out.write("            <a href=\"# \" class=\"w3-bar-item w3-button \">Cửa hàng 3</a>\n");
      out.write("            <a href=\"# \" class=\"w3-bar-item w3-button \">Cửa hàng 4</a>\n");
      out.write("            <a href=\"# \" class=\"w3-bar-item w3-button \">Cửa hàng 5</a>\n");
      out.write("            <a href=\"# \" class=\"w3-bar-item w3-button \">Cửa hàng 6</a>\n");
      out.write("            <a href=\"# \" class=\"w3-bar-item w3-button \">Cửa hàng 7</a>\n");
      out.write("            <a href=\"# \" class=\"w3-bar-item w3-button \">Cửa hàng 8</a>\n");
      out.write("            <a href=\"# \" class=\"w3-bar-item w3-button \">Cửa hàng 9</a>\n");
      out.write("            <a href=\"# \" class=\"w3-bar-item w3-button \">Cửa hàng 10</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <a href=\"sanpham.html \" class=\"w3-bar-item w3-button \">Sản phẩm</a>\n");
      out.write("        <a href=\"# \" class=\"w3-bar-item w3-button \">Nhập kho</a>\n");
      out.write("        <a href=\"# \" class=\"w3-bar-item w3-button \">Tồn kho</a>\n");
      out.write("        <a href=\"# \" class=\"w3-bar-item w3-button \">Nhà cung cấp</a>\n");
      out.write("        <a href=\"# \" class=\"w3-bar-item w3-button \">Doanh thu</a>\n");
      out.write("        <a href=\"nhanvien.html \" class=\"w3-bar-item w3-button \">Nhân viên</a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div style=\"margin-left:23% \">\n");
      out.write("\n");
      out.write("        <div class=\"w3-container \">\n");
      out.write("          <!-- SEARCH -->\n");
      out.write("            <form action=\" \" class=\"search \">\n");
      out.write("            <input type=\"text \" placeholder=\" Tìm kiếm \" >\n");
      out.write("            <button ><i class=\"fas fa-search \"></i></button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
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
