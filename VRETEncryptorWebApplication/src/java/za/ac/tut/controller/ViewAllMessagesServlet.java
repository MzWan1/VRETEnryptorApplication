/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
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
public class ViewAllMessagesServlet extends HttpServlet {

        
    @EJB private MessagesFacadeLocal mfl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        List<Messages> messageList = mfl.findAll();
        List<String> decryptedList = decryptMessage(messageList);
        
        session.setAttribute("decryptedList", decryptedList);
        request.getRequestDispatcher("view_all_message_outcome.jsp").forward(request, response);
    }

    private List<String> decryptMessage(List<Messages> messageList) {
        List<String> decryptedList = new ArrayList<>();
        
        for (Messages messages : messageList) {
           String cyphertext = messages.getMessage();
           String plaintext = decryptMessage(cyphertext);
           decryptedList.add(plaintext);
        }
        return decryptedList;
    }

    private String decryptMessage(String cyphertext) {
        String plaintext = cyphertext
                .replace('1', 'a')
                .replace('2', 'e')
                .replace('3', 'i')
                .replace('4', 'o')
                .replace('5', 'u');
        
        return plaintext;
    }
}
