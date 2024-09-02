package com.pranay.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



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
    @PostMapping("/employee")
    public String EmployeePost(@ModelAttribute Employee emp,Model m) {
        System.out.println("FirstName is "+emp.getFirstName());
       m.addAttribute("employee", emp);
        return "index";
    }
    
}
