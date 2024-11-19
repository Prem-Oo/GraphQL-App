package com.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.graphql.model.Task;
import com.graphql.repository.TaskRepository;

@Controller
public class TaskMutationResolver {

	@Autowired
	private TaskRepository taskRepository;

	@MutationMapping
	public Task createTask(@Argument String title, @Argument String description) {
		Task task = new Task();
		task.setTitle(title);
		task.setDescription(description);
		task.setCompleted(false);
		return taskRepository.save(task);
	}

	@MutationMapping
	public Task updateTask(@Argument Long id,@Argument boolean completed) {
		Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
		task.setCompleted(completed);
		return taskRepository.save(task);
	}

	@MutationMapping
	public boolean deleteTask(@Argument Long id) {
		taskRepository.deleteById(id);
		return true;
	}

}
