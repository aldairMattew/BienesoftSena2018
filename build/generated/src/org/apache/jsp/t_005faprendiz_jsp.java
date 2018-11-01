package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.aprendizSG;
import modelo.consultas;
import modelo.permisoSG;
import java.util.ArrayList;

public final class t_005faprendiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <!--Let browser know website is optimized for mobile-->\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> \n");
      out.write("            \n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("            <!--importando imagen y texto en pestaña-->\n");
      out.write("            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"materialize/icons/black/ver_lista.png\" />\n");
      out.write("            <title>BieneSoft | Permiso Coordinador</title>\n");
      out.write("\n");
      out.write("            <!--estilo body-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/body.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo encabezado-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/encabezado.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("            <!--estilo modulo busqueda-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/modulo_busqueda.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la tabla--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/tabla.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!--estilo modal-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/modal.css\" media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la botones--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/buttons.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo de la registro--> \n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/formulario.css\"  media=\"screen,projection\"/>\n");
      out.write("            \n");
      out.write("            <!--estilo footer-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/footer.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("            <!--estilo materialize.css-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"materialize/css/materialize.min.css\"  media=\"screen,projection\"/>    \n");
      out.write("            \n");
      out.write("            <!--importando--->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--*******************************OBJETO NAV RESPONSIVE***************************-->\n");
      out.write("        \n");
      out.write("        <!--nav principal--->\n");
      out.write("        \n");
      out.write("        <nav class=\"nav-wrapper\" id=\"nav_principal\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                    <i>\n");
      out.write("                        <img style=\"width: 25px; margin-top: 10px;\" src=\"materialize/icons/white/menu.png\" />\n");
      out.write("                    </i>\n");
      out.write("                    \n");
      out.write("                        <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                        <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                </a>\n");
      out.write("                \n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                    </a>\n");
      out.write("                \n");
      out.write("                    <a href=\"#\" data-target=\"menu-responsive\" class=\"sidenav-trigger\"> \n");
      out.write("                        <ul  class=\"right hide-on-med-and-down\">\n");
      out.write("                            <lu id=\"li\" title=\"cerrar cesion\"><a href=\"\"><img style=\"width: 25px; margin-top: 10px;\" src=\"\" /></a></lu>\n");
      out.write("                        </ul>\n");
      out.write("                    </a>\n");
      out.write("            </div>  \n");
      out.write("        </nav> \n");
      out.write("        \n");
      out.write("        <!--menu response-->\n");
      out.write("        \n");
      out.write("        <ul class=\"sidenav\" id=\"menu-responsive\">\n");
      out.write("                    \n");
      out.write("            <li><a href=\"#\"> Aprendizes</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\"> Alimentacion</a></li>\n");
      out.write("\n");
      out.write("            <li><a href=\"#\"> Permisos</a></li>        \n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        <!--------------------------------------------------->\n");
      out.write("\n");
      out.write("        <!--nav secundario (opciones)--->\n");
      out.write("        \n");
      out.write("        <nav id=\"nav_menu\" class=\"hide-on-med-and-down\" >\n");
      out.write("                        <a href=\"t_permiso_coordinador.jsp\">\n");
      out.write("                            <input id=\"opc_menu_2\" type=\"submit\" value=\"Permisos\"/>\n");
      out.write("                        </a>\n");
      out.write("                                  \n");
      out.write("                        <a href=\"t_aprendiz.jsp\">\n");
      out.write("                            <input id=\"opc_menu_2\" type=\"submit\" value=\"Aprendices\"/>\n");
      out.write("                        </a>\n");
      out.write("            \n");
      out.write("                        <a href=\"t_ficha.jsp\">\n");
      out.write("                            <input id=\"opc_menu_2\" type=\"submit\" value=\"Fichas\"/>\n");
      out.write("                        </a>    \n");
      out.write("            \n");
      out.write("                        <a href=\"t_aprendiz_rel_patrocinio.jsp\">\n");
      out.write("                            <input id=\"opc_menu_2\" type=\"submit\" value=\"Patrocinio\"/>\n");
      out.write("                        </a>\n");
      out.write("            \n");
      out.write("                        <a href=\"t_habitacion.jsp\">\n");
      out.write("                            <input id=\"opc_menu_2\" type=\"submit\" value=\"Habitaciones\"/>\n");
      out.write("                        </a>\n");
      out.write("        </nav>\n");
      out.write("        <!--**************************************************************************************************-->\n");
      out.write("        \n");
      out.write("        <!--MODULO INFORMACION USUARIO-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <label id=\"user_text\" class=\"user_text hide-on-med-and-down\">Coordinador</label> \n");
      out.write("            ");

                HttpSession rnombre=request.getSession();
                String nom=(String)rnombre.getAttribute("datico");
             
      out.write("\n");
      out.write("        <p id=\"user_text\" class=\"user_text hide-on-med-and-down\">");
      out.print(nom);
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("          <!--*********************************************************-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--*******************************OBJETO  MODULO CONSULTAS***************************-->\n");
      out.write("        \n");
      out.write("        <div class=\"container hide-on-small-only\">\n");
      out.write("            <div id=\"search-container\" >\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"btn-search-principal\" class=\"btn-search-principal hide-on-med-and-up\">\n");
      out.write("            <img src=\"materialize/icons/white/search.png\" />\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"btn-search-close\" class=\"btn-search-close hide-on-med-and-up\">\n");
      out.write("            <img src=\"materialize/icons/white/close.png\" />\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"modal-container\" class=\"modal-container container hide-on-med-and-up\">\n");
      out.write("            <div id=\"search-container-modal\" class=\"col s12\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <!--**************************************************************************************************-->\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!--*******************************OBJETO TABLA***************************-->\n");
      out.write("        \n");
      out.write(" <div class=\"container l12 m12 s12\">\n");
      out.write("     <h1 id=\"title_container\">TABLA Aprendiz(Coordinador)</h1>\n");
      out.write(" \n");
      out.write("         <div id=\"table\"  class=\"table\" style=\"margin-top: -10px;\">\n");
      out.write("     \n");
      out.write("                <table class=\"scrolling\">\n");
      out.write("                    \n");
      out.write("                    <thead id=\"thead\" class=\"thead\">\n");
      out.write("                        <th id=\"th_thead\">Numero de documento</th>\n");
      out.write("                        <th id=\"th_thead\">Tipo de documento</th>\n");
      out.write("                        <th id=\"th_thead\">Nombres</th>\n");
      out.write("                        <th id=\"th_thead\">Apellidos</th>\n");
      out.write("                        <th id=\"th_thead\">Tipo de aprendiz</th>\n");
      out.write("                        <th id=\"th_thead\">Numero de ficha</th>        \n");
      out.write("                        <th id=\"th_head\">Acciones</th>\n");
      out.write("                    </thead>\n");
      out.write("                               \n");
      out.write("                    ");

                        ArrayList <aprendizSG> listdat = new ArrayList<>();
                        consultas con = new consultas();
                        listdat = con.consultarTablaAprendiz();
                        aprendizSG x = new aprendizSG();

                         for(int i = 0; i< listdat.size(); i++){
                        x= listdat.get(i);
                    
      out.write("\n");
      out.write("          \n");
      out.write("<tr >\n");
      out.write("        <form action=\"ServletAprendiz\"  method=\"post\">\n");
      out.write("\n");
      out.write("                <td><input class=\"browser-default\" type=\"number\" name=\"t_NumeroDocumento\" value=\"");
      out.print(x.getApr_documento());
      out.write("\"></td>\n");
      out.write("                <td><input class=\"browser-default\" type=\"text\" name=\"t_TipoDocumento\" value=\"");
      out.print(x.getApr_documentoTipo());
      out.write("\"></td>\n");
      out.write("                <td><input class=\"browser-default\" type=\"text\" name=\"t_Nombres\" value=\"");
      out.print(x.getApr_nombres());
      out.write("\"></td>\n");
      out.write("                <td><input class=\"browser-default\" type=\"text\" name=\"t_Apellidos\" value=\"");
      out.print(x.getApr_apellidos());
      out.write("\"></td>\n");
      out.write("                <td><input class=\"browser-default\" type=\"text\" name=\"t_TipoAprendiz\" value=\"");
      out.print(x.getApr_tipoAprendiz());
      out.write("\"></td>\n");
      out.write("                <td><input class=\"browser-default\" type=\"number\" name=\"t_numeroFicha\" value=\"");
      out.print(x.getApr_ficha_fic_numero());
      out.write("\"></td>\n");
      out.write("    \n");
      out.write("                     <td>  \n");
      out.write("                         <div id=\"btn-consulta-tabla\" class=\"btn-consulta-tabla\" title=\"consultar aprendiz\">\n");
      out.write("                             <img src=\"materialize/icons/white/visibility.png\" />\n");
      out.write("                        </div>\n");
      out.write("                     </td>\n");
      out.write("\n");
      out.write("            \n");
      out.write("</tr>   \n");
      out.write("\n");
      out.write("<!--MODAL-->\n");
      out.write("\n");
      out.write("<div class=\"modal-background\" id=\"modal-background\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        \n");
      out.write("        <div class=\"  col s12 l12 m12\" id=\"\">\n");
      out.write("  \n");
      out.write("        <div class=\"modal-cont l12 s12 m12\" id=\"modal-cont\" >\n");
      out.write("            \n");
      out.write("  \n");
      out.write("                <div class=\"btn-cerrar_modal\" id=\"btn-cerrar_modal\">\n");
      out.write("                        <img src=\"icon_acciones/cerrar-ventana.png\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">ID</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"number\" name=\"t_NumeroDocumento\" value=\"");
      out.print(x.getApr_documento());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Tipo de documento</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_TipoDocumento\" value=\"");
      out.print(x.getApr_documentoTipo());
      out.write("\">\n");
      out.write("                                                 </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                   <p id=\"input_msg_modal\">Nombres</p>\n");
      out.write("                                                   <br>\n");
      out.write("                                                   <input id=\"input_txt_modal\" type=\"text\" name=\"t_Nombres\" value=\"");
      out.print(x.getApr_nombres());
      out.write("\">\n");
      out.write("                                               </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                   <p id=\"input_msg_modal\">Apellidos</p>\n");
      out.write("                                                   <br>\n");
      out.write("                                                   <input id=\"input_txt_modal\" type=\"text\" name=\"t_Apellidos\" value=\"");
      out.print(x.getApr_apellidos());
      out.write("\">\n");
      out.write("                                               </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Fecha de nacimiento</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\"  type=\"date\" name=\"t_FechaNacimiento\" value=\"");
      out.print(x.getApr_fechaNacimiento());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                 <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Edad</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"number\" name=\"t_Edad\" value=\"");
      out.print(x.getApr_edad());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Sexo</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_sexo\" value=\"");
      out.print(x.getApr_sexo());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Celular</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_celular\" value=\"");
      out.print(x.getApr_celular());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">eps</p>  \n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_eps\" value=\"");
      out.print(x.getApr_eps());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                 <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">rh</p>   <!--falta-->\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_rh\" value=\"");
      out.print(x.getApr_rh());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Tipo de aprendiz</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_TipoAprendiz\" value=\"");
      out.print(x.getApr_tipoAprendiz());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Nombre del padres</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_NombrePadre\" value=\"");
      out.print(x.getApr_nombrePadre());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Telefono del padre</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"number\" name=\"t_celularPadre\" value=\"");
      out.print(x.getApr_telefonoPadre());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Nombre de la madre</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_NombreMadre\" value=\"");
      out.print(x.getApr_nombreMadre());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Telefono de la madre</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"number\" name=\"t_celularMadre\" value=\"");
      out.print(x.getApr_telefonoMadre());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Departamento</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_Departamento\" value=\"");
      out.print(x.getApr_departamento());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Ciudad</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_ciudad\" value=\"");
      out.print(x.getApr_ciudad());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Barrio</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_barrio\" value=\"");
      out.print(x.getApr_barrio());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Direccion</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_direccion\" value=\"");
      out.print(x.getApr_direccion());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Antecedentes medicos</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_AntecedenteMedico\" value=\"");
      out.print(x.getApr_antecedente_medico());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">E-mail</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_email\" value=\"");
      out.print(x.getApr_email());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Hoja de vida</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <img src=\"");
      out.print(x.getApr_hojaDeVida());
      out.write("\" width=\"60\" height=\"60\"/>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"Hoja\" value=\"");
      out.print(x.getApr_hojaDeVida());
      out.write("\">\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input type=\"file\" name=\"HojaDeVida\" accept=\"imagen/*\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Acta de compromiso</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"text\" name=\"t_Acta\" value=\"");
      out.print(x.getApr_actaCompromiso());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Llamados de atencion</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"number\" name=\"t_llamadosAtencion\" value=\"");
      out.print(x.getApr_llamadosDeAtencion());
      out.write("\" readonly>\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Numero de habitacion</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"number\" name=\"t_numeroHabitacion\" value=\"");
      out.print(x.getApr_numero_habitacion());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"input-field col s12 l6 m6\">\n");
      out.write("                                                    <p id=\"input_msg_modal\">Ficha</p>\n");
      out.write("                                                    <br>\n");
      out.write("                                                    <input id=\"input_txt_modal\" type=\"number\" name=\"t_numeroFicha\" value=\"");
      out.print(x.getApr_ficha_fic_numero());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                        <div class=\"footer-modal\" id=\"footer-modal\">\n");
      out.write("                            <input type=\"submit\"  name=\"btn-actualizar\" value=\"enviar\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("    </div>\n");
      out.write("                        \n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("</div>\n");
      out.write("<!---------------------------------------------------------------------------->\n");
      out.write("\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("                \n");
      out.write("         \n");
      out.write("         <!--**************************************************************************************************-->\n");
      out.write("         \n");
      out.write("         <!--***************FOOTER*********************-->\n");
      out.write("        <footer class=\"page-footer\" id=\"footer_form\">\n");
      out.write("\n");
      out.write("                    <div class=\"container white-text center\">\n");
      out.write("                    © 2018 Biene-Soft\n");
      out.write("                    <br>\n");
      out.write("                    Todos los derechos reservados\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("        </footer>\n");
      out.write("        <!------------------------------------------------------------------------------------------------------>\n");
      out.write("                \n");
      out.write("\n");
      out.write("    <!--importando funciones para los objetos-->    \n");
      out.write("    <script>\n");
      out.write("        document.addEventListener('DOMContentLoaded', function() {\n");
      out.write("            M.AutoInit();\n");
      out.write("        });\n");
      out.write("    </script>    \n");
      out.write("    \n");
      out.write("    <!--importando la funcion modal resultado-tabla-->\n");
      out.write("    <script src=\"js/modal-tabla/main.js\"></script>\n");
      out.write("  \n");
      out.write("    <!--importando la funcion de modal-busqueda-->\n");
      out.write("    <script src=\"js/modulo-busqueda/main.js\"></script>\n");
      out.write("        \n");
      out.write("    <!--JavaScript at end of body for optimized loading-->\n");
      out.write("    <script type=\"text/javascript\" src=\"materialize/js/materialize.min.js\"></script>\n");
      out.write("\n");
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
