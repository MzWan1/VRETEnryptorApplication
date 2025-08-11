/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.MessagesFacadeLocal;

/**
 *
 * @author Student
 */
public class ViewLongestMessage extends HttpServlet {
        
    @EJB private MessagesFacadeLocal mfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String longestMessageDetails = mfl.viewLongestMessage();
        
        session.setAttribute("longestMessageDetails",longestMessageDetails);
        
        request.getRequestDispatcher("view_longest_message_outcome.jsp").forward(request, response);
    }
}
