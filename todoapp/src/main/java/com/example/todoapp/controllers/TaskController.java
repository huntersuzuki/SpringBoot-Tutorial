package com.example.todoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todoapp.entities.Task;
import com.example.todoapp.services.TaskService;



@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping("/")
    public String getTask(Model model) {

        model.addAttribute("tasklist", taskService.getAllTask());
        model.addAttribute("myname", "Pranay");
        return "index";
    }

    @RequestMapping("/add")
    public String addTask(Model model) {
        System.out.println("Load the empty form");
        Task task = new Task();
        model.addAttribute("task", task);
        return "addtask";
    }

    @RequestMapping("/addtask")
    public String addTaskDone(@ModelAttribute Task task) {
        System.out.println("Receive the data from form");
        System.out.println(task.getTaskName());
        taskService.saveTask(task);
        return "redirect:/";
    }

    @RequestMapping("/view/{id}")
    public String requestMethodName(@PathVariable int id,Model model) {
        System.out.println("View " + id);
        model.addAttribute("task", taskService.getTask(id));
        return "viewtask";
    }

    @RequestMapping("/delete/{id}")
    public String requestMethodName(@PathVariable int id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }
    

}
