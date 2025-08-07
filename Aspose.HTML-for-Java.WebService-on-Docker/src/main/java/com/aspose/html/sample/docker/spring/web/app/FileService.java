package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileService {
    @Value("${app.input-dir}")
    private String inputDir;

    @Value("${app.output-dir}")
    private String outputDir;

    public ResponseEntity<Resource> getFileResponse(String filename) throws IOException {
        Path filePath = Paths.get(outputDir, filename);
        File file = filePath.toFile();

        if (!file.exists() || !file.getCanonicalPath().startsWith(new File(outputDir).getCanonicalPath())) {
            return ResponseEntity.notFound().build();
        }

        Resource resource = new FileSystemResource(file);
        String contentType = Files.probeContentType(filePath);
        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + file.getName() + "\"")
                .body(resource);
    }

    public String deleteInputFile(String filename, RedirectAttributes redirectAttributes) {
        try {
            Path filePath = Paths.get(inputDir, filename);
            Files.deleteIfExists(filePath);
            redirectAttributes.addFlashAttribute("message", "Input file successfully deleted");
            return "redirect:/aspose-html-for-java/sample-web-service";
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("error", "Error deleting input file: " + e.getMessage());
            return "redirect:/aspose-html-for-java/sample-web-service";
        }
    }

    public String deleteOutputFile(String filename, RedirectAttributes redirectAttributes) {
        try {
            Path filePath = Paths.get(outputDir, filename);
            Files.deleteIfExists(filePath);
            redirectAttributes.addFlashAttribute("message", "Output file successfully deleted");
            return "redirect:/aspose-html-for-java/sample-web-service/files";
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("error", "Error deleting output file: " + e.getMessage());
            return "redirect:/aspose-html-for-java/sample-web-service/files";
        }
    }

    public String deleteAllInputFiles(RedirectAttributes redirectAttributes) {
        try {
            Files.list(Paths.get(inputDir))
                    .forEach(file -> {
                        try {
                            Files.deleteIfExists(file);
                        } catch (IOException e) {
                            // Handle individual file deletion errors
                        }
                    });
            redirectAttributes.addFlashAttribute("message", "All input files successfully deleted");
            return "redirect:/aspose-html-for-java/sample-web-service";
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("error", "Error deleting input files: " + e.getMessage());
            return "redirect:/aspose-html-for-java/sample-web-service";
        }
    }

    public String deleteAllOutputFiles(RedirectAttributes redirectAttributes) {
        try {
            Files.list(Paths.get(outputDir))
                    .forEach(file -> {
                        try {
                            Files.deleteIfExists(file);
                        } catch (IOException e) {
                            // Handle individual file deletion errors
                        }
                    });
            redirectAttributes.addFlashAttribute("message", "All output files successfully deleted");
            return "redirect:/aspose-html-for-java/sample-web-service/files";
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("error", "Error deleting output files: " + e.getMessage());
            return "redirect:/aspose-html-for-java/sample-web-service/files";
        }
    }
}
