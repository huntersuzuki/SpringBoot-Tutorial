package com.pranay.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @GetMapping("/main")
    public String MainIndex() {
        return "index";
    }

    @GetMapping("/student")
    public String Student(Model m) {
        m.addAttribute("student", new Student());
        return "student";
    }

    @PostMapping("/student")
    public String Student(@ModelAttribute Student student, Model m) {
        m.addAttribute("student",student);
        return "index";
    }

}
