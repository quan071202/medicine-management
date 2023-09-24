/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.CheckEmail;
import Dao.DAO;
import Entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "AddTK1Controll", urlPatterns = {"/addtk1"})
public class AddTK1Controll extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String pass = request.getParameter("psw");
        String pass1 = request.getParameter("psw-repeat");
        int maCH = Integer.parseInt(request.getParameter("maCH"));
        DAO dao = new DAO();
         HttpSession session = request.getSession();
     User a = (User)  session.getAttribute("acc");
        CheckEmail c = new CheckEmail();
        if(!pass.equals(pass1)){
            request.setAttribute("mess1", "Nhap lai mat khau chua chinh xac!");
            request.getRequestDispatcher("TaoTK.jsp").forward(request, response);
        }
        else if(!c.validate(email)){
              request.setAttribute("mess1", "Email chua dung dinh dang !");
            request.getRequestDispatcher("TaoTK.jsp").forward(request, response);
        }
        else if(!dao.checkaddU(name)){
             request.setAttribute("mess1", "Tai khoan da ton tai!");
              request.getRequestDispatcher("TaoTK.jsp").forward(request, response);
        }
        else if(!dao.checkaddG(email)){
             request.setAttribute("mess1", "Email da ton tai!");
              request.getRequestDispatcher("TaoTK.jsp").forward(request, response);
        }
        else if(maCH <1 || maCH>5){
             request.setAttribute("mess1", "Ma cua hang sai");
              request.getRequestDispatcher("TaoTK.jsp").forward(request, response);
        }
        else if(request.getParameter("admin")== null){
            dao.insertUser1(name, pass, email, 3, maCH);
            response.sendRedirect("quanlytaikhoan");
        }
        else{
             dao.insertUser1(name, pass, email, 2, maCH);
            response.sendRedirect("quanlytaikhoan");
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
