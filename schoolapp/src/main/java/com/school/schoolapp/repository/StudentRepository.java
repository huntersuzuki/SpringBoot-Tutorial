package com.school.schoolapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.school.schoolapp.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity,Integer>{
    
}
