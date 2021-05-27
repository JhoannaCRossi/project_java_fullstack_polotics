
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletNuevoUsuario", urlPatterns = {"/ServletNuevoUsuario"})
public class ServletNuevoUsuario extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
       //recupero los datos enviados por el metodo post del formulario
       String usuario = request.getParameter("inputUsuario");
       String contrasena = request.getParameter("inputContrasena");
       
       //guardamos cliente en la session
       request.getSession().setAttribute("usuNuevo", usuario);
       request.getSession().setAttribute("contrNueva", contrasena);
       
       response.sendRedirect("nuevoUsuario.jsp");
       
        //instanciamos controladora de la logica
        Controladora controladora = new Controladora();
        
        controladora.crearUsuario(usuario, contrasena);
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
