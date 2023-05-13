package pl.coderslab.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.entity.User;
import pl.coderslab.service.UserService;

@Controller
@RequiredArgsConstructor
class RegisterController {

    private final UserService userService;



    @GetMapping(path = "/register")
    String showAddUserForm(Model model) {
        model.addAttribute("user", new User());
        return "public/register";
    }

    @PostMapping(path = "/register")
    String processAddUserForm(@Valid User user, BindingResult errors) {
        if (errors.hasErrors()) {
            System.out.println(errors);
            return "public/register";
        }
        userService.saveUser(user);
        return "redirect:/title_page";
    }
}
