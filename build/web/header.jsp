<%-- 
    Document   : header
    Created on : Feb 16, 2023, 1:24:52 AM
    Author     : 9277d
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="mycss.css">
    </head>
    <body>
        <header>
        <nav>
            <ul>
                <li><a href=""><img src="images/logo.jpg" id="logo"></a></li>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="registration.jsp">Register</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><form action="searchServlet" method="post" class="formsearch">
                        <input type="text" name="txtsearch" placeholder="Search">
                        <select name="searchby">
                            <option value="byname">by name</option>
                            <option value="bycate">by category</option>
                        </select>
                        <input type="submit" name="action" value="search">
                    </form></li>
            </ul>
        </nav>
        </header>
    </body>
</html>
