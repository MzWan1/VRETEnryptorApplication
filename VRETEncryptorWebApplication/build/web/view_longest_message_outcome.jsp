<%-- 
    Document   : view_longest_message_outcome
    Created on : 11 Aug 2025, 11:36:01
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Longest Message Page</title>
    </head>
    <body>
        <h1>View Longest Message</h1>
        <%
            String longestMessageDetails = (String) session.getAttribute("longestMessageDetails");
        %>
        <p>
            <%=longestMessageDetails%>
        </p>
        <ol>
            <li><a href="encrypt_message.html">Encrypt Message</a></li>
            <li><a href="LogoutServlet.do">Logout</a></li>
        </ol>
    </body>
</html>
