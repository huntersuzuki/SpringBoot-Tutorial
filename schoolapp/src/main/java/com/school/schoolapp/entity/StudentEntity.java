package com.school.schoolapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int roll;
    private float marks;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public float getMarks(){
        return marks;
    }
    public void setMarks(float marks){
        this.marks= marks;
    }
}
