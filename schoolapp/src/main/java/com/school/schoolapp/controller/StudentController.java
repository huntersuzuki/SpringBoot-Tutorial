package com.school.schoolapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.school.schoolapp.entity.StudentEntity;
import com.school.schoolapp.services.StudentService;

import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class StudentController {
    @Autowired
    StudentService ss;
    @GetMapping("/createstudent")
    public String getStudent(Model m) {
        m.addAttribute("student", new StudentEntity());
        return "addstudent";
    }
    @PostMapping("/createstudent")
    public String setStudent(@ModelAttribute StudentEntity se) {
        ss.addStudent(se);
        return "result";
    }
    
}
