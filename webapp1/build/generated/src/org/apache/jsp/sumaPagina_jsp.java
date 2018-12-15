package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sumaPagina_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Pagina para sumar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form class=\"form-horizontal\">\n");
      out.write("            <fieldset>\n");
      out.write("\n");
      out.write("            <!-- Form Name -->\n");
      out.write("            <legend>Suma</legend>\n");
      out.write("\n");
      out.write("            <!-- Text input-->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"col-md-4 control-label\" for=\"txtNumero1\">Numero 1</label>  \n");
      out.write("              <div class=\"col-md-5\">\n");
      out.write("                  <input id=\"txtNumero1\" name=\"txtNumero1\" type=\"number\" placeholder=\"Captura un numero\" class=\"form-control input-md\" required=\"\">\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Text input-->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"col-md-4 control-label\" for=\"txtNumero2\">Numero 2</label>  \n");
      out.write("              <div class=\"col-md-5\">\n");
      out.write("              <input id=\"txtNumero2\" name=\"txtNumero2\" type=\"number\" placeholder=\"Captura un numero\" class=\"form-control input-md\" required=\"\">\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Button -->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label class=\"col-md-4 control-label\" for=\"btnSumar\"></label>\n");
      out.write("              <div class=\"col-md-4\">\n");
      out.write("                <button id=\"btnSumar\" name=\"btnSumar\" class=\"btn btn-primary\">Sumar</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("            </form>\n");
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
