<%-- 
    Document   : view_all_message_outcome
    Created on : 11 Aug 2025, 11:21:53
    Author     : Student
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All Messages Page</title>
    </head>
    <body>
        <h1>View All Messages Outcome</h1>
        <%
            List<String> decryptedList = (List<String>) session.getAttribute("decryptedList");
        %>
        <table>
            <tr>Decrypted Messages</tr>
            
            <%
                for (String message : decryptedList) {
                        
            %>
            <td><%=message%></td>
            <%
                }
            %>    
        </table>
        <ol>
            <li><a href="LogoutServlet.do">Logout</a></li>
        </ol>
    </body>
</html>
