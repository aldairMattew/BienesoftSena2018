//DATOS APRENDIZ
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.aprendizSG;
import modelo.consultas;


@WebServlet(name = "servBuscarAprendiz", urlPatterns = {"/servBuscarAprendiz"})
public class servBuscarAprendiz extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        String tipoAprendiz = request.getParameter("tipo");
        String docId = request.getParameter("documento");
        String ventana = request.getParameter("ventana");
        
//       JOptionPane.showMessageDialog(null, "se toma en el servlet al iniciar  " + "  EL ID: " +docId+  "EL TIPO: " +tipoAprendiz);
        if(ventana != null && ventana.equals("abrir")) {
            //BUSCAR DATOS DEL APRENDIZ SELECCIONADO
            consultas con= new consultas();
            ArrayList<aprendizSG> aprendizSena = new ArrayList<>();
            
            //GuargarID EN LOS GETTER Y SETTER
            aprendizSG id = new aprendizSG(Integer.parseInt(docId));
            //LLAMAR CONSULTA
            aprendizSena = con.consultarAprendizID(Integer.parseInt(docId));
            
            //Guarda datos
            aprendizSG apr=new aprendizSG();
            apr = aprendizSena.get(0);
            
            //CONSULTAR NOMBRE DEL APRENDIZ
            consultas con_ap = new consultas();
            ArrayList<aprendizSG> aprendiz = new ArrayList<>();
            
            //Consulta de datos de aprendiz (ID)
            aprendizSena = con_ap.consultarTablaAprendiz();

            aprendizSG ap = new aprendizSG();
            ap = aprendiz.get(0);
            
            //Impresion de datos del permiso
            JOptionPane.showMessageDialog(null, ap.getApr_email());
            
            out.print(
                    ap.getApr_documento()+ //0
                "|"+ap.getApr_documentoTipo()+//1
                "|"+ap.getApr_nombres()+ //2
                "|"+ap.getApr_apellidos()+ //3
                "|"+ap.getApr_fechaNacimiento()+ //4
                "|"+ap.getApr_edad()+ //5
                "|"+ap.getApr_sexo()+ //6
                "|"+ap.getApr_celular()+ //7
                "|"+ap.getApr_eps()+ //8
                "|"+ap.getApr_rh()+ //9
                "|"+ap.getApr_tipoAprendiz()+ //10
                "|"+ap.getApr_nombrePadre()+ //11
                "|"+ap.getApr_telefonoPadre()+ //12
                "|"+ap.getApr_nombreMadre()+ //13
                "|"+ap.getApr_telefonoMadre()+ //14
                "|"+ap.getApr_departamento()+ //15
                "|"+ap.getApr_ciudad()+ //16
                "|"+ap.getApr_barrio()+ //17
                "|"+ap.getApr_direccion()+ //18
                "|"+ap.getApr_antecedente_medico()+//19
                "|"+ap.getApr_email()+//20
                "|"+ap.getApr_hojaDeVida()+//21
                "|"+ap.getApr_actaCompromiso()+//22
                "|"+ap.getApr_llamadosDeAtencion()+//23
                "|"+ap.getApr_numero_habitacion()+//24
                "|"+ap.getApr_ficha_fic_numero());//25

        } else { 
         
            int doc=Integer.parseInt(request.getParameter("documento")); //Documento aprendiz
//            JOptionPane.showMessageDialog(null, "esto se consulta en el servlet para buscar  " +doc);
            out.print(
                "<thead class='thead_t'>"+                    
                    "<tr>"+
                    "<th id='thead_opt'>NUMERO DE DOCUMENTO</th>"+
                    "<th id='thead_opt'>TIPO DE DOCUMENTO</th>"+
                    "<th id='thead_opt'>NOMBRES</th>"+
                    "<th id='thead_opt'>APELLIDOS</th>"+
                    "<th id='thead_opt'>TIPO APRENDIZ</th>"+
                    "<th id='thead_opt'>NUMERO DE FICHA</th>"+
                    "<th id='thead_opt'>ACCIONES</th>"+                 
                    "</tr>"+
                "</thead>");

            ArrayList<aprendizSG> lisdat = new ArrayList<>();
            consultas con = new consultas();
            lisdat = con.consultarAprendizDocTipo(tipoAprendiz, doc);
            //JOptionPane.showMessageDialog(null, "esto se va a enviar:  tipo-->" +tipoAprendiz+ "  documnto--->"+doc);
            
            aprendizSG x = new aprendizSG();
            int i=0;
            for(i=0; i<lisdat.size(); i++){
                x = lisdat.get(i);

        out.print(
                "<tr>"+
                    "<form action='ServletAprendiz' enctype='multipart/form-data' method='post'>"+
                        "<td><input id=id"+i+"  class='browser-default input_t'  readonly type='number' name='t_NumeroDocumento' value="+x.getApr_documento()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_TipoDocumento' value="+x.getApr_documentoTipo()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_Nombres' value="+x.getApr_nombres()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_Apellidos' value="+x.getApr_apellidos()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='text' name='t_TipoAprendiz' value="+x.getApr_tipoAprendiz()+"></td>"+
                        "<td><input class='hide-on-med-and-down input_t' readonly type='number' name='t_numeroFicha' value="+x.getApr_ficha_fic_numero()+"></td>"+        
                        "<td>"+ 
                        "<div  class='btn-ver-permiso-coordinador'>"+                
                        "<img id=p"+i+" class='ver_apr' src='icon_acciones/ver.png' style='padding-left: 15px'/>"+     
                        "</div>"+
                        "</td>"+        
                "</tr>"
        );
            }


            out.print("<script src='js/modal/modalAprendiz.js'></script>");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}