package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class f_005faprendiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>f_aprendiz</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            <h1>formulario aprendiz</h1>\r\n");
      out.write("            \r\n");
      out.write("            <form action=\"ServletAprendiz\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                <td><input type=\"number\" name=\"f_NumeroDocumento\" placeholder=\"documento del aprendiz\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_TipoDocumento\" placeholder=\"tipo de documento\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_Nombres\" placeholder=\"nombres\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_Apellidos\" placeholder=\"apellidos\"><td>\r\n");
      out.write("                <td><input type=\"date\" name=\"f_FechaNacimiento\" placeholder=\"fecha de nacimiento\"></td>\r\n");
      out.write("                <td><input type=\"number\" name=\"f_Edad\" placeholder=\"edad\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_sexo\" placeholder=\"sexo\"></td>\r\n");
      out.write("                <td><input type=\"number\" name=\"f_celular\" placeholder=\"celular\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_eps\" placeholder=\"eps\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_rh\" placeholder=\"rh\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_TipoAprendiz\" placeholder=\"tipo aprendiz\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_NombrePadre\" placeholder=\"nombre del padre\"></td>\r\n");
      out.write("                <td><input type=\"number\" name=\"f_celularPadre\" placeholder=\"celular del padre\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_NombreMadre\" placeholder=\"nombre de la madre\"></td>\r\n");
      out.write("                <td><input type=\"number\" name=\"f_celularMadre\" placeholder=\"celular de la madre\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_Departamento\" placeholder=\"departamento\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_ciudad\" placeholder=\"ciudad\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_barrio\" placeholder=\"barrio\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_direccion\" placeholder=\"direccion\"><td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_AntecedenteMedico\" placeholder=\"antecedente medico\"></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_email\" placeholder=\"E-mail\"></td>\r\n");
      out.write("                <td><input type=\"file\" name=\"f_HojaDeVida\" accept=\"imagen/*\"><br><br></td>\r\n");
      out.write("                <td><input type=\"text\" name=\"f_Acta\" placeholder=\"Acta de compromiso\"><td>\r\n");
      out.write("                <td><input type=\"number\" name=\"f_llamadosAtencion\" placeholder=\"llamados de atencion\"></td>\r\n");
      out.write("                <td><input type=\"number\" name=\"f_numeroHabitacion\" placeholder=\"numero de habitacion\"></td>\r\n");
      out.write("                <td><input type=\"number\" name=\"f_numeroFicha\" placeholder=\"numero de ficha\"></td>\r\n");
      out.write("                \r\n");
      out.write("                <input type=\"submit\" name=\"btn_guardar\" value=\"Guardar\">\r\n");
      out.write("                \r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
