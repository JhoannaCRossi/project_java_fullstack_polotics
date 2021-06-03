
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


@WebServlet(name = "ServletNuevoEmpleado", urlPatterns = {"/ServletNuevoEmpleado"})
public class ServletNuevoEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
       //recupero datos enviados por metodo post
       String idUsuarioEmple = request.getParameter("selectUsuario");      
       Controladora controladora = new Controladora();
       
       Usuario usuario = controladora.buscarUsuario(Integer.parseInt(idUsuarioEmple)); 
       
       String dniEmple = request.getParameter("inputDNIemple");
       String nombreEmple = request.getParameter("inputNombreEmple");
       String apellidoEmple = request.getParameter("inputApellidoEmple");
       String direccionEmple = request.getParameter("inputDireccionEmple");
       String telefonoEmple = request.getParameter("inputTelefonoEmple");
       
       //guardamos cliente en la session
       request.getSession().setAttribute("idUsuarioEmple", idUsuarioEmple);
       request.getSession().setAttribute("selectUsuario", usuario);
       request.getSession().setAttribute("dniEmple", dniEmple);
       request.getSession().setAttribute("nombreEmple", nombreEmple);
       request.getSession().setAttribute("apellidoEmple", apellidoEmple);
       request.getSession().setAttribute("direccionEmple", direccionEmple);
       request.getSession().setAttribute("telefonoEmple", telefonoEmple);
       
       response.sendRedirect("nuevoEmpleado.jsp");
       
        //instanciamos controladora de la logica
        
        controladora.crearEmpleado(usuario, dniEmple, nombreEmple, apellidoEmple, direccionEmple, telefonoEmple);
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
