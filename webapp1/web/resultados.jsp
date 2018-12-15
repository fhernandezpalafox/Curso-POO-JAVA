<%-- 
    Document   : resultados
    Created on : 15/11/2018, 09:50:04 AM
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
            //JAVA BACKEND
            int resultado = 0;
            
            if(request.getParameter("txtNumero1")!=null  ||  request.getParameter("txtNumero2") !=  null){
                
                resultado  =  Integer.parseInt(request.getParameter("txtNumero1"))  
                              + Integer.parseInt(request.getParameter("txtNumero2")) ;
                
            }
        %>
        
        <h1>El resultado es <%=  resultado%></h1>
    </body>
</html>
