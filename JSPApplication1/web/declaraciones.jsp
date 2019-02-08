<%-- 
    Document   : declaraciones
    Created on : 7/02/2019, 10:07:04 PM
    Author     : DiazOspina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones</title>
    </head>
    <body>
        <h1>Declaraciones!</h1>

        <%!
            String pasarAMinusculas(String cadena) {
                return cadena.toLowerCase();
            }
        %>

        <p><b>"Hola Mundo" en minusculas</b>: <%= pasarAMinusculas("Hola Mundo")%></p>

    </body>
</html>
