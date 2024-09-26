package com.example.todoapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoapp.entities.Task;
import com.example.todoapp.repositories.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public Task geTask(){
        Task task = new Task();
        task.setTaskName("Learn Java");
        task.setTaskStatus("Started");
        task.setTaskDesription("Started the first chapter of Java");
        taskRepository.save(task);
        return task;
    }
}
