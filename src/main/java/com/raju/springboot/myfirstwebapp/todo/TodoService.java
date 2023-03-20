package com.raju.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	private static int cnt = 1;
	static {
		todos.add(new Todo(cnt++, "raju", "Learn Spring", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(cnt++, "raju", "Learn React Js", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(cnt++, "raju", "Learn Problem Solving", LocalDate.now().plusYears(1), false));
		
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(cnt++, username, description, targetDate, done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
}
 