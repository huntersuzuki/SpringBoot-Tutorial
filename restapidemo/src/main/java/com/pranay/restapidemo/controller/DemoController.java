package com.pranay.restapidemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
class Student{
    private int id;
    private String studentName;
    private double marks;
}

@RestController
public class DemoController {
    @RequestMapping("/name")
    public String getName(){
        return "pranay";
    }

    @RequestMapping("/age")
    public Integer getAge(){
        return 10;
    }

    @RequestMapping("/student")
    public Student getStudent(){
        Student s = new Student();
        s.setId(10);
        s.setStudentName("pranay");
        s.setMarks(88.56);
        return s;
    }
}
