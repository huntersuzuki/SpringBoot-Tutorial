package com.pranay.restapidemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pranay.restapidemo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
    
}
