package org.wnek.servlets.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wnek.servlets.todo.TodoService;

@WebServlet(urlPatterns = "/delete-todo")
public class TodoDeleteServlet extends HttpServlet {
	
	private TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String todoToDelete = request.getParameter("deleteTodo");
		todoService.remove(new Todo(todoToDelete));
		
		response.sendRedirect("/todo");
	}
}
