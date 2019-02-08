<%-- 
    Document   : Operations
    Created on : 8/02/2019, 11:04:28 AM
    Author     : edilson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="operations.Operations" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practice 1</title>
    </head>
    <body>
        <style>
            body{
                background: #c8f2c6;
            }
            .answer{
                background: #65a7cbb3;
                width: 50%;
                
                text-align: center;
                color: #5832c280;
                border-radius: 20px 20px 20px 20px;
                box-shadow: 10px 10px 10px #000;
            }
            h1{
                 font-family: "Times New Roman", Times, serif;
                 color: #23a496;
            }
            
            
        </style>
        
       
        
        <div class="answer"> 
             <h1>Hi ${param.name}</h1>
            <h2> the answer is :   </h2>
            
            <p>
                <strong>${param.num1} + ${param.num2}  =  </strong> <%= Operations.add( request.getParameter("num1"),request.getParameter("num2")) %><br>
                <strong>${param.num1} - ${param.num2}  =  : </strong>     <%= Operations.substract(request.getParameter("num1"),request.getParameter("num2") )%><br><br>
                     <strong>${param.num1} * ${param.num2}  =  : </strong> <%= Operations.multiply(request.getParameter("num1"),request.getParameter("num2") )%><br><br>
                       <strong>${param.num1} % ${param.num2}  =  </strong> <%= Operations.module(request.getParameter("num1"),request.getParameter("num2") )%><br><br>
                       <strong>${param.num1} / ${param.num2}  =  </strong>   <%= Operations.divide(request.getParameter("num1"),request.getParameter("num2") )%><br><br>
                    
            </p>
            
            
        </div>
    </body>
</html>
