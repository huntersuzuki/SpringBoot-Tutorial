package com.example.todoapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.todoapp.entities.Task;

@Repository
public interface TaskRepository extends CrudRepository <Task,Integer>{
    
}
