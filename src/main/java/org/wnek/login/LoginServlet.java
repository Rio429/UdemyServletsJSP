package org.wnek.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wnek.servlets.todo.TodoService;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	
	private LoginService loginValidationService = new LoginService();
	private TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/views/Login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(loginValidationService.isValid(userName, password)) {
			request.getSession().setAttribute("name", userName);
			response.sendRedirect("/todo");
		} else {
			request.setAttribute("errorMessage", "Invalid Credentials");
			request.getRequestDispatcher("WEB-INF/views/Login.jsp").forward(request, response);
		}
		
	}

}
