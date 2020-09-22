<%-- 
    Document   : index
    Created on : 19/09/2020, 17:48:38
    Author     : reyg6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="../../../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <style>
            table {
                font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
            }

            td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
            }

            tr:nth-child(even) {
            background-color: LightGreen;
            }
            </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main</title>
    </head>
    <body>
        <script src="js/jquery-3.5.1.min"></script>
        <script src="js/bootstrap.min"></script>
        
        <h2><header>Bienvenidos a pagina principal!</header></h2>
                    
        <h2><a href="cliente">Crear cliente</a></h2>
             
            <table border='3'>
            <thead>
              
                <tr>
            
                    <th>Estado</th>
                    <th>Código Cliente</th>
                    <th>NIT</th>
                    <th>Nombre Cliente</th>
                    <th>Direccion</th>
                    <th>Estatus</th>
                    <th colspan="2">Opciones</th>
            
                </tr>
            </thead>
                            
            <tbody>
            
                <c:forEach items="${List}" var="cliente">
                   
                    <c:if  test="${cliente.status == 'true'}">
                    <tr>   
                        <td><h4>Cliente Activo</h4></td>
                        <td>${cliente.codigoCliente}</td> 
                        <td>${cliente.nit}</td> 
                        <td>${cliente.nombreCliente}</td> 
                        <td>${cliente.direccion}</td>
                        <td><a href="cliente/codigo/${cliente.codigoCliente}">Modificar Cliente</a></td> 
                        <td><a href="cliente/eliminar/${cliente.codigoCliente}">Cambiar Estado[Eliminar]</a></td> 
                    
                    </tr>
                    </c:if>
                    
                </c:forEach>
 
                <c:forEach items="${List}" var="cliente">
                    
                    <c:if test="${cliente.status == 'false'}" >
                    <tr>
                        <td><h4>Clientes inactivos</h4></td>
                        <td>${cliente.codigoCliente}</td> 
                        <td>${cliente.nit}</td> 
                        <td>${cliente.nombreCliente}</td> 
                        <td>${cliente.direccion}</td>
                        <td><a href="cliente/codigo/${cliente.codigoCliente}">Modificar Cliente</a></td> 
                        <td><a href="cliente/eliminar/${cliente.codigoCliente}">Cambiar Estado[Eliminar]</a></td> 
                    </tr>
                    </c:if>
                    
                </c:forEach>
                    
            </table>
    </body>
</html>