
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import Logica.Empleado;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletEditarEmpleado", urlPatterns = {"/ServletEditarEmpleado"})
public class ServletEditarEmpleado extends HttpServlet {

   
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
        Empleado empleado = controladora.buscarEmpleado(Integer.parseInt(id));
        
        HttpSession misession = request.getSession(true);
        misession.setAttribute("empleado", empleado);
        
        response.sendRedirect("editarEmpleado.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
          
        String idEmple = (request.getParameter("inputId"));
        String idUsuEmple = (request.getParameter("inputUsuario"));
        String dniEmple = (request.getParameter("inputDNI"));
        String nombreEmple = (request.getParameter("inputNombre"));
        String apellidoEmple = (request.getParameter("inputApellido"));
        String direccionEmple = (request.getParameter("inputDireccion"));
        String telefonoEmple = (request.getParameter("inputTelefono"));
        
        Controladora controladora = new Controladora();
        Empleado emp = controladora.buscarEmpleado(Integer.parseInt(idEmple));
        Usuario usu = controladora.buscarUsuario(Integer.parseInt(idUsuEmple));
       
        emp.setUnUsuario(usu);
        emp.setDni(dniEmple);
        emp.setNombre(nombreEmple);
        emp.setApellido(apellidoEmple);
        emp.setDireccion(direccionEmple);
        emp.setTelefono(telefonoEmple);
        
        controladora.editarEmpleado(emp);
        
        response.sendRedirect("listaEmpleado.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
