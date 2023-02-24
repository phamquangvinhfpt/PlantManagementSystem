<%-- 
    Document   : personalPage
    Created on : Feb 16, 2023, 8:10:29 AM
    Author     : 9277d
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link  rel="stylesheet" href="mycss.css" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = (String) session.getAttribute("name");
            if(name == null) {
        %>
        <p><font color='red'>You must login to view personal page</font></p>
        <p></p>
        <%} else {
        %>
        <header>
            <%@include file="header_loginedUser.jsp"%>
        </header>
        <section>
            <h3>Welcome <%= name%> come back</h3>
            <h3>logout</h3>
        </section>
        <section><!--load all orders in here--></section>
        <footer>
            <%@include file="Footer.jsp" %>
        </footer>
        <%}%>
    </body>
</html>
