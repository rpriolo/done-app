package br.com.rpriolo.done.controller;

import br.com.rpriolo.done.domain.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public String showAllTasks() {
        return "tasks";
    }

    @GetMapping("/add")
    public String loadTaskForm() {
        return "add";
    }
}