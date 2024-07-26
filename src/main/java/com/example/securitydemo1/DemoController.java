package com.example.securitydemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/home")
    public String handleWelcome() {
        return "home";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome() {
        return "admin_home";
    }

    @GetMapping("/user/home")
    public String handleUserHome() {
        return "user_home";
    }
}
