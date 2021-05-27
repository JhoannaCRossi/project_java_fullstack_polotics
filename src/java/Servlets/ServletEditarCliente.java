
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletEditarCliente", urlPatterns = {"/ServletEditarCliente"})
public class ServletEditarCliente extends HttpServlet {

  
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
        Cliente cliente = controladora.buscarCliente(Integer.parseInt(id));
        
        HttpSession misession = request.getSession(true);
        misession.setAttribute("cliente", cliente);
        
        response.sendRedirect("editarCliente.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String id = (request.getParameter("inputId"));
        String dni = (request.getParameter("inputDNI"));
        String nombre = (request.getParameter("inputNombre"));
        String apellido = (request.getParameter("inputApellido"));
        String direccion = (request.getParameter("inputDireccion"));
        String telefono = (request.getParameter("inputTelefono"));
        
        Controladora controladora = new Controladora();
        Cliente cliente = controladora.buscarCliente(Integer.parseInt(id));

        cliente.setDni(dni);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        
        controladora.editarCliente(cliente);
        
        response.sendRedirect("listaCliente.jsp");
        
    }
 
 
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
