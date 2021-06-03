
package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import Logica.Empleado;
import Logica.Entrada;
import Logica.Juego;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletEditarEntrada", urlPatterns = {"/ServletEditarEntrada"})
public class ServletEditarEntrada extends HttpServlet {

  
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
        Entrada entrada = controladora.buscarEntrada(Integer.parseInt(id));
        
        HttpSession misession = request.getSession(true);
        misession.setAttribute("entradaEditada", entrada);
        
        response.sendRedirect("editarEntrada.jsp");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String idEntrada = (request.getParameter("inputId"));
        String juegEntrada = (request.getParameter("inputJuego"));
        String clienEntrada = (request.getParameter("inputCliente"));
        String fechaEntrada = (request.getParameter("inputFecha"));
        String horaEntrada = (request.getParameter("inputHora"));
        String observaEntrada = (request.getParameter("inputObservacion"));
        
        Controladora controladora = new Controladora();
        Juego juego = controladora.buscarJuego(Integer.parseInt(juegEntrada));
        Cliente cliente = controladora.buscarCliente(Integer.parseInt(clienEntrada));
        Entrada entrada = controladora.buscarEntrada(Integer.parseInt(idEntrada));
        
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null;

        try {

            fecha = formatoDelTexto.parse(fechaEntrada);
    

        } catch (ParseException ex) {
        }
        
        entrada.setCliente(cliente);
        entrada.setHora(horaEntrada);
        entrada.setUnJuego(juego);
        entrada.setObservacion(observaEntrada);
        
        controladora.editarEntrada(entrada);
        
        response.sendRedirect("listaEntrada.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
