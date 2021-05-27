
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletEditarUsuario", urlPatterns = {"/ServletEditarUsuario"})
public class ServletEditarUsuario extends HttpServlet {

 
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
        Usuario usuario = controladora.buscarUsuario(Integer.parseInt(id));
        
        HttpSession misession = request.getSession(true);
        misession.setAttribute("usuario", usuario);
        
        response.sendRedirect("editarUsuario.jsp");
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
          
        String id = (request.getParameter("inputId"));
        String usuario = (request.getParameter("inputUsuario"));
        String contrasenia = (request.getParameter("inputContrasenia"));
        
        
        Controladora controladora = new Controladora();
        Usuario usu = controladora.buscarUsuario(Integer.parseInt(id));

      
        usu.setNombreUsuario(usuario);
        usu.setContraseniaUsuario(contrasenia);
        
        controladora.editarUsuario(usu);
        
        response.sendRedirect("listaUsuario.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
