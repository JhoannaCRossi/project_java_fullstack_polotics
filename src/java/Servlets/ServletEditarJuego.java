
package Servlets;

import Logica.Controladora;
import Logica.Empleado;
import Logica.Horario;
import Logica.Juego;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletEditarJuego", urlPatterns = {"/ServletEditarJuego"})
public class ServletEditarJuego extends HttpServlet {

  
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
        Juego juego = controladora.buscarJuego(Integer.parseInt(id));
        
        HttpSession misession = request.getSession(true);
        misession.setAttribute("juego", juego);
        
        response.sendRedirect("editarJuego.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String idJuegoe = (request.getParameter("inputId"));
        String idHorario = (request.getParameter("inputIdHorario"));
        String nombreJuego = (request.getParameter("inputNombreJuego"));
        String aperturaJuego = (request.getParameter("inputHorarioApertura"));
        String cierreJuego = (request.getParameter("inputHorarioCierre"));
        
        Controladora controladora = new Controladora();
        Juego juego = controladora.buscarJuego(Integer.parseInt(idJuegoe));
        Horario horario = controladora.buscarHorario(Integer.parseInt(idHorario));
     
        juego.setNombre(nombreJuego);
        
        
        controladora.editarHorario(horario);
        controladora.editarJuego(juego);
        
        response.sendRedirect("listaJuego.jsp");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
