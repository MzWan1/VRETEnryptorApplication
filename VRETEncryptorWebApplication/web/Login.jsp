<%-- 
    Document   : Login
    Created on : 11 Aug 2025, 09:40:23
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Please provide your login credentials below</h1>
        <form action="j_security_check" method="POST">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input required="" name="j_username" type="text" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input required="" name="j_password" type="text" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input value="LOGIN" type="submit" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
