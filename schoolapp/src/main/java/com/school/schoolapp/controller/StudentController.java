package com.school.schoolapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.school.schoolapp.entity.StudentEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class StudentController {
    @GetMapping("/createstudent")
    public String getStudent(Model m) {
        m.addAttribute("student", new StudentEntity());
        return "addstudent";
    }
    @PostMapping("/createstudent")
    public String postMethodName(@ModelAttribute StudentEntity se) {
        
        return "dashboard";
    }
    
}
