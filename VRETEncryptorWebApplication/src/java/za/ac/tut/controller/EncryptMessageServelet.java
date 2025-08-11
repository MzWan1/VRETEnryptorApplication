/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.MessagesFacadeLocal;
import za.ac.tut.ejb.model.Messages;

/**
 *
 * @author Student
 */
@WebServlet("/encrypt")
public class EncryptMessageServelet extends HttpServlet {

        
    @EJB private MessagesFacadeLocal mfl;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String userid = (String) session.getAttribute("userid");
        String plaintext = request.getParameter("plaintext").toLowerCase();
        
        Date datecreated = new Date();
        Integer messagelen = plaintext.length();
        String cyphertext = encryptUserId(plaintext);
        
        
        Messages message = new Messages(cyphertext, messagelen, userid, datecreated);
        mfl.create(message);
        
        request.getRequestDispatcher("encrypt_message_outcome.jsp").forward(request, response);
    }

    private String encryptUserId(String plaintext) {
        String cyphertext = plaintext
                .replace('a', '1')
                .replace('e', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('u', '5');
        
        return cyphertext;
    }
}
