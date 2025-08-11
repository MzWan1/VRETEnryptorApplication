/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.exception.IsNotDigitException;
import za.ac.tut.exception.NotRequiredLengthException;
import za.ac.tut.exception.UserExistException;
import za.ac.tut.services.ValidateUserIDInterface;

/**
 *
 * @author Student
 */
@WebServlet("/initial")
public class InitializeServelet extends HttpServlet {

    @EJB private ValidateUserIDInterface validateUserid;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        String userid = request.getParameter("userid");
        String username = request.getParameter("username");
        
        try {
            validateUserid.validateUserID(userid);
            
            session.setAttribute("username", username);
            session.setAttribute("userid", userid);
            
            request.getRequestDispatcher("initialize_outcome.jsp").forward(request, response);
            
        } catch (NotRequiredLengthException ex) {
            session.setAttribute("error", "Length Error: " + ex.getMessage());
            request.getRequestDispatcher("not_required_length_exception_outcome.jsp").forward(request, response);
        } catch (IsNotDigitException ex) {
            session.setAttribute("error", "Not Digit Error: " + ex.getMessage());
            request.getRequestDispatcher("is_not_digit_exception_outcome.jsp").forward(request, response);
        } catch (UserExistException ex) {
            session.setAttribute("error", "User Exist Error: " + ex.getMessage());
            request.getRequestDispatcher("user_exist_exception_outcome.jsp").forward(request, response);
        }
    }
}
