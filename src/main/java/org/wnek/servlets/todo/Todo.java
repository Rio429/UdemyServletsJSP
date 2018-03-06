package org.wnek.servlets.todo;

public class Todo {
	private String todo;

	public Todo(String todo) {
		super();
		this.todo = todo;
	}
	
	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	@Override
	public String toString() {
		return String.format("Todo [name=%s]", todo);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((todo == null) ? 0 : todo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (todo == null) {
			if (other.todo != null)
				return false;
		} else if (!todo.equals(other.todo))
			return false;
		return true;
	}
}
