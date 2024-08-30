package com.pranay.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/main")
    public String MainIndex() {
        return "index";
    }

    @GetMapping("/student")
    public String Student(Model m){
        m.addAttribute("student",new Student());
        return "student";
    }
}
