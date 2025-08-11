<%-- 
    Document   : initialize_outcome
    Created on : 11 Aug 2025, 09:50:44
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Initialize Outcome Page</title>
    </head>
    <body>
        <h1>Initialize Outcome</h1>
        <%
            String username = (String)session.getAttribute("username");
            String compname = application.getInitParameter("compname");
        %>
        <p>Hi <b><%=username%></b> my name is <b><%=compname%> select option below</b></p>
        <ol>
            <li><a href="encrypt_message.html">Encrypt Message</a></li>
            <li><a href="ViewAllMessagesServlet.do">View All Messages</a></li>
            <li><a href="ViewLongestMessage.do">View Longest Message</a></li>
            <li><a href="LogoutServlet.do">Logout</a></li>
        </ol>
    </body>
</html>
