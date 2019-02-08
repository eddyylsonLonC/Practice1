<%-- 
    Document   : objetos
    Created on : 7/02/2019, 10:22:37 PM
    Author     : DiazOspina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Objetos implicitos</title>
    </head>
    <body>
        <h1>Objetos implicitos!</h1>
        
        <p><b>Agente de peticion</b>: <%= request.getHeader("User-Agent") %></p>
        <p><b>Idioma de peticion</b>: <%= request.getLocale() %></p>
    </body>
</html>
