
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //traigo datos del formulario login
        String usua = request.getParameter("usuario");
        String contra = request.getParameter("contrasenia");
        
        //bandera para verificacion
        boolean estaONO = false;
        
        //instanciamos el control
        Controladora control = new Controladora();
        
        //comprobamos si existe el usuario ingresado
        estaONO = control.comprobarIngreso(usua, contra);
        System.out.println(estaONO);
        //acciones si esta o no
        if(estaONO == true){
            //verifico que existe una session
            HttpSession misession = request.getSession(true);
            misession.setAttribute("usuario", usua);
            misession.setAttribute("contrasenia", contra);
            
            response.sendRedirect("index.jsp");
        }else{
            response.sendRedirect("errorLogin.jsp");
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
