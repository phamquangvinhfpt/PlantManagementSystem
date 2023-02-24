package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/Footer.jsp");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        @import url('https://fonts.googleapis.com/css?family=Raleway:400,700');\n");
      out.write("\n");
      out.write("*,*:before,*:after{box-sizing:border-box}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("  min-height:100vh;\n");
      out.write("  font-family: 'Raleway', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container{\n");
      out.write("  position:absolute;\n");
      out.write("  width:100%;\n");
      out.write("  height:100%;\n");
      out.write("  overflow:hidden;\n");
      out.write("  \n");
      out.write("  &:hover,&:active{\n");
      out.write("    .top, .bottom{\n");
      out.write("      &:before, &:after{\n");
      out.write("        margin-left: 200px;\n");
      out.write("        transform-origin: -200px 50%;\n");
      out.write("        transition-delay:0s;\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .center{\n");
      out.write("      opacity:1;\n");
      out.write("      transition-delay:0.2s;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top, .bottom{\n");
      out.write("  &:before, &:after{\n");
      out.write("    content:'';\n");
      out.write("    display:block;\n");
      out.write("    position:absolute;\n");
      out.write("    width:200vmax;\n");
      out.write("    height:200vmax;\n");
      out.write("    top:50%;left:50%;\n");
      out.write("    margin-top:-100vmax;\n");
      out.write("    transform-origin: 0 50%;\n");
      out.write("    transition:all 0.5s cubic-bezier(0.445, 0.05, 0, 1);\n");
      out.write("    z-index:10;\n");
      out.write("    opacity:0.65;\n");
      out.write("    transition-delay:0.2s;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top{\n");
      out.write("  &:before{transform:rotate(45deg);background:#e46569;}\n");
      out.write("  &:after{transform:rotate(135deg);background:#ecaf81;}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bottom{\n");
      out.write("  &:before{transform:rotate(-45deg);background:#60b8d4;}\n");
      out.write("  &:after{transform:rotate(-135deg);background:#3745b5;}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".center{\n");
      out.write("  position:absolute;\n");
      out.write("  width:400px;\n");
      out.write("  height:400px;\n");
      out.write("  top:50%;left:50%;\n");
      out.write("  margin-left:-200px;\n");
      out.write("  margin-top:-200px;\n");
      out.write("  display:flex;\n");
      out.write("  flex-direction: column;\n");
      out.write("  justify-content: center;\n");
      out.write("  align-items: center;\n");
      out.write("  padding:30px;\n");
      out.write("  opacity:0;\n");
      out.write("  transition:all 0.5s cubic-bezier(0.445, 0.05, 0, 1);\n");
      out.write("  transition-delay:0s;\n");
      out.write("  color:#333;\n");
      out.write("  \n");
      out.write("  input{\n");
      out.write("    width:100%;\n");
      out.write("    padding:15px;\n");
      out.write("    margin:5px;\n");
      out.write("    border-radius:1px;\n");
      out.write("    border:1px solid #ccc;\n");
      out.write("    font-family:inherit;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"mycss.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"\"><img src=\"images/logo.jpg\" id=\"logo\"></a></li>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"registration.jsp\">Register</a></li>\n");
      out.write("                <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                <li><form action=\"searchServlet\" method=\"post\" class=\"formsearch\">\n");
      out.write("                        <input type=\"text\" name=\"txtsearch\" placeholder=\"Search\">\n");
      out.write("                        <select name=\"searchby\">\n");
      out.write("                            <option value=\"byname\">by name</option>\n");
      out.write("                            <option value=\"bycate\">by category</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"search\">\n");
      out.write("                    </form></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container\" onclick=\"onclick\">\n");
      out.write("            <div class=\"top\"></div>\n");
      out.write("            <div class=\"bottom\"></div>\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <h2>Please Sign In</h2>\n");
      out.write("                <input type=\"email\" placeholder=\"email\">\n");
      out.write("                <input type=\"password\" placeholder=\"password\">\n");
      out.write("                <h2>&nbsp;</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://codepen.io/banik/pen/ReNNrO/3f837b2f0085b5125112fc455941ea94.js\"></script>\n");
      out.write("        <footer>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"mycss.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p style=\"color: #006666; text-align: center;\">Copyright &copy; 2021</p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </footer>\n");
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
