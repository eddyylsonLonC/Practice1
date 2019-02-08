<%-- 
    Document   : expresiones
    Created on : 7/02/2019, 09:49:14 PM
    Author     : DiazOspina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expresiones</title>
    </head>
    <body>
        <h1>Expresiones</h1>
        
        <p>Convirtiendo una cadena a mayusculas: <%= "Hola Mundo".toUpperCase() %></p>
        <p>25 multiplicado por 4 es igual a <%= 25*4 %></p>
        <p>75 es menor a 69?  <%= 75 < 69 %></p>
    </body>
</html>
