package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FileManagementController {
    @GetMapping("/aspose-html-for-java/sample-web-service/files")
    public String listFiles(Model model) {
        try {
            List<String> files = Files.list(Paths.get(outputDir))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toList());
            
            model.addAttribute("convertedFiles", files);
            return "results";
        } catch (IOException e) {
            model.addAttribute("error", "Error reading file list: " + e.getMessage());
            return "results";
        }
    }

    @GetMapping("/aspose-html-for-java/sample-web-service/files/{filename:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String filename) {
        try {
            return fileService.getFileResponse(filename);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping("/aspose-html-for-java/sample-web-service/input/delete/{filename}")
    public String deleteInputFile(@PathVariable String filename, 
                                RedirectAttributes redirectAttributes) {
        return fileService.deleteInputFile(filename, redirectAttributes);
    }

    @PostMapping("/aspose-html-for-java/sample-web-service/output/delete/{filename}")
    public String deleteOutputFile(@PathVariable String filename, 
                                 RedirectAttributes redirectAttributes) {
        return fileService.deleteOutputFile(filename, redirectAttributes);
    }

    @PostMapping("/aspose-html-for-java/sample-web-service/input/delete-all")
    public String deleteAllInputFiles(RedirectAttributes redirectAttributes) {
        return fileService.deleteAllInputFiles(redirectAttributes);
    }

    @PostMapping("/aspose-html-for-java/sample-web-service/output/delete-all")
    public String deleteAllOutputFiles(RedirectAttributes redirectAttributes) {
        return fileService.deleteAllOutputFiles(redirectAttributes);
    }

    @Value("${app.output-dir}")
    private String outputDir;

    @Autowired
    private FileService fileService;
}
