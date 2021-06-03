
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletNuevoHorario", urlPatterns = {"/ServletNuevoHorario"})
public class ServletNuevoHorario extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
          
       //recupero los datos enviados por el metodo post del formulario
       String horarioApertura = request.getParameter("inputApertura");
       String horarioCierre = request.getParameter("inputCierre");
       
       //guardamos cliente en la session
       request.getSession().setAttribute("horarioApertura", horarioApertura);
       request.getSession().setAttribute("horarioCierre", horarioCierre);
       
       response.sendRedirect("nuevoHorario.jsp");
       
        //instanciamos controladora de la logica
        Controladora controladora = new Controladora();
        
        controladora.crearHorario(horarioApertura, horarioCierre);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
