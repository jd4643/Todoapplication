package com.demo.controller;
// creating APIs for CRUDS operation 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Todo;
import com.demo.service.TodoService;

@RestController
public class TodoController {
	@Autowired
	private TodoService todoservice;

	@GetMapping("/users/{name}/todos")
	public List<Todo> retrieveTodos(@PathVariable String name) {
		return todoservice.retrieveTodos(name);

	}

	@GetMapping("/users/{name}/todos/{id}")
	public Todo retrieveTodo(@PathVariable String name, @PathVariable int id) {
		return todoservice.retrieveTodo(id);

	}

}
