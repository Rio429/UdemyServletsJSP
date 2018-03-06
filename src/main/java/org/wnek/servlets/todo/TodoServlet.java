package org.wnek.servlets.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wnek.servlets.todo.TodoService;

@WebServlet(urlPatterns = "/todo")
public class TodoServlet extends HttpServlet {
	
	private TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("todos", todoService.getTodos());
		request.getRequestDispatcher("WEB-INF/views/Todo.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String newTodo = request.getParameter("newTodo");
		todoService.addNewTodo(newTodo);
		
		response.sendRedirect("/todo");
	}
}
