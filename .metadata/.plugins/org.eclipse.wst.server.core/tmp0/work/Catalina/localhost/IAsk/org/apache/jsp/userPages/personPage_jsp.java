/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.48
 * Generated at: 2019-07-07 05:27:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.userPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.*;
import java.util.*;

public final class personPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/G:/Project2019/FinalProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/IAsk/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1562118636000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1562477210651L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("entity");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\"content=\"Basic HTML5 App generated by MyEclipse Mobile Tools\" />\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"jquery-3.2.1.min.js\"></script>\r\n");
      out.write(" <!--引入Bootstrap-->\r\n");
      out.write(" <link href=\"");
      out.print( path );
      out.write("/bootstrap3.3.7/css/bootstrap.css\" rel=\"stylesheet\" >\r\n");
      out.write(" <script type=\"text/javascript\" src=\"");
      out.print( path );
      out.write("/bootstrap3.3.7/js/bootstrap.js\" ></script>\r\n");
      out.write("<link href=\"");
      out.print( path );
      out.write("/css/feed.css\" rel=\"stylesheet\" >\r\n");
      out.write("\t<title>ad</title>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  table\r\n");
      out.write("        {   \r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 90%;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("            line-height: 20px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            background-color: rgba(255, 255, 255, 1);\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            border-collapse: separate;\r\n");
      out.write("            border: 2px solid rgba(54, 53, 54, 1);\r\n");
      out.write("        }\r\n");
      out.write("        thead\r\n");
      out.write("        {\r\n");
      out.write("            height:56px;\r\n");
      out.write("            width: 86px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            line-height: 26px;\r\n");
      out.write("            color: rgba(54, 53, 54, 1);\r\n");
      out.write("            font-size: 25px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        table tr th,table tr td {\r\n");
      out.write("            border-right: 1px solid #555555 ;\r\n");
      out.write("            border-bottom: 1px solid #555555 ;\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("}\r\n");
      out.write("        \r\n");
      out.write("        tbody tr{\r\n");
      out.write("        \theight: 50px;\r\n");
      out.write("        }\r\n");
      out.write("        button\r\n");
      out.write("        {\r\n");
      out.write("        \twidth: 80px;\r\n");
      out.write("        \theight: 30px;\r\n");
      out.write("        }\r\n");
      out.write("        input#text{\r\n");
      out.write("        \tborder:none;\r\n");
      out.write("        \tbox-shadow : none;\r\n");
      out.write("        }\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: url(images/back.jpg)\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" \t$(document).ready(function(){\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\t$(\"button.topp\").click(function(){\r\n");
      out.write(" \t\t\tvar dom = $(this).parent().prev().children();\r\n");
      out.write(" \t\t\tvar qid = $(this).attr(\"id\");\r\n");
      out.write(" \t\t\tvar text = dom.val();\r\n");
      out.write(" \t\t\tdom.val(text);\r\n");
      out.write(" \t\t\t$.ajax({\r\n");
      out.write(" \t\t\t\turl:\"");
      out.print(path );
      out.write("/questionUpdate\",\r\n");
      out.write(" \t\t\t\ttype:\"POST\",\r\n");
      out.write(" \t\t\t\tdataType : \"json\",\r\n");
      out.write(" \t\t\t\tcontentType : \"application/x-www-form-urlencoded; charset=utf-8\",\r\n");
      out.write(" \t\t\t\tdata : {\r\n");
      out.write(" \t\t\t\t\tqid : qid,\r\n");
      out.write(" \t\t\t\t\ttext : text\r\n");
      out.write(" \t\t\t\t},\r\n");
      out.write(" \t\t\t\tsuccess:function(data){\r\n");
      out.write(" \t\t\t\t\tif(data.code = \"success\"){\r\n");
      out.write(" \t\t\t\t\t\talert(\"保存成功\");\r\n");
      out.write(" \t\t\t\t\t\tdom.val(data.text);\r\n");
      out.write(" \t\t\t\t\t}else{\r\n");
      out.write(" \t\t\t\t\t\talert(\"保存失败\");\r\n");
      out.write(" \t\t\t\t\t\tdom.val(data.text);\r\n");
      out.write(" \t\t\t\t\t}\r\n");
      out.write(" \t\t\t\t}\r\n");
      out.write(" \t\t\t\t\r\n");
      out.write(" \t\t\t});\r\n");
      out.write(" \t\t});\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t$(\"#t1\").click(function(){\r\n");
      out.write("\t \t\t$(\"#tag1\").show();\r\n");
      out.write("\t \t\t$(\"#tag2\").hide();\r\n");
      out.write("\t \t});\r\n");
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t \t$(\"#t2\").click(function(){\r\n");
      out.write("\t \t\t$(\"#tag2\").show();\r\n");
      out.write("\t \t\t$(\"#tag1\").hide();\r\n");
      out.write("\t \t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t \tfunction del(temp)\r\n");
      out.write("\t \t{\r\n");
      out.write("\t\t\talert(temp.parentNode.parentNode);//这个temp.parentNode就是div元素\r\n");
      out.write("\t\t\t$(temp.parentNode.parentNode.parentNode).remove();\r\n");
      out.write("\t \t} \r\n");
      out.write("\t \r\n");
      out.write("\t \tfunction loc(temp)\r\n");
      out.write("\t \t{\r\n");
      out.write("\t \t\talert(\"已锁定\");\r\n");
      out.write("\t \t\t// $($(temp).next(\"button.unlock\")).attr('disabled',\"false\");\r\n");
      out.write("\t \t\t// $(temp).attr('disabled',\"true\");\r\n");
      out.write("\t \r\n");
      out.write("\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \tfunction unl(temp)\r\n");
      out.write("\t \t{\r\n");
      out.write("\t \t\talert(\"解锁\");\r\n");
      out.write("\t \t\t// $($(temp).sblings(\"button.lock\")).attr('disabled',\"false\");\r\n");
      out.write("\t \t\t// $(temp).attr('disabled',\"true\");\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \tfunction top(temp)\r\n");
      out.write("\t \t{\r\n");
      out.write("\t \t\talert(\"已置顶\");\r\n");
      out.write("\t \t\t// $($(temp).sblings(\"button.untop\")).attr('disabled',\"false\");\r\n");
      out.write("\t \t\t// $(temp).attr('disabled',\"true\");\r\n");
      out.write("\t \t}\r\n");
      out.write("\t \tfunction unt(temp)\r\n");
      out.write("\t \t{\r\n");
      out.write("\t \t\talert(\"已取消置顶\");\r\n");
      out.write("\t \t\t// $($(temp).sblings(\"button.topp\")).attr('disabled',\"false\");\r\n");
      out.write("\t \t\t// $(temp).attr('disabled',\"true\");\r\n");
      out.write("\t \t}\r\n");
      out.write("\r\n");
      out.write("\t \t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"header\" id=\"header\">\r\n");
      out.write("\t\t<nav class=\"navbar\" role=\"navigation\"  style=\"height: 105px\">\r\n");
      out.write("\t\t   <div class=\"navbar-header\" >\r\n");
      out.write("\t\t      <img  class=\"tubiao\" src=\"images/biao.jpg\" width=\"100\" height=\"100\" alt=\"图标\">\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t  <div id=\"avatar\" class=\"geren\" style=\"margin-left:550px;margin-top:70px;\">\r\n");
      out.write("  \t\t\t\t\t\t<a href=\"ToPersonEdit\">编辑个人资料</a>\r\n");
      out.write("\t  \t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  </nav>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t   </div>\r\n");
      out.write("<div class=\" tab-content \" style=\"height: 900px;margin-top: 80px;background-color:white;width: 1170px; margin-left: 170px;\">\r\n");
      out.write("\t\t<div style=\"margin-left: 70px;\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>问题内容</td>\r\n");
      out.write("                    <td>操作</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /userPages/personPage.jsp(176,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("Q");
      // /userPages/personPage.jsp(176,12) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${QuesUserAll}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("            \t<tr>\r\n");
            out.write("                 \t<td><input type=\"text\" name=\"text\" id=\"text\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Q.text}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" /></td>\r\n");
            out.write("                 \t<td style=\"padding: 10px;\">\r\n");
            out.write("                    \t<button class=\"topp\" onclick=\"top(this)\" id=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Q.qid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">保存</button>\r\n");
            out.write("                 \t    <a href=\"MyQuesDelServlet?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Q.qid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"><button class=\"delete\" onclick=\"del(this)\">删除</button></a>\r\n");
            out.write("                 \t</td>\r\n");
            out.write("            \t</tr>\r\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
