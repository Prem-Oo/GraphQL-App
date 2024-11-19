package com.graphql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.model.Task;
import com.graphql.repository.TaskRepository;

@Controller
public class TaskQueryResolver {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@QueryMapping public List<Task> tasks() { 
		return taskRepository.findAll();
	} 
	
	@QueryMapping public Task taskById(@Argument Long id) { 
		return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Record with id: "+id +" Not Found"));
	}
}
