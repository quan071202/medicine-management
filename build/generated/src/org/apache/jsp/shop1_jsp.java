package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("     <link rel=\"stylesheet\" href=\"reset.css\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"base.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("     <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("    <body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"container_header\">\n");
      out.write("      <header class=\"header\">\n");
      out.write("        <div class=\"grid\">\n");
      out.write("          <nav class=\"header_nav\">\n");
      out.write("            <ul class=\"header_list\">\n");
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
      out.write("        <a href=\"home\" class=\"w3-bar-item w3-button\" style=\"color: #0984e3;\">Trang chủ</a>\n");
      out.write("        <div class=\"w3-dropdown-hover\">\n");
      out.write("          <!-- CHI NHÁNH -->\n");
      out.write("          <button class=\"w3-button\">Các chi nhánh\n");
      out.write("            <i class=\"fa fa-caret-down\"></i>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"w3-dropdown-content w3-bar-block\">\n");
      out.write("            <a href=\"#\" class=\"w3-bar-item w3-button\" \">Cửa hàng 1</a>\n");
      out.write("            <a href=\" # \" class=\" w3-bar-item w3-button \">Cửa hàng 2</a>\n");
      out.write("            <a href=\" # \" class=\" w3-bar-item w3-button \">Cửa hàng 3</a>\n");
      out.write("            <a href=\" # \" class=\" w3-bar-item w3-button \">Cửa hàng 4</a>\n");
      out.write("            <a href=\" # \" class=\" w3-bar-item w3-button \">Cửa hàng 5</a>\n");
      out.write("            <a href=\" # \" class=\" w3-bar-item w3-button \">Cửa hàng 6</a>\n");
      out.write("            <a href=\" # \" class=\" w3-bar-item w3-button \">Cửa hàng 7</a>\n");
      out.write("            <a href=\" # \" class=\" w3-bar-item w3-button \">Cửa hàng 8</a>\n");
      out.write("            <a href=\" # \" class=\" w3-bar-item w3-button \">Cửa hàng 9</a>\n");
      out.write("            <a href=\" # \" class=\" w3-bar-item w3-button \">Cửa hàng 10</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <a href=\" sanpham.html \" class=\" w3-bar-item w3-button \">Sản phẩm</a>\n");
      out.write("        <a href=\" # \" class=\" w3-bar-item w3-button \">Nhập kho</a>\n");
      out.write("        <a href=\" # \" class=\" w3-bar-item w3-button \">Tồn kho</a>\n");
      out.write("        <a href=\" # \" class=\" w3-bar-item w3-button \">Nhà cung cấp</a>\n");
      out.write("        <a href=\" # \" class=\" w3-bar-item w3-button \">Doanh thu</a>\n");
      out.write("        <a href=\" nhanvien.html \" class=\" w3-bar-item w3-button \">Nhân viên</a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\" product\">\n");
      out.write("              <nav class=\" nav_content \">\n");
      out.write("                <h3 class=\" heading_content \">Cửa hàng 1</h3>\n");
      out.write("              </nav>\n");
      out.write("              <!-- Thêm sản phẩm-->\n");
      out.write("              <button id=\"add_product\" onclick=\"myFunction()\">Thêm sản phẩm</button>\n");
      out.write("              <button id=\"add_product\">Xuất file excel</button>\n");
      out.write("              <form action=\"\" method=\"post\">\n");
      out.write("              <div id=\"form_add\">\n");
      out.write("                <header>\n");
      out.write("                  <h2>Thêm sản phẩm</h2>\n");
      out.write("                </header>\n");
      out.write("                <input type=\"text\" placeholder=\"Ảnh\">\n");
      out.write("                <input type=\"text\" placeholder=\"Id\">\n");
      out.write("                <input type=\"text\" placeholder=\"Giá\">\n");
      out.write("                <input type=\"text\" placeholder=\"Số lượng\">\n");
      out.write("                <footer>\n");
      out.write("                    <button class=\"form_edit-button\" type=\"submit\">\n");
      out.write("                      <H2 class=\"hide\"  onclick=\"myFunction()\">Cập nhật</h2>\n");
      out.write("                  </button>\n");
      out.write("                </footer>\n");
      out.write("              </div>\n");
      out.write("                  </form>\n");
      out.write("              <!-- SEARCH -->\n");
      out.write("              <form action=\" \" class=\" search \">\n");
      out.write("                <input type=\" text \" placeholder=\" Tìm kiếm \">\n");
      out.write("                <button><i class=\" fas fa-search \"></i></button>\n");
      out.write("              </form>\n");
      out.write("              <!-- TABLE -->\n");
      out.write("              <table>\n");
      out.write("                <tr>\n");
      out.write("                  <th> MÃ THUỐC</th>\n");
      out.write("                  <th>TÊN</th>\n");
      out.write("                  <th>ẢNH</th>\n");
      out.write("                  <th>SỐ LƯỢNG</th>\n");
      out.write("                  <th>GIÁ THÀNH</th>\n");
      out.write("                  <th>CHỨC NĂNG</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("              </table>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <script>$(document).ready(function () {\n");
      out.write("          $(\".hide\").click(function () {\n");
      out.write("            $(\".form_edit\").hide();\n");
      out.write("          });\n");
      out.write("          $(\".show\").click(function () {\n");
      out.write("            $(\".form_edit\").show();\n");
      out.write("          });\n");
      out.write("        });\n");
      out.write("        function myFunction() {\n");
      out.write("          var x = document.getElementById(\"form_add\");\n");
      out.write("          if (x.style.display === \"none\") {\n");
      out.write("            x.style.display = \"block\";\n");
      out.write("          } else {\n");
      out.write("            x.style.display = \"none\";\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("      </script>\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr>\n");
          out.write("                  <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.mathuoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td ><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"ảnh\"  style=\"width: 200px;height: 150px;\" ></td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.soluong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("              <td><a href=\"delete?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.mathuoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" >Xóa</a>\n");
          out.write("                    <!-- form sửa -->\n");
          out.write("                    <form action=\"\" method=\"post\">\n");
          out.write("                    <div class=\"form_edit\">\n");
          out.write("                      <header>\n");
          out.write("                        <h2>Sửa thông tin</h2>\n");
          out.write("                      </header>\n");
          out.write("                      <input type=\"text\" placeholder=\"Mã thuốc\">\n");
          out.write("                      <input type=\"text\" placeholder=\"Tên\">\n");
          out.write("                      <input type=\"text\" placeholder=\"Ảnh\">\n");
          out.write("                      <input type=\"text\" placeholder=\"Số lượng\">\n");
          out.write("                      <input type=\"text\" placeholder=\"Giá thành\">\n");
          out.write("                      <footer>\n");
          out.write("                          <button class=\"form_edit-button\" type=\"submit\">\n");
          out.write("                          <h2 class=\"hide\">Cập nhật</h2>\n");
          out.write("                        </button>\n");
          out.write("                          <button class=\"form_edit-button\" type=\"reset\">Cancle</button>\n");
          out.write("                      </footer>\n");
          out.write("                    </div>\n");
          out.write("                        </form>\n");
          out.write("                    <button class=\"hide show\" id=\"update\">Sửa</button>\n");
          out.write("                  </td>\n");
          out.write("                </tr>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
