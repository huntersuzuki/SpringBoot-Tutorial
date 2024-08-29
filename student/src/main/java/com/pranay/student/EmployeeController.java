package com.pranay.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping("/index")
    public String MainIndex() {
        return "index";
    }

    @GetMapping("/employee")
    public String Employee(Model m) {
        m.addAttribute("employee", new Employee());
        return "employee";
    }

}
