/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.94
 * Generated at: 2025-07-24 19:50:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.axis2.transport.http.HTTPConstants;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.ui.util.CharacterEncoder;
import org.wso2.carbon.utils.ServerConstants;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1741069184000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(7);
    _jspx_imports_classes.add("org.apache.commons.httpclient.HttpMethod");
    _jspx_imports_classes.add("org.wso2.carbon.ui.util.CharacterEncoder");
    _jspx_imports_classes.add("org.wso2.carbon.ui.CarbonUIUtil");
    _jspx_imports_classes.add("org.wso2.carbon.utils.ServerConstants");
    _jspx_imports_classes.add("org.apache.axis2.transport.http.HTTPConstants");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey.release();
    _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dialog/display_messages.jsp", out, false);
      out.write('\n');
      out.write('\n');
      //  fmt:bundle
      org.apache.taglibs.standard.tag.rt.fmt.BundleTag _jspx_th_fmt_005fbundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.BundleTag) _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.get(org.apache.taglibs.standard.tag.rt.fmt.BundleTag.class);
      boolean _jspx_th_fmt_005fbundle_005f0_reused = false;
      try {
        _jspx_th_fmt_005fbundle_005f0.setPageContext(_jspx_page_context);
        _jspx_th_fmt_005fbundle_005f0.setParent(null);
        // /admin/index.jsp(28,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fbundle_005f0.setBasename("org.wso2.carbon.i18n.Resources");
        int _jspx_eval_fmt_005fbundle_005f0 = _jspx_th_fmt_005fbundle_005f0.doStartTag();
        if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_fmt_005fbundle_005f0);
          }
          do {
            out.write('\n');
            out.write('\n');

                Object param = session.getAttribute("authenticated");
				String passwordExpires = (String) session
						.getAttribute(ServerConstants.PASSWORD_EXPIRATION);
				boolean loggedIn = false;
				if (param != null) {
					loggedIn = (Boolean) param;
				}
				boolean serverAdminComponentFound = CarbonUIUtil
						.isContextRegistered(config, "/server-admin/");
				
				if (CharacterEncoder.getSafeText(request.getParameter("skipLoginPage"))!=null){
					response.sendRedirect("../admin/login_action.jsp");
					return;
				}

            out.write("\n");
            out.write("    <div id=\"middle\">\n");
            out.write("        ");

            String serverName = CarbonUIUtil
        						.getServerConfigurationProperty("Name");
        
            out.write("\n");
            out.write("        <h2>\n");
            out.write("            ");
            //  fmt:message
            org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
            boolean _jspx_th_fmt_005fmessage_005f0_reused = false;
            try {
              _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
              _jspx_th_fmt_005fmessage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
              // /admin/index.jsp(52,12) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_fmt_005fmessage_005f0.setKey("carbon.server.home");
              int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
              if (_jspx_eval_fmt_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_fmt_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_fmt_005fmessage_005f0);
                }
                do {
                  out.write("\n");
                  out.write("                ");
                  //  fmt:param
                  org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_005fparam_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
                  boolean _jspx_th_fmt_005fparam_005f0_reused = false;
                  try {
                    _jspx_th_fmt_005fparam_005f0.setPageContext(_jspx_page_context);
                    _jspx_th_fmt_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fmessage_005f0);
                    // /admin/index.jsp(53,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_fmt_005fparam_005f0.setValue( serverName);
                    int _jspx_eval_fmt_005fparam_005f0 = _jspx_th_fmt_005fparam_005f0.doStartTag();
                    if (_jspx_th_fmt_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                    _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f0);
                    _jspx_th_fmt_005fparam_005f0_reused = true;
                  } finally {
                    org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fparam_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fparam_005f0_reused);
                  }
                  out.write("\n");
                  out.write("            ");
                  int evalDoAfterBody = _jspx_th_fmt_005fmessage_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_fmt_005fmessage_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey.reuse(_jspx_th_fmt_005fmessage_005f0);
              _jspx_th_fmt_005fmessage_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f0_reused);
            }
            out.write("\n");
            out.write("        </h2>\n");
            out.write("\n");
            out.write("        <p>\n");
            out.write("            ");
            //  fmt:message
            org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
            boolean _jspx_th_fmt_005fmessage_005f1_reused = false;
            try {
              _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
              _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fbundle_005f0);
              // /admin/index.jsp(58,12) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_fmt_005fmessage_005f1.setKey("carbon.console.welcome");
              int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
              if (_jspx_eval_fmt_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_fmt_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_fmt_005fmessage_005f1);
                }
                do {
                  out.write("\n");
                  out.write("                ");
                  //  fmt:param
                  org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_005fparam_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
                  boolean _jspx_th_fmt_005fparam_005f1_reused = false;
                  try {
                    _jspx_th_fmt_005fparam_005f1.setPageContext(_jspx_page_context);
                    _jspx_th_fmt_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fmessage_005f1);
                    // /admin/index.jsp(59,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_fmt_005fparam_005f1.setValue( serverName);
                    int _jspx_eval_fmt_005fparam_005f1 = _jspx_th_fmt_005fparam_005f1.doStartTag();
                    if (_jspx_th_fmt_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                    _005fjspx_005ftagPool_005ffmt_005fparam_0026_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f1);
                    _jspx_th_fmt_005fparam_005f1_reused = true;
                  } finally {
                    org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fparam_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005fparam_005f1_reused);
                  }
                  out.write("\n");
                  out.write("            ");
                  int evalDoAfterBody = _jspx_th_fmt_005fmessage_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_fmt_005fmessage_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey.reuse(_jspx_th_fmt_005fmessage_005f1);
              _jspx_th_fmt_005fmessage_005f1_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005fmessage_005f1_reused);
            }
            out.write("\n");
            out.write("        </p>\n");
            out.write("\n");
            out.write("        <p>&nbsp;</p>\n");
            out.write("\n");
            out.write("        <div id=\"workArea\">\n");
            out.write("        <div id=\"systemInfoDiv\">\n");
            out.write("            ");

                if (loggedIn && passwordExpires != null) {
            
            out.write("\n");
            out.write("                 <div class=\"info-box\"><p>Your password expires at ");
            out.print(passwordExpires);
            out.write(". Please change by visiting <a href=\"../user/change-passwd.jsp?isUserChange=true&returnPath=../admin/index.jsp\">here</a></p></div>\n");
            out.write("            ");

                }
            				if (loggedIn && serverAdminComponentFound) {
            
            out.write("\n");
            out.write("            <div id=\"result\"></div>\n");
            out.write("            <script type=\"text/javascript\">\n");
            out.write("                jQuery.noConflict();\n");
            out.write("                var refresh;\n");
            out.write("                function refreshStats() {\n");
            out.write("                    var url = \"../server-admin/system_status_ajaxprocessor.jsp\";\n");
            out.write("                    var data = null;\n");
            out.write("                    try {\n");
            out.write("                        jQuery.ajax({\n");
            out.write("                            url: \"../admin/jsp/session-validate.jsp\",\n");
            out.write("                            type: \"GET\",\n");
            out.write("                            dataType: \"html\",\n");
            out.write("                            data: data,\n");
            out.write("                            complete: function(res, status){\n");
            out.write("                                if (res.responseText.search(/----valid----/) != -1) {\n");
            out.write("                                    jQuery(\"#result\").load(url, null, function (responseText, status, XMLHttpRequest) {\n");
            out.write("                                    });\n");
            out.write("                                }\n");
            out.write("                            },error: function(res, status, error){\n");
            out.write("\n");
            out.write("                            }\n");
            out.write("                        });\n");
            out.write("                    } catch (e) {\n");
            out.write("                    }\n");
            out.write("                }\n");
            out.write("                try {\n");
            out.write("                    jQuery(document).ready(function() {\n");
            out.write("                        refreshStats();\n");
            out.write("\n");
            out.write("                    });\n");
            out.write("                } catch (e) {\n");
            out.write("                } // ignored\n");
            out.write("            </script>\n");
            out.write("            ");

                }
            
            out.write("\n");
            out.write("        </div>\n");
            out.write("        </div>\n");
            out.write("    </div>\n");
            int evalDoAfterBody = _jspx_th_fmt_005fbundle_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_fmt_005fbundle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.popBody();
          }
        }
        if (_jspx_th_fmt_005fbundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005ffmt_005fbundle_0026_005fbasename.reuse(_jspx_th_fmt_005fbundle_005f0);
        _jspx_th_fmt_005fbundle_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fbundle_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fbundle_005f0_reused);
      }
      out.write('\n');
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
