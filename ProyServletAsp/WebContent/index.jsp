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
       <% Object o = request.getAttribute("NombreServlet");       
         if( o != null){ %>
	        <h4><% out.println(o.toString());}%></h4>	                
        	       
       <form action="login.do" method="post">
          <p><input type="text" placeholder= "Ingrese el Nombre: " name="firstname" requiered><br></p>
          <p><input type="text" placeholder= "Ingrese el Apellido: " name="lastname" requiered><br></p> 
          <p><input type="mail" placeholder= "Ingrese el Mail: " name="email" requiered><br></p>
          <input type="password" placeholder="ingrese el password: " name="password" required><br>	
		 <input type="submit" value="login" ><br>       
       </form>
    </div>   
</body>
</html>