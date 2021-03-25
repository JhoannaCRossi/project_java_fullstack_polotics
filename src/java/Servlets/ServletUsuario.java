
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
public class ServletUsuario extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       /* String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasena");
        
        request.getSession().setAttribute("usuario", usuario);
        request.getSession().setAttribute("contrasena", contrasenia);
        
        response.sendRedirect("altaCorrecta.jsp");
        */
        //instanciamos controladora de la logica
        Controladora controladora = new Controladora();
        
        controladora.crearUsuario();
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
