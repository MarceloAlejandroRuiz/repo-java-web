<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listdo</title>
</head>
<body>
     <h1>Listado</h1>
	<a href="nuevo.do">Nuevo</a>
	
  <table>
   <tr>
      <td>ID</td>
      <td>NOMBRE</td>
      <td>PRECIO</td>
      <td></td>
      <td></td>
   </tr>   	
	<c:forEach items="${productos}" var="p"> 
	  <tr>
	    <td>${p.id}</td>
	    <td>${p.nombre}</td>
	    <td>${p.precio}</td>
	    <td><a href="editar.html?id="${p.id}>Editar</a>
	    <td><a href="borrar.html?id="${p.id}>Borrar</a>
	  </tr>
	</c:forEach>
  </table>
</body>
</html>