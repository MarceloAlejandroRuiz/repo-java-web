package ar.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.model.User;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		User u = new User(request.getParameter("firstname"), request.getParameter("lastname"),
				request.getParameter("email"), request.getParameter("password"));

		if (u.getPassword().equals("123")) {
			out.println("ok");
			
			request.setAttribute("user", u);
			RequestDispatcher dis = request.getRequestDispatcher("welcome.jsp");
			dis.forward(request, response);
		}else {
			response.sendRedirect("register.jsp");
		}			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
