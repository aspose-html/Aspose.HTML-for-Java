package com.aspose.html.examples.Working_with_HTML_Documents.EnvironmentConfiguration;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.services.IRuntimeService;
import com.aspose.html.utils.TimeSpan;

import java.io.IOException;

import static com.aspose.html.examples.utils.Resources.$o;

public class RuntimeService {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET Example_LimitJavaScriptExecutionUsingRuntimeService.java
        // Limit JavaScript execution time when converting HTML to image using Java
        // Learn more: https://docs.aspose.com/html/java/environment-configuration/

        // Prepare HTML code and save it to a file
        String code = "<h1>Runtime Service</h1>\r\n" +
                "<script> while(true) {} </script>\r\n" +
                "<p>The Runtime Service optimizes your system by helping it start apps and programs faster.</p>\r\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("runtime-service.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Limit JS execution time to 5 seconds
        IRuntimeService runtimeService = configuration.getService(IRuntimeService.class);
        runtimeService.setJavaScriptTimeout(TimeSpan.fromSeconds(5));

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument($o("runtime-service.html"), configuration);

        // Convert HTML to PNG
        Converter.convertHTML(document, new ImageSaveOptions(), $o("runtime-service_out.png"));
        // @END_SNIPPET
    }
}