
package Servlets;

import Logica.Controladora;
import Logica.Horario;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletEditarHorario", urlPatterns = {"/ServletEditarHorario"})
public class ServletEditarHorario extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
 
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
         String id = request.getParameter("id");
     
        Controladora controladora = new Controladora();
        Horario horario = controladora.buscarHorario(Integer.parseInt(id));
        
        HttpSession misession = request.getSession(true);
        misession.setAttribute("horario", horario);
        
        response.sendRedirect("editarHorario.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
          
        String id = (request.getParameter("inputId"));
        String horarioApertura = (request.getParameter("inputApertura"));
        String horarioCierre = (request.getParameter("inputCierre"));
        
        
        Controladora controladora = new Controladora();
        Horario hora = controladora.buscarHorario(Integer.parseInt(id));

      
        hora.setHorarioApertura(horarioApertura);
        hora.setHorarioCierre(horarioCierre);
        
        controladora.editarHorario(hora);
        
        response.sendRedirect("listaHorario.jsp");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
