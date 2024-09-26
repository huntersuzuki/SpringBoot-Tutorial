package com.example.todoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.todoapp.services.TaskService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping("/")
    public String getTask(Model model) {

        model.addAttribute("task", taskService.geTask());
        model.addAttribute("myname", "Pranay");
        return "index";
    }

    @RequestMapping("/add")
    public String addTask() {
        return "addtask";
    }
    
}
