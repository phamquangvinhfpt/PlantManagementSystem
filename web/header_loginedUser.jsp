<%-- 
    Document   : header_loginedUser
    Created on : Feb 16, 2023, 8:10:51 AM
    Author     : 9277d
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="mycss.css">
        <title>JSP Page</title>
    </head>
    <body>
        <nav>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="">change profile</a></li>
                <li><a href="">completed orders</a></li>
                <li><a href="">Canceled orders</a></li>
                <li><a href="">processing orders</a></li>
                <li>from<input type="date" name="from" /> to <input type="date" name="to" />
                    <input type="submit" value="search">
                </li>
            </ul>
        </nav>
    </body>
</html>
