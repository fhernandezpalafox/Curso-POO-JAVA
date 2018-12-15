<%-- 
    Document   : primeraPagina
    Created on : 15/11/2018, 08:26:04 AM
    Author     : felipehernandez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
    </head>
    <body>
        
        <%
           String nombre  = "felipe";
        
          int resultado = 2 + 4;

        %>
        <h1>Hello World! <%= nombre%> </h1>
        
        <label>El resultaod de la suma <%= resultado%></label>
        
    </body>
</html>
