package pl.coderslab.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Task;
import pl.coderslab.service.TaskService;

import java.awt.print.Book;

@Controller
@RequiredArgsConstructor
class TaskController {

        private final TaskService taskService;

    @GetMapping(path = "/deleteTask/{id}")
    public String deleteTaskById(@PathVariable Long id) {
        taskService.deleteById(id);
        return "redirect:/main_page";
    }


    @GetMapping(path = "/addTask")
    String showAddTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "logged/taskForm";
    }

    @PostMapping(path = "/addTask")
    String processAddTaskForm(@Valid Task task, BindingResult errors) {

        if (errors.hasErrors()) {
            return "logged/taskForm";
        }

        taskService.save(task);

        return "redirect:/main_page";
    }


}
