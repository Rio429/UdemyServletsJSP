package org.wnek.servlets.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	
	static {
	todos.add(new Todo("Learn Web App developlment"));
	todos.add(new Todo("Learn Spring MVC"));
	todos.add(new Todo("Learn Spring Rest Services"));
	}
	
	public void addNewTodo(String todo) {
		todos.add(new Todo(todo));
	}
	
	public void remove(Todo todo) {
		todos.remove(todo);
		
	}
	
	public List<Todo> getTodos() {
		return todos;
	}
}
