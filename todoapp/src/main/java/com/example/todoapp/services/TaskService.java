package com.example.todoapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoapp.entities.Task;
import com.example.todoapp.repositories.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    //
    public Iterable<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public void saveTask(Task task) {
        taskRepository.save(task);
    }

    public Task getTask(int id) {
        return taskRepository.findById(id).get();
    }

    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }

    public void updateTask(Task task){
        taskRepository.save(task);
    }
}
