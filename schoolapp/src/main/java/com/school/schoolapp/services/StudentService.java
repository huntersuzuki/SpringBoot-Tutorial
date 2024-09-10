package com.school.schoolapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.schoolapp.entity.StudentEntity;
import com.school.schoolapp.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository sr;
    public void addStudent(StudentEntity s){
        sr.save(s);//Inserting data into table
    }
}
