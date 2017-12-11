package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .header-fixed .header-limiter {\n");
      out.write("\tmax-width: 1200px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("}\n");
      out.write("        .header-fixed {\n");
      out.write("\tbackground-color:#292c2f;\n");
      out.write("\tbox-shadow:0 1px 1px #ccc;\n");
      out.write("\tpadding: 20px 40px;\n");
      out.write("\theight: 80px;\n");
      out.write("\tcolor: #ffffff;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\ttop:-100px;\n");
      out.write("\n");
      out.write("\t-webkit-transition:top 0.3s;\n");
      out.write("\ttransition:top 0.3s;\n");
      out.write("}\n");
      out.write(".header-fixed-placeholder{\n");
      out.write("\theight: 80px;\n");
      out.write("\tdisplay: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Logo */\n");
      out.write("\n");
      out.write(".header-fixed .header-limiter h1 {\n");
      out.write("\tfloat: left;\n");
      out.write("\tfont: normal 28px Cookie, Arial, Helvetica, sans-serif;\n");
      out.write("\tline-height: 40px;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-fixed .header-limiter h1 span {\n");
      out.write("\tcolor: #5383d3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The navigation links */\n");
      out.write("\n");
      out.write(".header-fixed .header-limiter a {\n");
      out.write("\tcolor: #ffffff;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-fixed .header-limiter nav {\n");
      out.write("\tfont:16px Arial, Helvetica, sans-serif;\n");
      out.write("\tline-height: 40px;\n");
      out.write("\tfloat: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-fixed .header-limiter nav a{\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tpadding: 0 5px;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\tcolor: #ffffff;\n");
      out.write("\topacity: 0.9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-fixed .header-limiter nav a:hover{\n");
      out.write("\topacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-fixed .header-limiter nav a.selected {\n");
      out.write("\tcolor: #608bd2;\n");
      out.write("\tpointer-events: none;\n");
      out.write("\topacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fixed version of the header */\n");
      out.write("\n");
      out.write("body.fixed .header-fixed {\n");
      out.write("\tpadding: 10px 40px;\n");
      out.write("\theight: 50px;\n");
      out.write("\tposition: fixed;\n");
      out.write("\twidth: 100%;\n");
      out.write("\ttop: 0;\n");
      out.write("\tleft: 0;\n");
      out.write("\tz-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body.fixed .header-fixed-placeholder {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body.fixed .header-fixed .header-limiter h1 {\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\tline-height: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body.fixed .header-fixed .header-limiter nav {\n");
      out.write("\tline-height: 28px;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Making the header responsive */\n");
      out.write("\n");
      out.write("@media all and (max-width: 600px) {\n");
      out.write("\n");
      out.write("\t.header-fixed {\n");
      out.write("\t\tpadding: 20px 0;\n");
      out.write("\t\theight: 75px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.header-fixed .header-limiter h1 {\n");
      out.write("\t\tfloat: none;\n");
      out.write("\t\tmargin: -8px 0 10px;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tfont-size: 24px;\n");
      out.write("\t\tline-height: 1;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.header-fixed .header-limiter nav {\n");
      out.write("\t\tline-height: 1;\n");
      out.write("\t\tfloat:none;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.header-fixed .header-limiter nav a {\n");
      out.write("\t\tfont-size: 13px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tbody.fixed .header-fixed {\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*\n");
      out.write("\t We are clearing the body's margin and padding, so that the header fits properly.\n");
      out.write("\t We are also adding a height to demonstrate the scrolling behavior. You can remove\n");
      out.write("\t these styles.\n");
      out.write(" */\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\theight: 1500px;\n");
      out.write("}\n");
      out.write(".imgfix\n");
      out.write("{\n");
      out.write("    height:20px;\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <header class=\"header-fixed\">\n");
      out.write("\n");
      out.write("\t<div class=\"header-limiter\">\n");
      out.write("\n");
      out.write("            <h1><a href=\"#\">Company<span>logo</span></a></h1>\n");
      out.write("\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<a href=\"index.html\">Home</a>\n");
      out.write("\t\t\t<a href=\"#\">Products</a>\n");
      out.write("\t\t\t<a href=\"#\">AboutUs</a>\n");
      out.write("                  <a><img class=\"imgfix\" src='images/mycart.png'></a>\n");
      out.write("                  <a href='#'>Signup</a>\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("        \n");
      out.write("<!-- You need this element to prevent the content of the page from jumping up -->\n");
      out.write("<div class=\"header-fixed-placeholder\"></div>\n");
      out.write("\n");
      out.write("<!-- The content of your page would go here. -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\n");
      out.write("\t\tvar showHeaderAt = 150;\n");
      out.write("\n");
      out.write("\t\tvar win = $(window),\n");
      out.write("\t\t\t\tbody = $('body');\n");
      out.write("\n");
      out.write("\t\t// Show the fixed header only on larger screen devices\n");
      out.write("\n");
      out.write("\t\tif(win.width() > 400){\n");
      out.write("\n");
      out.write("\t\t\t// When we scroll more than 150px down, we set the\n");
      out.write("\t\t\t// \"fixed\" class on the body element.\n");
      out.write("\n");
      out.write("\t\t\twin.on('scroll', function(e){\n");
      out.write("\n");
      out.write("\t\t\t\tif(win.scrollTop() > showHeaderAt) {\n");
      out.write("\t\t\t\t\tbody.addClass('fixed');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse {\n");
      out.write("\t\t\t\t\tbody.removeClass('fixed');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    if(request.getParameter("log")==null)
    {
       
        response.sendRedirect("signup.jsp");
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><u>LOGIN</u></h1>\n");
      out.write("        <form>\n");
      out.write("            EMAIL-ID:\n");
      out.write("            <input type=\"email\" name=\"email\" required/></td>\n");
      out.write("        <br>\n");
      out.write("            PASSWORD:\n");
      out.write("            <input type=\"password\" name=\"password\" required/><br>\n");
      out.write("            <INPUT TYPE=\"submit\" value=\"SUBMIT\" name=\"ok\"/>\n");
      out.write("    </form>   \n");
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