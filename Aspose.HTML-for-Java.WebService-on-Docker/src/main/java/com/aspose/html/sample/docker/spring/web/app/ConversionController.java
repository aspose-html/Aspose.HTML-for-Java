package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
// другие ваши импорты

@Controller
public class ConversionController {
    @GetMapping("/aspose-html-for-java/sample-web-service/convert/{filename}")
    public String showConvertPage(@PathVariable String filename, Model model) {
        model.addAttribute("filename", filename);
        return "convert";
    }

    @PostMapping("/aspose-html-for-java/sample-web-service/convert")
    public String convertFile(@RequestParam String filename,
                              @RequestParam String outputFormat,
                              @RequestParam(required = false) Boolean adjustToWidestPage,
                              @RequestParam(required = false) Double pageWidth,
                              @RequestParam(required = false) Double pageHeight,
                              RedirectAttributes redirectAttributes) {
        try {
            ConversionService conversionService = getConverterForFormat(outputFormat);
            String outputPath = conversionService.convert(filename, adjustToWidestPage,
                    pageWidth, pageHeight);

            redirectAttributes.addFlashAttribute("message",
                    "File successfully converted to " + outputFormat.toUpperCase());
            return "redirect:/aspose-html-for-java/sample-web-service/files";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Conversion error: " + e.getMessage());
            return "redirect:/aspose-html-for-java/sample-web-service/convert/" + filename;
        }
    }

    @Autowired
    private PdfConversionService pdfConversionService;

    @Autowired
    private XpsConversionService xpsConversionService;

    @Autowired
    private PngConversionService pngConversionService;

    private ConversionService getConverterForFormat(String format) {
        return switch (format.toLowerCase()) {
            case "pdf" -> pdfConversionService;
            case "xps" -> xpsConversionService;
            case "png" -> pngConversionService;
            default -> throw new IllegalArgumentException("Unsupported format: " + format);
        };
    }
}
