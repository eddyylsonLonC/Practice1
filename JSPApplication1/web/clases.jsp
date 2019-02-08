<%-- 
    Document   : clases
    Created on : 7/02/2019, 10:10:54 PM
    Author     : DiazOspina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="co.edu.utp.isc.prog.ManejoCadenas" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clases</title>
    </head>
    <body>
        <h1>Uso de Clases</h1>
        
        <p><b>"Hola Mundo" en mayusculas</b>: <%= ManejoCadenas.pasarAMayusculas("Hola Mundo")%></p>
        <p><b>"Hola Mundo" en minusculas</b>: <%= ManejoCadenas.pasarAMinusculas("Hola Mundo")%></p>
    </body>
</html>
