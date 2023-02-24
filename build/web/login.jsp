<%-- 
    Document   : login
    Created on : Feb 16, 2023, 1:38:25 AM
    Author     : 9277d
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        section {
            width: 80%;
            margin: auto;
            margin-top: 50px;
        }
        .login-form {
            width: 40%;
            margin: auto;
            padding: 10px;
            background-color: #f5f5f5;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        .login-form table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 10px;
        }

        .login-form td {
            padding: 10px;
        }

        .login-form input[type="text"],
        .login-form input[type="password"] {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            width: 100%;
            box-sizing: border-box;
        }

        .login-form input[type="submit"] {
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            width: 100%;
            box-sizing: border-box;
        }

        .login-form input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
    <body>
        <header>
            <%@include file="header.jsp" %>
        </header>
        <section>
            <form action="mainController" method="post" class="login-form">
                <table>
                    <tr>
                        <td>email</td>
                        <td><input type="text" name="txtemail"></td>
                    </tr>
                    <tr>
                        <td>password</td>
                        <td><input type="password" name="txtpassword"></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="login" name="action">
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
