/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package RutinaCliente;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cliente;
import logica.Rutina;
import logica.RutinaFuerza;
import logica.RutinaMasa;
import logica.RutinaPeso;
/**
 *
 * @author yerky vargas
 */
@WebServlet(name = "RutinaCliente", urlPatterns = {"/RutinaCliente"})
public class RutinaCliente extends HttpServlet {
    
    public static Rutina rut;
    public static void liskov(Rutina r) {
        r.crearRutina();
        rut=r;
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        Cliente cliente=new Cliente();
        cliente.setNombre(request.getParameter("nombre"));
        cliente.setPeso(request.getParameter("peso"));
        cliente.setAltura(request.getParameter("altura"));
        cliente.setEdad(request.getParameter("edad"));
        response.setContentType("text/html;charset=UTF-8");
        
       
            switch (request.getParameter("objetivo")) {
                case "1":
                    RutinaMasa rutinaMasa= new RutinaMasa();
                    liskov(rutinaMasa);
                    break;
                case "2":
                    RutinaPeso rutinaPeso= new RutinaPeso();
                    liskov(rutinaPeso);
                    break;
                case "3":
                    RutinaFuerza rutinaFuerza= new RutinaFuerza();
                    liskov(rutinaFuerza);
                    break;
                default:
                    break;
            }
            
         switch (request.getParameter("dias")) {
                case "1":
                    rut.getRutina();
                    break;
                case "2":
                    rut.getRutina();
                    break;
                case "3":
                    rut.getRutina();
                    break;
                case "4":
                    rut.getRutina();
                    break;
                case "5":
                    rut.getRutina();
                    break;
                case "6":
                    rut.getRutina();
                    break;
                case "7":
                    rut.getRutina();
                    break;
                default:
                    break;
            }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link href=\"CSS.css\" rel=\"stylesheet\" type=\"text/css\">");
            out.println("<title>Servlet RutinaCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Estos son tus datos: " +  "</h1>");
            out.println("<h1>Nombre: " +  cliente.getNombre()+ "</h1>");
            out.println("<h1>Peso: " +  cliente.getPeso()+ " kilos</h1>");
            out.println("<h1>Altura: " +  cliente.getAltura()+ " centimetros</h1>");
            out.println("<h1>Edad: " +  cliente.getEdad()+ " años</h1>");
            out.println("<h1>Vas a entrenar por: " +  cliente.getDias()+ " dias</h1>");
            out.println("<h1>Esta es tu rutina: " +  rut.getRutina() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
