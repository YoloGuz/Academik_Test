<%-- 
    Document   : crear-cliente-2
    Created on : 19/09/2020, 20:36:10
    Author     : reyg6
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../../../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Crear</title>
    </head>
    <body>
           <h1>Crear Clientes</h1>
        
    <c:out>${mensaje}</c:out>
        <form:form method="post" 
                   action="${pageContext.servletContext.contextPath}/cliente/crear" 
                   modelAttribute="cliente">

            
            <form:label path="codigoCliente">Código:</form:label> 
            <form:input path="codigoCliente"  />
            <form:errors path="codigoCliente" />
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
            <a href="http://localhost:8080/Academik_test/">Menu</a>
    </body>
</html>
