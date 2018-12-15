<%-- 
    Document   : sumaPagina
    Created on : 15/11/2018, 09:12:23 AM
    Author     : felipehernandez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina para sumar</title>
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <form class="form-horizontal" action="resultados.jsp" method="POST">
            <fieldset>

            <!-- Form Name -->
            <legend>Suma</legend>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="txtNumero1">Numero 1</label>  
              <div class="col-md-5">
                  <input id="txtNumero1" name="txtNumero1" type="number" placeholder="Captura un numero" class="form-control input-md" required="">

              </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="txtNumero2">Numero 2</label>  
              <div class="col-md-5">
              <input id="txtNumero2" name="txtNumero2" type="number" placeholder="Captura un numero" class="form-control input-md" required="">

              </div>
            </div>

            <!-- Button -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="btnSumar"></label>
              <div class="col-md-4">
                  <button id="btnSumar" name="btnSumar" class="btn btn-primary">Sumar</button>
              </div>
            </div>

            </fieldset>
            </form>
        
        <script>
            
            function sumar(){
                
                var resultado  = 0;
                
                var txtNumero1  =  document.getElementById("txtNumero3").value;
                var txtNumero2  =  document.getElementById("txtNumero4").value;
                
                resultado = parseInt(txtNumero1) + parseInt(txtNumero2);
                
                alert("Resultado de la suma es:"+resultado);
                
            }
            
            
        </script>
        
        
    </body>
</html>
