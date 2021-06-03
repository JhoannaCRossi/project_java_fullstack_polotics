
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletEliminarUsuario", urlPatterns = {"/ServletEliminarUsuario"})
public class ServletEliminarUsuario extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        //recupero el id pasado por parametro
        String id = request.getParameter("id");
        
        //invoco a la controladora de la logica
        Controladora controladora = new Controladora();
        controladora.borrarUsuario(Integer.parseInt(id));
        
        //redirecciono si es exitosa la operación
        response.sendRedirect("listaUsuario.jsp");
    }



  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
