<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div align="center">    
       <h3>Login de usuario</h3>
       
       <form action="login.do" method="get">
          <input type="text" placeholder= "Ingrese el Nombre: " name="firstname" requiered><br>
          <input type="mail" placeholder= "Ingrese el Mail: " name="email" requiered><br>
          <input type="password" placeholder="ingrese el password: " name="password" required><br>
		  
		 <input type="submit" value="login" ><br>       
       </form>
    
    </dir>   
</body>
</html>