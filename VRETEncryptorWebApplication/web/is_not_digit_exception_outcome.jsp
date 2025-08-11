<%-- 
    Document   : is_not_digit_exception_outcome
    Created on : 11 Aug 2025, 09:28:17
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Is Not Digit Exception Page</title>
    </head>
    <body>
        <h1>Is Not Digit Exception</h1>
        <%
            String error = (String) session.getAttribute("error");
        %>
        <p><%=error%></p>
        <ol>
            <li><a href="initialize.html">Initialize User</a></li>
            <li><a href="LogoutServlet.do">Logout</a></li>
        </ol>
    </body>
</html>
