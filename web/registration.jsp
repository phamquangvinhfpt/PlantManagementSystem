<%-- 
    Document   : registration
    Created on : Feb 16, 2023, 1:40:37 AM
    Author     : 9277d
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <%@include file="header.jsp" %>
        </header>
        <section>
            <form action="mainController" method="post" class="formregister">
                <h1>Register</h1>
                <table>
                    <tr>
                        <td>email</td>
                        <td><input type="text" name="txtemail" required=""></td>
                    </tr>
                    <tr>
                        <td>full name</td>
                        <td><input type="text" name="txtfullname" required=""></td>
                    </tr>
                    <tr>
                        <td>password</td>
                        <td><input type="password" name="txtpassword" required=""></td>
                    </tr>
                    <tr>
                        <td>phone</td>
                        <td><input type="text" name="txtphone"></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="register" name="action">
                        </td>
                    </tr>
                </table>
            </form>
        </section>
        <footer>
            <%@include file="Footer.jsp" %>
        </footer>
    </body>
</html>
