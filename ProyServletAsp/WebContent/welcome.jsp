<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="ar.com.model.User"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <% User u = (User)request.getAttribute("user");  %>

     <ul>
		  <li><% out.println(u.getEmail());     %></li>
		  <li><% out.println(u.getFirstName()); %></li>
		  <li><% out.println(u.getLastName());  %></li>
		  <li><% out.println(u.getPassword());  %> </li>
	 </ul>      
</body>
</html>