package com.creditmanageapplicationstart.controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleError() {
        // Handle the error and return the appropriate view or redirect
        return "error"; // Replace "error" with the name of your error view
    }

    public String getErrorPath() {
        return "/error";
    }
}

