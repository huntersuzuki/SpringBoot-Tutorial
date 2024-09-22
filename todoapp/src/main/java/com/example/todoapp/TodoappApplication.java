package com.example.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.todoapp.entities.Task;
import com.example.todoapp.repositories.TaskRepository;

@SpringBootApplication
public class TodoappApplication {

	private TaskRepository taskRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);

	}

	public void run(String... args) throws Exception {
		Task task = new Task();
		task.setTaskName("Learn Java");
		task.setTaskStatus("Started");
		task.setTaskDesription("Started the first chapter of Java");
		taskRepository.save(task);
	}

}
