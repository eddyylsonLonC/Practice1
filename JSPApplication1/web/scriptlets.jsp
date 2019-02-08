<%-- 
    Document   : scriptlets
    Created on : 7/02/2019, 09:58:00 PM
    Author     : DiazOspina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scriptlets</title>
    </head>
    <body>
        <h1>Sentencias de codigo</h1>

        <%
            for (int i = 1; i <= 5; i++) {
                out.println("<br/>Yo amo el codigo: " + i);
            }
        %>
    </body>
</html>
