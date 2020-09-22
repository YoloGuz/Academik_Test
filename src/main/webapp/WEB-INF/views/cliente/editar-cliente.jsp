<%-- 
    Document   : editar-cliente
    Created on : 20/09/2020, 10:53:30
    Author     : reyg6
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Cliente</title>
    </head>
    <body>
        <h1>Editar</h1>
        
        
        <form:form method="post"  
                   action="../editar"
                   modelAttribute="cliente">
            
            <form:label path="codigoCliente">Código:</form:label> 
            <form:input path="codigoCliente" readonly="true"  />
            <br/>

            <form:label path="nit">NIT:</form:label> 
            <form:input path="nit" />
            <form:errors path="nit" />
            <br/>

            <form:label path="nombreCliente">Nombre Cliente:</form:label> 
            <form:input path="nombreCliente" />
            <form:errors path="nombreCliente" />
            <br/>


            <form:label path="direccion">Direccion:</form:label> 
            <form:input path="direccion" />
            <form:errors path="direccion" />
            <br/>
            
            <form:button class="">Guardar</form:button>
        </form:form>
        
    </body>
</html>
