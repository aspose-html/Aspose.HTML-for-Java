package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class FileUploadController {
    @PostMapping("/aspose-html-for-java/sample-web-service/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, 
                                 RedirectAttributes redirectAttributes) {
        try {
            Files.createDirectories(Paths.get(inputDir));
            Path targetPath = Paths.get(inputDir, file.getOriginalFilename());
            Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            
            redirectAttributes.addFlashAttribute("message", "File successfully uploaded!");
            return "redirect:/aspose-html-for-java/sample-web-service";
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("error", "Upload error: " + e.getMessage());
            return "redirect:/aspose-html-for-java/sample-web-service";
        }
    }

    @Value("${app.input-dir}")
    private String inputDir;
}
