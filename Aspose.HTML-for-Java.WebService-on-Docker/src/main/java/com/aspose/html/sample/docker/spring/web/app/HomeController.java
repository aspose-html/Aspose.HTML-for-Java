package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    @GetMapping("/")
    public RedirectView redirectToHomePage() {
        return new RedirectView("/aspose-html-for-java/sample-web-service");
    }

    @GetMapping("/aspose-html-for-java/sample-web-service")
    public String homePage(Model model) {
        try {
            List<String> inputFiles = Files.list(Paths.get(inputDir))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toList());
            model.addAttribute("inputFiles", inputFiles);
        } catch (IOException e) {
            model.addAttribute("error", "Error reading files: " + e.getMessage());
        }
        return "home";
    }

    @Value("${app.input-dir}")
    private String inputDir;
}
