<%-- 
    Document   : respuesta
    Created on : 7/02/2019, 10:53:31 PM
    Author     : DiazOspina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmacion de Registro</title>
    </head>
    <body>
        <p>El estudiante esta confirmado: ${param.firstName} ${param.lastName}</p>
        <p>El pais del estudiante es: ${param.country}</p>
    </body>
</html>
