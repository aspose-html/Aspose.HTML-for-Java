package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class CustomErrorController {
    @ExceptionHandler(Exception.class)
    public String handleError(Exception ex, Model model) {
        model.addAttribute("error", "An error occurred");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", "500");
        return "error";
    }
}
