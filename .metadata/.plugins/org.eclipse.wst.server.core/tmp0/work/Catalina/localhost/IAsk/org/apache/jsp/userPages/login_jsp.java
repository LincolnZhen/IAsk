/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.48
 * Generated at: 2019-07-03 02:23:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.userPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");

String path = request.getContextPath();


      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("<meta name=\"description\"content=\"Basic HTML5 App generated by MyEclipse Mobile Tools\" />\r\n");
      out.write(" <!--引入jquery-->\r\n");
      out.write(" <script type=\"text/javascript\" src=\"jquery-3.2.1.min.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"./layer/layer.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.part\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t\twidth:380px;\r\n");
      out.write("\t\theight: 30px;\r\n");
      out.write("\t\tmargin-left: 10px;\r\n");
      out.write("\t\tmargin-top: 40px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.submit\r\n");
      out.write("\t{\r\n");
      out.write("\t\twidth: 140px;\r\n");
      out.write("\t\theight: 40px;\r\n");
      out.write("\t\tfont-size: 13px;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tbackground-color: #cc3300;\r\n");
      out.write("\t\tborder: none;\r\n");
      out.write("\t\tborder-radius: 5px;\r\n");
      out.write("\t\tmargin-left: 120px;\r\n");
      out.write("\t\tmargin-top: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"margin-top: 70px;\">\r\n");
      out.write("<form id=\"loginF\">\r\n");
      out.write("<div id=\"part\" class=\"part\"> <h>用户名</h><input id=\"id\" name=\"id\" style=\"height: 28px;width: 263px;margin-left: 10px;\"></input></div>\r\n");
      out.write("<div id=\"\" class=\"part\"> <h>密码</h><input id=\"psd\" name=\"pwd\" type=\"password\" style=\"height: 28px;width: 263px;margin-left: 30px;\"></input></div>\r\n");
      out.write("<div style=\"margin-left: 260px;margin-top: 40px;\"></div>\r\n");
      out.write("<input type=\"submit\" class=\"submit\" id=\"subm\" value=\"登陆\">\r\n");
      out.write("<form>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t// $(document).ready(function(){\r\n");
      out.write("\t// \t$(\"#subm\").click(function(event) {\r\n");
      out.write("\t// \t\tvar index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引\r\n");
      out.write("\t// \tparent.layer.close(index); //再执行关闭        \r\n");
      out.write("\t// \t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t// });\r\n");
      out.write("\r\n");
      out.write("\tfunction form_confirm()\r\n");
      out.write("{\r\n");
      out.write("    var id=document.getElementById(\"id\").value\r\n");
      out.write("    var psd=document.getElementById(\"psd\").value\r\n");
      out.write("     var myreg = /^([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$/;\r\n");
      out.write("     if((!myreg.test(id))\r\n");
      out.write("     {\r\n");
      out.write("     \talert('用户名请输入有效的邮箱！');\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("     }\r\n");
      out.write("    if(psd.length<6)\r\n");
      out.write("    {\r\n");
      out.write("        alert(\"密码长度不能小于6位\");\r\n");
      out.write("        return false; \r\n");
      out.write("    }\r\n");
      out.write("    if(psd.length>14)\r\n");
      out.write("    {\r\n");
      out.write("        alert(\"密码长度不能大于14位\");\r\n");
      out.write("        return false; \r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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
