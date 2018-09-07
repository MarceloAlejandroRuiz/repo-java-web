<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <h2>Ver producto</h2>

	<a href="listar.html">Listar</a>
	<table>
		<tr>
			<td>Nombre</td>
			<td>${producto.id}</td>
		</tr>
		<tr>
			<td>Precio</td>
			<td>${producto.nombre}</td>
		</tr>
		<tr>
			<td>Precio</td>
			<td>${producto.precio}</td>
		</tr>
		
	</table>
</body>
</html>