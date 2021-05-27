
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletNuevoCliente", urlPatterns = {"/ServletNuevoCliente"})
public class ServletNuevoCliente extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    
       //recupero datos enviados por metodo post
       String dni = request.getParameter("inputDNI");
       String nombre = request.getParameter("inputNombre");
       String apellido = request.getParameter("inputApellido");
       String direccion = request.getParameter("inputDireccion");
       String telefono = request.getParameter("inputTelefono");
       
       //guardamos cliente en la session
       request.getSession().setAttribute("dni", dni);
       request.getSession().setAttribute("nombre", nombre);
       request.getSession().setAttribute("apellido", apellido);
       request.getSession().setAttribute("direccion", direccion);
       request.getSession().setAttribute("telefono", telefono);
       
       response.sendRedirect("nuevoCliente.jsp");
       
        //instanciamos controladora de la logica
        Controladora controladora = new Controladora();
        
        controladora.crearCliente(dni, nombre, apellido, direccion, telefono);
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
