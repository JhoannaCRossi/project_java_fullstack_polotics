
package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import Logica.Horario;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletNuevoJuego", urlPatterns = {"/ServletNuevoJuego"})
public class ServletNuevoJuego extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
    }

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
          
       //recupero datos enviados por metodo post
       String idEmpleJuego = request.getParameter("selectEmpleado");      
       String idHorarioJuego = request.getParameter("selectHorario");      
       String nombreJuego = request.getParameter("inputNombre");
       
       Controladora controladora = new Controladora();
       
       Empleado empleado = controladora.buscarEmpleado(Integer.parseInt(idEmpleJuego)); 
       Horario horario = controladora.buscarHorario(Integer.parseInt(idHorarioJuego));
       
       
       
       //guardamos cliente en la session
       request.getSession().setAttribute("horarioJuego", horario);
       request.getSession().setAttribute("nombreJuego", nombreJuego);
       request.getSession().setAttribute("empleadoJuego", empleado);
       request.getSession().setAttribute("idEmpleadoJuego", idEmpleJuego);
       
      
       response.sendRedirect("nuevoJuego.jsp");
       
        //instanciamos controladora de la logica
        
        controladora.crearJuego(nombreJuego, idHorarioJuego, idEmpleJuego);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
