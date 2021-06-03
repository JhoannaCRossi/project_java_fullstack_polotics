package Servlets;

import Logica.Cliente;
import Logica.Controladora;
import Logica.Juego;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletNuevaEntrada", urlPatterns = {"/ServletNuevaEntrada"})
public class ServletNuevaEntrada extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);

        //recupero datos enviados por metodo post
        String idClienteEntrada = request.getParameter("selectCliente");
        String idJuegoEntrada = request.getParameter("selectJuego");
        Controladora controladora = new Controladora();

        Juego juegoEntrada = controladora.buscarJuego(Integer.parseInt(idJuegoEntrada));
        Cliente clienteEntrada = controladora.buscarCliente(Integer.parseInt(idClienteEntrada));

       
        String fechaEntrada = request.getParameter("inputFecha");
        String observacion = request.getParameter("inputObservacion");
        String horaEntrada = request.getParameter("inputHoraEntrada");
        
        int hora = Integer.parseInt(horaEntrada);
        int horaAperturaJuego = Integer.parseInt(juegoEntrada.getUnHorario().getHorarioApertura());
        int horaCierreJuego = Integer.parseInt(juegoEntrada.getUnHorario().getHorarioCierre());
        
        if(hora >= horaAperturaJuego && hora <= horaCierreJuego){
            
            //guardamos cliente en la session
            request.getSession().setAttribute("fechaEntrada", fechaEntrada);
            request.getSession().setAttribute("horaEntrada", horaEntrada);
            request.getSession().setAttribute("observacion", observacion);
            request.getSession().setAttribute("juegoEntrada", juegoEntrada);
            request.getSession().setAttribute("clienteEntrada", clienteEntrada);

            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = null;

            try {

                fecha = formatoDelTexto.parse(fechaEntrada);


            } catch (ParseException ex) {
            }

            response.sendRedirect("nuevaEntrada.jsp");

            //instanciamos controladora de la logica
            controladora.crearEntrada(fecha, horaEntrada, observacion, juegoEntrada, clienteEntrada);
        }else{
            
            response.sendRedirect("fueraDeHorario.jsp");
            
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
