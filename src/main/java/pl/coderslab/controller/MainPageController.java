package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Task;
import pl.coderslab.service.TaskService;

import java.util.List;

@Controller
public class MainPageController {

    private final TaskService taskService;

    public MainPageController(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping ("/main_page")
    public String mainPage(Model model) {
        List<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        System.out.println(tasks);
        return "logged/main_page";
    }


}
