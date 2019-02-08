<%-- 
    Document   : hello
    Created on : 7/02/2019, 09:45:02 PM
    Author     : DiazOspina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludo</title>
    </head>
    <body>
        <h3>Hola Mundo!!</h3>
        
        <p>La hora del servidor es: <%= java.text.DateFormat.getDateTimeInstance().format(new java.util.Date()) %></p>
    </body>
</html>
