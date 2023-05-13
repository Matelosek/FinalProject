package pl.coderslab.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.entity.User;

@Controller
public class LoginController {

    @GetMapping("/login")
    String login(){
        return "public/login";
    }


}
